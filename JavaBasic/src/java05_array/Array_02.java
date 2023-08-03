package java05_array;

public class Array_02 {
	public static void main(String[] args) {
		
		int[] arr1; //배열 변수 선언
		arr1 = new int[5]; //배열 요소 생성

		int[] arr2 = new int[13];
		
		for(int i=0; i<13; i++) {
			arr2[i] = i;
		}
		
		//----------------------------------------------------
		
		//선언과 동시에 초기화
		int num = 100;
		
		//----------------------------------------------------
	
		//배열 공간의 선언과 동시에 초기화
		int[] arr3 = { 1, 2, 3, 4, 5, 6 };
		
//		arr3 = new int[6];
//		arr3[0] = 1;
//		arr3[1] = 2;
//		arr3[2] = 3;
//		...
//		arr3[5] = 6;
		
		//----------------------------------------------------
		
		//에러, 배열 초기화는 선언할 때에만 사용할 수 있다
//		arr3 = { 100, 200 };
		
		//----------------------------------------------------
		
		char[] chArr = { 'A', 'p', 'p', 'l', 'e' };
		
		double[] dArr = { 1.1, 2.2, 3.3, 4.4 };
		
		boolean[] bArr = { true, false, true, true, false, false, true };		
		
	}
}















