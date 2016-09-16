import com.google.gson.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Caleb on 9/13/2016.
 */
public class ParseJSON implements IParse {

    private class tempPerson {
        String __type;

        public String getType() {
            return this.__type;
        }
    }

    @Override
    public List parse(String JSON) {

//        Found on http://stackoverflow.com/questions/11255353/java-best-way-to-grab-all-strings-between-two-strings-regex
        List<String> strings = Arrays.asList( JSON.replaceAll("^.*?\\{", "").split("\\}.*?(\\{|$)"));

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            Gson gson = new GsonBuilder().create();
            String personType = gson.fromJson("{"+strings.get(i)+"}",tempPerson.class).getType().toLowerCase();

//            System.out.println("The type we are testing for is: " +  gson.fromJson("{"+strings.get(i)+"}",Person.class).getType());

            if (personType.contains("adult")) {
                System.out.println("Creating an adult...");
                Person p = gson.fromJson("{"+strings.get(i)+"}", Adult.class);
                people.add(p);
            }
            else if (personType.contains("child")) {
                System.out.println("Creating a child...");
                Person p = gson.fromJson("{"+strings.get(i)+"}",  Child.class);
                people.add(p);
            }

        }

//        System.out.println("Parsing: JSON with the name... " + people);
        return people;
    }
}
