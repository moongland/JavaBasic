package java04_control.loop;

public class While_03 {
	public static void main(String[] args) {
		
		//while문을 이용한 구구단 출력
		//	-> 2~9단 전부 출력
		
		//각 단 진행 반복
//		for( int dan=2; dan<=9; dan++ ) {	//dan, 2~9, x8
		int dan=2;
		while( dan<=9 ) {	//dan, 2~9, x8
			
			//구구단 출력
//			for(int i=1; i<=9; i++) { // i, 1~9
			int i=1;
			while( i<=9 ) { // i, 1~9
				
				System.out.println( dan + " x " + i + " = " + (dan*i) );
				
				i++;
			}
			
			System.out.println("------------");
			
			dan++;
		}		

	}
}








