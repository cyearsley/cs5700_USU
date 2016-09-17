import java.util.*;
import java.util.Scanner;

/**
 * Created by Caleb on 9/13/2016.
 */

public class RunProgram {

    private static List acceptedDocumentTypes = Arrays.asList("XML", "JSON");
    private static String xmlTestDocument = "PersonTestSet_11.xml";
    private static String jsonTestDocument = "PersonTestSet_01.json";
    private static String fileData;

    public static void main(String[] args) {

        //What type of file are we reading?
        String fileName = promptFileType();

        if ("XML".equals(fileName.toUpperCase())) {
            fileName = xmlTestDocument;
        }
        else if ("JSON".equals(fileName.toUpperCase())) {
            fileName = jsonTestDocument;
        }

        String fileExtension = fileName.replaceAll("(.*)\\.", "").toUpperCase();

        fileReader fReader = new fileReader(fileName, fileExtension);
        if (fReader.readFile() == "") {
            System.out.println("The file could not be found! Please ensure that your file is in the src/ directory, and the spelling is correct.\nRe-run the program and try again...");
        }
        else {
            fileData = fReader.readFile();

            if (acceptedDocumentTypes.contains(fileExtension)) {

                int documentIndex = acceptedDocumentTypes.lastIndexOf(fileExtension);
                Parse parser = new Parse(acceptedDocumentTypes.get(documentIndex).toString());
                List<Person> parsedData = parser.performParse(fileData);

                findAndWritePersonRelationships relationship = new findAndWritePersonRelationships(parsedData);
                String output = relationship.getDataOutput();
                relationship.writeToOutputFile(relationship.getOutputFile());

                System.out.println(output);

            }
            else {
                System.out.println("Please specify a file with a valid extension (.json or .xml).");
            }
        }

    }

    public static String promptFileType() {
        System.out.println("What is the file path of the document you would like to parse? (You can enter either \"xml\" or \"json\" to view the default test.");
        System.out.print("The type of files that are currently valid are: ");
        for (int i = 0; i < acceptedDocumentTypes.size(); i++) {
            System.out.print(" " + acceptedDocumentTypes.get(i));
        }
        System.out.println("");
        System.out.println("Please enter the file path of your document (include the file type): ");

        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();

        return fileName;
    }

}
