package java04_control.selection;

import java.util.Scanner;

public class SwitchQuiz_Menu_v3 {
	
//	- 메뉴 만들기
//
//	===============================
//		M  e  n  u
//	===============================
//		1. Hello World 출력
//		2. 이름 출력
//		3. 성별 출력
//		4. 종료
//	===============================
//
//	  >> _
//
//	 -> 각 메뉴 번호를 입력하면 메뉴에 알맞게 동작하도록 작성
//	 -> 동작은 간단한 출력으로 해결

	public static void main(String[] args) {
		
		//메뉴 번호 상수
		final int HELLO_MENU = 1;	//Hello World
		final int NAME_MENU = 2;	//이름
		final int GENDER_MENU = 3;	//성별
		final int EXIT_MENU = 4;	//종료
		
		//--------------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		int menu; //메뉴 선택 변수
		
		//-------------------------------------------------
		
		do {
			
			System.out.println("===============================");
			System.out.println("\tM  e  n  u");
			System.out.println("===============================");
			System.out.println("\t1. Hello World 출력");
			System.out.println("\t2. 이름 출력");
			System.out.println("\t3. 성별 출력");
			System.out.println("\t4. 종료");
			System.out.println("===============================");
			
			System.out.println();
			System.out.print("\t>> ");
			menu = sc.nextInt();
			
			System.out.println();
			System.out.print("\t>> ");
			
			
			//메뉴 실행 객체 생성
			RunMenu runMenu = new RunMenu();
	//		runMenu.printBye(); //테스트
			
			
			switch( menu ) {
			case HELLO_MENU:
	//			System.out.println("Hello World");
				
				runMenu.printHello();
				
				break;
	
			case NAME_MENU:
	//			System.out.println("Clare");
				
				runMenu.printName();
				
				break;
				
			case GENDER_MENU:
	//			System.out.println("Female");
				
				runMenu.printGender();
				
				break;
				
			case EXIT_MENU:
	//			System.out.println("Good Bye~~!");
				
				runMenu.printBye();
				
				break;
				
			default:
				System.out.println("메뉴를 잘못 선택하셨습니다");
			} // switch end
			
		} while( menu != EXIT_MENU ); // do-while end
		
	} //main end
	
} //class end


















