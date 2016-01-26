import java.io.*;
import java.util.Scanner;

class SecretCode {
	public static void main(String[] args) {
		Scanner message = new Scanner(System.in);
		String key = message.nextLine();
		String decoded = "";

		while (message.hasNextInt()) {
			int index = message.nextInt();
			decoded += key.charAt(index);
		}
		System.out.println(decoded);
	}
}