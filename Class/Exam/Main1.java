import java.io.IOException;
import java.io.FileOutputStream;

public class Main1 {
    public static void main (String [] args){
        try {
            FileOutputStream out =  new FileOutputStream("data.txt");
            String message = "Hello, Java!";

            byte [] data = message.getBytes();
            out.write(data);
            out.writeInt(123);
            out.writeDouble(3.14);
            out.writeFloat(2.5f);
            out.writeBoolean(true);
            out.close();

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}