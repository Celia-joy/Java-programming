package architecture.service;

import architecture.model.Student;
import architecture.repository.StudentRepository;
import architecture.exception.InvalidStudentException;
import architecture.util.StudentValidator;

public class StudentService {

    private StudentRepository repository;

    public  StudentService(StudentRepository repository) {
        this.repository = repository;
    }
    public void registerStudent(Student student){
        if(!StudentValidator.isValid(student)){
            throw new InvalidStudentException(
                "Invalid student information."
            );
        }
        if(student.getAge() < 10){
            throw new InvalidStudentException(
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