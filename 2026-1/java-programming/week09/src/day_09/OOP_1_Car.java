package day_09;
import java.util.Scanner;

public class OOP_1_Car {
	public static void main(String[] args) {
		
		
	}

	static void func0() {
		
		Car c1 = new Car();
		c1.setColor("red");
		c1.setDoor(3);
		
		Car c2 = new Car();
		c2.setColor("white");
		c2.setDoor(4);
				
		c1.printInfo();
		c2.printInfo();

	}
	
	static void func1() {
		Car arr[] = new Car[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<arr.length; i++)
	}
}

class Car{
	private String color;
	private int door;
	
	void printInfo() {
		System.out.println(color + ", " + door +"도어");
	}
	
	String getColor() {
		return color;
	}
	
	void setColor(String str) {
		System.out.println("컬러 변경 " + str);
		color = str;
		}
	
	int getDoor() { return door; }
	void setDoor(int num) { door = num; }
	
} 