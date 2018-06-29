package Variables_and_Math;

public class marathon_race_time {
	
	// In 2016, Kenyan runner Eliud Kipchoge won the Olympic gold medal 
	// in the men’s 26.2-mile marathon race. The official timer tracked 
	// his race at 7724 seconds. 
	// What is his time in hours, minutes, and seconds? 
	
	// RESULT:    2hrs:8mins:44secs
	
	// Bonus: What was his average pace per mile in minutes?
	
	// RESULT:    Average pace: 4.885 minutes per mile
	
	public static void main (String[] args) {
			
			int secondsInMinute = 60;
			int secondsInHour = secondsInMinute * 60;
			
			int raceTime = 7724;
			
			int numHours = raceTime/secondsInHour;
			int numMinutes = (raceTime%secondsInHour)/secondsInMinute;
			int numSeconds = (raceTime%secondsInHour)%secondsInMinute;
			
			int minutesToFinish = raceTime / secondsInMinute;
			
		    double numMiles = 26.2;
		    double pace = minutesToFinish / numMiles;
			
			System.out.println(numHours + "hrs:" + numMinutes + "mins:" + numSeconds+"secs");
		
			System.out.printf("Average pace: %.3f minutes per mile", pace);
		}

}
