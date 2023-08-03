package java04_control.condition;

public class IfElse_03 {
	public static void main(String[] args) {
		
		int num = 44;
		
		if( num>0 && num<=100 ) {
			System.out.println("num은 1~100사이의 정수");
		}
		
		System.out.println("----------");
		
		if( num>0 ) {
			System.out.println("0보다 크다");
			
			if( num<=100 ) {
				System.out.println("0보다 크다");
				System.out.println("100보다 작거나 같다");
				
			} else {
				System.out.println("0보다 크다");
				System.out.println("100보다 작거나 같지 않다");
				
				System.out.println("100보다 크다");
				
			}
			
			System.out.println("0보다 크다");
			
		} else {
			System.out.println("0보다 크지 않다");
			System.out.println("0과 같거나 작다");
			
			if( num == 0 ) {
				System.out.println("0과 같다");
				
			} else {
				System.out.println("0과 같지 않다");
				
				System.out.println("0보다 작다");
				
			}
			
		}

	}
}
















