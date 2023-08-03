package java04_control.selection;

public class Switch_01 {
	public static void main(String[] args) {
	
		//switch문, 선택문 (조건문)
		//	switch ~ case 문
		
		//------------------------------------------------------------
		
//		switch( 비교대상 ) {
//		case 비교값1:
//			실행코드1
//		
//		case 비교값2:
//			실행코드2
//		
//		case 비교값3:
//			실행코드3
//		
//		case 비교값4:
//			실행코드4
//		
//		default:
//			같은 값을 가지는 비교값이 없을 때 실행
//		}
		
		// 비교대상과 같은 값으로 지정한 case구문의 위치부터 아래쪽 코드를 전부 실행한다
		
		// 비교대상에는 정수형, 문자(char), 문자열(String) 타입이어야한다
		//	** 연산식도 사용할 수 있다
		
		// default: 부분은 생략할 수 있다
		
		//---------------------------------------------------------------------
		
		int num = 10;
//		int num = 20;
//		int num = 55;
		
		switch( num ) {
		
		case 10:
			System.out.println("num은 10입니다");
			break;
			
		case 20:
			System.out.println("num은 20입니다");
			break;
			
		case 30:
			System.out.println("num은 30입니다");
			break;
			
		default:
			System.out.println("num은 10, 20, 30 모두 아닙니다");
		}
		
		System.out.println("switch구문 바깥쪽");
		
	}	
}

















