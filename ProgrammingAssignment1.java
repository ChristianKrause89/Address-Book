// COSC 2320 Spring 2015
// Name: Christian Krause
// Programming Assignment 1
// This is my own work; I will not post
package programmingassignment1;

public class ProgrammingAssignment1 {

    public static void main(String[] args) {
        View theView = new View();
        Controller theController = new Controller();

        theController.load();
        int a = 1;
        while (a == 1) {
            theView.ShowSelection();
            theController.makeSelection();
        }
    }
}
