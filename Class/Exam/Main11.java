import java.io.*;

public class Main11 {
    public static void main (String [] args) {
        try {
            FileInputStream in = new FileInputStream("source.txt");
            FileOutputStream out = new FileOutputStream("destination.txt");

            int data;
            
            while ((data = in.read()) != -1){
                out.write(data);
            }
            System.out.println("File copied successfully!");

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}