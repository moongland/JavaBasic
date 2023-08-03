package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileCopy {
	public static void main(String[] args) {
		
		//	Quiz.
		
		//	Source.txt 파일의 내용을 읽어들여 Destination.txt 파일로 저장한다
		//	-> 파일 복사
		
		//	49,520,698  bytes
		
		//	Source.txt ---> FileCopy ---> Destination.txt
		
		//-----------------------------------------------------------------------
		
		//입력대상 파일
		File src = new File("./src/java13_io/fileStream/", "Source.txt");
		System.out.println("[TEST] src exists : " + src.exists());
	
		//출력대상 파일
		File dest = new File("./src/java13_io/fileStream/", "Destination.txt");
		System.out.println("[TEST] dest exists : " + dest.exists());
		
		
		//입출력 스트림 객체 변수
		FileInputStream in = null;
		FileOutputStream out = null;
		
		
		//파일 입출력을 보조할 변수
		byte[] buf = new byte[1024]; //임시 저장소
		int len = -1; //입출력 길이(크기)
		int total = 0; //총 입출력된 데이터의 길이(크기)
		
		
		try {
			
			//파일 입출력 스트림 생성
			in = new FileInputStream(src);		//Source.txt 파일에 대한 입력 스트림
			out = new FileOutputStream(dest);	//Destionation.txt 파일에 대한 출력 스트림
			
			
			//입력스트림 처리
			//while( 반복적으로 read ) {
			//	출력 write
			//}

			
//			in.read(buf);
//			out.write(buf);
			
			
			//in 스트림에서 더 이상 읽어들일 데이터가 없을 때
			//	-> Source.txt 파일의 오프셋(offset)이 파일의 끝에 도달했을 때
			//	-> End of Stream
			//	-> End of File
			//	-> EOF

			
//			while( true ) {
//				len = in.read(buf);
//				
//				//End Of Stream
//				if( len == -1 ) {
//					break;
//				}
//				
//				out.write(buf, 0, len);
//			}
			
			//파일 입력
			while( (len = in.read(buf)) != -1 ) {
				
				//파일 출력
				out.write(buf, 0, len);
				
				//진행상황 콘솔 출력
//				System.out.print( new String( buf, 0, len ) );
				
				//복사된 데이터의 총 길이 계산
				total += len;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//출력스트림 닫기
				if(out!=null)	out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				//입력스트림 닫기
				if(in!=null)	in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println();
		System.out.println(">> " + total + " 바이트 복사 완료");
		
	}
}
















