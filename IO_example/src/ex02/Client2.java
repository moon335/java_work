package ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client2 {
	
	// 통신 소켓
	Socket socket;
	
	// ip 주소
	final String IP = "localhost";
	
	// port 번호
	final int PORT = 10000;
	
	// 키보드 입력 받는 버퍼드리더
	BufferedReader keyboardReader;
	
	// 소켓으로 보낼 버퍼드라이터
	BufferedWriter writer;
	
	// 서버에서 온 메세지 받는 리더
	BufferedReader bufferedReader;
	
	
	public Client2() {
		initData();
	}
	
	private void initData() {
		try {
			// 소켓 연결
			socket = new Socket(IP, PORT);
			
			// 키보드 입력 받기
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));
			
			// 소켓으로 보낼 버퍼드 라이터
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// 서버에서 온 메세지 받기
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			new Thread(new ReaderThread()).start();
			
			
			while(true) {
				System.out.println("키보드 입력 대기: ");
				String input = keyboardReader.readLine();
				writer.write(input);
				writer.newLine(); // 이걸 써주거나 \n을 써줘야 보내짐
				writer.flush();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				keyboardReader.close();
				writer.close();
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	class ReaderThread implements Runnable {

		@Override
		public void run() {
			while(true) {
				try {
					String msg = bufferedReader.readLine();
					System.out.println("서버측>>> " + msg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	public static void main(String[] args) {
		new Client2();
	} // end of main

} // end of class
