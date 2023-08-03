package java07_inherit;

class Parent5 {
	public void display() {
		System.out.println("부모 클래스");
	}
}

//** final 클래스는 자식 클래스를 만들 수 없다
//** final 클래스는 상속되지 않는다

//final class Child5 extends Parent5 {
class Child5 extends Parent5 {
	
	//** final 메소드는 더 이상 오버라이딩되지 않는다
	//** final 메소드는 재정의없이 자식클래스에 상속된다
	
	@Override
	public final void display() {
		System.out.println("자식 클래스 오버라이딩");
	}
	
}

class GrandChild extends Child5 {
	
//	@Override
//	public void display() {
//		System.out.println("2번 재정의된 메소드");
//	}
	
}

public class InheritEx_05 {
	public static void main(String[] args) {
		
		Parent5 p = new GrandChild();
		p.display();
		
	}
}








