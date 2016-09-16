import com.sun.xml.internal.ws.util.StringUtils;

import java.util.regex.Pattern;

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
    private String __type;

//    public Person(int objectId, int birthYear, int birthMonth, int birthDay, String stateFileNumber, String socialSecurityNumber, String firstName, String middleName, String lastName, String gender) {
//        this.objectId = objectId;
//        this.birthYear = birthYear;
//        this.birthMonth = birthMonth;
//        this.birthDay = birthDay;
//        this.stateFileNumber = stateFileNumber;
//        this.socialSecurityNumber = socialSecurityNumber;
//        this.firstName = firstName;
//        this.middleName = middleName;
//        this.lastName = lastName;
//        this.gender = gender;
//    }

    /*
    * Checks to see if testNumber is an integer, if so, return the integer... else return -1.
    *   This is primarily used for parsing xml documents. Gson seems to handle all the data gracefully for JSON.
    * */
    public int checkSetInt(String testNumber) {
//        Integer testing using regex referneced from: http://stackoverflow.com/questions/14206768/how-to-check-if-a-string-is-numeric
        if (!testNumber.matches("[+]?\\d*")) {
//            The testNumber is NOT a number, so return -1.
            return -1;
        }
//        The testNumber IS a number, so return it.
        return Integer.parseInt(testNumber);
    }

    public String getType() {
        return this.__type;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = checkSetInt(objectId);
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = checkSetInt(birthYear);
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = checkSetInt(birthMonth);
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = checkSetInt(birthDay);
    }

    public String getStateFileNumber() {
        return stateFileNumber;
    }

    public void setStateFileNumber(String stateFileNumber) {
        this.stateFileNumber = stateFileNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String get__type() {
        return __type;
    }

    public void set__type(String __type) {
        this.__type = __type;
    }
}
