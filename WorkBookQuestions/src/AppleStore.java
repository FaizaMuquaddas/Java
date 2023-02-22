
public class AppleStore {
	public static void main(String[] args) {
		
		int numOfApples = 0;
		int numOfCustomers = 0;
		double profit = 0;
		
		System.out.println("Beesley picked 600 apples from an orchard.");
		numOfApples +=600;
		
		System.out.println("Time for business! Beesley selling each apple for Rs.12" );
		int price = 12;
		
		System.out.println("One customer walked in. He bought 10 apples");
		numOfApples -= 10;
		numOfCustomers += 1 ;
		profit += 10*price;
		
		System.out.println("Another customer walked in. He bought 6 apples!");
		numOfApples -= 6;
		numOfCustomers ++;
		profit = 15*price;
		
		System.out.println("Another customer walked in. He bought 20 apples!");
		numOfApples -= 20;
		numOfCustomers ++;
		profit = 20*price;
		
		System.out.println("Wow! So far, Beesley made profit of Rs." + profit );
		System.out.println(numOfCustomers + " customers love your apples.");
		System.out.println("Beesley have " + numOfApples +" apples left. She will sell more apples tommorrow.");
		
		
		
		}


}
