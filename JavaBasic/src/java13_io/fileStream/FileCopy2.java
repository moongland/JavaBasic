package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileCopy2 {
	public static void main(String[] args) {
		
		//입력대상 파일
		File src = new File("./src/java13_io/fileStream/", "Source.txt");
		System.out.println("[TEST] src exists : " + src.exists());
	
		//출력대상 파일
		File dest = new File("./src/java13_io/fileStream/", "Destination.txt");
		System.out.println("[TEST] dest exists : " + dest.exists());
		
		
		//파일 입출력을 보조할 변수
		byte[] buf = new byte[1024]; //임시 저장소
		int len = -1; //입출력 길이(크기)
		int total = 0; //총 입출력된 데이터의 길이(크기)
		
		
		//입출력 스트림 객체 변수
		try(	FileInputStream in = new FileInputStream(src);
				FileOutputStream out = new FileOutputStream(dest); ) {
			
			//파일 입력
			while( (len = in.read(buf)) != -1 ) {
				
				//파일 출력
				out.write(buf, 0, len);
				
				//복사된 데이터의 총 길이 계산
				total += len;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println();
		System.out.println(">> " + total + " 바이트 복사 완료");
		
	}
}
















