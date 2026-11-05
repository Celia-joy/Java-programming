import java.io.FileInputStream;
import java.io.IOException;


public class Main2 {
    public static void main (String[] args){
        try {
            FileInputStream in = new FileInputStream("data.txt");
            int data;

            while((data = in.read()) != -1){
                System.out.print((char) data);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}