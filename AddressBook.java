
// COSC 2320 Spring 2015
// Name: Christian Krause
// Programming Assignment 1
// This is my own work; I will not post

package programmingassignment1;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class AddressBook extends KCSortedLinkedBasedList {

    public void DisplayPersonalInfo() {

        String theLastName;
        System.out.println("Please enter last name: ");
        Scanner scannerObj = new Scanner(System.in);
        theLastName = scannerObj.next();

        for (int i = 1; i <= super.KCgetLength(); i++) {
            ExtPersonType temp = (ExtPersonType) super.KCgetEntry(i);
            String lastNombre = temp.getLastName();
            if (theLastName.compareTo(lastNombre) == 0) {
                AddressType address = temp.getAddress();
                DateType date = temp.getDOB();
                System.out.println(address.toString(2));
                System.out.println(date.toString());
                System.out.println(temp.getPhoneNumber());
                break;

            }

        }

    }

    public void DisplayBDNames() {

        int theMonth;
        System.out.println("Please enter month: ");
        Scanner scannerObj = new Scanner(System.in);
        theMonth = scannerObj.nextInt();

        for (int i = 1; i <= super.KCgetLength(); i++) {
            ExtPersonType temp = (ExtPersonType) super.KCgetEntry(i);
            DateType someDate = temp.getDOB();
            int month = someDate.getMonth();

            if (theMonth == month) {
                System.out.println(temp.getFirstName() + " " + temp.getLastName());
            }

        }

    }

    public void DisplayStatusNames() {

        String theStatus;
        System.out.println("Please enter affiliation: ");
        Scanner scannerObj = new Scanner(System.in);
        theStatus = scannerObj.next();

        for (int i = 1; i <= super.KCgetLength(); i++) {
            ExtPersonType temp = (ExtPersonType) super.KCgetEntry(i);
            String someStatus = temp.personStatus();

            if (theStatus.compareTo(someStatus) == 0) {
                System.out.println(temp.getFirstName() + " " + temp.getLastName());
            }

        }


    }

    public void AddEntry() {

        Scanner scanOb = new Scanner(System.in);

        System.out.println("Please input first name:");
        String userName = scanOb.next();

        System.out.println("Please input last name:");
        String userLast = scanOb.next();

        System.out.println("Please input month:");
        int month = scanOb.nextInt();

        System.out.println("Please input day:");
        int day = scanOb.nextInt();

        System.out.println("Please input year:");
        int year = scanOb.nextInt();
        String rubbish = scanOb.nextLine();

        System.out.println("Please input street name:");
        String street = scanOb.nextLine();

        System.out.println("Please input city:");
        String city = scanOb.nextLine();

        System.out.println("Please input state:");
        String state = scanOb.nextLine();

        System.out.println("Please input zip code:");
        String zip = scanOb.nextLine();

        System.out.println("Please input phone number:");
        String phone = scanOb.nextLine();

        System.out.println("Please input affiliation:");
        String status = scanOb.nextLine();

        AddressType addressObject = new AddressType(street, city, state, zip);
        PersonType personObject = new PersonType(userName, userLast);
        DateType dateObject = new DateType(month, day, year);
        ExtPersonType ePersonObject = new ExtPersonType(addressObject, dateObject, phone, status, userLast, userName);

        int newIndex = sortList(userName, userLast);
        boolean checker = super.KCadd(newIndex, ePersonObject);

    }

    public void DeleteEntry() {
        String theLastName;
        System.out.println("Please enter last name: ");
        Scanner scannerObj = new Scanner(System.in);
        theLastName = scannerObj.next();

        for (int i = 1; i <= super.KCgetLength(); i++) {
            ExtPersonType temp = (ExtPersonType) super.KCgetEntry(i);
            String lastNombre = temp.getLastName();
            if (theLastName.compareTo(lastNombre) == 0) {
                super.KCremove(i);

            }

        }
    }

    public void LoadData() {
        Scanner fileIn = null;
        try {
            fileIn = new Scanner(new FileInputStream("Programming Assignment 1 Data.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File note found.");
            System.exit(0);
        }

        String firstName, lastName, streetAddress, city, state, ZIPcode, phoneNumber, personStatus, extraLine;
        int month, day, year;

        while (fileIn.hasNextLine()) {
            firstName = fileIn.next();
            lastName = fileIn.next();

            if (fileIn.hasNextInt()) {
                month = fileIn.nextInt();
                day = fileIn.nextInt();
                year = fileIn.nextInt();
                extraLine = fileIn.nextLine();
            } else {
                month = 0;
                day = 0;
                year = 0;
            }

            streetAddress = fileIn.nextLine();
            city = fileIn.nextLine();
            state = fileIn.nextLine();
            ZIPcode = fileIn.nextLine();
            phoneNumber = fileIn.nextLine();
            personStatus = fileIn.nextLine();

            // creating ExtPersonType object
            AddressType addressObject = new AddressType(streetAddress, city, state, ZIPcode);
            PersonType personObject = new PersonType(firstName, lastName);
            DateType dateObject = new DateType(month, day, year);
            ExtPersonType ePersonObject = new ExtPersonType(addressObject, dateObject, phoneNumber, personStatus, lastName, firstName);

            int position = sortList(firstName, lastName);

            boolean checker = super.KCadd(position, ePersonObject);



        }
    }

    public int sortList(String firstName, String lastName) {
        int length = super.KCgetLength();
        int newPosition = -1;

        if (super.KCisEmpty()) {
            return 1;
        } else {
            for (int i = (length); i >= 1; i--) {
                ExtPersonType temp = (ExtPersonType) super.KCgetEntry(i);
                String firstNombre = temp.getFirstName();
                String lastNombre = temp.getLastName();
                if (lastName.compareTo(lastNombre) < 0) {
                    newPosition = i;
                } else if (newPosition == -1) {
                    newPosition = length;
                }
            }
        }
        return newPosition;
    }

    public void SaveData() {

        File theFile = new File("Programming Assignment 1 Data.txt");
        PrintWriter output = null;
        try {
            output = new PrintWriter(new FileOutputStream(theFile));

        } catch (FileNotFoundException e) {
            System.out.println("Could not open file.");
            System.exit(0);
        }
        Node theNode = headNode;
        for (int i = 1; i <= length; i++) {
            ExtPersonType save = (ExtPersonType) theNode.getData();
            output.println(save.toString());
            theNode = theNode.getAddress();
        }
        output.close();
        System.out.println("\nFile successfully saved.");

        System.exit(0);
    }
}
