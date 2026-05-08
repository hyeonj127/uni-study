package java_basic_2;

public class TestIncome {

	public static void main(String[] args) {
		
		Income[] arr = new Income[5];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = new Income();
		}
		
		String[] item = new String[] {"주식", "일당", "유투브", "이자", "용돈" };
		for(int i = 0; i<item.length; i++) {
			arr[i].item = item[i];
		}
		
		double[] income = new double[] {5000, 100000, 500, 1000, 10000};
		for(int i = 0; i<income.length; i++) {
			arr[i].income = income[i];
		}
		
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i].getIncome();
		}
		
		System.out.println(sum);
		
	}
	
}


class Income {
	
	String item;
	double income;

	double getIncome() {
		return (int)income;
	}
	
}