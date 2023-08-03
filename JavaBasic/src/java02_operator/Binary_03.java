package java02_operator;

public class Binary_03 {
	public static void main(String[] args) {
		
		//이항연산자 - 관계, 비교
		
		//	<		less than		lt
		//	>		greater than	gt
		
		//	<=		less than equal		le
		//	>=		greater than equal	ge
		
		//	==		equal		eq
		//	!=		not equal	ne
		
		//	왼쪽 피연산자를 기준으로 오른쪽 피연산자를 비교한다
		//	비교 결과를 참/거짓으로 반환한다
		
		//		-> boolean타입으로 리턴한다
		//		-> true / false
		
		//---------------------------------------------------------------
		
		int num1 = 11;
		int num2 = 22;
		
		System.out.println("num1 == num2 : " + (num1==num2));
		System.out.println("num1 != num2 : " + (num1!=num2));
		
		System.out.println("num1 < num2 : " + (num1<num2));
		System.out.println("num1 > num2 : " + (num1>num2));
		
		System.out.println("num1 <= num2 : " + (num1<=num2));
		System.out.println("num1 >= num2 : " + (num1>=num2));
		
		//---------------------------------------------------------------
		
		boolean result = num1==num2;
		
		System.out.println("결과 : " + result);
		
	}
}














