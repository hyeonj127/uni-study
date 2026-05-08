package java_basic_2;
import java.util.Scanner;

public class TestCard {
	public static void main(String[] args) {
		
		System.out.println("2-2.");
		System.out.println();
		
		Card c1 = new Card();
		c1.shape = "heart";
		c1.num = 7;
		
		Card c2 = new Card();
		c2.shape = "diamond";
		c2.num = 1;
		
		c1.printInfo();
		c2.printInfo();
		
		
		System.out.println();
		System.out.println("2-3.");
		System.out.println();
		
		
		Card[] cArr1 = new Card[13];
		for(int i = 0; i<cArr1.length; i++) {
			cArr1[i] = new Card();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("카드 모양을 입력하세요 (diamond, club, heart, spade 중 하나) :");
		String scanShape = sc.next();
		
		for (int i = 0; i<cArr1.length; i++) {
			cArr1[i].shape = scanShape;
			cArr1[i].num = i+1;
			cArr1[i].printInfo();
		}
		
		
		System.out.println();
		System.out.println("2-4.");
		System.out.println();
		
		
		Card[][] cArr2 = new Card[4][13];
		String[] shape = new String[] {"diamond", "club", "heart", "spade"};
		for(int i = 0; i<cArr2.length; i++) {
			for(int j = 0; j<cArr2[i].length; j++) {
				cArr2[i][j] = new Card();
				cArr2[i][j].shape = shape[i];
				cArr2[i][j].num = j+1;
				cArr2[i][j].printInfo();
			}
		}		
		
	}
}


class Card {
	
	String shape;
	int num;
	
	void printInfo() {
		System.out.println("모양:" + shape + ", 번호:" + num);
	}
	
}
