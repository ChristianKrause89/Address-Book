// COSC 2320 Spring 2015
 // Name: Christian Krause
 // Programming Assignment 1
 // This is my own work; I will not post
 package programmingassignment1;

 import java.util.Scanner;

 public class Controller {

     AddressBook ABObject = new AddressBook();

     public void makeSelection() {
         int choice = -13;
         Scanner scannerObj = new Scanner(System.in);
         System.out.println("Enter selection here: ");
         choice = scannerObj.nextInt();

         switch (choice) {
             case 1:
                 UCDisplayPersonalInfo();
                 break;
             case 2:
                 UCDisplayBDNames();
                 break;
             case 3:
                 UCDisplayStatusNames();
                 break;
             case 4:
                 UCAddEntry();
                 break;
             case 5:
                 UCDeleteEntry();
                 break;
             case 6:
                 UCExit();
         }
     }

     public void UCDisplayPersonalInfo() {
         ABObject.DisplayPersonalInfo();
     }

     public void UCDisplayBDNames() {
         ABObject.DisplayBDNames();
     }

     public void UCDisplayStatusNames() {
         ABObject.DisplayStatusNames();
     }

     public void UCAddEntry() // add appropriate parameters
     {
         ABObject.AddEntry();
     }

     public void UCDeleteEntry() // add appropriate parameters
     {
         ABObject.DeleteEntry();
     }

     public void UCExit() {
         ABObject.SaveData();
     }

     public void load() {
         ABObject.LoadData();
     }
 }