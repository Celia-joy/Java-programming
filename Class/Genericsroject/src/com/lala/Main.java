
/*
class Main {
    public static void main (String[]args){
        K k = (x,y) -> x + y;
        int sum = k.display(7,9);
        System.out.println("Sum: " + sum);
    }
}
*/
/*
package com.lala;
import java.util.HashSet;
import java.util.Set;


class Main {
    public static void main(String[] args){

        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "Celia";

        Employee e2 = new Employee();
        e2.id = 1;
        e2.name = "Celia";

        System.out.println(e1.equals(e2));

        Set<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        System.out.println(set.size());
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

    }
}
*/

package com.lala;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Aline", "Mugisha", 78.5));
        students.add(new Student(101, "Celia", "Joy", 92.0));
        students.add(new Student(104, "Eric", "Niyonzima", 85.5));
        students.add(new Student(102, "David", "Uwimana", 88.0));

        System.out.println("Original list: ");
        students.forEach(System.out::println);

        students.sort(null);
        
        System.out.println("\nSorted by ID(ascending):");
        students.forEach(System.out::println);

        students.sort(new GradeComparator());

        System.out.println("\nSorted by Grade(descending):");
        students.forEach(System.out::println);
    }
}