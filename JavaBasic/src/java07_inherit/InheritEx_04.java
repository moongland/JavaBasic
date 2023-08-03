package java07_inherit;

class Parent4 {
	protected int num;
	
	public Parent4() {
		
		//this 생성자 호출 코드, 같은 클래스의 다른 생성자를 호출한다
//		this(0);
//		this(555);
		
		System.out.println("부모 디폴트 생성자");
	}

	public Parent4(int num) {
//		this();
		
		System.out.println("부모 매개변수있는 생성자");
		
		this.num = num;
	}
}

class Child4 extends Parent4 {
	
	public Child4() {
		
		//부모 생성자 호출 코드, super생성자 호출
		//	-> 자식클래스의 생성자는 항상 super(); 첫 코드로 수행한다
		//	-> 평소에는 생략되어있다
//		super();
		
		System.out.println("자식 디폴트 생성자");
	}
	
	public Child4(int num) {

		//** 부모 생성자 호출하는 코드를 작성하지 않으면
		//	기본적으로 부모 디폴트 생성자를 호출한다
		
		
		//부모 디폴트 생성자를 호출한다
//		super();
		
		//부모 매개변수있는 생성자를 호출한다
		super(num);
		
		
		System.out.println("자식 매개변수있는 생성자");
		
		//상속받은 num 필드 초기화
//		super.num = num;

		//에러 안남, Child4에 num 필드가 없어서 super영역에서 찾는다
//		this.num = num;
		
	}
	
}

public class InheritEx_04 {
	public static void main(String[] args) {
		
		Parent4 p1 = new Parent4();
		
		System.out.println("--------------------");
		
		Parent4 p2 = new Parent4(111);
		
		System.out.println("--------------------");
		
		Child4 c1 = new Child4();
		
		System.out.println("--------------------");
		
		Child4 c2 = new Child4(222);
		
	}	
}













