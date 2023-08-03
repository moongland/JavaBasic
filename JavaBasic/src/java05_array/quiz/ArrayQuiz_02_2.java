package java05_array.quiz;

public class ArrayQuiz_02_2 {
	public static void main(String[] args) {
		
		 int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		 
//		 - arr 배열의
//		  (인덱스 숫자가 짝수인 요소의 합) - (인덱스 숫자가 홀수인 요소의 합)을
//		  구하시오
//		  	=> -5
		 
		 //----------------------------------------------------------------------
		 
		 int evenSum = 0; //짝수인덱스 요소의 합
		 int oddSum = 0; //홀수인덱스 요소의 합
		 
		 for(int i=0; i<arr.length; i++) {
			 if( i%2==0 ) { //짝수인덱스
				 evenSum += arr[i];
			 } else { //홀수인덱스
				 oddSum += arr[i];
			 }
		 }
		 
		 System.out.println( evenSum - oddSum );
		 
	}
}
