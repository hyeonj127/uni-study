package day_09_2;

public class OOP_5_Staff {
	public static void main(String[] args) {
		Staff s1 = new Staff();
		s1.setName("김태희");
		s1.setPosition("과장");
		s1.setSallay(3000000);
		
		Staff s2 = new Staff();
		s2.setName("차은우");
		s2.setPosition("대리");
		s2.setSallay(2000000);
		
		
		Staff s3 = new Staff();
		s3.setName("소지섭");
		s3.setPosition("사원");
		s3.setSallay(1000000);
		
		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(s3.info());
		
	}

}

class Staff{
	private String position;
	private String name;
	private double sallay;
	
	String info() {
		return name +" " + position +", " + (int)sallay + "원";
	}
	
	void setPosition(String str) {
		position = str;
	}
	
	void setName(String str) {
		name = str;
	}
	
	void setSallay(double f) {
		sallay = f;
	}
}






