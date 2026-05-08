package java_basic_2;
import java.util.Scanner;

public class Day02 {

	public static void main(String[] args) {
		func15();
		func16();
		func17();
	}
	
	static void func0() {
		System.out.println("hello world");
		System.out.println(2026);
		System.out.println('A');
	}
	
	static void func1() {
		int year = 2026;
		int month = 3;
		int day = 16;
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
	}
	
	static void func2() {
		int x = 10;
		int y = 20;
		int tmp = 0;
		System.out.println("x:" + x + " y:" + y);
		
		tmp = x;
		x = y;
		y = tmp;
		System.out.println("x:" + x + " y:" + y);
	}
	
	static void func3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		System.out.println("입력한 값은 " + a);
		
		System.out.println("문자열을 입력하세요");
		String s = sc.next();
		System.out.println("입력한 문자열은 " + 5);
	}
	
	// 두 개 정수를 사용자로부터 입력 받아 그 합을 출력하세요
	static void func4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 두 개를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a + b;
		
		System.out.println("합은 " + sum);
	}
	
	// 2026년에 태어나면 1살입니다. 출생년도를 입력받아 나이를 계산해서 출력하세요
	static void func5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출생년도를 입력하세요");
		int year = sc.nextInt();
		int age = 2027 - year;
		
		System.out.println("당신의 나이는 " + age);
	}
	
	// 이름을 문자열로 입력 받고 국어, 영어, 수학 점수를 정수로 입력받아 평균과 총점을 출력하세요
	static void func6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		
		System.out.println("당신의 국어, 영어, 수학 점수를 입력하세요");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		float avg = total / 3f;
		avg=((int)(avg*100 + 0.5f))*0.01f;
		
		System.out.println(name + "님의 평균 점수는 " + avg + " 총점은 " + total);
	}
	
	public static void func7() {
		byte b = 127;
		b = (byte)(b+1);
		System.out.println(b);
	}
	
	public static void func8() {
		int a = 65;
		char ch = (char) a;
		System.out.println(a + ", " + ch);
		
		char ch2 = 'B';
		int b = (int)ch2;
		System.out.println(ch2 + ", " + b);
		
		float f = 1.5f;
		int n = (int)f;
		System.out.println(f + ", " + n);
		
		int n2 = 10;
		float f2 = n2;
		System.out.println((n2+ ", " + f2));
	}
	
	// 변수의 생존기간
	public static void func9() {
		int value1 = 3;
		{
			int value2 = 5;
			System.out.println(value1);	// 3
			System.out.println(value2); // 5
		}
		System.out.println(value1); // 3
//		System.out.println(value2); // error
	}
	
	// 같은 자료형간의 연산과 다른 자료형간의 연산
	public static void func10() {
		// #1 같은 자료형 간의 연산
		int value1 = 3 + 5;
		int value2 = 8 / 5;			// 1
		float value3 = 3.0f + 5.0f;
		double value4 = 8.0 / 5.0;	// 1.6
		
		byte data1 = 3;
		byte data2 = 5;
//		byte value5 = data1 + data2; // 오류
		int value5 = data1 + data2;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println();
		
		// #2 다른 자료형 간의 연산
//		int value6 = 5 + 3.5; // 오류
		double value6 = 5 + 3.5;
		int value7 = 5 + (int)3.5;
		
		double value8 = 5 / 2.0;
		byte data3 = 3;
		short data4 = 5;
		int value9 = data3 + data4;
		double value10 = data3 + data4;
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
	}
	
	// 문자 값의 다양한 저장방법 및 출력
	public static void func11() {
		// #4 문자(char) : 문자, 정수
		// #4-1 문자로 저장하는 방법
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3';
		System.out.println(value1); // A
		System.out.println(value2); // 가
		System.out.println(value3); // 3
		System.out.println();
		
		// #4-2 정수로 저장하는 방법
		char value4 = 65;
		char value5 = 0xac00;
		char value6 = 51;
		System.out.println(value4); // A
		System.out.println(value5); // 가
		System.out.println(value6); // 3
		
		// #4-3 유니코드로 직접 입력
		char value7 = '\u0041';
		char value8 = '\uac00';
		char value9 = '\u0033';
		System.out.println(value7); // A
		System.out.println(value8); // 가
		System.out.println(value9); // 3
	}
	
	// 자동타입변환과 수동타입변환
	public static void func12() {
		// #1 자동타입변환 (업캐스팅 + byte/short 자료형 데이터 입력)
		float value1 = 3;	// int -> float (업캐스팅)
		long value2 = 5; 	// int -> long (업캐스팅)
		double value3 = 7;	// int -> double (업캐스팅)
		byte value4 = 9;	// (예외: int -> byte)
		short value5 = 11;	// (예외: int -> short)
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println();
		
		// #2 수동타입변환
		byte value6 = (byte)128;	// int -> byte (다운캐스팅)
		int value7 = (int)3.5;		// double -> int (다운캐스팅)
		float value8 = (float)7.5;	// double -> float (다운캐스팅)
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
	}
	
	public static void func13() {
		System.out.println("hello java");
		int x = 10;
		int y = 10;
		
		// -x + 3
		System.out.println(-x + 3);
		
		// x + 3 * y
		System.out.println(x + 3 * y);
		
		// x + 3 > y - 2
		System.out.println(x + 3 > y - 2);
		
		// x > 3 && x < 5
		System.out.println(x > 3 && x < 5);
	}
	
	public static void func14() {
		// a << 2 + 1와 (a << 2) + 1 두 수식의 결과를 예측해보고 프로그래밍 해봅니다
		int a = 10;
		System.out.println(a << 2 + 1);
		System.out.println((a << 2) + 1);
		
		// x < -1 || x > 3 && x < 5의 결과를 예측해보고 프로그래밍 해봅니다
		int x = 10;
		System.out.println(x < -1 || x > 3 && x < 5);
	}
	
	public static void func15() {
		int i = 5;
		i++;
		System.out.println(i);
		
		i = 5;
		++i;
		System.out.println(i);
	}
	
	public static void func16() {
		int i, j;
		i = 5;
		j = i++;
		System.out.println("j = i++; 결과, i = " + i + ", j = " + j);
		
		i = 5;
		j = ++i;
		System.out.println("j = ++i; 결과, i = " + i + ", j = " + j);
	}
	
	public static void func17() {
		int i = 5, j = 5;
		
		System.out.println(i++);
		System.out.println(++j);
		System.out.println("i = " + i + ", j = " + j);
	}
}
