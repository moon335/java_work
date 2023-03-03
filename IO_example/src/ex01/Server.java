package ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	// 서버 소켓
	ServerSocket serverSocket;
	
	// 통신 소켓
	Socket socket;
	
	// 클라이언트로부터 입력 받은 것을 읽음
	BufferedReader socketReader;
	
	// 클라이언트에게 보낼 메세지 입력
	BufferedReader keyboardReader;
	
	// 클라이언트쪽에 출력
	BufferedWriter writer;
	
	public Server() {
		initData();
	}
	
	private void initData() {
		try {
			// 서버소켓 포트 번호 부여
			serverSocket = new ServerSocket(10000);
			
			// 클라이언트 연결 대기
			socket = serverSocket.accept();
			System.out.println("연결 완료");
			
			// 클라이언트 메세지 받는 리더
			socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// 키보드 입력 받는 리더
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));
			
			// 클라이언트 쪽에 출력
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// 쓰레드 사용해서 키보드 입력값 받기
			new Thread(new MsgWriter()).start();
			
			
			while(true) {
				String msg = socketReader.readLine();
				System.out.println("클라이언트>>> " + msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socketReader.close();
				keyboardReader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	} // end of initData
	
	class MsgWriter implements Runnable {

		@Override
		public void run() {
			while(true) {
				try {
					System.out.println("키보드 입력 대기: ");
					String input = keyboardReader.readLine();
					writer.write(input);
					writer.newLine();
					writer.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Server();
	} // end of main

} // end of class
