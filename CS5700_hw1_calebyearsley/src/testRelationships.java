/**
 * Created by Caleb on 9/16/2016.
 */
public class testRelationships {

    private Person person1;
    private Person person2;

    // person1 and person2 are the people being compared.
    public testRelationships(Person person1, Person person2) {
        this.person1 = person1;
        this.person2 = person2;
    }

    //    Tests social security number and state file number
//    Assume the following sets:
//        name: {fname,mname,lname}
//        unqiue: {SSN, SFN}
//        dates: {YOB, MOB, DOB}
//        gender: {gender}

//    test the following:
//        1) 2name, 1unqiue
//        2) 1name, 2unqiue
//        3) 1name, 1unqiue, 1dates
//        4) 2unqiue, gender
//        5) 2unqiue, 1dates

    public boolean runTests() {

        try {
            if (test2Name() && test1Uniqiue() && testGender()) {
                return true;
            }
            else if (test1Name() && test2Unqiue() && testGender()) {
                return true;
            }
            else if (test1Name() && test1Uniqiue() && test1Date() && testGender()) {
                return true;
            }
            else if (test2Unqiue() && testGender() && testGender()) {
                return true;
            }
            else if (test2Unqiue() && test1Date() && testGender()) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }

    }

//    Test if at least one name matches
    public boolean test1Name() {
        try {
            if (person1.getFirstName().equals(person2.getFirstName())) {
                return true;
            }
            else if (person1.getMiddleName().equals(person2.getMiddleName())) {
                return true;
            }
            else if (person1.getLastName().equals(person2.getLastName())) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean test2Name() {
        System.out.println("first name: " + person2.getFirstName());
        try {
            if (person1.getFirstName().equals(person2.getFirstName()) && person1.getMiddleName().equals(person2.getMiddleName())) {
                return true;
            }
            else if (person1.getFirstName().equals(person2.getFirstName()) && person1.getLastName().equals(person2.getLastName())) {
                return true;
            }
            else if (person1.getMiddleName().equals(person2.getMiddleName()) && person1.getLastName().equals(person2.getLastName())) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean test1Uniqiue() {
        if (person1.getSocialSecurityNumber().equals(person2.getSocialSecurityNumber())) {
            return true;
        }
        else if (person1.getStateFileNumber().equals(person2.getStateFileNumber())) {
            return true;
        }
        return false;
    }
    public boolean test2Unqiue() {
        if (person1.getSocialSecurityNumber().equals(person2.getSocialSecurityNumber()) && person1.getStateFileNumber().equals(person2.getStateFileNumber())) {
            return true;
        }
        return false;
    }

    public boolean test1Date() {
        if (person1.getBirthDay() == person2.getBirthDay()) {
            return true;
        }
        else if (person1.getBirthMonth() == person2.getBirthMonth()) {
            return true;
        }
        else if (person1.getBirthYear() == person2.getBirthYear()) {
            return true;
        }
        return false;
    }

    public boolean testGender() {
        if (person1.getGender().equals(person2.getGender())) {
            return true;
        }
        return false;
    }

//    public boolean testOneName(Person comparer, Person comparee) {
//        System.out.println("comparer: " + comparer.getFirstName() + ", comparee: " + comparee.getFirstName());
//        System.out.println("comparer: " + comparer.getSocialSecurityNumber() + ", comparee: " + comparee.getSocialSecurityNumber());
//        System.out.println("comparer: " + comparer.getStateFileNumber() + ", comparee: " + comparee.getStateFileNumber());
//        System.out.println("==================");
//        if (
//                comparer.getStateFileNumber() == comparee.getStateFileNumber()
//                || comparer.getSocialSecurityNumber() == comparee.getSocialSecurityNumber()
//                ) {
//
//            if (
//                    (comparer.getFirstName() == comparee.getFirstName() )
//                    || (comparer.getMiddleName() == comparee.getMiddleName() )
//                    || (comparer.getLastName() == comparee.getLastName() )
//                    ) {
//                return true;
//            }
//        }
//        return false;
//    }

}
