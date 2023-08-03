package java14_net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Net01_InetAddress {
	public static void main(String[] args) {

		//InetAddress 클래스
		//	IP정보 관리 클래스
		
		//	생성자 없음
		//	직접 객체를 new해서 생성할 수 없다
		
		//	주로 도메인주소(호스트네임)를 이용하여 IP주소를 객체로 얻어와서 사용한다
		
		//	** 호스트네임 : 네트워크에서 노드를 구분하기 위해 정하는 이름
		//	** 도메인주소 : 인터넷상의 호스트네임
		
		//	** 윈도우에서 호스트네임은 로그온한 유저이름 또는 컴퓨터이름을 기본으로 한다
		
		//------------------------------------------------------------------------------
		
		//IP주소 표현 객체
		InetAddress ip = null;
		
		try {
			
			//호스트(도메인)으로부터 IP주소 정보 얻기
			ip = InetAddress.getByName("www.kh-academy.co.kr");
			
			System.out.println( ip );
			
			
			//호스트 네임 (도메인)
			System.out.println( ip.getHostName() );
			
			//호스트 주소 (IP)
			System.out.println( ip.getHostAddress() );
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println("-------------------------");
		
		//로컬호스트, localhost
		//	네트워크 상에서 자기 자신 노드를 지칭하는 키워드
		
		//	가상 루프백(loopback) 호스트 네임
		
		//	루프백 호스트 네임 : localhost
		//	루프백 호스트 IP : 127.0.0.1
		
		
		try {
			
			InetAddress localhost = InetAddress.getLocalHost();
			
			String hostname = localhost.getHostName();	//localhost의 호스트네임
			String hostip = localhost.getHostAddress();	//localhost의 IP
			
			System.out.println("hostname : " + hostname);
			System.out.println("hostip : " + hostip);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}	
}


















