package java09_api;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		
		//	java.util.Random 클래스
		//------------------------------------------------------
		
		Random ran;		//랜덤 객체 변수
		ran = new Random();	//랜덤 객체 생성
		
		System.out.println( ran.nextInt() );
		
		System.out.println("---------------");
		
		System.out.println( ran.nextBoolean() ); // true / false
		System.out.println( ran.nextDouble() );	// 0.0(포함) ~ 1.0(미포함)
	
		System.out.println("---------------");

		System.out.println( ran.nextInt(100) ); // 0~99, 100개 중 랜덤
		
		System.out.println( ran.nextInt(100) + 1 ); // 1 ~ 100
		
		
		System.out.println( ran.nextInt(3) + 7 );	// 0~2 + 7 -> 7~9
		
		System.out.println("---------------");
		
		//10회 반복
		for(int i=0; i<10; i++) {
			
			switch ( ran.nextInt(3) ) {
			case 0:
				System.out.println("가위");
				break;

			case 1:
				System.out.println("바위");
				break;
				
			case 2:
				System.out.println("보");
				break;
			}
			
		}
		
	}
}
















