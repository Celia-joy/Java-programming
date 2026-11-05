import java.io.IOException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;

public class Main7 {
    public static void main (String [] args){
        try {
            DataOutputStream out =  new DataOutputStream(new FileOutputStream("data.txt"));

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