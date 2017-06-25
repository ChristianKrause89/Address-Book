
// COSC 2320 Spring 2015
// Name: Christian Krause
// Programming Assignment 1
// This is my own work; I will not post
package programmingassignment1;

public class PersonType {

    private String firstName;
    private String lastName;

    PersonType() {
        firstName = null;
        lastName = null;
    }

    PersonType(String newFirstName, String newLastName) {
        firstName = newFirstName;
        lastName = newLastName;
    }

    public void setFirstName(String newName) {
        firstName = newName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        String theString;
        theString = (firstName + "\r\n" + lastName);
        return theString;
    }
}
