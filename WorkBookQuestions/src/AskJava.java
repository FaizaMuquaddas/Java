
public class AskJava {
	public static void main (String[] args) {
		
		double price = 2.50;
		double change = 3.50;
		int capacity = 15;
		int people = 12;
		String request = "PS5";
		String purchase = "car";
		int space = 20;
		int guests = 25;
		int voters = 100;
		int competitors = 93;
		
		System.out.println("Hi Java, do i have enough change to buy chips? \nJava: " + (price<=change));
		System.out.println("Hi Java, can the elevator hold everyone? \nJava: " + (capacity<=people));
		System.out.println("Hi Java, will my friend be happy? \nJava: " + (request.equals(purchase)));
		System.out.println("Hi Java, can everyone attend my dinner party? \nJava: " + (space>=guests));
		System.out.println("Hi Java, will i win the election? \nJava: " + (voters<competitors));
		
		
	}

}
