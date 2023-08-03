package java12_exception;

import java.io.IOException;

public class Exception_04_throw {
	public static void main(String[] args) {
		
		//throw 키워드
		//	-> 예외 상황(예외 객체)을 발생시키는 키워드
		
		//	-> 개발자가 직접 예외를 발생(throw)시키기 위해 사용한다
		
		//--------------------------------------------------------------
		
		String str = null;
		
		//예외 발생 지점, NullPointerException
//		System.out.println( str.length() );
		
		System.out.println("문자열의 길이 출력 이후 코드");

		System.out.println("----------");
		
		if( str != null ) {
			System.out.println( str.length() );
			
		} else {	//예외가 발생하는 경우
			System.out.println("[EXCEPTION] 문자열이 null입니다");
			
			
			//예외 객체를 직접 만들어서 발생시키는 코드
			//	-> 예외 상황 던지기
//			throw new NullPointerException(); //예외가 발생하고 프로그램 강제 종료
			
		}
		
		System.out.println("----------");
		
		//ArithmeticException - / by zero ( divied by zero )
//		System.out.println( 999 / 0 );
		
		
		//예외 정보 객체 생성
//		ArithmeticException ae = new ArithmeticException();

		//예외 던지기 ( 예외 발생시키기 )
//		throw ae;
		
		//** 예외 객체를 생성(new)하는 것은 예외를 발생(throw)시키는 것이 아니다
		
		//** new, throw 동작은 별개
		
		//------------------------------------------------------------------------
		
		//throw코드와 new코드를 한꺼번에 같이 적는 것이 좋다
		
//		throw new ArithmeticException();
//		throw new ArithmeticException("문제 상황 설명");
		
		//------------------------------------------------------------------------
		
		try {
			
			//CheckedException - try~catch구문 필수
			throw new IOException();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
















