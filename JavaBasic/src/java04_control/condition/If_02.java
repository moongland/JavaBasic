package java04_control.condition;

public class If_02 {
	public static void main(String[] args) {
		
		int num = 10;
		
		if( num == 15 ) {
			System.out.println("HI");
		}
		System.out.println("Hello");
		
		//-----------------------------------------------------------
		
		//{}중괄호 블록(block)은 여러 개의 코드를 하나로 묶어주는 역할을 한다
		//중괄호 자체는 코드 실행 흐름에 영향을 주지 않는다
		
		{
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		}		
		
		//-----------------------------------------------------------
		
		// 제어문은 해당 제어문의 다음에 오는 코드 한 개 또는 {}중괄호 블록 하나에
		//영향을 준다
		
		if( false )
			System.out.println(11111);	//실행되지 않는다
			System.out.println(22222);	//실행된다
			
		System.out.println("----------");
		
		//제어문에 적용할 코드가 한 줄이어도 {}중괄호를 쓰는 습관을 들이자
		
		if( false ) {
			System.out.println(11111);	//실행되지 않는다
		}
		
		System.out.println(22222);	//실행된다
		
		System.out.println("----------");
		
		//제어문의 ()괄호 다음에 ;을 붙이지 않도록 조심하자
		//	-> 실수로 작성하는 경우가 많음
		
		if(false);{
			System.out.println("HI");
			System.out.println("Hello");
			System.out.println("Hola");
		}
		
	}
}















