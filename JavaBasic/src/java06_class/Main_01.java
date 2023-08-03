package java06_class;

//실행 클래스
//	메인 메소드를 정의하고 있는 클래스
//	프로그램을 실행할 수 있는 클래스

public class Main_01 {
	
	public static void main(String[] args) {
		
		System.out.println("main() 실행 테스트");
		System.out.println("-----------------------");
		
		
		//Class_01 타입의 참조형 변수인 c01 선언
		Class_01 c01;
	
		//Class_01 타입의 인스턴스를 생성한다 (new 연산자)
		//인스턴스의 참조값을 c01 객체 변수에 대입한다
		c01 = new Class_01();
	
		//--------------------------------------------------
		
		//멤버 필드의 이용
		
		c01.num = 123;
		c01.data = "Apple";
		
		//--------------------------------------------------
		
		//멤버 메소드의 이용
		
		//메소드 호출(call, 사용)
		c01.display();
		
		//--------------------------------------------------
		
		Class_01 c02 = new Class_01();
		Class_01 c03 = new Class_01();
		Class_01 c04 = new Class_01();
		
		c02.num = 200;
		c03.num = 300;
		c04.num = 400;
		
		//--------------------------------------------------
		
		//객체 변수를 출력하면 참조값이 출력된다
		//	-> 레퍼런스, Reference
		System.out.println( c04 );
		
		//--------------------------------------------------
		
		Class_01 c05 = null;
		c05.data = "Banana"; //NullPointerException 발생
		
		//** NullPointerException
		//	-> null값을 참조하여 코드를 실행하려고 했을 때 발생하는 예외(오류)
		
	}
	
}
















