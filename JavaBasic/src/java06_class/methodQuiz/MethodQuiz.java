package java06_class.methodQuiz;

public class MethodQuiz {

	//Q1. 1~100출력 기능
	public void print100() {
		for(int i=0; i<100; i++) {
			System.out.println(i+1);
		}
	}
	
	//Q2. 전달인자만큼 "Hello"를 반복해서 출력하는 기능
	public void printHello( int num ) {
		for(int i=0; i<num; i++) {
			System.out.println("Hello");
		}
	}
	
	//Q3. 전달인자 숫자만큼, 전달인자 문자열을 출력하는 기능
	public void printData( int num, String data ) {
		
		for(int i=0; i<num; i++) {
			System.out.println( data );
		}
	}

}














