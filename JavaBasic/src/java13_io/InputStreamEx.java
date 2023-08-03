package java13_io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class InputStreamEx {
	public static void main(String[] args) {
		
		//키보드 표준 입력 스트림 객체
		InputStream is = System.in;
		
//		System.out.print("Input : ");
//		try {
//			System.out.println( is.read() );
//			System.out.println( is.read() );
//			System.out.println( is.read() );
//			System.out.println( is.read() );
//			System.out.println( is.read() );
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//--------------------------------------------------------------------
		
		//입력 데이터 저장소
		//	-> read()메소드의 매개변수로 이용
		byte[] buf = new byte[10];
		
		//입력 데이터의 길이
		//	-> read()메소드의 반환값으로 이용
		//	-> read()메소드의 반환값이 -1일 경우 EOF
		int len = -1;
		
		
		//입력한 전체 데이터를 문자열로 저장하는 객체
		StringBuilder sb = new StringBuilder();
		
		//입력한 전체 문자열의 길이
		int total = 0;
		
		
		try {
			System.out.println("<< 입력 대기중 >>");
			
			//입력 받을 데이터가 스트림에 남아있으면 반복한다
			//	-> EOF(입력데이터의 마지막)를 만날 때까지 입력을 반복한다
			while( ( len = is.read(buf) ) != -1 ) {
				
//				System.out.println( Arrays.toString(buf) );
//				System.out.println( new String( buf, 0, len ) );
//				System.out.println( len );
				
				//키보드 스트림의 EOF 입력
				//	윈도우 : ctrl + z
				//	맥OS : command + d
				
				//----------------------------------------------------

				//read()가 입력받은 전체 문자열을 StringBuilder에 추가한다
				sb.append( new String(buf, 0, len) );
				
				//read()가 입력받은 전체 문자열의 길이를 total에 계산한다 (총합)
				total += len;
				
			}			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				//스트림 닫기
				//	스트림이 사용하던 시스템 자원을 반환한다
				//	자원 해제
				if( is!=null )	is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println();
		System.out.println("<< 전체 입력받은 데이터 >>");
		System.out.println( sb );
		
		System.out.println();
		System.out.println("<< 전체 입력받은 길이 >>");
		System.out.println( total + "B");
		
	}
}















