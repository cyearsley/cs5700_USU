/**
 * Created by Caleb on 9/13/2016.
 */
public abstract class Person {

    private int objectId;
    private int birthYear;
    private int birthMonth;
    private int birthDay;

    private String stateFileNumber;
    private String socialSecurityNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;

    public Person(int objectId, int birthYear, int birthMonth, int birthDay, String stateFileNumber, String socialSecurityNumber, String firstName, String middleName, String lastName, String gender) {
        this.objectId = objectId;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.stateFileNumber = stateFileNumber;
        this.socialSecurityNumber = socialSecurityNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
    }
}
