package java_basic_2;
import java.util.Scanner;

public class MidtermExam {

	public static void main(String[] args) {
		
		func2();
		
	}
	
	static void func1() {
		
		// 정수형 변수 num을 선언하고 100으로 초기화하는 코드
		int num = 100;
		
	}

	static void func2() {
		
		// 두 개 수를 입력 받아 그 합을 출력하는 코드 작성
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// int sum = a+b;
		System.out.println(a+b);
		
	}
	
	static void func3() {
		
		// 문자열 하나를 입력 받아 화면에 출력하는 코드 작성
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(s);
		
	}
	
	static void func4() {
		
		// 세 개의 정수를 입력 받아 세 정수의 합을 출력하는 코드 작성
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i<3; i++) {
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println(sum);
	}
	
	static void func5() {
		
		// 다음 코드에서 오류 나는 부분을 찾아 원인을 적고 코드를 수정하세요
		byte a = 10;
		byte b = 20;
		int c = (int)a + b;
		
		System.out.println(c);
	}
	
	static void func6() {
		
		// 다음 코드에서 출력하는 정수의 특징은 무엇인가요
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 3의 배수
		
	}
	
	static void func7() {
		
		// 1부터 사용자가 입력한 값까지 합을 출력하도록 완성하세요
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i<num+1; i++) {
			System.out.println(sum);
			sum += i;
		}
		System.out.println(sum);
	}
	
	 static void func8() {
		 
		 for(int i = 5; i>0; i--) {
			 for(int j = 0; j<i; j++) {
				 System.out.print('*');
			 }
			 System.out.println();
		 }

	 }
	 
	 
	 static void test1() {
		 int value1 = 3;
		 {
			 int value2 = 5;
			 System.out.println(value1);
			 System.out.println(value2);
		}
		 System.out.println(value1);
		 // System.out.println(value2);	// 오류
	 }
	 
	 static void test2() {
		 // 문자로 저장하는 방법
		 char value1 = 'A';
		 char value2 = '가';
		 char value3 = '3';
		 System.out.println(value1);
		 System.out.println(value2);
		 System.out.println(value3);
		 System.out.println();
		 
		 // 정수로 저장하는 방법
		 char value4 = 65;
		 char value5 = 0xac00;
		 char value6 = 51;
		 System.out.println(value4);
		 System.out.println(value5);
		 System.out.println(value6);
		 System.out.println();
		 
		 // 유니코드로 직접 입력
		 char value7 = '\u0041';
		 char value8 = '\uac00';
		 char value9 = '\u0033';
		 System.out.println(value7);
		 System.out.println(value8);
		 System.out.println(value9);
	 }
	 
	 static void test3() {
		 // 자동 타입 변환
		 float value1 = 3;	// int -> float(업캐스팅)
		 long value2 = 5;	// int -> long(업캐스팅)
		 double value3 = 7; // int -> double(업캐스팅)
		 byte value4 = 9;	// int -> byte
		 short value5 = 11; // int -> short
		 
		 System.out.println(value1);
		 System.out.println(value2);
		 System.out.println(value3);
		 System.out.println(value4);
		 System.out.println(value5);
		 System.out.println();
		 
		 // 수동 타입 변환
		 byte value6 = (byte)128;	// int -> byte(다운캐스팅) // overflow로 인해 -128 출력
		 int value7 = (int)3.5;		// double -> int(다운캐스팅)
		 float value8 = (float)7.5; // double -> float(다운캐스팅)
	 }
	 
	static void test4() {
		// 같은 자료형 간의 연산
		int value1 = 3 + 5;
		int value2 = 8 / 5;	// int / int = int
		float value3 = 3.0f + 5.0f;
		double value4 = 8.0 / 5.0;
		
		byte data1 = 3;
		byte data2 = 5;
		// byte value5 = data1 + data2	// data1+data2는 int형이므로 오류.
		int value5 = data1 + data2;
		
		System.out.println(value1);
		System.out.println(value2);
	}
	 
}