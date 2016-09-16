import java.util.List;

/**
 * Created by Caleb on 9/13/2016.
 * Class to delegate parsing methods.
 */
public class Parse {

    IParse parser;

    public Parse(String fileType) {

        if (fileType == "XML") {
            this.parser = new ParseXML();
        }
        else if (fileType == "JSON") {
            this.parser = new ParseJSON();
        }
        //TODO: if other file types need to be parsed, add another >>else if<< here.
        //  Keep in mind: if another file type is required, we will need to add another parsing behavior.
    }

    public List performParse(String fileData) {
        List<Person> parsedFileData = parser.parse(fileData);
        return parsedFileData;
    }
}
