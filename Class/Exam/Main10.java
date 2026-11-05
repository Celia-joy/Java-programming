import java.io.*;

public class Main10 {
    public static void main(String [] args) throws IOException, ClassNotFoundException{
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.bin"));

            Student1 s = (Student1) in.readObject();
            System.out.println("Name: " + " " + s.name);
            System.out.println("Age: " + " " + s.age);
        }

        catch(IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        
    }
}