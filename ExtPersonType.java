
// COSC 2320 Spring 2015
// Name: Christian Krause
// Programming Assignment 1
// This is my own work; I will not post
package programmingassignment1;

public class ExtPersonType extends PersonType {

    private AddressType address;
    private DateType DOB;
    private String phoneNumber;
    private String personStatus;

    ExtPersonType() {
        super();
        address = null;
        DOB = null;
        phoneNumber = null;
        personStatus = null;
    }

    ExtPersonType(AddressType address, DateType DOB, String phoneNumber, String personStatus, String lastName, String firstName) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.address = address;
        this.DOB = DOB;
        this.phoneNumber = phoneNumber;
        this.personStatus = personStatus;
    }

    public void setAddress(AddressType newAddress) {
        address = newAddress;
    }

    public void setDOB(DateType newDOB) {
        DOB = newDOB;
    }

    public void setPhoneNumber(String newPhoneNumber) {
        phoneNumber = newPhoneNumber;
    }

    public void setPersonStatus(String newPersonStatus) {
        personStatus = newPersonStatus;
    }

    public AddressType getAddress() {
        return address;
    }

    public DateType getDOB() {
        return DOB;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String personStatus() {
        return personStatus;
    }

    @Override
    public String toString() {
        String theString;
        theString = (super.toString() + "\r\n" + DOB.toString() + "\r\n" + address.toString(1) + "\r\n" + phoneNumber + "\r\n" + personStatus);
        return theString;
    }
}
