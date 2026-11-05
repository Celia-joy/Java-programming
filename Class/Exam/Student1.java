import java.io.*;

public class Student1 implements Serializable {
    String name;
    int age;

    public Student1 (String name, int age){
        this.name = name;
        this.age = age;
    }
}