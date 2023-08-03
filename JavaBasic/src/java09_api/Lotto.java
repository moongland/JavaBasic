package java09_api;

import java.util.Random;

public class Lotto {

	//랜덤 객체
	private Random ran = new Random();

	
	public void makeLotto(int[] lotto) {
		
		//전체 6개 랜덤 수 구하기
		for(int i=0; i<lotto.length; i++) {
			
			int num = ran.nextInt(45) + 1; // 1~45 중 하나
			
			
			//--- 중복 값 제거하기 ---
			
			//** flag 변수
			//	로직 수행 결과(상태값)을 저장하는 변수
			//	로직이 종료된 이후에서 로직 수행 결과를 유지하는 역할
			
			
			
			//중복된 값인지 체크하는 변수
			//	true : 중복데이터 이미 있음
			//	false : 중복데이터 없음
			boolean isExist = false;
			
			
			//이미 생성한 값들 중에서 중복값이 존재하는 지 검사한다
			for(int j=0; j<i; j++) {
				
				//중복되는 값이 있는 경우
				if( lotto[j] == num ) {
					isExist = true;
					
					break; //중복 검사 중단
				}
				
			}

			
			//중복되는 값이 존재할 경우
			if( isExist ) {
				i--; //반복횟수 한번 추가
				continue;
			}
			
			//------------------------
			
			
			//랜덤값 배열에 대입하기
			lotto[i] = num;
		}
		
	}
	
	public void makeLotto2(int[][] lotto) {

		for(int i=0; i<lotto.length; i++) {
			makeLotto(lotto[i]);			
		}
		
	}
}

















