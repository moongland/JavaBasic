package java03_scanner;

import java.util.Scanner;

//** import 선언
//	-> 현재 소스코드에서 java.util.Scanner 클래스의 이름을
//	 패키지를 생략하고 Scanner로 사용하겠다!

public class Scanner_01 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		// class Scanner
		//	스캐너 클래스
		
		//	키보드로 입력한(타이핑한) 내용을 프로그램 데이터로 가져오는 기능 클래스
		
		//	입력 기능 클래스
		
		//--------------------------------------------------------------------------
		
		//기본형 변수
		int num;		// int형 변수 선언
		num = 12345;	// int값 대입
		
		//--------------------------------------------------------------------------

		//참조형 변수
//		String name;
		
		java.util.Scanner input;
		Scanner in;
		
		//Organize Imports 단축키 : ctrl + shift + o
		//	-> 클래스 임포트 최적화(정리)
		
		Scanner sc;	//참조형 변수 선언
		sc = new Scanner(System.in);	// 객체 생성, Scanner클래스 기능 활성화
		
		//	-> System.in : 키보드
		//	-> new Scanner( System.in ); : 키보드 입력 객체
		
		Scanner sc2 = new Scanner(System.in);
		
		//--------------------------------------------------------------------------

//		sc.nextInt();
		
		System.out.print("숫자를 입력하세요 : ");
		int data = sc.nextInt();
	
		System.out.println("입력된 값 : " + data);
		
		//--------------------------------------------------------------------------
		
		System.out.print("실수값 입력 : ");
		System.out.println("입력된 실수값 : " + sc.nextDouble());
		
		//--------------------------------------------------------------------------
		
		//자원 반납(해제) - 연결해서 사용한 키보드의 사용 종료를 알린다
		sc.close();
		
	}
	
}
















