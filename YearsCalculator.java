import java.util.Scanner;

public class YearsCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		//Get user input
		System.out.println("Please enter the number of the minutes");
		int InputMinutes = scanner.nextInt(); 
		
		// my variables
		int minutesInOneDay = 1440 ;
		int minutesInOneYear = 525600;		
		
		//calculation
		int yearNumber = InputMinutes / minutesInOneYear;
		int remainingMinutes = InputMinutes % minutesInOneYear;
		int dayNumber = remainingMinutes / minutesInOneDay;
		
		// output
		System.out.println(InputMinutes + " minutes is approximately " + yearNumber + " years and " + dayNumber + " days");

	}

}
