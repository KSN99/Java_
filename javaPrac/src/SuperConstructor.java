package chap_06;

class Point {
	int x,y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

class Point3D extends Point{
	int z;
	Point3D(int x, int y, int z){
		super(x, y);
		this.z=z;
	}
}

public class SuperConstructor {

	public SuperConstructor() {
	}

	public static void main(String[] args) {
		Point3D p= new Point3D(3, 3, 6);
		System.out.println(p.x+","+p.y+","+p.z);
	}

}
