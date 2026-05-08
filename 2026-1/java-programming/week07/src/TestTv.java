package java_basic_2;

public class TestTv {
	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		t1.bPower = true;
		t1.channel = 11;
		t1.power();
		
		System.out.println(t1.bPower +", " + t1.channel);
		
		Tv t2 = new Tv();
		t2.bPower = true;
		t2.channel = 5;
		System.out.println(t2.bPower + ", " + t2.channel);
		
		t2 = t1;
		System.out.println(t2.bPower + ", " + t2.channel);
		
	}
}


class Tv {
	
	boolean bPower;
	int channel;
	
	void power() {
		bPower = !bPower;
	}
	
	void channelUp() {
		channel ++;
	}
	
	void channelDown() {
		channel --;
	}
	
}