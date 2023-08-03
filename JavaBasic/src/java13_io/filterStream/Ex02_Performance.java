package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_Performance {
	public static void main(String[] args) {

		
		//성능 평가
		//	-> 코드의 수행 시간을 측정한다
		
		//	1. 알고리즘(로직) 시작 전 현재시간 체크 -> start 변수에 저장
		
		//	2. 알고리즘 수행
		
		//	3. 알고리즘(로직) 완료 후 현재시간 체크 -> end 변수에 저장
		
		//	4. 두 시간의 차이를 구한다 -> 수행 시간 ( end - start )		
		
		//--------------------------------------------------------------
		
		//** System.currentTimeMillis();
		//	현재시간(EpochTime)을 밀리초 단위로 반환한다 
		
		long start = System.currentTimeMillis();
		
		//로직 수행
		
		long end = System.currentTimeMillis();
		
		System.out.println("수행시간 : " + ( end-start ) );
		
		
		//--------------------------------------------------------------
		
		//입력 대상 파일
		File file = new File("./src/java13_io/fileStream", "Source.txt");
		System.out.println("[TEST] exists : " + file.exists());
		
		//파일 입력 스트림 객체
		FileInputStream fis = null; //1차 스트림 - 파일 입력
		BufferedInputStream bis = null; //2차 스트림 - 성능 향상 입력
		
		
		//파일 입력관련 변수
		byte[] buf = new byte[1024]; //입력 데이터 버퍼
		int len = -1; //입력 데이터의 길이
		
		
		try {
			
			fis = new FileInputStream(file);	//1차, File -> FileInputStream
			
			start = System.currentTimeMillis();
			while( (len = fis.read(buf)) != -1 ) {}
			end = System.currentTimeMillis();
			
			System.out.println("fis : " + (end-start) );
			
			//-------------------------------------------------------------------
			
			bis = new BufferedInputStream( new FileInputStream(file) );
			
			start = System.currentTimeMillis();
			while( (len = bis.read(buf)) != -1 ) {}
			end = System.currentTimeMillis();
			
			System.out.println("bis : " + (end-start) );
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				
				//스트림 닫기
				//	-> 의존적인 관계의 객체는 생성된 역순으로 .close()해야 한다
				if(bis!=null)	bis.close();
//				if(fis!=null)	fis.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
















