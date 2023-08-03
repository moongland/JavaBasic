package java05_array.quiz;

public class ArrayQuiz_02_1 {
	public static void main(String[] args) {
		
//		 int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
//		 배열이 선언된 뒤 문제를 푸시오
//
//		 - arr 배열을 invert_arr라는 배열에 거꾸로 입력하시오
//		 => invert_arr : { 21, 13, 9, 8, 10, 27, 9, 3, 17, 10 }

		//----------------------------------------------------------------------
		
		int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		
		int[] invert_arr = new int[arr.length];
		
		//i, 0 ~ length-1 ( arr의 인덱스 진행 )

		//	-> length-1-i ( invert_arr의 인덱스 진행 )
		//	-> i값이 커질수록 length-1-i는 작아지도록 진행한다
		
		for(int i=0; i<invert_arr.length; i++) { //i, 0 ~ length-1
			
//			invert_arr[invert_arr.length-1-i] = arr[i];
			
			invert_arr[i] = arr[invert_arr.length-1-i];
			
		}

		for(int i=0; i<invert_arr.length; i++) {
			System.out.print(invert_arr[i] + " ");
		}
		
	}
}
