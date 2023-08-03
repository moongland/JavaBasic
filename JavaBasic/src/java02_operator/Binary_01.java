package java02_operator;

public class Binary_01 {
	public static void main(String[] args) {

		//이항 연산자 - 산술
		//	+ - * / %
		
		//------------------------------------
		
		int num1 = 16, num2 = 7; //피연산자
		
		int result; //연산의 결과값을 저장하는 변수
		
		
		result = num1 + num2;
//		result = 16 + 7;	// 변수의 값 불러오기
//		result = 23;		// 덧셈 연산
		//	-> result변수에 23을 대입한다
		
		System.out.println("덧셈 결과 : " + result);
		
		//-------------------------------------------------------
		
		// %
		//	나머지 연산자
		//	modular operator
		//	mod 연산자
		
		//	나눗셈을 수행하고 그 나머지를 결과값으로 나타낸다
		
		num2 = 6;
		
		result = num1 % num2;
//		result = 16 % 6;
//		result = 4;
		
		System.out.println( num1 + "값을 " + num2 + "(으)로 나눈 나머지 : " + result);
		
		System.out.println("---------------");
		
		//num1:16, num2:6
		
		//잘못작성한 코드 - 연산자 우선순위, 연산방향을 고려하지 않음
		System.out.println("num1 + num2 = " + num1+num2);
//		System.out.println("num1 + num2 = " + 16 + 6);
//		System.out.println("num1 + num2 = 16" + 6);
//		System.out.println("num1 + num2 = 166");
		
		System.out.println("---------------");
		
		System.out.println("num1 + num2 = " + (num1+num2));
		System.out.println("num1 - num2 = " + (num1-num2));
		System.out.println("num1 * num2 = " + (num1*num2));
		System.out.println("num1 / num2 = " + (num1/num2)); //몫 (2.66667이 아닌 2)
		System.out.println("num1 % num2 = " + (num1%num2)); //나머지
		
		//산술 연산은 반드시 피연산자들의 데이터타입이 같아야 연산할 수 있다
		
		//산술 연산의 결과값도 피연산자들과 같은 데이터타입을 가진다
		
		System.out.println("---------------");
		
		System.out.println("16 / 6 = " + (16/6));	// int/int -> int
		System.out.println("16.0 / 6.0 = " + (16.0/6.0));	//	double/double -> double
		
		System.out.println("---------------");
		
		System.out.println( (double)num1 / (double)num2 );
//		System.out.println( (double)16 / (double)6 );	//변수값 불러오기
//		System.out.println( 16.0 / (double)6 );			//왼쪽 항 double형으로 변환
//		System.out.println( 16.0 / 6.0 );				//오른쪽 항 double형으로 변환
//		System.out.println( 2.6666666666666665 );		//double끼리 나눗셈

		System.out.println("---------------");
		
		System.out.println( 11 + 34.56 );	// 11의 double 자동 형변환
		
		System.out.println( 11 + (int)34.56 );	// 34.56의 int 강제 형변환
		
		System.out.println("---------------");
		
		System.out.println( num1 / (double)num2 );

//		System.out.println( 16 / (double)6 );	//변수 값 불러오기
//		System.out.println( 16 / 6.0 );			//강제형변환
//		System.out.println( 16.0 / 6.0 );		//자동형변환
//		System.out.println( 2.66666666665 );	//나눗셈
		
		System.out.println("--- 잘못 사용한 경우 ------------");
		
		System.out.println( (double)(num1 / num2) );
		
//		System.out.println( (double)(16 / 6) );
//		System.out.println( (double)(2) );
//		System.out.println( 2.0 );
		
		System.out.println("---------------");
		
		double dNum = 3.14;
		
		System.out.println("3.14 / 2 = " + (dNum/2));
		
		System.out.println("3.14 % 2 = " + (dNum%2));
		
		//** 실수 계산에서는 부동소수점 오차가 발생할 수 있다
		//	-> 0.0000000000000001
		
	}
}













