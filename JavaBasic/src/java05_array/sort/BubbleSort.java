package java05_array.sort;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {
	public static void main(String[] args) {
		
		//버블 정렬
		int[] arr = { 3, 2, 5, 4, 1 };
		
		//--- 원본 출력 ---
		System.out.println("--- 정렬 전 ---");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		//--- 버블 정렬 수행 --- (구현!)
		
		//전체 회차 진행
		for(int j=0; j<arr.length-1; j++) {
			
			//각 회차 반복
			for(int i=0; i<arr.length-1-j; i++) {	//i, 0 ~ 3-j	-> 모든 요소
				
				//인접한 두 요소를 비교하고 왼쪽이 크면 스왑
//				if( arr[i] > arr[i+1] ) {//오름차순	//i+1, 1 ~ 4-j
				if( arr[i] < arr[i+1] ) {//내림차순	//i+1, 1 ~ 4-j
					
					//스왑
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					
				}
				
			}
			
			//전체 데이터 출력 - 진행 중간 과정 확인
			System.out.println();
			System.out.print("TEST " + (j+1) + "회 ] ");
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
			}	
			System.out.println();
			
		}

		
		
		
		//--- 결과 출력 ---
		System.out.println();
		System.out.println("--- 정렬 후 ---");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		
		System.out.println("--------------------");
		
		
		int[] arr2 = { 56, 3, 4, 7, 23, 9, 2346, 567 };
		
		//정렬
		Arrays.sort(arr2);
		
		System.out.println( Arrays.toString(arr2) );		
		
	}
}














