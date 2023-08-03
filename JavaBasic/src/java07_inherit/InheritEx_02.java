package java07_inherit;

class Parent2 {
	public int num;
	
	public void display() {
		System.out.println("부모 메소드");
	}
}

class Child2 extends Parent2 {
	public int num;		//상속받은 멤버
	
	public String name;	//자식클래스의 고유 멤버
	
	@Override
	public void display() {
		System.out.println("오버라이딩 메소드");
	}
	
	public void print() {
		System.out.println("자식 고유 메소드");
	}	
}

public class InheritEx_02 {
	public static void main(String[] args) {
		
		Child2 c = new Child2();
		c.num = 222;
		
		((Parent2)c).num = 111;
		
		//-----------------------------------------------------

		Parent2 p = new Parent2();
		p.num = 999;
		
		//-----------------------------------------------------
		
		p.display();
		c.display();
		
		System.out.println("---------------");
		
		//	Parent2 <- Child2 형변환
		
		Parent2 pc = new Child2();
		
		pc.num = 555;
		
		//동적바인딩, 인스턴스인 Child2타입의 display()메소드가 실행된다
		pc.display();
		
		//에러, Parent2타입에 print()메소드가 존재하지 않는다
//		pc.print();
		
		((Child2)pc).print();
		
		System.out.println("---------------");

		// 자식클래스를 부모 클래스타입으로 자동 형변환한다
		// 부모타입 객체 변수에 자식 타입 인스턴스를 저장한다
		
		// 부모타입객체를 자식 인스턴스타입으로 강제 형변환할 수 있다
		
		
		//에러, 부모 타입을 자식 타입으로 사용할 수 없다
		//	-> ClassCastException 예외 발생한다
//		Parent2 p2 = new Parent2();
//		((Child2)p2).num = 333;
		
//		Child2 c2 = (Child2)new Parent2();
//		c2.num = 444;
		
		//** ClassCastException 예외
		//	특정 클래스를 다른 클래스로 형변환하려고 시도할 때 발생한다
		
	}
}
















