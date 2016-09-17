/**
 * Created by Caleb on 9/13/2016.
 */
public abstract class Person {

    private int ObjectId;
    private int BirthYear;
    private int BirthMonth;
    private int BirthDay;

    private String StateFileNumber;
    private String SocialSecurityNumber;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String Gender;
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
        return ObjectId;
    }

    public void setObjectId(String objectId) {
        this.ObjectId = checkSetInt(objectId);
    }

    public int getBirthYear() {
        return BirthYear;
    }

    public void setBirthYear(String birthYear) {
        this.BirthYear = checkSetInt(birthYear);
    }

    public int getBirthMonth() {
        return BirthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.BirthMonth = checkSetInt(birthMonth);
    }

    public int getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String birthDay) {
        this.BirthDay = checkSetInt(birthDay);
    }

    public String getStateFileNumber() {
        return StateFileNumber;
    }

    public void setStateFileNumber(String stateFileNumber) {
        this.StateFileNumber = stateFileNumber;
    }

    public String getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.SocialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        this.MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public String get__type() {
        return __type;
    }

    public void set__type(String __type) {
        this.__type = __type;
    }
}
