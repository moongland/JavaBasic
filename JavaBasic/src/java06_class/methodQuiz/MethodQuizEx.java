package java06_class.methodQuiz;

public class MethodQuizEx {
	public static void main(String[] args) {

		MethodQuiz mq = new MethodQuiz();
		
		//전달인자 없음
		mq.print100();
		
		//전달인자 1개 : int형 7
		mq.printHello(7);
		
		//전달인자 2개 : int형 3, String형 "안녕"
		mq.printData(3, "안녕!");
		
	}
}

















