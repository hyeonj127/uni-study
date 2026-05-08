package day_09;

import java.util.Scanner;


//
//클래스명 :Card
//멤버변수 : String 타입의 shape와 int 타입의 num
//메서드 : 메서드 이름은 printInfo, 반환값은 없음, 매개변수 없ㅁ, 
//      기능은 멤버변수에 저장된 값을 콘솔 창에 출력
class Card{
	
	private String shape;
	private int num;
	
	void printInfo() {
		System.out.println("모양:" + shape + ", 번호:" + num);
	}
	
	String getShape() {
		return shape;
	}
	
	void setShape(String str) {
		shape = str;
	}
	
	int getNum() {
		return num;
	}
	
	void setNum(int number) {
		num = number;
	}
}


public class OOP_2_Card {
	
	public static void main(String[] args) {
		func1();
	}
	
	static void func1() {
		Card c1 = new Card();
		c1.setShape("heart");
		c1.setNum(7);
		
		Card c2 = new Card();
		c2.setShape("diamond");
		c2.setNum(7);
		
		c1.printInfo();
		c2.printInfo();
	}
	
	//길이가 13인 배열에 사용자가 입력한 모양의 카드를 저장
	static void func2() {
		
		Card[] arr = new Card[13];
		
		System.out.println("diamond, club, heart, spade 중 하나를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		
		for(int i = 0 ;i < arr.length ; i++) {
			arr[i] = new Card();
			arr[i].setShape(str);
			arr[i].setNum(i+1);
			
			System.out.println(arr[i].getShape() + ", " + arr[i].getNum());
		}
		
		return ;
		
	}
	
	static void func3() {
		
		Card arrCards[][] = new Card[4][13];
		
		String str_shape[] = {"spade", "heart", "diamond", "club"};
		
		for(int i = 0 ;i < str_shape.length; i++) {
			for(int j = 0 ; j < arrCards[i].length ;j++) {			
				arrCards[i][j] = new Card();
				arrCards[i][j].setShape(str_shape[i]);
				arrCards[i][j].setNum(j+1);
			}
		} 
		
		for(int i = 0 ;i < str_shape.length; i++) {
			for(int j = 0 ; j < arrCards[i].length ;j++) {				
				arrCards[i][j].printInfo();
			}
		}
		
		
	}

}

