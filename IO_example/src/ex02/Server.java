package ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
	
	// 서버 소켓
	ServerSocket serverSocket;
	
	// 통신 소켓
	ArrayList<Socket> sockets;
	
	// 클라이언트1로부터 입력 받은 것을 읽음
	BufferedReader socketReader1;
	
	// 클라이언트2에게 보낼 메세지 입력
	BufferedReader socketReader2;
	
	// 클라이언트1쪽에 출력
	BufferedWriter writer1;
	
	// 클라이언트2쪽에 출력
	BufferedWriter writer2;
	
	public Server() {
		initData();
	}
	
	private void initData() {
		// 연결 포트 생성
		new Thread(new ConnectionThread()).start();
		
		try {
//			// acc...
//			System.out.println("연결 대기중");
//			sockets.add(serverSocket.accept());
//			System.out.println("연결 완료");
			
			// 클라이언트 1의 리더
			socketReader1 = new BufferedReader(new InputStreamReader(sockets.get(0).getInputStream()));
			
			// 클라이언트 1의 라이터
			writer1 = new BufferedWriter(new OutputStreamWriter(sockets.get(1).getOutputStream()));
			
			// 클라이언트 2의 리더
			socketReader2 = new BufferedReader(new InputStreamReader(sockets.get(1).getInputStream()));
			
			// 클라이언트 2의 라이터
			writer2 = new BufferedWriter(new OutputStreamWriter(sockets.get(0).getOutputStream()));
			
			new Thread(new Client1Thread()).start();
			
			new Thread(new Client2Thread()).start();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socketReader1.close();
				writer1.close();
				socketReader2.close();
				writer2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	} // end of initData
	
	class ConnectionThread implements Runnable {

		@Override
		public void run() {
			while(true) {
				try {
					serverSocket = new ServerSocket(10000);
					System.out.println("연결 대기중");
					sockets.add(serverSocket.accept());
					System.out.println("연결 완료");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	class Client1Thread implements Runnable {
		
		@Override
		public void run() {
			while(true) {
				String input1;
				try {
					input1 = socketReader1.readLine();
					writer1.write(input1);
					writer1.newLine();
					writer1.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	class Client2Thread implements Runnable {

		@Override
		public void run() {
			while(true) {
				String input2;
				try {
					input2 = socketReader2.readLine();
					writer2.write(input2);
					writer2.newLine();
					writer2.flush();
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
