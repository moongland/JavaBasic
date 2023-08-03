package java06_class.constructor;

class Constructor {
	
	//멤버 필드
	private int num1 = 111;
	private int num2 = 222;
	
	
	
	//--- 생성자 ---
	public Constructor() {
		System.out.println("디폴트 생성자");
		System.out.println("매개변수없는 생성자");
		
		//멤버필드의 값을 초기화한다
		//	-> 객체 생성이후 처음으로 저장되어야 할 값들을 대입한다
		
		num1 = 8000;
		num2 = 9000;
	}
	
	//일반 메소드 정의
	//	-> 생성자 만들 때 조심해야한다
	//	-> 생성자의 이름과 같은 일반 메소드를 작성하게될 수 있다! 조심하도록 한다!
	public void Constructor() {
	}

	
	//매개변수있는 생성자 - 오버로딩되었음
	public Constructor(int num1, int num2) {
//		this.num1 = num1;
//		this.num2 = num2;
		
		setNum1(num1);
		setNum2(num2);
		
	}
	
	
	//--- Getter, Setter ---
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}	
}

public class ConstructorEx_01 {
	public static void main(String[] args) {
	
		//객체 변수
		Constructor cons01;
		
		//객체 생성
		cons01 = new Constructor(); //생성자 호출
		
		//에러, private 필드에 접근할 수 없다
//		cons01.num1 = 5000;
		
		System.out.println("--- 생성자 호출 후 ---");
		System.out.println("num1: " + cons01.getNum1() + ", num2: " + cons01.getNum2());
		
		System.out.println();
		System.out.println("--------------------");
		
		Constructor cons_02;
		cons_02 = new Constructor(5555, 6666);		
		System.out.println("num1: " + cons_02.getNum1() + ", num2: " + cons_02.getNum2());

	}
	
	// 세로 화면 분할 단축키 : ctrl + shift + [
	// 가로 화면 분할 단축키 : ctrl + shift + -
}











