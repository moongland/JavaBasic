package java09_api;

import java.util.Arrays;
import java.util.Random;

public class Random_Lotto {
	public static void main(String[] args) {
		
		//랜덤 숫자(1~45) 6개 생성
		//	-> 중복되지않은 숫자
		//-----------------------------------------------------
		
		//로또 번호 배열
		int[] lotto = new int[6];
		
		Lotto l = new Lotto();
		l.makeLotto( lotto );

		Arrays.sort(lotto); //정렬
		System.out.println( Arrays.toString(lotto) );
		
		//-----------------------------------------------------
		System.out.println("--------------------");
		
		int[][] lotto2 = new int[5][6];
		
		l.makeLotto2(lotto2);
		
		for(int i=0; i<5; i++) {
			Arrays.sort(lotto2[i]);
		}
		
		for(int i=0; i<5; i++) {
			System.out.println( Arrays.toString(lotto2[i]) );
		}
		
	}
}













