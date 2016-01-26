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
  			name.startsWith("Fred")    ||
  			name.startsWith("Graham")) {
	  		return 0;
  		} else if (name.startsWith("Amy") ||
  				   name.startsWith("Buffy")   ||
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

class DocumentationPrinter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNextLine()) {
      String line = input.nextLine();
      if (line.startsWith("//")) {
        System.out.println(line);
      }
    }
	}
}

class BetterDocumentationPrinter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean shouldPrint = false;

    while (input.hasNextLine()) {
      String line = input.nextLine();
      if (line.startsWith("/*")) shouldPrint = true;
      if (line.startsWith("*/")) shouldPrint = false;
      if (shouldPrint           || 
          line.startsWith("//") ||
          line.startsWith("/*") ||
          line.startsWith("*/")) {
        System.out.println(line);
      }
    }
  }
}

class PasswordChecker {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean okay = false;

    System.out.println("Acceptable passwords:\n" +
                        "- Are at least 7 characters long\n" +
                        "- Contain both upper and lower case alphabetic characters\n" +
                        "- Contain at least 1 digit.\n");
    while (!okay) {
      System.out.println("Enter your password: ");
      String password = input.next();
      if (password.length() >= 7  &&
          containsUpper(password) && 
          containsLower(password) &&
          containsNumber(password)) okay = true;
      if (!okay) System.out.println("That password is not acceptable.\n");
    }
  
      System.out.println("Acceptable password.");
  }
  
  public static boolean containsUpper(String password) {
    for (int i=0; i<password.length(); i++) {
      if (Character.isUpperCase(password.charAt(i))) return true;
    }
    return false;
  }
  
  public static boolean containsLower(String password) {
    for (int i=0; i<password.length(); i++) {
      if (Character.isLowerCase(password.charAt(i))) return true; 
    }
    return false;
  }

  public static boolean containsNumber(String password) {
    for (int i=0; i<password.length(); i++) {
      if (Character.isDigit(password.charAt(i))) return true;
    }
    return false;
  }
}