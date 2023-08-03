package java05_array.quiz;

public class ArrayQuiz_02_4 {
	public static void main(String[] args) {
		
		int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};

//		 - arr 배열의 요소들 중 중복된 값은 over_arr에 넣고 중복되지
//		  않은 값은 ret_arr에 입력하시오
//		 	** over_arr, ret_arr은 길이가 10인 배열로 작성한다
//		 	
//		 	출력한다면 (정렬도 할 수 있으면 해도 됨)
//		 	=> over_arr : 9, 10
//		 	=> ret_arr : 3, 8, 13, 17, 21, 27

		//-----------------------------------------------------------------------
		
		int[] over_arr = new int[arr.length]; //중복 값 배열
		int[] ret_arr = new int[arr.length]; //중복이 아닌 값 배열
		
		int overCnt = 0; //중복값의 개수		
		int retCnt = 0; //중복이 아닌 값의 개수
		
		for(int i=0; i<arr.length; i++) { //기준값
			
			boolean isOverlap = false; //중복값이면 true
			
			//이미 중복값으로 판별된 숫자인지 확인
			for(int j=0; j<over_arr.length; j++) {
				if( arr[i] == over_arr[j] ) {
					isOverlap = true;
					break;
				}
			}
			
			//이전에 중복값으로 판별된 숫자라면 건너뜀
			if( isOverlap ) {
				continue;
				
			} else {
				
				// 비교해보지 않는 인덱스(기준값의 오른쪽 요소들)에
				//중복값이 있는지 확인한다
				for(int j=i+1; j<arr.length; j++) {
					if( arr[i] == arr[j] ) { //중복값 발견
						isOverlap = true;
						break;
					}
				}
				
			}
			
			//최종 처리
			if(isOverlap) {
				over_arr[overCnt++] = arr[i];
				
			} else {
				ret_arr[retCnt++] = arr[i];
				
			}
		}
		
		
		
		//API를 이용한 정렬
//		Arrays.sort(over_arr);
//		Arrays.sort(ret_arr);
		
		
		
		//--- 버블 정렬 ---
		for(int i=0; i<over_arr.length-1; i++) {
			for(int j=0; j<over_arr.length-1-i; j++) {
				
				//0은 스왑하지 않음
				if( over_arr[j] > over_arr[j+1] && over_arr[j+1] != 0 ) {
					int tmp = over_arr[j];
					over_arr[j] = over_arr[j+1];
					over_arr[j+1] = tmp;
				}
			}
		}

		for(int i=0; i<ret_arr.length-1; i++) {
			for(int j=0; j<ret_arr.length-1-i; j++) {
				
				//0은 스왑하지 않음
				if( ret_arr[j] > ret_arr[j+1] && ret_arr[j+1] != 0 ) {
					int tmp = ret_arr[j];
					ret_arr[j] = ret_arr[j+1];
					ret_arr[j+1] = tmp;
				}
			}
		}
		//-----------------

		
		
		//--- 최종 출력 ---
		System.out.print("Overlap: ");
//		for(int i=0; i<over_arr.length; i++) {
		for(int i=0; i<overCnt; i++) {
			System.out.print(over_arr[i] + " ");
		}
		System.out.println();
		
		System.out.print("Return: ");
//		for(int i=0; i<ret_arr.length; i++) {
		for(int i=0; i<retCnt; i++) {
			System.out.print(ret_arr[i] + " ");
		}
		System.out.println();
		//----------------
		
	}
}
