package java06_class.variable;

public class ClassVariableEx {
	
	public static void test() {
		System.out.println("정적 테스트");
	}
	
	public static void main(String[] args) {

		// 정적메소드인 main에서 다른 메소드를 호출하려면
		//해당 메소드도 정적메소드로 정의되어야만 한다
		test();
		//-------------------------------------------
		
		
		ClassVariable_01 cv01;
		cv01 = new ClassVariable_01();
		
		ClassVariable_01 cv02 = new ClassVariable_01();
		ClassVariable_01 cv03 = null;
		
		//** null 키워드, 널, 눌
		//	-> 참조형 데이터의 기본값
		//	-> 참조하는 대상이 없음을 나타낸다
		
		//-----------------------------------------------------------------

		cv01.setNum(12345);
		System.out.println(cv01.getNum());

		System.out.println(cv02.getNum());
		
		
		//예외 발생 - NullPointerException
//		System.out.println(cv03.getNum());
		
		System.out.println("--------------------");
		
		ClassVariable_02 cv04 = new ClassVariable_02();
		ClassVariable_02 cv05 = new ClassVariable_02();
		
		System.out.println( cv04.city );
		System.out.println( cv05.city );
		System.out.println( ClassVariable_02.city );

		cv04.city = "Busan";

		System.out.println("-----");
		System.out.println( cv04.city );
		System.out.println( cv05.city );
		System.out.println( ClassVariable_02.city );
		
		//-------------------------------------------------
		System.out.println("-----");

		// 정적변수는 클래스 단위로 관리되기 때문에
		//정적인 방법(static way)으로 사용해야 좋다
		
		ClassVariable_02.city = "Incheon";
		
		System.out.println( ClassVariable_02.city );
		
		//-------------------------------------------------
		System.out.println("-----");

		ClassVariable_03 cv06 = new ClassVariable_03();
		cv06.method(0, 0);
		
		System.out.println("-----");
		
		new ClassVariable_03().method(1, 2);
		
	}
}

















