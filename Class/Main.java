import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Object> c = new ArrayList<>();

        c.add(5);
        c.add(2);

        for (Object obj : c) {
            int num = (int) obj;
            System.out.println("Value: " + num);
        }

        class Box<T> {

            T value;

            public Box(T value) {
                this.value = value;
            }
        }

        Box<String> stringValue = new Box<>("Marius");

        System.out.println(stringValue.value);

        String name = "Jane";
        int age = 16;

        displayValue(name);
        displayValue(age);
    }

    public static <T> void displayValue(T value) {
        System.out.println(value);
    }
}