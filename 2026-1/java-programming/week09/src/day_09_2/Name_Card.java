package day_09_2;

public class Name_Card {

	public static void main(String[] args) {
		nameCard com1 = new nameCard();
		com1.department = "회계부";
		com1.position = "인턴";
		com1.name = "김현지";
		
		System.out.println(com1.info());
	}
}

class nameCard {
	
		static String company = "삼성전자";
		static String website = "https://www.samsung.com";
		String department;
		String position;
		String name;
		 
		String info() {
			String str = company + "\n 웹사이트:" + website + "\n" + department + " " + position + " " + name;
			return str;
		}

}
