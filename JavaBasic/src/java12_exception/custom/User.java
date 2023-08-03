package java12_exception.custom;

public class User {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws UserAgeException {
		
		//나이가 0보다 작거나
		//150보다 큰 경우
		//	-> 정상적이지 않은 상황으로 정의
		//	-> 예외 상황
		if( age<0 || age>150 ) {
			
//			System.out.println("나이는 0~150사이로 입력하세요");
//			return;
		
			//예외 발생
			throw new UserAgeException();
			
		}
		
		this.age = age;
	}
	
}

















