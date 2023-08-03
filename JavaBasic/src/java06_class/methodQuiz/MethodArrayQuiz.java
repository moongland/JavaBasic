package java06_class.methodQuiz;

public class MethodArrayQuiz {

	public void mul10(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] *= 10;
		}
	}

	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i] + " " );
		}
		System.out.println();
	}
	
}






