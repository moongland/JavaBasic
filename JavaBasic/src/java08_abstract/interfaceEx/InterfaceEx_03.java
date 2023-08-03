package java08_abstract.interfaceEx;

interface InterA {
	public abstract void getA();
}

interface InterB {
	public abstract void getB();
}

interface InterC extends InterA, InterB {
	public abstract void getC();
}

//class Children implements InterA, InterB, InterC {
class Children implements InterC {
	@Override
	public void getC() {
	}
	@Override
	public void getB() {
	}
	@Override
	public void getA() {
	}	
}

//** 클래스가 클래스를 상속받을 때 extends			(다중상속 X)
//** 인터페이스가 인터페이스를 상속받을 때 extends	(다중상속 O)

//** 클래스가 인터페이스를 상속받은 때 implements	(다중상속 O)















public class InterfaceEx_03 {
	public static void main(String[] args) {
	}
}
