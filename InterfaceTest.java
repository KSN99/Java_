class A{
	public void method(I i) {
		i.method();
	}
}

interface I {
	public void method();
}

class B implements I{
	public void method() {
		System.out.println("B method");
	}
}

class C implements I{
	public void method() {
		System.out.println("C method");
	}
}


public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.method(new B()); // A가 B의 의존
		a.method(new C());
	}

}
