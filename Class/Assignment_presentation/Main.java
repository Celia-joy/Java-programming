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

        // displayValue(name);
        // displayValue(age);        
    }

    public static <T> T displayValue(T value) {
        return value;
    }
   /*static class Box<T> {
        private T value;

        public void setValue(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }*/
   class Display {
    public static void main (String a[]){
        List<String> names = new ArrayList<>();
        names.add("Marius");
        names.add("Aline");
    }
    List(Integer) num = new arrayList<> ();
   }
}