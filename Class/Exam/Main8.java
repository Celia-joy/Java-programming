import java.io.*;

public class Main8 {
    public static void main(String[] args) {

        try (DataInputStream in = new DataInputStream(
                new FileInputStream("data.bin"))) {

            int number = in.readInt();
            double decimal = in.readDouble();
            float value = in.readFloat();
            boolean status = in.readBoolean();

            System.out.println("Integer: " + number);
            System.out.println("Double: " + decimal);
            System.out.println("Float: " + value);
            System.out.println("Boolean: " + status);

        } catch (IOException e) {
            System.out.println("Reading error: " + e.getMessage());
        }
    }
}