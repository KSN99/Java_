package java_11;


public class abstractTest {

	public static void main(String[] args) {
		Unit[] group= {new Marine(), new Tank(),new Dropship()};
		for (int i=0; i<group.length;i++) {
			group[i].move(100,200);
		}
}
}
	
abstract class Unit{
	int x,y;
	abstract void move(int x, int y);
	void stop() {}
}

class Marine extends Unit{
	void move(int x, int y) {
		System.out.println("Marine[x="+x+"y="+y);
	}
}

class Tank extends Unit{
	void move(int x, int y) {
		System.out.println(x+y);
	}
}

class Dropship extends Unit{
	void move(int x, int y) {
		System.out.println(x+y);
	}
}

