package java05_array;

public class Array_03 {
	public static void main(String[] args) {
		
		int[] arr = { 1,2,3,57,2,34,6,8,6457346,4745764,45,456,45674,876 };
		
		// ** 배열의 길이
		//	요소의 갯수
		//	배열의 크기
		
		//	->	배열이름.length
		
		//----------------------------------------------------------------
		
		System.out.println("배열의 길이 : " + arr.length);
	
		System.out.println("---------");
		
		//배열의 모든 요소 출력하기
		for(int i=0; i<arr.length; i++) {
			System.out.println( arr[i] );
		}
		
		System.out.println("---------");
		
		for (int i = 0; i < arr.length; i++) {
		}
		
	}
}













