package generics;

import java.util.List;
import java.util.ArrayList;

public class GenericMethods {
    public static <T> void printValue(T value){
        System.out.println("Value: " +value);
    }
    public static <T> T getValue(T value){
        return value;
    }
    public static <K, V> void printPair(K key, V value){
        System.out.println("Key: " + key + ", Value: "+  value);
    }

    public static <T extends Number> double doubleValue(T value){
        return value.doubleValue() * 2;
    }
    public static void printBox(Box<?> box){
        System.out.println("Box contains: " + box.getValue());
    }
    public static double sumNumbers(List<? extends Number> numbers){
        double total = 0;
        for (Number number : numbers){
            total += number.doubleValue();
        }
        return total;
    }
    public static void addNumbers(List<? super Integer> numbers) {
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
    }

    public static void main(String[] args){
        /*
        printValue("Celia Joy");
        printValue(16);
        printValue(15.99);
        printValue(true);
        */

       String name = getValue(" Celia Joy");
       Integer age = getValue(16);
       Double price = getValue(15.99);

       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
       System.out.println("Price: " + price); 

       printPair(1, "Celia");
       printPair("Age", 16);
       printPair("Price", 15.99);

       System.out.println(doubleValue(10));
       System.out.println(doubleValue(15.5));
       System.out.println(doubleValue(7.2f));

       Box<String> nameBox = new Box<>("Celia Joy");
       Box<Integer> ageBox = new Box<>(16);
       Box<Double> priceBox = new Box<>(15.99);

       printBox(nameBox);
       printBox(ageBox);
       printBox(priceBox);

       List<Integer> ages = new ArrayList<>();
       ages.add(16);
       ages.add(17);
       ages.add(18);
       System.out.println("Total: " + sumNumbers(ages));

       List<Integer> numbers = new ArrayList<>();
       addNumbers(numbers);
       System.out.println(numbers);
    }
}