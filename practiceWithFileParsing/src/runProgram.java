import com.google.gson.*;
import java.util.*;
import java.io.*;

/**
 * Created by Caleb on 9/14/2016.
 */
public class runProgram {

    public static void main(String[] args) {
        String JSON = "";
        String fileName = "src/PersonTestSet_01.json";
//        String xmlFileName = "PersonTestSet_11.xml";
//        String fileName = "src/testing.txt";

//        Referenced from: https://www.caveofprogramming.com/java/java-file-reading-and-writing-files-in-java.html
        String line = null;

        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                JSON += line;
            }

            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }

        System.out.println("Loading: File: " + fileName);
        System.out.println("JSON: " + JSON);
        List<Person> people2 = gsonParse(JSON);
        System.out.println("The people stored are: " + people2);
    }

    public class Person {
        private String FirstName;
        private int ObjectId;
        private String __type;

        public String toString() {
            return "FirstName: " + this.FirstName + ", ObjectId: " + this.ObjectId + ", __type: " + this.__type;
        }

        public String getId() {
            return this.ObjectId + "";
        }

        public String getType() {
            return this.__type;
        }
    }

    public class Adult extends Person {

        private String Phone1;

        @Override
        public String toString() {
            return super.toString() + ", Phone1: " + this.Phone1;
        }
    }

    public class Child extends Person {

        private String MotherFirstName;

        @Override
        public String toString() {
            return super.toString() + ", MotherFirstName: " + this.MotherFirstName;
        }
    }

    public static List gsonParse(String JSON) {

//        Found on http://stackoverflow.com/questions/11255353/java-best-way-to-grab-all-strings-between-two-strings-regex
        List<String> strings = Arrays.asList( JSON.replaceAll("^.*?\\{", "")
                .split("\\}.*?(\\{|$)"));

        List<Person> people = new ArrayList<Person>();

        for (int i = 0; i < strings.size(); i++) {
            Gson gson = new GsonBuilder().create();
            String personType = gson.fromJson("{"+strings.get(i)+"}",Person.class).getType().toLowerCase();

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

        return people;
    }

}
