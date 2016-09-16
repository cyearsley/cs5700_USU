/**
 * Created by Caleb on 9/13/2016.
 * Child - inherits from Person.
 */
public class Child extends Person {
    private int birthOrder;

    private String newbornScreeningNumber;
    private String isPartOfMultipleBirth;
    private String birthCountry;
    private String motherFirstName;
    private String motherMiddleName;
    private String motherLastName;

//    public Child(int objectId, int birthYear, int birthMonth, int birthDay, String stateFileNumber, String socialSecurityNumber, String firstName, String middleName, String lastName, String gender, int birthOrder, String newbornScreeningNumber, String isPartOfMultipleBirth, String birthCountry, String motherFirstName, String motherMiddleName, String motherLastName) {
//        super(objectId, birthYear, birthMonth, birthDay, stateFileNumber, socialSecurityNumber, firstName, middleName, lastName, gender);
//        this.birthOrder = birthOrder;
//        this.newbornScreeningNumber = newbornScreeningNumber;
//        this.isPartOfMultipleBirth = isPartOfMultipleBirth;
//        this.birthCountry = birthCountry;
//        this.motherFirstName = motherFirstName;
//        this.motherMiddleName = motherMiddleName;
//        this.motherLastName = motherLastName;
//    }

    public int getBirthOrder() {
        return birthOrder;
    }

    public String getNewbornScreeningNumber() {
        return newbornScreeningNumber;
    }

    public String getIsPartOfMultipleBirth() {
        return isPartOfMultipleBirth;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public String getMotherMiddleName() {
        return motherMiddleName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setBirthOrder(String birthOrder) {
        this.birthOrder = checkSetInt(birthOrder);
    }

    public void setNewbornScreeningNumber(String newbornScreeningNumber) {
        this.newbornScreeningNumber = newbornScreeningNumber;
    }

    public void setIsPartOfMultipleBirth(String isPartOfMultipleBirth) {
        this.isPartOfMultipleBirth = isPartOfMultipleBirth;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    public void setMotherMiddleName(String motherMiddleName) {
        this.motherMiddleName = motherMiddleName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }
}
