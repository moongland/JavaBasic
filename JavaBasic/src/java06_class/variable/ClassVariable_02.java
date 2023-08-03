package java06_class.variable;

public class ClassVariable_02 {

	//멤버 필드 -> 인스턴스 변수
	private int num;
	
	//멤버 필드 -> 클래스 변수, static 변수, 정적 변수
//	private static String city = "Seoul";
	public static String city = "Seoul";
	
	//** static == 정적 == 실행 전
	//** dynamic == 동적 == 실행 중
	
	//--------------------------------------------------------------------
	
	private int data1 = 100; //인스턴스 변수
	
	
	//정적 멤버 메소드
	//	-> 곧바로 호출할 수 있도록 준비된다
	//	-> 객체 생성없이 정적인 방법으로 호출할 수 있게 된다
	public static void test1() {
		
		//에러
		//	-> 정적메소드에서 인스턴스변수 사용할 수 없음
		//	-> 인스턴스변수가 만들어지기 전에 실행 준비가 완료되어야 하기 때문
//		data1 = 123;
//		System.out.println( data1 );
		
	}
	
	//--------------------------------------------------------------------
	
	//**정적메소드에서는 정적 멤버필드만 사용할 수 있다
	
	//정적 변수
	private static int data2;
	
	public static void setData2(int data2) {
		ClassVariable_02.data2 = data2;
	}
	
	public static int getData2() {
		return data2;
	}
	
	//--------------------------------------------------------------------
	
	//** 일반 메소드에서 정적 변수를 사용하는 것은 문제가 없다
	
	//정적 변수
	private static int data3 = 1234;
	
	//일반 멤버 메소드
	public void test2() {
		System.out.println( data3 ); //정적 변수 사용
	}
	
	//--------------------------------------------------------------------
	
	//상수
	public static final int MAX = 1000;
	
}
















