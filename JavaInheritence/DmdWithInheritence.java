interface Red {

	void foo();

	void fun();
}

abstract class Blue implements Red{
	public void fun() {
		System.out.println("Blue / fun()\n ");
	}
}

class Violet extends Blue implements Red{

	@Override
	public void foo() {
		System.out.println("Red->Violet / foo()");
	}
}

//Putting comments to be changed

//Comments to create conflict - CCEP:65110

//Comments to create push conflict - CCEP-1000

//Comments to create push conflict - CCEP-2000

public class DmdWithInheritence {
	public static void main(String args[]) {
		Violet V = new Violet();
		V.foo();
		V.fun();

		Red R = new Violet();
		R.foo();
		R.fun();

		Blue B = new Violet();
		B.foo();
		B.fun();
	}
}
