package java04_control.loop;

public class For_07_v2 {
	public static void main(String[] args) {
		
		int total = 0;
		
//		for( int day = 0, money = 10; day < 15; day++, total += money, money *= 2 ) {}
		
//		for( int day = 0, money = 10; day < 15; day++, total += money, money *= 2 );
		
		int day = 0, money = 10;
		for( ; day < 15;  ) {
			day++;
			total += money;
			money *= 2;
		}
		
		System.out.println();
		System.out.println("저축한 총 금액 : " + total + "원");
		
	}
	
}


















