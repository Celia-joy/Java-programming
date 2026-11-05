import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Main6 {
    public static void main(String [] args){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("name.txt"));
            writer.write("John Doe");
            writer.write("Jenny Mirriota");
            writer.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}