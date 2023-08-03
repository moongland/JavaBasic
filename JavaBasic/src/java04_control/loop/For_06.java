package java04_control.loop;

public class For_06 {

	//QUIZ.
	//구구단 2단을 출력하기

	//출력 예시)
	//	2 x 1 = 2
	//	2 x 2 = 4
	//	2 x 3 = 6
	//	2 x 4 = 8
	//	2 x 5 = 10
	//	2 x 6 = 12
	//	2 x 7 = 14
	//	2 x 8 = 16
	//	2 x 9 = 18
	
	//반복횟수 : x9
	//반복구간 : 1~9
	
	//반복하면서 수행할 작업(코드) : i값의 출력, i*2값의 출력
	
	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) { // i, 1~9
			
			System.out.println( "2 x " + i + " = " + (2*i) );
			
		}
		
	}
	
}
















