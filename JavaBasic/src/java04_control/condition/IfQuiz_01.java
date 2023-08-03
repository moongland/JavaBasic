package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_01 {
	public static void main(String[] args) {
		
//		 + 숫자 하나를 입력받아 양수인지 음수인지 판별하시오

		Scanner sc = new Scanner(System.in); //입력 객체
		
		int num; //입력값 변수
		
		
		//숫자 하나 입력받기
		System.out.print("Input Number : ");
		num = sc.nextInt();
		
		
		if( num > 0 ) { //양수
			System.out.println(num + "이/가 양수입니다");
		}

		if( num < 0 ) { //음수
			System.out.println(num + "이/가 음수입니다");
		}
		
		if( num == 0 ) { //0
			System.out.println("입력한 값은 0 입니다");
		}
		
	}
}













