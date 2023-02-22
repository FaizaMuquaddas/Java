
public class LogicalOperators {

	public static void main(String[] args) {
		
		int english = 93;
		int maths  = 85;
		String student = "faiza";
		
		if(english >93 && maths < 33 || student.equals("faiza")) {
			
			System.out.println("Congratulations!");
		}
		else {
			System.out.println("Better luck next time");
		}
	}

}
