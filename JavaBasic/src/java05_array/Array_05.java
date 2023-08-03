package java05_array;

public class Array_05 {
	public static void main(String[] args) {
		
		//문자열
		String str = "Apple";
		
		//--------------------------------------------
		
		//String배열 타입 변수 선언
		String[] strArr;
		
		//String배열 공간 생성 (3개짜리)
		strArr = new String[3];

		//"Apple", "Banana", "Cherry" 저장(대입) 하기
		strArr[0] = "Apple";
		strArr[1] = "Banana";
		strArr[2] = "Cherry";
		
		//전체 문자열 출력
		for( int i=0; i<strArr.length; i++ ) {
			
			System.out.println( strArr[i] );
			System.out.println( strArr[i].length() );

			//	strArr		-> String[] 타입
			//	strArr[i]	-> String타입
			
			//	strArr.length		-> 문자열 배열의 길이 (문자열의 갯수)
			//	strArr[i].length()	-> 문자열의 길이 (문자 갯수)
			
			System.out.println("----------");
			
		}
		
	}
}












