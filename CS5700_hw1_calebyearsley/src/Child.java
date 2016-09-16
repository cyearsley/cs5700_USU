/**
 * Created by Caleb on 9/13/2016.
 * Child - inherits from Person.
 */
public class Child extends Person {
    private int BirthOrder;

    private String NewbornScreeningNumber;
    private String IsPartOfMultipleBirth;
    private String BirthCountry;
    private String MotherFirstName;
    private String MotherMiddleName;
    private String MotherLastName;

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
        return BirthOrder;
    }

    public String getNewbornScreeningNumber() {
        return NewbornScreeningNumber;
    }

    public String getIsPartOfMultipleBirth() {
        return IsPartOfMultipleBirth;
    }

    public String getBirthCountry() {
        return BirthCountry;
    }

    public String getMotherFirstName() {
        return MotherFirstName;
    }

    public String getMotherMiddleName() {
        return MotherMiddleName;
    }

    public String getMotherLastName() {
        return MotherLastName;
    }

    public void setBirthOrder(String birthOrder) {
        this.BirthOrder = checkSetInt(birthOrder);
    }

    public void setNewbornScreeningNumber(String newbornScreeningNumber) {
        this.NewbornScreeningNumber = newbornScreeningNumber;
    }

    public void setIsPartOfMultipleBirth(String isPartOfMultipleBirth) {
        this.IsPartOfMultipleBirth = isPartOfMultipleBirth;
    }

    public void setBirthCountry(String birthCountry) {
        this.BirthCountry = birthCountry;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.MotherFirstName = motherFirstName;
    }

    public void setMotherMiddleName(String motherMiddleName) {
        this.MotherMiddleName = motherMiddleName;
    }

    public void setMotherLastName(String motherLastName) {
        this.MotherLastName = motherLastName;
    }
}
