
// COSC 2320 Spring 2015
// Name: Christian Krause
// Programming Assignment 1
// This is my own work; I will not post
package programmingassignment1;

public interface KCListADTInterface {

    public boolean KCadd(int newPosition, Object newEntry);

    public boolean KCisEmpty();

    public Object KCremove(int givenPosition);

    public Object KCgetEntry(int givenPosition);
}
