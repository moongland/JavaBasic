package java04_control.loop;

public class For_02 {
	public static void main(String[] args) {
		
		for( int i=0; i<10; i++ ) {
			System.out.println( i );
		}
		
		//** for문의 초기식에서 변수를 선언하고 사용하면
		//	for문 종료 이후에 접근할 수 없다
		//	-> for문 종료하면서 변수가 지워진다
		
//		System.out.println("for 이후 : " + i); //에러
	
		//---------------------------------------------------------
		
		int i;
		for( i=0; i<13; i++ ) {
			System.out.println( i );
		}
		
		// i변수가 0부터 13보다 작은 동안 1씩 증가하면서 반복한다
		
		// 반복횟수 : 13번
		// 반복구간 : 0 ~ 12
		
		System.out.println("----------");
		
		for( i=6; i<11; i++) {
			System.out.println(i);
		}
		
		// i변수가 6부터 11보다 작은 동안 1씩 증가하면서 반복한다
		
		//	반복횟수 : x5
		//	반복구간 : 6 7 8 9 10
		
	}
}


















