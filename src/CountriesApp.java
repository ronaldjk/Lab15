import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String country = null;
		String dirString = "resource";
		String cont = "yes";
		
		
		CountriesTextFile.createDirectory(dirString);
		CountriesTextFile.createFile(dirString, "countries.txt");
		
		while (cont.equalsIgnoreCase("yes")) {
		System.out.println("Choose an option: ");
		System.out.println("(1) See a list of countries");
		System.out.println("(2) Add a country");
		System.out.println("(3) Exit");
		int input = scan.nextInt();
		
		if (input == 1) {
			CountriesTextFile.readFromFile(dirString, "countries.txt");
			System.out.println();
			System.out.println("Would you like to choose another option?");
			cont = scan.next();
		}
		
		else if (input == 2) {
			System.out.println("Please enter a country: ");
			country = scan.next();
			CountriesTextFile.writeToFile(dirString, "countries.txt", country);
			System.out.println("Would you like to choose another option?");
			cont = scan.next();
			
		}
		}
		
		
			System.out.println("Goodbye!");
		}
		

	}


