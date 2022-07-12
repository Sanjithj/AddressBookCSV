package com.bridgelabz;

import java.util.Scanner;
import java.util.logging.FileHandler;

public class AddressBookMain {


public static final String addressBook = null;

public static void main(String[] args) {
	System.out.println("Welcome to address book");
	Scanner sc =new Scanner(System.in);
	int option;
	while(true) {
		System.out.println("Operation to perform\n 1)Add Contact\n 2)edit contact\n 3)delete\n4)Display contact\n 5. add address book");
		option =sc.nextInt();
		switch(option) {
		case 1:
			AddressBookService.addContacts();
			break;
		case 2:
			AddressBookService.editContact();
			break;
		case 3:
			AddressBookService.deleteContact();
			break;
		case 4:
			AddressBookService.display();
		case 5:
			AddressBookService.addAddressBook();
			break;
		case 6:
            FileHandler file = new FileHandler();

            System.out.print(" Please enter to perform read or write: ");
            String fileOption = sc.next();

            System.out.print(" Please enter which format to operate in (txt/csv/json): ");
            String fileFormatOption = sc.next();

            if (fileFormatOption.equalsIgnoreCase("txt")) {
                if (fileOption.equalsIgnoreCase("read") || fileOption.equalsIgnoreCase("r"))
                    file.readFromFile();
                else {
                    System.out.print(" Please enter which address book to write: ");
                    String adBookFile = sc.next();

                    file.writeIntoFile(adBookFile, adBook);
                }
            }
            else if (fileFormatOption.equalsIgnoreCase("txt")) {
                if (fileOption.equalsIgnoreCase("read") || fileOption.equalsIgnoreCase("r"))
                    file.readtxtFile();
                else {
                    System.out.print(" Please enter which address book to write: ");
                    String adBookFile = sc.next();

                    file.writeCSVFile(adBookFile, adBook);
                }
            }
            break;
		default:
			System.out.println("Enter the option");
		}
		
	System.out.println("Vist again");
	sc.close();
	}
	
	
}

}
