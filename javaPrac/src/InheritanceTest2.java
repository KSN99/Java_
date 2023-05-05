package chap_06;



class Tvvv extends Object{
	void test() {System.out.println("TestParent");}
}

class TvDvd extends Tvvv{
	Dvd dvd = new Dvd();
}


class Dvd{
	void test2() {System.out.println("composition");}
}

public class InheritanceTest2 {
	public InheritanceTest2() {
	}

	public static void main(String[] args) {
		TvDvd d = new TvDvd();
		d.test();
		d.dvd.test2();
	}

}
