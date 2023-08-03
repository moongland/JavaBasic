package java09_api;

public class ObjectEx {
	public static void main(String[] args) {
		
		Point p1 = new Point( 10, 20 );
		
		System.out.println( p1.toString() );	//전달인자 String 타입
		System.out.println( p1 );				//전달인자 Object 타입

//		System.out.println( 객체타입 );
		// ** 전달인자 객체의 .toString() 을 자동으로 호출한다

		System.out.println();
		System.out.println("--- equals() -----------------");
		
		Point p2 = new Point(11, 22);
		Point p3 = new Point(11, 22);
		Point p4 = p2;
		
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		
		// == 연산자 비교
		//		동일성 비교, identity
		//		같은 객체인지 비교한다
		//		참조값이 같은 지 비교한다
		//		객체변수에 저장된 값(참조값)이 같은 지 비교한다
		System.out.println();
		System.out.println("p2==p3 : " + (p2==p3));	//false, 동일하지 않음
		System.out.println("p2==p4 : " + (p2==p4));	//true, 동일함

		
		// .equals() 메소드 비교
		//		동등성 비교, equality
		//		객체의 값(인스턴스 변수값)이 같은 지 비교한다
		//		개발자가 재정의하여 인스턴스 변수의 값을 비교하도록 만들어야 한다
		System.out.println();
		System.out.println("p2.equals(p3) : " + p2.equals(p3));
		System.out.println("p2.equals(p4) : " + p2.equals(p4));
		
		System.out.println("--------------------");
		
		String s1 = new String("Apple");
		String s2 = new String("Apple");
		String s3 = new String("Banana");
		String s4 = "Apple";
		
		System.out.println("s1 == s2 : " + (s1==s2));
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		
		
		System.out.println();
		System.out.println("--- hashCode() -----------------");

		System.out.println("p2 : " + p2.hashCode());
		System.out.println("p3 : " + p3.hashCode());
		System.out.println("p4 : " + p4.hashCode());
		
		System.out.println();
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s3 : " + s3.hashCode());
		System.out.println("s4 : " + s4.hashCode());

		
		System.out.println();
		System.out.println("--- clone() -----------------");
		
		Point pOriginal = new Point( 33, 44 );
		
		//얕은 복사
		Point pClone1 = pOriginal;
		
		//깊은 복사
		Point pClone2 = new Point( pOriginal.getX(), pOriginal.getY() );
		
		
		//clone() 복사
		try {
			
			Point pClone = (Point)pOriginal.clone();
			
			System.out.println( pClone );
			
			System.out.println( pOriginal.hashCode() );
			System.out.println( pClone.hashCode() );
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}
















