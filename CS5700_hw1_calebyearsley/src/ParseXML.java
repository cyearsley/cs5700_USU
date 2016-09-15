/**
 * Created by Caleb on 9/13/2016.
 */
public class ParseXML implements IParse {

    private class tempPerson {
        String __type;
    }

    @Override
    public void parse(String fileName) {
        System.out.println("Parsing: XML with the name... " + fileName);
    }
}
