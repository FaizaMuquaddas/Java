import java.util.Scanner;

public class JavaGram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to JavaGram! Lets's sign you up.");
		System.out.println("What is your first name?");
		String firstName = scan.nextLine();
		
		System.out.println("What is your last name?");
		String lastName = scan.nextLine();
		
		System.out.println("How old are you?");
		int age = scan.nextInt();
		
		scan.nextLine();
		System.out.println("Make a Username");
		String username = scan.nextLine();
		
		System.out.println("What is your city?");
		String city = scan.nextLine();
		
		System.out.println("What is your country?");
		String country = scan.nextLine();
		
		System.out.println("Thank you for joining the JavaGram!");
		System.out.println("\nHere is the information you entered:");
		System.out.println("\tFirst Name: " + firstName);
		System.out.println("\tLast Name: " +lastName);
		System.out.println("\tAge: " + age);
		System.out.println("\tUsername: " +username);
		System.out.println("\tCity: " +city);
		System.out.println("\tCountry: " +country);
		
		scan.close();
		
		
		
		
		
		
		

	}

}
