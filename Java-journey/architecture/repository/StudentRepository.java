package architecture.repository;

import architecture.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> students = new ArrayList<>();
    public void save(Student student) {
        students.add(student);
    }
    public Student findById(int id){
        for(Student student : students){
            if (student.getId() == id){
                return student;
            }
        }
        return null;
    }
    public List<Student> findAll(){
        return students;
    }
}