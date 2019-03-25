import java.lang.*;
import java.util.*;
import com.cezarydanilowski.*;
import com.cezarydanilowski.Queue;

/**
 * Program implements data structure called queue, shows haw it works
 * @author Cezary Daniłowski
 * @version 1.0 2019-03-25
 */

public class Main {
    public static void main(String[] args) {
        Class<String> clazz = Class.forName("");
        Queue<String> names = new Queue<>(clazz,5);

        names.add("Andrzej");
        names.add("Jacek");
        names.add("Franek");
        names.add("Mirek");
        names.add("Sławek");

        System.out.println(names.getFirst());
    }
}
