package java01_variables;

//	한 줄 주석

/*
	문장 주석

	여러 줄을 주석으로 처리한다

*/


//한 줄 주석 토글(toggle) 단축키 : ctrl + shift + c


public class Variables_01 { //클래스 정의

	//메인 메소드 - 프로그램 시작점
	public static void main(String[] args) {
		
//		System.out.println("동작 테스트");

		//-------------------------------------------

		System.out.println( 12345 );	//int
		System.out.println( 123.456 );	//double
		System.out.println( false );	//boolean
		System.out.println( 'A' );		//char, 단일 문자
		
		System.out.println( "Hello" );	//String타입, 문자열
	
		//-------------------------------------------
		
		//char형 - 정수 관계
		
		System.out.println( '가' );
		System.out.println( (int)'가' );//char형 -> int형 변환하여 출력: 44032
		
		System.out.println( 99 ); //int형
		System.out.println( (char)99 );//int형 -> char형 변환하여 출력: 'c'
		System.out.println( (char)0x63 );//int형 -> char형 변환하여 출력: 'c'
		
	}
	
}













