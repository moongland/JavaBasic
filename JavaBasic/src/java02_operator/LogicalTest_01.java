package java02_operator;

public class LogicalTest_01 {
	public static void main(String[] args) {
		
		int a = 5, b = 6, c = 10, d;
		
		d = ++a * b--;
		
		System.out.println("a=" + a + ", b=" + b + ", d=" + d);
		
		d = a++ + ++c - b--;
		
		System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);

	}
}















