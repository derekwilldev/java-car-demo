/*
 * Programmer: Derek Will
 * Date: May 3 2017
 * Purpose: Create properties and behavior of a car 
 */




import java.util.Scanner;

public class CarDemo {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int yearModel;
		int speed = 0;
		String make;
		String emptyMake = "";
		
			// get car year
		System.out.print("Enter your car's year: ");
		yearModel = userInput.nextInt();
		
		while (yearModel < 1940 && yearModel > 2017) {
			System.out.print("Error - enter a year between 1940 and 2017: ");
			yearModel = userInput.nextInt();
		}
		
		
			// get car make
		System.out.print("Enter the make of your car: ");
		make = userInput.next();
		
		while (make == emptyMake) {
			System.out.print("Error - please enter the make of your car: ");
			make = userInput.next();
		}
		

			// create new car
		Car userCar = new Car(yearModel, make, speed);

		
		System.out.println("Model Year: " + userCar.getYearModel(yearModel));
		System.out.println("Make: " + userCar.getMake(make));
		System.out.println("Speed: " + userCar.getSpeed(speed));
		
		
			// accelerate
		System.out.println();
		System.out.println("Speed up!!");
		for (int i = 1; i < 6; i++) {
			speed = userCar.accelerate(speed);
			
			System.out.println(speed);
		}
		
		
			// slow down
		System.out.println();
		System.out.println("Slow down!!");
		for (int i = 1; i < 6; i++) {
			speed = userCar.brake(speed);
			
			System.out.println(speed);
		}
		
	} // end main method
	
	
	

}
