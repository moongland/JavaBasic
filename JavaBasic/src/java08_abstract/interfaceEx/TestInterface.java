package java08_abstract.interfaceEx;

public interface TestInterface {

	//인터페이스
	//	상수 멤버 필드
	//	추상 멤버 메소드
	
	//------------------------------------------------
	
	//상수 멤버 필드
	//	-> public static final 키워드가 붙은 필드만 선언 가능하다
	
	//선언과 동시에 초기화 필수
	public static final int NUM1 = 123;
	
	//------------------------------------------------
	
	//public static final 키워드를 생략해도 모든 키워드를 자동으로 붙여서 선언된다
	
	int NUM2 = 234;
	public int NUM3 = 345;
	static int NUM4 = 456;
	final int NUM5 = 567;
	
	//** 인터페이스에 필드를 선언할 때 public static final 키워드를 모두
	//	붙여서 작성하는 것이 좋다
	
	//------------------------------------------------

	//에러, 일반 메소드를 멤버로 가질 수 없다
//	public void method() {
//	}
	
	//추상 메소드
	//	-> abstarct 키워드없이 메소드를 작성해도 추상 메소드로 판단한다
	public void out();
	
	//추상 메소드
	public abstract void display();
	
	//** 인터페이스에 추상 메소드를 작성할 땐 abstract를 붙이는 것이 좋다
	
}




















