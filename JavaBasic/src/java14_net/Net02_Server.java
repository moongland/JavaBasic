package java14_net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Net02_Server {
	public static void main(String[] args) {
		
		System.out.println("서버");
		
		//서버 리슨 소켓
		ServerSocket servSock = null;
		
		//서버 통신 소켓
		Socket sock = null;
		
		//소켓 입력 스트림
		BufferedReader in = null;
		
		
		//서버 포트 번호
		int port = 10001;
		
		try {
			
			servSock = new ServerSocket( port );
			System.out.println("+ + + 서버 리슨 소켓 생성 + + +");
			
			
			System.out.println();
			System.out.println("--- Linstening ---");
			sock = servSock.accept();	//리슨 시작, 클라이언트 접속되면 통신 소켓 반환
			
			System.out.println(" >> 서버 IP : " + InetAddress.getLocalHost().getHostAddress());
			System.out.println(" >> 서버 리슨 Port : " + sock.getLocalPort() );

			
			
			//--- BLOCKED ---
			//	-> 다음 코드로 진행되지않고 멈춰있는 상태
			//	-> 일시 정지 상태
			
			System.out.println();
			System.out.println("클라이언트 접속 완료");
			
			
			//클라이언트 접속 정보 얻기
			InetAddress ip = sock.getInetAddress();
			System.out.println(" >> 클라이언트 IP : " + ip.getHostAddress() );
			System.out.println(" >> 클라이언트 접속 Port : " + sock.getPort() );
			
			
			
			
			//--- 데이터 통신 ---
//			sock.getInputStream();	//통신용 입력 스트림
//			sock.getOutputStream();	//통신용 출력 스트림
			
			//클라이언트로부터 입력받는 소켓 입력스트림 생성
			in = new BufferedReader( new InputStreamReader( sock.getInputStream() ) );
			
			String msg = in.readLine();
			
			System.out.println();
			System.out.println(" >> 전송받은 데이터 : " + msg);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(in!=null)	in.close();
				if(sock!=null)	sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(servSock!=null)	servSock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}














