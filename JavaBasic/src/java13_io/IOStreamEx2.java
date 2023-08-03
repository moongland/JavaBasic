package java13_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStreamEx2 {
	public static void main(String[] args) {
		
		//키보드 입력스트림 -> 프로그램 -> 모니터 출력스트림
		//-----------------------------------------------------------
		
		byte[] buf = new byte[1024]; //입출력 데이터의 임시 저장소
		int len = -1; //입력 데이터의 길이
		
		
		try (	InputStream is = System.in;
				OutputStream os = System.out ) {
			
			//입력 데이터가 EOF가 될 때까지 반복적으로 입력한다
			while( ( len = is.read(buf) ) != -1 ) {
				
				//입력 받은 데이터를 출력한다
				os.write(buf, 0, len);

				//출력 버퍼 비우기
				os.flush();
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
}













