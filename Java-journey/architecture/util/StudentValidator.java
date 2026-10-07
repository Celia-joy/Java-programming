package architecture.util;

import architecture.model.Student;

public class StudentValidator {
    public static boolean isValid(Student student){
        return student != null && student.getName() != null && !student.getName().isBlank() && student.getAge() >= 10;
    }
}