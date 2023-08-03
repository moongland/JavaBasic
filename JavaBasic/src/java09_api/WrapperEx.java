package java09_api;

public class WrapperEx {
	public static void main(String[] args) {
		
		//int형 변수 (기본형)
		int num = 10;
		
		//Integer형 변수 (참조형)
		Integer iVal1 = num;
		Integer iVal2 = 12345;
		
		
		//생성자는 deprecate 되어있다
//		Integer iVal3 = new Integer(7346);
		
		
		//int타입 변수 (기본형)
		int i1 = iVal1;
		int i2 = iVal2;
	
		//---------------------------------------------------
		
		//자료형에 대한 정보
		System.out.println("BYTES : " + Integer.BYTES);
		System.out.println("SIZE : " + Integer.SIZE);
		
		System.out.println("Double BYTES : " + Double.BYTES);
		
		System.out.println("Boolean TRUE : " + Boolean.TRUE);
		System.out.println("Boolean FALSE : " + Boolean.FALSE);
		
		System.out.println("---------------");
		
		System.out.println("MIN_VALUE : " + Integer.MIN_VALUE);
		System.out.println("MAX_VALUE : " + Integer.MAX_VALUE);
		
		System.out.println("MIN_VALUE : " + Long.MIN_VALUE);
		System.out.println("MAX_VALUE : " + Long.MAX_VALUE);
		
		System.out.println("---------------");
		
		//** parse : 추출한다
		//	일정 패턴을 이용하여 원하는 형식의 데이터를 추출한다
		
		//문자열에서 int데이터를 추출한다
		int number = Integer.parseInt("12345");
		
		//문자열에서 double데이터를 추출한다
		double dNum = Double.parseDouble("523.3421");
		
		//문자열에서 boolean데이터를 추출한다
		boolean bData = Boolean.parseBoolean( "false" );
		
	}
}
















