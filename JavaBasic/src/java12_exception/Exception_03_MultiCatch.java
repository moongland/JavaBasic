package java12_exception;

public class Exception_03_MultiCatch {
	public static void main(String[] args) {
		
		try {
			//try 블록
			//예외 발생이 예측된 코드를 작성한다
			
		} catch (NullPointerException e) {
			//catch 블록
			//NullPointerException 예외 발생 시 예외처리할 코드를 작성한다
			
			e.printStackTrace();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			//catch 블록
			//ArrayIndexOutOfBoundsException 예외 발생 시 예외처리할 코드를 작성한다
			
			e.printStackTrace();

		} catch (Exception e) {
			//catch 블록
			// NullPointerException 과 ArrayIndexOutOfBoundsException 이
			//아닌 나머지 예외 발생 시 예외처리할 코드를 작성한다
			
			e.printStackTrace();
			
		}
		
		//** catch블록 구문은 여러 개 작성할 수 있다
		
		//---------------------------------------------------------------------
		
		//Multi Catch 구문
		//	-> 하나의 catch구문에 여러 예외 클래스를 적용하는 문법
		
		try {
			
		} catch ( NullPointerException|ArrayIndexOutOfBoundsException e ) {
			// 멀티 캐치 구문
			
			e.printStackTrace();
			
		} catch (Exception e) {
			// 추가 catch 구문 작성 가능
			
		}
		
		
	}
}














