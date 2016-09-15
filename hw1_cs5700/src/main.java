import java.util.*;
import com.google.gson.*;

/**
 * Created by Caleb on 9/8/2016.
 * Libraries using:
 *      -Gson (for parsing JSON)
 *
 */

public class main {
    public static void main(String[] args) {
        System.out.println("This is a test HELLO JAVA");
        adult test = new adult(123, 123,123,123,"test","test","test","test","test","test","first phone", "second phone");
        System.out.println(test.getPhone1());
    }
}
