import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import org.xml.sax.InputSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Caleb on 9/13/2016.
 */
public class ParseXML implements IParse {

    @Override
    public List parse(String XML) {
        System.out.println("Parsing: XML with the name... " + XML);
        List<Person> personList = new ArrayList<>();

//            Referencing http://www.rgagnon.com/javadetails/java-0573.html
        try {
                DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                InputSource is = new InputSource();
                is.setCharacterStream(new StringReader(XML));
                Document doc = db.parse(is);
                NodeList nodes = doc.getElementsByTagName("Person");

                for (int i = 0; i < nodes.getLength(); i++) {

                    Element element = (Element) nodes.item(i);

                    String personType = element.getAttribute("xsi:type");

                    if (personType.toLowerCase().equals("Adult".toLowerCase())) {

                        personList.add(constructPerson("adult".toLowerCase(), element));

                    }
                    else if (personType.toLowerCase().equals("Child".toLowerCase())) {

                        personList.add(constructPerson("child".toLowerCase(), element));

                    }

                }

            } catch (Exception e) {
                System.out.println("ERROR" + e);
            }

        return personList;
    }

    public static String getElementData(String elementName, Element element) {
        NodeList name = element.getElementsByTagName(elementName);
        Element line = (Element) name.item(0);

        Node child = line.getFirstChild();
        if (child instanceof CharacterData) {
            CharacterData cd = (CharacterData) child;
            return cd.getData();
        }
        return "";
    }

    public static Person addInheritedProperties(Person person, Element element, String personType) {
//        System.out.println("The value of phone1 is: " + person.getPhone1());
        try {
            person.setObjectId(getElementData("ObjectId", element));
//            System.out.println("Set objectId!");
        } catch(Exception e) {}
        try {
            person.setBirthYear(getElementData("BirthYear", element));
//            System.out.println("Set birthYear!");
        } catch(Exception e) {}
        try {
            person.setBirthMonth(getElementData("BirthMonth", element));
//            System.out.println("Set birthMonth!");
        } catch(Exception e) {}
        try {
            person.setBirthDay(getElementData("BirthDay", element));
//            System.out.println("Set birthDay!");
        } catch(Exception e) {}
        try {
            person.setStateFileNumber(getElementData("StateFileNumber", element));
//            System.out.println("Set stateFileNumber!");
        } catch(Exception e) {}
        try {
            person.setSocialSecurityNumber(getElementData("SocialSecurityNumber", element));
//            System.out.println("Set socialSecurityNumber!");
        } catch(Exception e) {}
        try {
            person.setFirstName(getElementData("FirstName", element));
//            System.out.println("Set firstName!");
        } catch(Exception e) {}
        try {
            person.setMiddleName(getElementData("MiddleName", element));
//            System.out.println("Set middleName!");
        } catch(Exception e) {}
        try {
            person.setLastName(getElementData("LastName", element));
//            System.out.println("Set lastName!");
        } catch(Exception e) {}
        try {
            person.setGender(getElementData("Gender", element));
//            System.out.println("Set gender!");
        } catch(Exception e) {}
        try {
            person.set__type(personType);
        } catch(Exception e) {}

        return person;
    }

    public Person constructPerson(String personType, Element element) {
        if (personType.toLowerCase().equals("adult")) {
            Adult person = new Adult();
            try {
                person.setPhone1(getElementData("Phone1", element));
//                System.out.println("Set Phone1!");
            } catch(Exception e) {}
            try {
                person.setPhone1(getElementData("Phone2", element));
//                System.out.println("Set Phone2!");
            } catch(Exception e) {}
            addInheritedProperties(person, element, personType);
          return person;
        }
        else {
            Child person = new Child();
            try {
                person.setBirthOrder(getElementData("BirthOrder", element));
//                System.out.println("Set BirthOrder!");
            } catch(Exception e) {}
            try {
                person.setNewbornScreeningNumber(getElementData("NewbornScreeningNumber", element));
//                System.out.println("Set NewbornScreeningNumber!");
            } catch(Exception e) {}
            try {
                person.setIsPartOfMultipleBirth(getElementData("IsPartOfMultipleBirth", element));
//                System.out.println("Set IsPartOfMultipleBirth!");
            } catch(Exception e) {}
            try {
                person.setBirthCountry(getElementData("BirthCountry", element));
//                System.out.println("Set birthCountry!");
            } catch(Exception e) {}
            try {
                person.setMotherFirstName(getElementData("MotherFirstName", element));
//                System.out.println("Set motherFirstName!");
            } catch(Exception e) {}
            try {
                person.setMotherMiddleName(getElementData("MotherMiddleName", element));
//                System.out.println("Set motherMiddleName!");
            } catch(Exception e) {}
            try {
                person.setMotherLastName(getElementData("MotherLastName", element));
//                System.out.println("Set motherLastName!");
            } catch(Exception e) {}
            addInheritedProperties(person, element, personType);
          return person;
        }
    }
}