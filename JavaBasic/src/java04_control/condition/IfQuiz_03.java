package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_03 {
	public static void main(String[] args) {
		
//		 + 두 수를 입력 받아 큰 수를 출력하시오

		Scanner sc = new Scanner(System.in); //입력 객체
		int num1; //입력값 변수
		int num2; //입력값 변수
		
		//숫자 두 개 입력받기
		System.out.print("Input Number : ");
		num1 = sc.nextInt();
		System.out.print("Input Number : ");
		num2 = sc.nextInt();

		if( num1 > num2 ) {	// num1이 큰 경우
			System.out.println(num1 + "이/가 큽니다");
		}
		
		if( num1 < num2 ) {	// num2가 큰 경우
			System.out.println(num2 + "이/가 큽니다");
		}
		
		if( num1 == num2 ) {
			System.out.println("두 숫자가 " + num1 + "(으)로 같다");
		}
		
	}
}














