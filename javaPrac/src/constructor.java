class Car {
	String color;
	String gearType;
	String door;
	
	Car(){
		this("color","auto","4");
	}
	
	Car(String c, String b, String a){
		this.color = c;
		this.gearType = b;
		this.door= a;
	
	
	}
}


public class constructor {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.color+c.gearType+c.door);
	}

}
