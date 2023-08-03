package java06_class.method;

public class Method_02 {

	//매개변수(Parameter)
	//	-> 메소드의 기능의 입력 데이터로 사용된다
	//	-> 여러 개, 여러 종류, 다양한 순서로 작성할 수 있다	
	
	//반환데이터(Return Data)
	//	-> 메소드의 기능의 출력 데이터로 사용된다
	//	-> 1개의 데이터를 반환할 수 있다
	
	//------------------------------------------------------------------
	
	//매개변수 없음 - 비워둔다
	//반환데이터 없음 - void타입으로 작성한다
	public void method1() {
		System.out.println("Hello");
	}
	
	//------------------------------------------------------------------
	
	//매개변수 - int형 1개(parameter)
	//반환데이터 없음
	public void method2( int parameter ) {
		System.out.println("전달한 값 : " + parameter);
	}
	
	//------------------------------------------------------------------
	
	//매개변수 없음
	//반환데이터 - double데이터
	public double method3() {
//		return 768; //정상, int넣어도 double로 자동형변환함
		return 4.23;
	}
	
	//** 반환데이터타입을 void가 아닌 타입으로 명시하면
	//	반드시 return코드를 작성해야 한다
	
	//------------------------------------------------------------------
	
	//매개변수 - double1개, int1개 : 총 2개
	//반환데이터 - 단일 문자 1개
	public char method4(double d, int n) {
		
		return 'A';
		
	}
	
}

















