/**
 * Created by Caleb on 9/13/2016.
 * Adult - inherits from Person
 */
public class Adult extends Person {

    private String phone1;
    private String phone2;

    public Adult(int objectId, int birthYear, int birthMonth, int birthDay, String stateFileNumber, String socialSecurityNumber, String firstName, String middleName, String lastName, String gender, String phone1, String phone2) {
        super(objectId, birthYear, birthMonth, birthDay, stateFileNumber, socialSecurityNumber, firstName, middleName, lastName, gender);
        this.phone1 = phone1;
        this.phone2 = phone2;
    }

    public String getPhone1() {
        return phone1;
    }

    public String getPhone2() {
        return phone2;
    }
}
