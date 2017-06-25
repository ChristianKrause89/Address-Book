
// COSC 2320 Spring 2015
// Name: Christian Krause
// Programming Assignment 1
// This is my own work; I will not post
package programmingassignment1;

public class AddressType {

    private String streetAddress;
    private String city;
    private String state;
    private String ZIPcode;

    AddressType() {
        streetAddress = null;
        city = null;
        state = null;
        ZIPcode = null;
    }

    AddressType(String newStreetAddress, String newCity, String newState, String newZIPcode) {
        streetAddress = newStreetAddress;
        city = newCity;
        state = newState;
        ZIPcode = newZIPcode;
    }

    public void setStreetAddress(String newStreetAddress) {
        streetAddress = newStreetAddress;
    }

    public void setCity(String newCity) {
        city = newCity;
    }

    public void setState(String newState) {
        state = newState;
    }

    public void setZIPcode(String newZIPcode) {
        ZIPcode = newZIPcode;
    }

    public String getStreeAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZIPcode() {
        return ZIPcode;
    }

    public String toString(int choice) {
        String theString;

        if (choice == 1) {
            theString = (streetAddress + "\r\n" + city + "\r\n" + state + "\r\n" + ZIPcode);
        } else {
            theString = ("Street Address:" + streetAddress + "\r\n" + "City:" + city + "\r\n" + "State:" + state + "\r\n" + "ZIPcode:" + ZIPcode);
        }
        return theString;
    }
}
