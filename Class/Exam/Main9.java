import java.io.*;

public class Main9 {
    public static void main (String [] args){
        Student1 s1 = new Student1("Joy", 16);
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.bin"));
            out.writeObject(s1);
            System.out.println("Student object serialized successfully");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}