import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main5 {
    public static void main (String[] args){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("name.txt"));
            String line;

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }

        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}