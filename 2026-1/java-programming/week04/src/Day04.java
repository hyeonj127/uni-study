package java_basic_2;
import java.util.Scanner;

public class Day04 {
	public static void main(String[] args) {
		func17();
	}
	
	static void func0() {
		String grade = "";
		System.out.println("점수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if (number >= 0 && number <= 100) {
			if (number >= 90) {
				grade = "A";
			} else if (number >= 80) {
				grade = "B";
			} else if (number >= 70) {
				grade = "C";
			} else if (number >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
			System.out.println("당신의 학점은 " + grade + "학점입니다.");
		} else {
			System.out.println("잘못된 입력입니다.");
		}	
	}
	
	static void func1() {
	int num1, num2, result;
	char op;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("첫 번째 수를 입력하세요");
	num1 = sc.nextInt();
	
	System.out.println("두 번째 수를 입력하세요");
	num2 = sc.nextInt();
	
	System.out.println("+, -, *, / 중 하나를 입력하세요");
	String str_op = (sc.next());
	op = str_op.charAt(0);
	
	
	
	switch (op) {
	case '+' :
		result = num1 + num2;
		break;
	case '-' :
		result = num1 - num2;
		break;
	case '*' :
		result = num1 * num2;
		break;
	case '/' :
		if (num2==0) result = 0xffff;
		else result = num1 / num2;
		break;
	default :
		result = 0xffff;
		return;
	}
	
	if (result == 0xffff)
		System.out.println("잘못된 입력입니다.");
	else
		System.out.println("연산 결과는 " + result + "입니다.");
	}
	
	static void func2() {
		double r = Math.random();
		int n = (int)(r*10) + 1;
		
		System.out.println(n);
	}
	
	static void func3() {
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
	
	static void func4() {
		for(int i = 0; i < 10; i++) {
			System.out.println("8 * " + i + " = " + 8*i);
		}
	}
	
	static void func5() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i; // sum = sum + i;
		}
		
		System.out.println(sum);
	}
	
	// for문 중첩 - 2단부터 9단까지 구구단 출력하기
	static void func6() {
		for(int i = 2; i < 10; i++) {
			System.out.println("\n" + i + "단");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
	}
	
	// 중첩 while문
	static void func7() {
		int i = 2;
		while(i <= 9) {
			int j = 1;
			while(j <= 9) {
				System.out.println(i + " * " + j + " = " + i*j);
				j++;
			}
			i++;
		}
	}
	
	static void func8() {
		for(int i = 1; i <= 10; i++) {
			if(i%3==0)
				continue;
			System.out.println(i);
		}
	}
	
	/* 제어문 예제 pdf 파일 예제 */
	
	// switch문 심화 문제
	static void func9() {
		char grade;
		System.out.println("점수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score <= 0 || score >= 100) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		score /= 10;
		switch(score) {
		case 10 :
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		case 6 :
			grade = 'D';
			break;
		default :
			grade = 'F';
		}
		
		System.out.println("당신의 학점은 " + grade + "학점입니다.");	
	}
	
	// for문 응용 문제 1 - 구구단 8단 출력하기
	static void func10() {
		for(int i = 1; i < 10; i++) {
			System.out.println("8 * " + i + " = " + 8*i);
		}
	}
	
	// while문 기본 문제
	static void func11() {
		int a = 0;
		while(a<10) {
			System.out.println(a + " ");
			a++;
		}
	}
	
	// while문 기본 문제 2
	static void func12() {
		int i = 10;
		while(i>0) {
			System.out.println(i + " ");
			i--;
		}
	}
	
	// do-while문 기본 문제
	static void func13() {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 하나를 입력하세요. q가 입력되면 종료합니다");
		
		do {
			ch = sc.next().charAt(0);
			System.out.println("입력한 문자 : " + ch);
		} while(ch != 'q');
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	// 반복문의 중복 응용 문제
	static void func14() {
		for(int i = 0; i < 10; i++) {
			for(int j = 10; j > i; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	// 반복문(break, continue) 예제 - 1~100 사이 3의 배수 출력
	static void func15() {
		for(int i = 1; i < 101; i++) {
			if(i%3 != 0)
				continue;
			System.out.println(i);
		}
	}
	
	// 반복문(break, continue) 예제 - 최초로 500이 넘는 값 찾기
	static void func16() {
		int i = 1;
		int sum = 0;
		
		while(true) {
			sum += i;
			if(sum>500)
				break;
			i++;
		}
		
		System.out.println(sum + ", 1부터 " + i + "까지의 합");
	}
	
	// for문 예제 2
	static void func17() {
		System.out.println("2부터 9 사이의 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		if(x<2 || x>9) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		for(int i = 1; i<10; i++) {
			System.out.println(x + " * " + i + " = " + x*i);
		}
	}
}
