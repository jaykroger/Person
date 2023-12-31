import java.util.*;
public class Person {
    String ID;
    String firstName;
    String lastName;
    String title;
    int yearOfBirth;

    public Person(String ID, String firstName, String lastName, String title, int yearOfBirth) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.yearOfBirth = yearOfBirth;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    // ToString construct
    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", c=" + c +
                '}';
    }


    // New methods
    Calendar c = Calendar.getInstance();

    // New Methods
    public String fullName() {
        String fullName = getFirstName() + " " + getLastName();
        return fullName;
    } // returns the full name of the user (first name + space + last name)

    public String formalName() {
        return getTitle() + " " + getFirstName() + " " + getLastName();
    } // returns the formal full name of the user (title + full name)

    public int getAge() {
        int currentYear = c.get(Calendar.YEAR);
        return currentYear - getYearOfBirth();
    } // returns the age assuming the current year

    public int getAgeSpecifiedYear(int year) {
        int age = year - getYearOfBirth();
        return age;
    } // uses YOB to calculate age for a specified year based on the Calendar object
}
