package java12_exception;

public class Exception_02_TryCatch {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		int i=0;

		try {

			while( true ) {
				arr[i] = i+1;
				i++;
			}

		} catch (ArrayIndexOutOfBoundsException e) {

			//sysout - 표준 출력 스트림
//			System.out.println("[예외가 발생했습니다]");

			//syserr - 표준 에러 스트림
			System.err.println("[예외가 발생했습니다]");

			//예외 상황 출력 (Method Call Stack Trace)
//			e.printStackTrace();
			
		} finally {
			System.out.println("예외 처리 이후 무조건 실행");
			
		}
		
		System.out.println("+ + + 프로그램 종료 + + +");
		
	}
}









