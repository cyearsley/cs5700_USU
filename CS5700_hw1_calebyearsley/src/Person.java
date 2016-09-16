/**
 * Created by Caleb on 9/13/2016.
 */
public abstract class Person {

    private String objectId;
    private String birthYear;
    private String birthMonth;
    private String birthDay;

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

    public String getType() {
        return this.__type;
    }

    public String getId() {
        return this.objectId;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
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
