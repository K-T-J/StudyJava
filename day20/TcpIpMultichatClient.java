package day20;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class TcpIpMultichatClient {
	public static void main(String args[]) {
		if(args.length!=1) {//만약 args 에 값이 없으면 
			System.out.println("USAGE: java TcpIpMultichatClient 대화명");
			System.exit(0);
		}

		try {
			String serverIp = "nullmaster.iptime.org";//서버의 아이피 주소
            
			Socket socket = new Socket(serverIp, 7777); //포트번호
			System.out.println("서버에 연결 되었습니다.");
			
			Thread sender   = new Thread(new ClientSender(socket, args[0]));//받는 스레드 보내는 스레드
			Thread receiver = new Thread(new ClientReceiver(socket));

			sender.start();	
			receiver.start();
		} catch(ConnectException ce) {
			ce.printStackTrace();
		} catch(Exception e) {}
	} // main

	static class ClientSender extends Thread {//스레드 상속
		Socket socket;
		DataOutputStream out; 
		String name;
					
		ClientSender(Socket socket, String name) {//socket, args[0] 받음
			this.socket = socket;
			try {
					
				out = new DataOutputStream(socket.getOutputStream());
				this.name = name;
			} catch(Exception e) {}
		}
		
		public void run() {//오버라이딩
			Scanner scanner = new Scanner(System.in);
			try {
				if(out!=null) {
					out.writeUTF(name);//사용자 이름내보내기
				}	

				while(out!=null) {
					out.writeUTF("["+name+"]"+scanner.nextLine());					}
			} catch(IOException e) {}
		} // run()
	} // ClientSender

	static class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream in;

		ClientReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
			} catch(IOException e) {}
		}

		public void run() {
			while(in!=null) {
				try {
					System.out.println(in.readUTF());
				} catch(IOException e) {}
			}
		} // run
	} // ClientReceiver
} // class
