package java08_abstract.interfaceEx.multiple;

public class Child extends Parent implements Inter_01, Inter_02 {

	@Override
	public void out() {
		System.out.println("자식 클래스");
	}
	
}
