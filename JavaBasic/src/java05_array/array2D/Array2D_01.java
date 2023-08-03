package java05_array.array2D;

public class Array2D_01 {
	public static void main(String[] args) {
		
		//2차원 배열
		
		int num;		//int형 변수 선언			-> 정수값 1개 저장
		
		int[] arr1D;	//int형배열 변수 선언		-> 정수값 여러 개 저장
		
		int[][] arr2D;	//int형2차원배열 변수 선언	-> int형배열 여러 개 저장
				// -> ((정수값)의 여러 개 묶음) 을 한 번 더 여러 개로 포장한 것
		
		int[][][] arr3D;	//int형 3차원 배열 변수
		int[][][][] arr4D;	//int형 4차원 배열 변수
		int[][][][][] arr5D;	//int형 5차원 배열 변수
		
		//-----------------------------------------------------------------
		
//		int[][] data = new int[2][3];
//		int[] testArr = new int[9];
//		int[][] arr = new int[2][];
//		arr[0] = new int[3];
		
		//-----------------------------------------------------------------
		
		//2차원 배열 선언
		int[][] arr;
		
		//2차원 배열 생성(new 연산자)
		arr = new int[3][2];	//3행 2열 크기의 int형 변수 공간으로 생성된다
		
		//1행 0열 인덱스 요소에 5555값 대입
		arr[1][0] = 5555;
		
		System.out.println( arr[1][0] );
		
		//-------------------------------------------------------------
		
		//배열 변수의 선언
		int[] arr2;		//추천
		int arr3[];		//비추천

		
		int[][] arr4;	//추천
		int[] arr5[];	//비추천
		int arr6[][];	//비추천
		
	}
}














