package java06_class.variable;

public class ClassVariable_03 {

	//--- 멤버 필드 ---
	private int num1 = 777;			//인스턴스 변수
	private static int num2 = 888;	//클래스 변수
	
	
	//--- 멤버 메소드 ---
	public void method(int num3, int num4) { //매개변수 (지역 변수 취급)
		
		System.out.println( num1 );	//인스턴스 변수 출력
		System.out.println( num2 ); //클래스 변수 출력
		
		//-----------------------------------------------------
		
		int num1 = 101;	//지역 변수
		int num2 = 102;	//지역 변수
		
		System.out.println("-----");
		
		System.out.println( num1 ); //지역 변수 출력
		System.out.println( num2 ); //지역 변수 출력
		
		System.out.println("-----");
		
		System.out.println( this.num1 );	//인스턴스 변수 출력		
		
//		System.out.println( this.num2 );	//클래스 변수 출력
		System.out.println( ClassVariable_03.num2 );	//클래스 변수 출력
		
	}
	
}













