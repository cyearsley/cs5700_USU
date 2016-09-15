/**
 * Created by Caleb on 9/8/2016.
 */
public class child extends person {

    private int birthOrder;

    private String newbornScreeningNumber;
    private String isPartOfMultipleBirth;
    private String birthCountry;
    private String motherFirstName;
    private String motherMiddleName;
    private String motherLastName;

    public child(
            int birthOrder,
            String newbornScreeningNumber,
            String isPartOfMultipleBirth,
            String birthCountry,
            String motherFirstName,
            String motherMiddleName,
            String motherLastName,
            int objectId, int birthYear, int birthMonth, int birthDay, String stateFileNumber, String socialSecurityNumber, String firstName, String middleName, String lastName, String gender
    ) {
        super(objectId, birthYear, birthMonth, birthDay, stateFileNumber, socialSecurityNumber, firstName, middleName, lastName, gender);
        this.birthOrder = birthOrder;
        this.newbornScreeningNumber = newbornScreeningNumber;
        this.isPartOfMultipleBirth = isPartOfMultipleBirth;
        this.birthCountry = birthCountry;
        this.motherFirstName = motherFirstName;
        this.motherMiddleName = motherMiddleName;
        this.motherLastName = motherLastName;
    }

    public int getBirthOrder() {
        return birthOrder;
    }

    public void setBirthOrder(int birthOrder) {
        this.birthOrder = birthOrder;
    }

    public String getNewbornScreeningNumber() {
        return newbornScreeningNumber;
    }

    public void setNewbornScreeningNumber(String newbornScreeningNumber) {
        this.newbornScreeningNumber = newbornScreeningNumber;
    }

    public String getIsPartOfMultipleBirth() {
        return isPartOfMultipleBirth;
    }

    public void setIsPartOfMultipleBirth(String isPartOfMultipleBirth) {
        this.isPartOfMultipleBirth = isPartOfMultipleBirth;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    public String getMotherMiddleName() {
        return motherMiddleName;
    }

    public void setMotherMiddleName(String motherMiddleName) {
        this.motherMiddleName = motherMiddleName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }
}
