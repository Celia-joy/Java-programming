import java.io.FileWriter;
import java.io.IOException;

public class Main3 {
    public static void main (String [] args){
        try{
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Celia");
            writer.write("Joy");
            writer.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}