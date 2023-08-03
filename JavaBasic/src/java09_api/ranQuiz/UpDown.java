package java09_api.ranQuiz;

import java.util.Random;
import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		
		int com;	//컴퓨터의 숫자 (랜덤)
		int user;	//사용자의 숫자 (키보드 입력)
		
		Random ran = new Random(); //랜덤 객체
		Scanner sc = new Scanner(System.in); //키보드 입력 객체
		
		System.out.println("=============== START ===============");
		
		com = ran.nextInt(50) + 1; //컴퓨터의 랜덤 숫자 생성, 1~50
		
//		System.out.println("[TEST] " + com);
		
		
		//7번의 기회
		for(int count=0; count<7; count++) {
			
			//사용자의 입력
			while( true ) {
				System.out.print("1~50 중 하나 입력 : ");
				user = sc.nextInt();
				
				if( user >=1 && user <= 50 ) {
					break;
				} else {
					System.out.println("[SYSTEM] 1~50 범위의 숫자만 입력하세요!");
				}
			}
			
			
			//컴퓨터 랜덤 숫자(com)와 사용자 입력(user) 숫자 비교
			if( com > user ) { //컴퓨터가 클 경우	-> UP출력
				System.out.println("UP");
				
			} else if( com < user ) { //컴퓨터가 작을 경우	-> DOWN 출력
				System.out.println("DOWN");
				
			} else  { //같을 경우	-> 사용자 승리
				System.out.println("이겼습니다!");
				
				//프로그램 중단 코드
				return;
			}
			
		} //7번의 기회 for end
		
		System.out.println("졌습니다");
		System.out.println("컴퓨터는 [" + com + "] 입니다");
		
	}
}
















