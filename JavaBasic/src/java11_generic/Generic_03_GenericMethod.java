package java11_generic;

//일반 클래스
class Class03 {
	
	//일반 메소드 -> <T>적용 -> 제네릭 메소드
	public <T> void display(int num) {
		int data;
	}

	//제네릭 메소드
	public <T> T out(T obj) {
		T data = obj;
		
		return data;
	}
	
}



public class Generic_03_GenericMethod {
	public static void main(String[] args) {
		
		//일반 클래스 생성
		Class03 cl = new Class03();
		
		// 메소드 호출 시에는 타입 파라미터를 전달인자의 타입을 보고
		//타입 파라미터가 결정된다
		//	-> 자동으로 Integer로 결정된다
		cl.out(12345);

		//------------------------------------------------------------
		
		//에러, T->Double 결정 후 호출
		//	-> int형 사용 할 수 없음
//		cl.<Double>out(12345);
		
		cl.<Boolean>out(true);
		
	}
}
















