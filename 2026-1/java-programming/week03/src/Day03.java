package java_basic_2;
import java.util.Scanner;

public class Day03 {
	
	public static void main(String[] args) {
		func18();
	}
	
	static void func0() {
		int i = 5;
		i++;
		System.out.println(i);
		
		i = 5;
		++i;
		System.out.println(i);
	}
	
	static void func1() {
		int i, j;
		i = 5;
		j = i++;
		System.out.println("j = i++; 결과, i =" + i + ", j = " + j);
		
		i = 5;
		j = ++i;
		System.out.println("j = ++i; 결과, i = " + i + ", j = " + j);
	}
	
	static void func2() {
		int i = 5, j = 5;
		
		System.out.println(i++);
		System.out.println(++j);
		System.out.println("i = " + i + ", j = " + j);
	}
	
	// 사용자로부터 초 단위 시간을 정수로 입력받아 시간, 분, 초로 표시
	static void func3() {
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();
		
		/*
		int hour = time / 3600;
		int min = (time - (hour * 3600)) / 60;
		int sec = time - (hour * 3600) - (min * 60);
		*/
		
		int sec = time % 60;
		int min = (time/60) % 60;
		int hour = (time/60) / 60;
		
		/*
		int hour = 0;
		int min = 0;
		int sec = 0;
		
		if (time >= 3600) :
			hour = time / 3600;
			time -= hour * 3600;
			
		if (min >= 60) :
			min = time / 60;
			time -= min * 60;
			
		sec = time;
		*/
		
		System.out.println(hour + "시간, " + min + "분, " + sec + "초");
	}
	
	// 이항연산자 특징
	static void func4() {
		int a = 1000000; // 1,000,000
		int b = 2000000; // 2,000,000
		
		// long c = a*b;
		long c = (long)a * b;
		System.out.println(c);
	}
	
	// 이상연산자 특징
	static void func5() {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a+b);
		System.out.println(c);
	}
	
	static void func6() {
		long a = 1000000 * 1000000; // 1,000,000
		long b = 1000000 * 1000000L;
		
		int c = 1000000*1000000/1000000;
		int d = 1000000/1000000*1000000;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
	}
	
	//int보다 작은 데이터 타입은 int로 변환해서 연산
	static void func7() {
		// 알파벳 소문자 연산
		char c1 = 'a';
		// char c2 = c1 + 1;
		char c2 =(char)(c1 + 1);
		// char c2 = ++c1;
		System.out.println(c2);
		
		// 문자형 숫자의 연산
		int i = '2' - '0'; // 2
		System.out.println(i);
		
//		char ch = 'y';
//		ch = (char)(ch - ('a' - 'A'));
//		System.out.println(ch);
	}
	
	// printf 사용법
	static void func8_1() {
		int a = 10;
		System.out.printf("%d", a);
		
	}
	
	//
	static void func8() {
		
	}
	
	// 관계연산자
	static void func9() {
		int x = 10;
		int y = 20;
		
		System.out.println(x >= y);
	}
	
	// 비트연산
	static void func10() {
		int a = 3;
		int b = 5;
		System.out.println(a|b);
		System.out.println(a&b);
		System.out.println(a^b);
	}
	
	// 두 개 정수 중 큰 값을 반환하는 삼항 연산자
	static void func11() {
		int a = 83;
		int b = 5;
		int max = (a>b)? a: b;
		System.out.println(max);
	}
	
	// 대입연산자
	static void func12() {
		int a = 10;
		a += 3; // a = a+3;
		System.out.println(a);
	}
	
	// if~else 예제 1
	static void func13() {
		System.out.println("정수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number%2==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
	
	// if~else 예제 2
	// 점수를 입력 받고 학점 출력하기
	static void func14() {
		System.out.println("점수를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A학점입니다.");
		} else if (score>=80) {
			System.out.println("B학점입니다.");
		} else if (score>=70) {
			System.out.println("C학점입니다.");
		} else if (score>=60) {
			System.out.println("D학점입니다.");
		} else System.out.println("F학점입니다.");
	}
	
	// 카드 게임 예제
	static void func15() {
		System.out.println("카드 게임을 시작합니다. 원하는 메뉴를 선택하세요");
		System.out.println("1. 카드를 섞습니다");
		System.out.println("2. 모든 카드를 보여 줍니다");
		System.out.println("3. 원하는 카드를 선택합니다");
		System.out.println("4. 게임을 종료합니다");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		if(menu == 1) {
			System.out.println("카드 섞기를 선택했습니다");
		}
		if(menu == 2) {
			System.out.println("모든 카드 보기를 선택했습니다");
		}
		if(menu == 3) {
			System.out.println("카드 선택을 선택했습니다");
		}
		if(menu == 4) {
			System.out.println("게임을 종료합니다");
		}
	}
	
	// 하나의 정수를 입력 받아서 0보다 크고 10보다 작으면 입력값을 출력하고
	// 그 외의 정수는 잘못된 입력이라고 출력
	static void func16() {
		System.out.println("정수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>0 && num<10) {
			System.out.println(num);
		} else System.out.println("잘못된 입력입니다.");
	}
	
	// 0보다 작거나 100보다 큰 수는 잘못된 입력이라고 출력
	static void func17() {
		System.out.println("정수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num<0 || num>100) {
			System.out.println("잘못된 입력입니다.");
		}
	}
	
	// 소문자는 대문자로, 대문자는 소문자로 출력
	static void func18() {
		System.out.println("알파벳을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char ch = s.charAt(0);
		
		if(ch<97) {
			ch += 32;
		} else ch -= 32;
		
		System.out.println("변경한 문자: " + ch);
	}
}