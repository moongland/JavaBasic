package java03_scanner;

import java.util.Scanner;

public class Scanner_04 {
	public static void main(String[] args) {
		
		//키보드 입력 객체
		Scanner sc = new Scanner(System.in);

		//------------------------------------------------
		
		//Scanner를 이용한 char값 처리하기
		
		//	-> Scanner에는 char를 직접 입력 받는 메소드(기능)가 없다
		
		//	-> String타입은 char형을 모아서 나열해 둔 클래스 타입이다
		//	-> String으로 입력받은 문자열의 첫 글자를 char타입으로 꺼내서 사용한다
		//-------------------------------------------------------------------------
		
		String str = "Apple Banana";
		
		char returnData = str.charAt(3);	// 'l'
		System.out.println("3번째 인덱스 : " + returnData);
		
		returnData = str.charAt(0);	// 'A'
		System.out.println("0 인덱스 : " + returnData);
		
		//-------------------------------------------------------------------------
		System.out.println("----------");
		
		System.out.print("Input : ");
		String data = sc.nextLine();
		
		System.out.println( data.charAt(0) );
		
		//-------------------------------------------------------------------------
		System.out.println("----------");
		
		System.out.print("Input : ");
		
		char charData = sc.nextLine().charAt(0);
		
		System.out.println( charData );
		
	}
}













