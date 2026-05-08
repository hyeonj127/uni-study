package java_basic_2;

public class TestStaff {
	
	public static void main(String[] args) {
		
		Staff s1 = new Staff();
		s1.name = "김태희";
		s1.position = "과장";
		s1.sallay = 3000000;
		
		Staff s2 = new Staff();
		s2.name = "차은우";
		s2.position = "대리";
		s2.sallay = 2000000;
		
		Staff s3 = new Staff();
		s3.name = "소지섭";
		s3.position = "사원";
		s3.sallay = 1000000;
		
		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(s3.info());
		
	}
	
}


class Staff {
	
	String position, name;
	double sallay;
	
	String info() {
		return name + " " + position + " " + (int)sallay + "원";
	}
	
}