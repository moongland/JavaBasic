package java06_class.constructor;

class Constructor_02 {
	
	//멤버필드
	private int n1;
	private int n2;
	
	
	//this키워드
	//	-> 자기 참조 객체
	//	-> 클래스 코드에서 멤버필드나 멤버메소드를 지칭할 때 사용할 수 있다
	
	//	-> 매개변수나 다른 변수와 이름이 겹칠 때 사용한다
	
	
	
	//모든 멤버필드를 초기화하는 매개변수 있는 생성자
	//	-> 단축키 : alt + shift + s , o
	public Constructor_02(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
		
		
		System.out.println("매개변수가 2개인 생성자");
	}
	
	


	public Constructor_02(int n1) {
		//this 생성자 호출
		//	-> 다른 생성자를 호출하는 코드
		//	-> 반드시 생성자의 첫 번째 코드로 작성되어야 한다
		this(n1, 0);

//		this.n1 = n1;
		
		System.out.println("매개변수가 1개인 생성자");
	}




	//디폴트 생성자
	//	-> 단축키 : ctrl + space
	public Constructor_02() {
		this(0, 0);		
		
//		n1 = 0;
//		n2 = 0;
		
		System.out.println("디폴트 생성자");
	}
	
	
	//모든 멤버필드의 값을 출력하는 일반 메소드
	public void out() {
		System.out.println("n1 : " + n1 + ", n2 : " + n2);
	}
	
}

public class ConstructorEx_02 {
	public static void main(String[] args) {
		
		Constructor_02 cons01 = new Constructor_02(111, 222);
		cons01.out();
		
		System.out.println("--------------------");
		
		Constructor_02 cons02 = new Constructor_02(333);
		cons02.out();
		
		System.out.println("--------------------");
		
		Constructor_02 cons03 = new Constructor_02();
		cons03.out();
		
	}
}













