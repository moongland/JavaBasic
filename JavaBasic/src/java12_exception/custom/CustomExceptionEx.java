package java12_exception.custom;

public class CustomExceptionEx {
	public static void main(String[] args) {
		
		User user = new User();
		
		try {
			user.setAge( 55 );
		} catch (UserAgeException e) {
			e.printStackTrace();
		}
		
		try {
			user.setAge( -99 );
		} catch (UserAgeException e) {
			e.printStackTrace();
		}
		
	}
}
