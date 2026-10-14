
/*
class Main {
    public static void main (String[]args){
        K k = (x,y) -> x + y;
        int sum = k.display(7,9);
        System.out.println("Sum: " + sum);
    }
}
*/

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