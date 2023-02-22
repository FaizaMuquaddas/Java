import java.util.Scanner;
public class Chatbot {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello! What is your name?");
		String name = scan.nextLine();
		
		System.out.println("Hi! " + name + " I'm JavaBot. Where are you from?" );
		String country = scan.nextLine();
		System.out.println("I hear it's a beautiful in " + country + "! I'm from a place called Oracle.");
		
		System.out.println("How old are you?");
		int age = scan.nextInt();
		
		
		System.out.println("So you're " + age + ", cool! I'm 400 years old." +"\nThis means I'm " + 400/age + " times older than you." + "\nEnough about me. What's your Favourite language? (just dont say python)");
		scan.nextLine();
		String language = scan.nextLine();
		
		System.out.println("\n" + language + ",thats's great! Nice chatting with you " + name + ". I have to log off now. See ya!" );
		scan.close();
		

	}

}
