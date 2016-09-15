import com.google.gson.*;
/**
 * Created by Caleb on 9/13/2016.
 */
public class ParseJSON implements IParse {

    private class tempPerson {
        String __type;
    }

    @Override
    public void parse(String JSON) {

        System.out.println("Parsing: JSON with the name... " + JSON);

    }
}
