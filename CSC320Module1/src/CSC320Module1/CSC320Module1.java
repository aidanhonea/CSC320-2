package CSC320Module1;

import java.util.Scanner;

public class CSC320Module1 {

	public static void main(String[] args) {

			//Create scanner to get user input
			Scanner scanner = new Scanner(System.in);
			
			//Assign values to the variables
			System.out.println("Enter your first name:");
			String firstName = scanner.nextLine();
			
			System.out.println("Enter your last name:");
			String lastName = scanner.nextLine();
			
			System.out.println("Enter your street address:");
			String streetAddress = scanner.nextLine();
			
			System.out.println("Enter your city:");
			String city = scanner.nextLine();
			
			System.out.println("Enter your zip code:");
			String zipCode = scanner.nextLine();
			
			scanner.close();
			
			//Print the person's information
			System.out.println("First name: " + firstName);
			System.out.println("Last name: " + lastName);
			System.out.println("Street Address: " + streetAddress);
			System.out.println("City: " + city);
			System.out.println("Zip Code: " + zipCode);
	}

}
