package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookService {
	static Scanner sc=new Scanner(System.in);
	static ArrayList<Contacts> arrayOfContacts = new ArrayList<Contacts>();
	public static void addContact() {
		System.out.println("Please enter your first name :");
	    String first_name = sc.next();
	    System.out.println("Please enter your last name :");
	    String last_name = sc.next();
	    sc.nextLine();
	    System.out.println("Please enter your Address :");
	    String Address = sc.nextLine();
	    System.out.println("Please enter your city :");
	    String city = sc.next();
	    System.out.println("Please enter your state :");
	    String state = sc.next();
	    System.out.println("enter the zip");
	    int zip=sc.nextInt();
	    System.out.println("Please enter your phone number :");
	    long phone_number = sc.nextLong();
	    System.out.println("Please enter your email id :");
	    String email = sc.next();
	    Contacts contact=new Contacts(first_name,last_name,Address,city,state,zip,phone_number,email);
	    arrayOfContacts.add(contact);
	    
	}
	  public static void display()
	    {

	        for(Contacts con : arrayOfContacts)
	        {
	            System.out.println(con);
	        }
	    }
}
