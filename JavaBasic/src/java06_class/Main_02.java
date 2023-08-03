package java06_class;

//실행 클래스
public class Main_02 {
	public static void main(String[] args) {
		
		Class_02 cl = new Class_02();
		
		System.out.println( cl.num4 ); //public
		System.out.println( cl.num3 ); //protected
		System.out.println( cl.num2 ); //default
		
		
		//공개 범위에 맞지 않는 멤버에 접근하면 "~is not visible" 에러가 나온다
//		System.out.println( cl.num1 ); //private
		
	}
}















