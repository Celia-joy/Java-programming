package architecture.repository;

import architecture.model.Student;
import java.util.ArrayList;
import java.util.List;

public class InMemoryStudentRepository implements StudentRepository {
    private List<Student> students = new ArrayList<>();

    @Override
    public void save(Student student){
        students.add(student);
    }

    @Override
    public Student findById(int id){
        for (Student student : students){
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findAll(){
        return students;
    }
}