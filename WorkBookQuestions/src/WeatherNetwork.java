
public class WeatherNetwork {

	public static void main(String[] args) {
		
		int temp = -14;
		String forecast;
		
		if(temp > -15 && temp<0 ) {
			forecast = "The forecast is FREEZING! Stay home!";
	}
		else if(temp>0 && temp<10){
			forecast = "The forecast is Chilly. Wear a coat!";
		}
		
		else {
			forecast = "It's warm. Go outside!";
		}
		
		System.out.println(forecast);
		
}
}
