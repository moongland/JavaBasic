package java14_net;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Net03_Client {
	public static void main(String[] args) {
		
		System.out.println("클라이언트");
		
		//클라이언트 접속, 통신용 소켓		
		Socket sock = null;
		
		//소켓 출력 스트림
		PrintWriter out = null;
		
		
		
		//접속할 서버의 IP, Port 정보
		String serverIP = null;
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		int port = 10001;
		
		
		try {
			
			//소켓객체를 생성하며 서버로 접속한다
//			sock = new Socket("서버IP 또는 서버호스트", 서버포트번호);
//			sock = new Socket( serverIP, port );
//			sock = new Socket( "127.0.0.1", port );
			sock = new Socket( "localhost", port );
			
			
			
			//--- 데이터 통신 ---
//			sock.getInputStream();	//통신용 입력 스트림
//			sock.getOutputStream();	//통신용 출력 스트림

			
			//서버쪽으로 출력하는 소켓 출력 스트림 생성
			out = new PrintWriter( new BufferedOutputStream( sock.getOutputStream() ), true );
			
//			out.println("Hello");

			
			System.out.println();
			System.out.print(" >> 전송할 메시지 : ");

//			Scanner sc = new Scanner(System.in);
//			String msg = sc.nextLine();
//			out.println( msg );
			
			out.println( new Scanner(System.in).nextLine() );
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  finally {
			
			try {
				if(out!=null)	out.close();
				if(sock!=null)	sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}













