/*
 * Programmer: Derek Will
 * Date: May 3 2017
 * Purpose: Create properties and behavior of a car 
 */



public class Car {

//	private int accelerator;
//	private int brake;

	Car(int year, String carMake, int speed) {
		int yearModel = year;
		String make = carMake;
		speed = 0;		
	}
	
	
	
	public int getYearModel(int yearModel) {
		return yearModel;
	}

	
	
	
	public String getMake(String make) {		
		return make;
	}
	
	
	
	
	public int getSpeed(int speed) {
		return speed;
	}
	
	
	
	
	public int accelerate(int speed) {
		return speed += 5;
	}
	
	
	
	public int brake(int speed) {
		return speed -= 5;
	}

	
}
