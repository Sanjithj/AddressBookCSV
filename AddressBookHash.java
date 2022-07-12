package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class AddressBookHash {
	HashMap<String, AddressBookService> addressBook = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	   
	    public AddressBookService findAddressBook(String adBookName) {

	        for (Map.Entry<String, AddressBookService> itrator : addressBook.entrySet()) {
	            if (itrator.getKey().equalsIgnoreCase(adBookName)) {
	                return itrator.getValue();
	            }
	        }

	        return null;

	    }
	    public void addAddressBook() {

	        System.out.println(" enter the name of the address book which you want to see ");
	        String name = sc.next();

	        if (addressBook.get(name) != null) {

	            System.out.println(" this book already exists");
	            return;
	        }

	        addressBook.put(name, new AddressBookService());

	    }
	    public void addContact() {
	    	System.out.println("enter the address book name");
	    	
	    	String addressBook=sc.next();
	    	AddressBookService addBook=findAddressBook(addressBook);
	    	if(addBook==null) {
	    		System.out.println("this is not exist");
	    		return;
	    	}
	    	AddressBookService.addContact();
	    }
	    public void editContact() {
	    	System.out.println("please enter the address book ");
	    	String addressBook=sc.next();
	    	AddressBookService addBook=findAddressBook(addressBook);
	    	if(addBook==null) {
	    		System.out.println("this is not exist");
	    		return;
	    	}
	    	AddressBookService.editContact();
	    }
	    public void deleteContact() {
	    	System.out.println("please enter the address book ");
	    	String addressBook=sc.next();
	    	AddressBookService addBook=findAddressBook(addressBook);
	    	if(addBook==null) {
	    		System.out.println("this is not exist");
	    		return;
	    	}
	    	AddressBookService.deleteContact();
	    }
	    
	    public void display() {
	    	System.out.println("please enter the address book ");
	    	String addressBook=sc.next();
	    	AddressBookService addBook=findAddressBook(addressBook);
	    	if(addBook==null) {
	    		System.out.println("this is not exist");
	    		return;
	    	}
	    	AddressBookService.display();
	    	
	    }
	    
	    }

