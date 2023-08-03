package java10_collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Collection_07_Properties {
	public static void main(String[] args) {
		
		//Properties 객체
		Properties prop = new Properties();
		
		// .put() 메소드를 이용하면 Properties의 고유한 특성을 이용하지 않는다
//		prop.put(true, 123123);
		
		// .setProperty() , .getProperty() 를 이용하여 문자열타입의 key-value 쌍 관리
//		prop.setProperty("A", 100);
		prop.setProperty("A", "100");
		
		System.out.println( prop.getProperty("A") );
		
		prop.setProperty("username", "Alice");
		prop.setProperty("password", "Ali123");
		prop.setProperty("test", "data");
		
		System.out.println( prop );
		
		System.out.println("---------------");
		
		//Properties 객체를 파일로 저장하기
		
		//파일 출력 스트림 객체
		FileWriter writer = null;
		
		try {
			
			//파일 출력 스트림 생성
			//	-> 파일이 없을 경우 파일도 생성해준다
//			writer = new FileWriter("C:\\Users\\user1\\git\\repository\\JavaBasic\\src\\java10_collection\\user.properties");
			writer = new FileWriter("C:/Users/user1/git/repository/JavaBasic/src/java10_collection/user.properties");
			
			//Properties 객체의 데이터를 파일로 출력한다
			//	-> 파일에 객체의 데이터가 기록된다
			prop.store(writer, "comment: User Information");
			
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("--------------------");		

		//파일 입력 객체
		FileReader reader = null;
		
		//입력받은 데이터를 확인할 Properties 객체
		Properties test = new Properties();
		
			
		//파일 입력 스트림 생성
		try {
			reader = new FileReader("C:/Users/user1/git/repsitory/JavaBasic/src/java10_collection/user.properties");
			System.out.println("불러오기 전 : " + test);
			
			//파일에서 데이터 읽어오기
			test.load(reader);
			
			System.out.println("불러온 후 : " + test);
			
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
		
		
		
		System.out.println("--------------------");		

		//자바 API에서 기본으로 제공하는 Properties클래스
		
		//시스템의 설정 정보
		Properties sysProp = System.getProperties();

		System.out.println();
		System.out.println("--- 자바 정보 ---");
		
		System.out.println( sysProp.getProperty("java.version") ); //JDK 버전
		System.out.println( sysProp.getProperty("java.vendor") ); //JDK 배포 회사
		
		System.out.println();
		System.out.println("--- OS 정보 ---");
		System.out.println( sysProp.getProperty("os.name") ); //운영체제 이름
		
	}	
}































