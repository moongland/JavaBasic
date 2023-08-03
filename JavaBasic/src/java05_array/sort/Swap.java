package java05_array.sort;

public class Swap {
	public static void main(String[] args) {
		
		//스왑, swap, 교환하기, 맞바꾸기
		
		int num1 = 11;
		int num2 = 22;
		
		//잘못 생각한 코드
//		num2 = num1;
//		num1 = num2;
		
		
		System.out.println("[스왑 전] " + num1 + " : " + num2);
		
		
		//스왑 코드
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		
		System.out.println("[스왑 후] " + num1 + " : " + num2);
		
	}
}











