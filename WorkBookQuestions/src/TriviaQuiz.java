import java.util.Scanner;

public class TriviaQuiz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. Which country held the 2016 Summer Olympics?" +"\n\ta) China \n\tb) Ireland \n\tc) Brazil \n\td) Italy\n");
		String ans1 = scan.next();
		
		System.out.println("2.Which planet is hottest?" +"\n\ta) Venus \n\tb) Saturn \n\tc) Mercury \n\td) Mars");
		String ans2 = scan.next();
		
		System.out.println("3.What is the rarest blood type?" +"\n\ta) O \n\tb) A \n\tc) B \n\td) AB-Negative");
		String ans3 = scan.next();
		
		System.out.println("4.Which one these characters is friend with Harry Potter?" +"\n\ta) Ron Weasley \n\tb) Hermione Granger \n\tc) Draco Malfoy \n\td) None of the above");
		String ans4 = scan.next();
		
		int score = 0;
		if (ans1.equals("c")) {
			score += 5;
		}
			if(ans2.equals("a")) {
				score += 5;
			}
			if (ans3.equals("d")) {
				score += 5;
		}
		
			if (ans4.equals("a") || ans4.equals("b")) {
				score += 5;
			}
			
			System.out.println("Your final score is:" +score+ "/20");
		if (score >=15) {
			System.out.println("Wow, you know your stuff");
		}
		
		else if(score >=5 && score <15) {
			System.out.println("Not bad!");
		}
		
		else {
			System.out.println("Better luck next time.");
		}
		
		scan.close();
		
		
	}

}
