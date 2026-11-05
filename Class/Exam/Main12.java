import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class Main12 {
    public static void main (String [] args){
        /*
        List<String> students = new ArrayList<>();

        students.add("Celia");
        students.add("Joy");
        students.add("Celia");
        */

        //System.out.println(students);

        /*
        Set<String> students = new HashSet<>();
        students.add("Celia");
        students.add("Joy");
        students.add("Celia");
        
        System.out.println(students);
        */

       /*

       Map<Integer, String> students = new HashMap<>();

       students.put(1, "Celia");
       students.put(2, "JD");
       students.put(3, "Jenny");

       System.out.println(students);

       */

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(4);
        numbers.add(14);

        Collections.sort(numbers);
        System.out.println(numbers);
    }
}