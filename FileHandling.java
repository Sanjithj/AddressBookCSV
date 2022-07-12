package com.bridgelabz;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandling {
	public void readFromFile() {
        Path path = Paths.get("C:\\Users\\sanji\\eclipse-workspace\\AddressBookIO.txt");

        try {
            System.out.println(Files.readAllLines(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeIntoFile(String adBookName, AddressBookService adBookHandling) {

        AddressBookMain adressdBook = adBookHandling.findAddressBookMain(adBookName);
        Path path = Paths.get("C:\\Users\\sanji\\eclipse-workspace\\AddressBookIO.txt");

        try {
            Files.write(path, AddressBookMain.addressBook.toString().getBytes());
        } catch (IOException e) {
          
            e.printStackTrace();
        }
    }
}
