package ca.demo.salestools;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();
		
	}
	
	private static void displayGreeting() {
		System.out.println("Hello happy sales people!");
		System.out.println("this app shows sales data");
		System.out.println("hej");
	}

}
