import java.io.*;
import java.util.Scanner;

class Car {
	double startMiles;
	double endMiles;
	double gallons;

	Car(double first, double last, double gals) {
		startMiles = first;
		endMiles = last;
		gallons = gals;
	}

	double calculateMPG() {
		return (endMiles - startMiles)/gallons;
	}
	boolean gasHog() {
		if (calculateMPG() < 15.0) return true;
		return false;
	}
	boolean economyCar() {
		if (calculateMPG() > 30.0) return true;
		return false;
	}
}

class MilesPerGallon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double startMiles, endMiles, gallons;

		System.out.print("Enter first reading: "); 
    	startMiles = input.nextDouble();
		System.out.print("Enter second reading: "); 
  		endMiles = input.nextDouble();
		System.out.print("Enter gallons: ");
		gallons = input.nextDouble();

	    Car car = new Car(startMiles, endMiles, gallons);

    	System.out.println("Miles per gallon is " + car.calculateMPG());
    	if (car.gasHog()) {
    		System.out.println("What a gas hog.");
    	}
    	if (car.economyCar()) {
    		System.out.println("Wow, an economy car!");
    	}
	}
}