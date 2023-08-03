package java04_control.loop;

import java.util.Scanner;

public class DoWhile_03_v2 {

	//숫자를 입력하고 그 값들의 총합을 구하고 최종값을 출력하는 프로그램
	//	-> 숫자 0을 입력하면 종료
	//	-> while 구문 활용

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input; //입력값
		int sum = 0; //총합
	
		while( true ) {
			
			System.out.print("Input Number(종료==0) : ");
			input = sc.nextInt();
	
			System.out.println("입력한 값 : " + input);
			
			sum += input; //합계
			
			System.out.println("지금까지 더한 값 : " + sum);
			System.out.println();
			
			if( input == 0 ) {
				break; //반복문 중단
			}
			
		}
		
		System.out.println();
		System.out.println("최종 합계 : " + sum);
		
	}
	
}














