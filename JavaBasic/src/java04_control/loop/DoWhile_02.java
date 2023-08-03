package java04_control.loop;

public class DoWhile_02 {
	public static void main(String[] args) {
		
		//DoWhile 사용 예시
		
//		do {
//			// 메뉴 만들기
//
//			//	1. 사용자 정보 입력
//			//	2. 사용자 검색
//			//	3. 전체 사용자 출력
//			//	4. 종료
//		} while( 4번을 선택하지 않으면 true );
		
		
		//** 슈도 코드, 수도 코드, Pseudo Code
		//	가짜 코드
		//	실제 구현된 코드는 아니지만 흐름,알고리즘 등을 파악할 수 있도록 작성한 것
		
		//---------------------------------------------------------------------------
		
		
		int i=0;	//초기식
		
		do {
			System.out.println( i ); //수행 코드
			
			i++;	//증감식
		} while( i<5 );	//조건식
		
	}
}


















