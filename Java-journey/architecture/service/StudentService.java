package architecture.service;

import architecture.model.Student;
import architecture.repository.StudentRepository;

public class StudentService {
    private StudentRepository repository;

    public  StudentService(StudentRepository repository) {
        this.repository = repository;
    }
    public void registerStudent(Student student){
        if(student.getAge() < 10){
            throw new IllegalArgumentException(
                "Student must be at least 10 years old."
            );
        }

        repository.save(student);

        System.out.println(
            student.getName() + " registered successfully"
        );
    }
    public Student findStudent(int id){
        return repository.findById(id);
    }
}