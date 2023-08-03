package java08_abstract.interfaceEx;

public class Test3 extends TestClass implements TestInterface {

	//--- TestInterface에서 상속됨 ---
	@Override
	public void out() {
	}
	@Override
	public void display() {
	}
	//--------------------------------

	//--- TestClass에서 상속됨 ---
	@Override
	public void method1() {
	}
	@Override
	public void method2() {
	}
	//----------------------------

}

