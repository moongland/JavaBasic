package java03_scanner;

import java.util.Scanner;

public class Scanner_03 {
	public static void main(String[] args) {
		
		//문자열 입력 처리 메소드
		//	nextLine()
		//	next()
		//-------------------------------------------------
		
		//키보드 입력 객체
		Scanner sc = new Scanner(System.in);
		
		//문자열 변수
		String str1;
		String str2;
		
		System.out.print("Input String : ");
	
		//문자열 입력받기
//		str1 = sc.next();
//		str2 = sc.next();
		str1 = sc.nextLine();
		str2 = sc.nextLine();
		
		System.out.println(); //줄바꿈
		System.out.println("--- 출력 ---");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		//--------------------------------------------------------------
		
		//nextLine() - '\n'
		//	개행문자(엔터값)를 기준으로 입력한 한 줄을 하나의 데이터로 판단한다
		
		//next() - '\n', '\t', ' '
		//	공백문자(white space, ws)들을 기준으로 하나의 데이터로 판단한다
		
		// nextInt(), nextDouble(), nextBoolean() 등의 다른 입력 메소드들은
		//next()메소드처럼 공백문자들을 기준으로 판단한다
				
	}
	
}














