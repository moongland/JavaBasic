package java05_array.array2D;

public class Array2D_02 {
	public static void main(String[] args) {
		
		//1차원 배열의 선언의 동시에 초기화
		int[] arr1D = { 1, 2, 3, 4, 5 };
		
		//2차원 배열의 선언의 동시에 초기화
		int[][] arr2D = {
				{ 1, 2, 3 },
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } 
			};
		//	-> 3행 3열의 2차원 배열이 생성된다
		//	-> 3x3배열, 3 by 3 array
		
		//------------------------------------------------------
		
		//전체 데이터 출력하기 - for
		
		for(int i=0; i<3; i++) { //i행, 0~2
			
			for(int j=0; j<3; j++) { //j열, 0~2
				
				System.out.print( arr2D[i][j] + " " );
				
			}
			
			System.out.println();
			
		}
		
		System.out.println("---------------");
		
		arr2D = new int[5][4];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				System.out.print( arr2D[i][j] + " " );
			}
			System.out.println();
		}

	}
}












