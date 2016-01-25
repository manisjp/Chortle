import java.io.* ;
import java.util.Scanner;

class TitleApplier {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
  		String currentName = "Jimmy";

	  	while (currentName.length() > 0) {
			System.out.println("\nEnter a name:");
  			currentName = input.next();
	  		switch (sex(currentName)) {
  				case 0: System.out.println("Mr. " + currentName);
  						break;
  				case 1: System.out.println("Ms. " + currentName);
  						break;
  				default: System.out.println(currentName);
  			}
  		}
  	}

  	public static int sex(String name) {
  		//0 if male, 1 if female, 2 if either
  		if (name.startsWith("Elroy") ||
  			name.startsWith("Fred")  ||
  			name.startsWith("Graham")) {
	  		return 0;
  		} else if (name.startsWith("Amy")   ||
  				   name.startsWith("Buffy") ||
  				   name.startsWith("Cathy")) {
	  		return 1;
  		}
  		return 2;
  	}
}

class MicrowaveMenu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter cook time --> ");
		String time = input.next();

		System.out.println("Your time --> " + convert(time));
	}

	public static String convert(String time) {
		if (time.length() <= 2) {
			return "0:" + time;
		}
		return time.substring(0,time.length()-2) + ":" + time.substring(time.length()-2);
	}
}