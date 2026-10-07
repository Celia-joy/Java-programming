import architecture.model.Student;
import architecture.repository.StudentRepository;
import architecture.service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        Student student = new Student(1, "Celia", 16);

        service.registerStudent(student);
        Student found = service.findStudent(1);

        System.out.println(found);
    }
}