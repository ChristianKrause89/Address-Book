
// COSC 2320 Spring 2015
// Name: Christian Krause
// Programming Assignment 1
// This is my own work; I will not post
package programmingassignment1;

public class DateType {

    private int month;
    private int day;
    private int year;

    DateType() {
        month = 0;
        day = 0;
        year = 0;
    }

    DateType(int newMonth, int newDay, int newYear) {
        month = newMonth;
        day = newDay;
        year = newYear;
    }

    public void setMonth(int newMonth) {
        month = newMonth;
    }

    public void setDay(int newDay) {
        day = newDay;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        String theString;
        theString = (month + " " + day + " " + year);
        return theString;
    }
}
