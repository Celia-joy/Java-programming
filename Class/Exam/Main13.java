import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override 
    public int compareTo(Student other){
        return Integer.compare(this.marks, other.marks);
    }

    public String toString(){
        return name + "-" + marks;
    }
}

class MarksDescending implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2){
        return Integer.compare(s2.marks, s1.marks);
    }

}

public class Main13 {
    public static void main (String [] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 78));
        
        Collections.sort(students);
        System.out.println("Ascending order marks: " + students);

        Collections.sort(students, new MarksDescending());
        System.out.println("Descending order marks: " + students);
    }
}