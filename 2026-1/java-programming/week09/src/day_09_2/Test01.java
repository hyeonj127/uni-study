package day_09_2;

public class Test01 {

}

class TestClass {
	void instanceMethod() {}	// 인스턴스 메서드
	static void staticMethod() {} // static 메서드
	
	void instanceMethod2() {	// 인스턴스 메서드
		instanceMethod();	// 다른 인스턴스 메서드를 호출한다.
		staticMethod();		// static메서드를 호출한다.
	}
	
	static void staticMethod2() { // static 메서드
		instanceMethod();	// 에러!!! 인스턴스 메서드를 호출할 수 없다.
		staticMethod();		// static메서드는 호출할 수 있다.
	}
}	// end of class

class TestClass2 {
	int iv;		// 인스턴스 변수
	static int cv;	// 클래스 변수
	
	void instanceMethod() {	// 인스턴스 메서드
		System.out.println(iv);	// 인스턴스 변수 사용 가능
		System.out.println(cv);	// 클래스 변수 사용 가능
	}
}