import java.util.*;
import java.io.*;
import java.util.Arrays;
public class Main
{	
	public static Main eswar;
	public LicenseBank bank;
	

	public static void main (String args[])
	{
		Main eswar = new Main();
		LicenseBank bank = new LicenseBank();
		int counter = 1;
		while (counter !=0){
		begin(bank);
		}
	}

	public static void begin(LicenseBank b)
	{
		int choice;
		do {
			System.out.println("Welcome! Enter your choice");
			System.out.println("(1) Enter new license information");
			System.out.println("(2) View a license");				
			Scanner reader = new Scanner(System.in);
			choice = reader.nextInt();
			} while(choice != 1 && choice != 2);

		if (choice == 1)
		{
			createNewAccount(b);		
		}
		if (choice == 2){
			accountLookUp(b);
			}
	}

	public static void createNewAccount(LicenseBank b)
	{
		Scanner creater = new Scanner(System.in);

		System.out.printf("Please enter your full name: ");
		String nombre = creater.nextLine();

		System.out.printf("Please enter your age: ");
		int anos = creater.nextInt();

		int choice;
		String rac = "White";
		do {
		System.out.println("\nChoose the one that best describes you: \n\t(1) White\n\t(2) Black\n\t(3) Asian\n\t(4) Hispanic");
		System.out.printf("Choice: ");
		choice = creater.nextInt();
		}while(choice != 1&&choice!=2&&choice!=3&&choice!=4);

		switch(choice)
		{
			case 1: rac = "White";
				break;
			case 2: rac = "Black";
				break;
			case 3: rac = "Asian";
				break;
			case 4: rac = "Hispanic";
				break;
		} 
		b.createNewLicense(nombre, anos, rac);
	}

	public static void accountLookUp(LicenseBank b)
	{
		System.out.println("Enter key number");
		Scanner reader = new Scanner(System.in);
		int code = reader.nextInt();
		b.getLicense(code);
		}
			
}
		
