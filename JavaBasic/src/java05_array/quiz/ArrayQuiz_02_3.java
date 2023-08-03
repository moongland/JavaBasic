package java05_array.quiz;

public class ArrayQuiz_02_3 {
	public static void main(String[] args) {
		int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};

//		 - arr 배열의 숫자들 중 높은 숫자가 1등이 되게하여
//		  rank_arr라는 배열에 순위를 입력하시오
//		 	=> arr :     { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }
//		     => rank_arr :{  5,  3, 10,7,  1,  5, 9, 7,  4,  2 }
		
		//-----------------------------------------------------------------
		
		int[] rank_arr = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) { //기준값
			
			//i번째 요소를 1등(가장 큰 값)으로 가정하고 초기화한다
			rank_arr[i] = 1;
			
			for(int j=0; j<arr.length; j++) { //비교대상
				
				//다른 숫자들과 비교하며 i번째요소(기준값)이 작으면 등수를 1 추가한다
				if( arr[i] < arr[j] ) {
					rank_arr[i]++;
				}
				
			}
			
		}
		
		//전체 출력
		for(int i=0; i<rank_arr.length; i++) {
			System.out.print(rank_arr[i] + " ");
		}
		
	}
}
