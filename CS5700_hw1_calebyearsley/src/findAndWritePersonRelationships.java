import java.util.List;
import java.util.Scanner;

/**
 * Created by Caleb on 9/16/2016.
 * Used to find the relationship between people, read the output file name, and write to the output file.
 */
public class findAndWritePersonRelationships {
    private String outputFile;
    private List<Person> listOfPeople;
    private String dataOutput;

    public findAndWritePersonRelationships(List<Person> peopleData) {
        this.listOfPeople = peopleData;
        System.out.println("The parsed data is: " +  this.listOfPeople);
    }

    public String getOutputFile() {
        return outputFile;
    }

    public String readUserOutputFileName () {

        System.out.println("\nWhat file would you like to output the results to?");
        Scanner scanner = new Scanner(System.in);
        String oFile = scanner.next();

        this.outputFile = oFile;
        return oFile;
    }

    public boolean writeToOutputFile() {

        return true;
    }

//    Find the relationships between people.
    public boolean findRelationships() {

//        Evaluate every possible relationship
        for (int comparer = 0; comparer < listOfPeople.size(); comparer++) {
            for (int comparee = 0; comparee < listOfPeople.size(); comparee++) {

//                We don't want to compare a person with themselves
                if (comparer == comparee) {
                    continue;
                }
            }
        }

        return true;
    }
}
