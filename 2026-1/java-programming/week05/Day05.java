package java_basic_2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Day05 {
	public static void main(String[] args) {
		func15();
	}
	
	static void func0() {
		// 배열의 값 대입 방법 1
		int[] array1 = new int[3];
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		System.out.println(array1[0] + ", " + array1[1] + ", " + array1[2]);
		
		int[] array2;
		array2 = new int[3];
		array2[0] = 3;
		array2[1] = 4;
		array2[2] = 5;
		System.out.println(array2[0] + ", " + array2[1] + ", " + array2[2]);
		
		// 배열의 값 대입 방법 2
		int[] array3 = new int[] {3, 4, 5};
		System.out.println(array3[0] + ", " + array3[1] + ", " + array3[2]);
		
		int[] array4;
		array4 = new int[] {3, 4, 5};
		System.out.println(array4[0] + ", " + array4[1] + ", " + array4[2]);
		
		// 배열의 값 대입 방법 3
		int[] array5 = {3, 4, 5};
		System.out.println(array5[0] + ", " + array5[1] + ", " + array5[2]);
		
		/*
		int[] array6;
		array6 = {3, 4, 5};	-> 불가능
		*/
	}
	
	// 배열 연습문제 1
	static void func1() {
		
	}
	
	static void func2() {
		// 기본 자료형 변수 복사
		int a = 3;
		int b = a;
		b = 7;
		System.out.println(a);	// 3
		System.out.println(b); 	// 7
		
		// 참조 자료형 변수 복사
		int[] a2 = {3, 4, 5};
		int[] b2 = a2;
		b2[0] = 7;
		
		System.out.println(a2[0]); 	// 7
		System.out.println(b2[0]); 	// 7
	}
	
	// for문을 사용해 100개의 데이터를 배열로 저장
	static void func3() {
		 int[] arr = new int[100];
		 
		 for(int i = 0; i < arr.length; i++) {
			 arr[i] = i+1;
		 }
		 
		 for(int i = 0; i<arr.length; i++) {
			 System.out.print(arr[i] + ", ");
		 }
	}
	
	static void func4() {
		int[] score = { 100, 95, 80, 45, 70 };
		
		int sum = 0;
		for(int i = 0; i<score.length; i++) {
			System.out.print(score[i] + ", ");
			sum += score[i];
		}
		
		double avg = (double)sum/5;
		
		System.out.println("평균은 " + avg + "점입니다.");
	}
	
	// 배열 응용 예제 1
	static void func5() {
		int[] arr = new int[10];
		
		for (int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + ", ");
		}
	}
	
	// 배열 응용 예제 2
	static void func6() {
		int[] score = {100, 88, 100, 100, 90};
		
		int sum = 0;
		for (int i = 0; i<score.length; i++) {
			sum += score[i];
		}
		
		double avg = (double)sum / score.length;
		
		System.out.println("총합은 " + sum + "점, 평균은 "
				+ avg +  "입니다.");
	}
	
	// 배열 응용 예제 3
	static void func7() {
		int[] arr = new int[5];
		
		System.out.println("숫자 " + arr.length + "개를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] > max) max = arr[i];
		}
		
		System.out.println("입력된 숫자 중 가장 큰 값은 " + max + "입니다.");
	}
	
	// 배열 응용 예제 4
	static void func8() {
		int[] arr = {79, 88, 91, 33, 100, 55, 95};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			max = arr[i] > max ? arr[i] : max;
			min = arr[i] < min ? arr[i] : min;
		}
		
		System.out.println("최대값은 " + max + ", 최소값은 " +
							min + "입니다.");
	}
	
	// 배열 응용 예제 5
	static void func9() {
		int[] arr = new int[10];
		
		Random random = new Random();
		for(int i = 0; i<arr.length; i++) {
			arr[i] = random.nextInt(1, 45);
			System.out.print(arr[i] + ", ");
		}
		
		/*
		 for(int i = 0; i<arr.length; i++) {
		 	arr[i] = (int)(Math.random()*45) + 1;
		 }
		 
		 for(int i = 0; i<arr.length; i++) {
		 	System.out.print(arr[i] + ", ");
		 }
		 */
	}
	
	// 배열 응용 예제 6
	static void func10() {
		int[] arr = new int[10];
				
		Random r = new Random();
		for(int i = 0; i<arr.length; i++) {
			arr[i] = r.nextInt(10) + 1;
			for(int j = 0; j<i; j++) {
				if (arr[i] == arr[j]) i--;
			}
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		/*
		 for(int i = 0; i<number.length; i++) {
		 	number[i] = i + 1;
		 }
		 
		 int j = 0, temp = 0;
		 for(int i = 0;
		 */
	}
	
	// 배열 응용 예제 7
	static void func11() {
		int[] arr = new int[6];
		
		Random r = new Random();
		for(int i = 0; i<arr.length; i++) {
			arr[i] = r.nextInt(45) + 1;
			for (int j = 0; j<i; j++) {
				if (arr[i] == arr[j]) i--;
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	
	// 2차원 배열
	static void func12() {
		int[][] score = { { 100, 100, 100},
				{ 20, 20, 20 },
				{ 30, 30, 30 },
				{ 40, 40, 40 },
				{ 50, 50, 50 } };
		score[0][1] = 90;
		System.out.println(score[0][1]);
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(score[i][j] + ", ");
			}
			System.out.println();
		}
	}
	
	// 3명의 학생의 시험 점수 2차원 배열
	static void func13() {
		int[][] score = {
				{ 90, 95 },
				{ 85, 100 },
				{ 95, 90 } };
		
		// 1. 2차원 형태로 출력
		for(int i = 0; i<score.length; i++) {
			for(int j = 0; j<score[i].length; j++) {
				System.out.print(score[i][j] + ", ");
			}
			System.out.println();
		}
		
		// 2. C언어 점수 평균
		int c_total = 0;
		for(int i = 0; i<score.length; i++) {
			c_total += score[i][0];
		}
		
		System.out.println("3명의 C 언어 점수 평균은 " + c_total/3f + "점 입니다.");
	}
	
	// String을 저장하는 3x2 배열 예제
	static void func14() {
		String[][] addr = new String[3][2];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<addr.length; i++) {
			System.out.println(i+1 + "번: ");
			for(int j = 0; j < addr[i].length; j++) {
				addr[i][j] = sc.next();
			}
			System.out.println();
		}
		
		for(int i = 0; i<addr.length; i++) {
			System.out.println(Arrays.toString(addr[i]));
		}
	}
	
	// 급여액 예제
	static void func15() {
		int[][] money = new int[5][3];
		Scanner sc = new Scanner(System.in);
		
		String[] name = {"과장", "대리", "사원"};
		
		for(int i = 0; i<money.length; i++) {
			for(int j = 0; j<money[i].length; j++) {
				System.out.print(i+1 + "번째 매장의 " + name[j] + "의 급여액을 입력하세요: ");
				money[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		for(int i = 0; i<money.length; i++) {
			System.out.println(Arrays.toString(money[i]));
		}
		// 매장별 총 급여
		int[] a_total = new int[money.length];
		for(int i = 0; i<money.length; i++) {
			for(int j = 0; j<money[i].length; j++) {
				a_total[i] += money[i][j];
			}
		System.out.println(i+1 + "번째 매장의 총 급여는 " + a_total[i] + "입니다.");
		}
		
		// 직급별 총 급여
		int[] b_total = new int[money[0].length];
		for(int i = 0; i<money[0].length; i++) {
			for(int j = 0; j<money.length; j++) {
				b_total[i] += money[j][i];
			}
		System.out.println(name[i] + " 직급의 총 급여는 " + b_total[i] + "입니다.");
		}
	}
}
