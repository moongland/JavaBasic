package java04_control.loop;

public class For_09 {
	public static void main(String[] args) {
		
		//for문 중첩, 2중 for문
		//	바깥쪽 반복문의 반복 횟수, 반복 구간에 맞춰서
		//	안쪽 반복문의 반복 횟수, 반복 구간을 생각해야 한다		
		
		//------------------------------------------------
		
		for(int i=0; i<3; i++) { // i, 0~2, x3
			
			for(int j=0; j<3; j++) { //j, 0~2, x3
				
				System.out.println("i:" + i + ", j:" + j);
				
			}
			
			System.out.println("-----");
			
		}
		
	}
}












