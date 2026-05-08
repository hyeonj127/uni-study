package day_09;
//2번 실습
public class OOP_3_Students {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("철수");
		s1.setBan(1);
		s1.setNo(1);
		s1.setScore(90, 70, 80);

		Student s2 = new Student();
		s2.setName("영희");
		s2.setBan(1);
		s2.setNo(2);
		s2.setScore(100, 90, 80);
		
		System.out.println("철수 : 총점-" + s1.getTotal() + ", 평균-" + s1.getAverage());
		System.out.println("철수 : 총점-" + s2.getTotal() + ", 평균-" + s2.getAverage());
//		s1.info();
//		s2.info();
	}

}

class Student{
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		
		float avg =getTotal()/3f;
		avg = (int)(avg*100)/100f;
		
		return avg;
	}
	
	void info() {
		System.out.println(name + " : 총점-" + getTotal() + ", 평균-" + getAverage());
	}
	
	void setName(String str) {
		name = str;
	}
	
	void setScore(int k, int e, int m) {
		kor = k;
		eng = e;
		math = m;
	}
	
	void setKor(int k) {
		kor = k;
	}
	
	void setEng(int e) {
		eng = e;
	}
	
	void setMath(int m) {
		math = m;
	}
	
	String getName() {
		return name;
	}
	
	int getKor() {
		return kor;
	}
	
	int getEng() {
		return eng;
	}
	
	int getMath() {
		return math;
	}
	
	void setBan(int num) {
		ban = num;
	}
	
	void setNo(int num) {
		no = num;
	}
}