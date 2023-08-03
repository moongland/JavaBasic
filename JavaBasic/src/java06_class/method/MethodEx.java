package java06_class.method;

//실행 클래스
public class MethodEx {
	public static void main(String[] args) {
		
		//객체 생성
		Method_01 m01 = new Method_01();
		
		//메소드 호출
		m01.hello();
	
		System.out.println("---------------");
		
		int result = m01.subtract(500, 600);
		System.out.println("뺄셈 결과 : " + result);
		
		System.out.println("빼기 : " + m01.subtract(500, 200));
		
	}
}
















