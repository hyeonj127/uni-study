package day_09;

public class OOP_4_TvTest {
	public static void main(String[] args) {
		func1();
	}
	
	static void func0() {
		
		Tv t = new Tv();
		t.setChannel(7);
		t.channelUp();
		System.out.println(t.getChannel());

	}
	
	static void func1() {
		
		Tv t1 = new Tv();
		t1.setChannel(5);
		
		Tv t2 = new Tv();
		t2.setChannel(11);
		
		System.out.println("t1: " + t1.getChannel() + ", t2: " + t2.getChannel());
		
	}
}

class Tv{
	private boolean power;
	private int channel;
	
	void power() { power = !power; }
	void channelUp(){ channel++; }
	void channelDown() { channel--;	}
	
	void setChannel(int num) {
		channel = num;
	}
	
	int getChannel() {
		return channel;
	}
}