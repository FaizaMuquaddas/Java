
public class WorkSchedule {

	public static void main(String[] args) {
		int day = 6;
		boolean holiday = false;
		
		if(holiday) {
			System.out.println("Wohoo, no work");
		}
		
		else if(day==6 || day==7) {
			System.out.println("it's the weekend, no work");
		}
		
		else {
			System.out.println("Wake up at 7:00 :(");
		}
		
		
	}
	}