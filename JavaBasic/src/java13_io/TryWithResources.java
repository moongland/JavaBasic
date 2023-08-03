package java13_io;

import java.io.IOException;
import java.io.OutputStream;

public class TryWithResources {
	public static void main(String[] args) {
		
		//try - with - resources 구문
		//	예외처리 구문
		//	try-catch구문의 변형
		
		//	JDK 1.7 추가
		
		//	-> 입출력 스트림 객체를 사용할 때 finally블록을 이용한
		//	 .close()호출을 예외처리구문이 자동으로 대신 처리해준다
		
		//	try( 객체 생성 ) {
		//
		//	} catch( 예외 객체 변수 ) {
		//
		//	}
		
		//	try블록이 끝날 때 자동으로 close() 메소드를 호출해준다
		//	-> AutoCloseable interface를 상속받아야 가능하다
		
		//-----------------------------------------------------------------
		
		//출력할 데이터
		byte[] buf = "AppleBananaCherry".getBytes();
		
		try( OutputStream os = System.out ) {
			
			os.write(buf, 0, buf.length); //데이터 출력
			os.flush(); //출력 버퍼 비우기
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

















