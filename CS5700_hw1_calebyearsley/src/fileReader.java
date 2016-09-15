import java.util.*;
import java.io.*;
/**
 * Created by Caleb on 9/15/2016.
 */
public class fileReader {
    private String fileName;
    private String fileType;

    public fileReader(String file, String type) {
        this.fileName = "src/" + file;
        this.fileType = type;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFileType() {
        return this.fileType;
    }

//    Returns the contens of a file in a single string
    public String readFile() {
        String fileData = "";

//      File reading Referenced from: https://www.caveofprogramming.com/java/java-file-reading-and-writing-files-in-java.html
        String fileLine = null;

        try {
//            Set the file reader
            FileReader fileReader = new FileReader(this.fileName);

//            Set the buffered reader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

//            Iterate through the file
            while((fileLine = bufferedReader.readLine()) != null) {
                fileData += fileLine;
            }

//            Close the file
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file: '" + this.fileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file: '" + this.fileName + "'");
        }

//        Return to entire contents of the file in a single string
        return fileData;
    }
}
