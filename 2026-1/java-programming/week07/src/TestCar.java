package java_basic_2;

public class TestCar {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.color = "red";
		c1.door = 4;
		
		Car c2 = new Car();
		c2.color = "white";
		c2.door = 4;
		
		c1.printInfo();
		c2.printInfo();
		
	}
}

class Car {
	
	String color;
	int door;
	
	void printInfo() {
		System.out.println(color + ", " + door + "도어");
	}
	
}