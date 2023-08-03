package java01_variables;

public class VariablesQuiz {
	// 변수에 알맞은 타입을 골라
	// 선언하고
	// 대입한 후
	// 모든 변수의 데이터를 출력해보자.

	// 이름, 나이, 성별, 키

	//	출력 예시
	//	이름 : Alice
	//	나이 : 99
	//	성별 : 남
	//	키 : 222.66

	//	ex)
	//	System.out.println("이름 : " + name);

	public static void main(String[] args) {
		
		// ** 필요한 데이터	-> 변수
		// 이름, 나이, 성별, 키

		// 1. 변수에 알맞을 타입 고르기
		
		//	이름	- 문자열	-> String
		//	나이	- 정수		-> int
		//	성별	- 단일 문자, 문자열	-> char
		//	키		- 실수		-> double
		
		
		// 2. 변수 선언
		String name; //이름
		int age; //나이
		char gender; //성별
		double height; //키

		
		//3. 대입
		name = "김개똥";
		age = 24;
		gender = '남';
		height = 198.2;
		
		//4. 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height);
		
		System.out.println("----------");
		
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender + ", 키 : " + height);
		
		System.out.println("----------");
		
		System.out.print("이름 : " + name);
		System.out.print(", 나이 : " + age);
		System.out.print(", 성별 : " + gender);
		System.out.println(", 키 : " + height);
		
		System.out.println("----------");

		System.out.println("HI HELLO HOLA");
		
		System.out.println("HI\nHELLO\nHOLA");
		
		//**	'\n' : 줄바꿈 문자, 개행 문자
		//		( ASCII 10 - LF, Line Feed, 줄 먹이기 )
	
		System.out.println("HI");
		System.out.println("HELLO");
		System.out.println("HOLA");
		
		System.out.println("----------");
		
		System.out.println("Apple");		
		
		System.out.print("Apple\n");
		
		System.out.print("Apple");
		System.out.print("\n");
		
		System.out.print("Apple");
		System.out.println(); //줄바꿈 수행
		
	}
}















