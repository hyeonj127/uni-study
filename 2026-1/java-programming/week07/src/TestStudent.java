package java_basic_2;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "철수";
		s1.ban = 1;
		s1.no = 1;
		s1.kor = 90;
		s1.eng = 70;
		s1.math = 80;
		
		Student s2 = new Student();
		s2.name = "영희";
		s2.ban = 1;
		s2.no = 2;
		s2.kor = 100;
		s2.eng = 90;
		s2.math = 80;
		
		System.out.println(s1.name + " : 총점 - " + s1.getTotal()
		+ "점, 평균 - " + (int)s1.getAverage() + "점");
		
		System.out.println(s2.name + " : 총점 - " + s2.getTotal()
		+ "점, 평균 - " + (int)s2.getAverage() + "점");
		
	}
	
}


class Student {
	
	String name;
	int ban, no, kor, eng, math;
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		double sum = kor+eng+math;
		return (float) (sum / 3);
	}
	
}