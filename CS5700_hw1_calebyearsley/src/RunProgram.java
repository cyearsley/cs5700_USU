import java.util.*;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
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

        //TODO: check to see what type of file we are reading...
        String fileName = promptFileType();

        if ("XML".equals(fileName.toUpperCase())) {
            fileName = xmlTestDocument;
        }
        else if ("JSON".equals(fileName.toUpperCase())) {
            fileName = jsonTestDocument;
        }

        String fileExtension = fileName.replaceAll("(.*)\\.", "").toUpperCase();
        System.out.println("The fileExtension is: " + fileExtension);

        fileReader fReader = new fileReader(fileName, fileExtension);
        if (fReader.readFile() == "") {
            System.out.println("The content is empty");
        }

        fileData = fReader.readFile();

        if (acceptedDocumentTypes.contains(fileExtension)) {

            int documentIndex = acceptedDocumentTypes.lastIndexOf(fileExtension);
            Parse parser = new Parse(acceptedDocumentTypes.get(documentIndex).toString());
            List<Person> parsedData = parser.performParse(fileData);
            System.out.println("The parsed data is: " +  parsedData);

        }
        else {
            System.out.println("Please specify a file with a valid extension.");
        }

        //TODO: if XML -> Parse parser = new Parse("XML");
        //TODO: if JSON -> Parse parser = new Parse("JSON");
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
