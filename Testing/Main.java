class Student {
    private String firstName;
    private String lastName;
    private String email;

    Student(String firstName){
        this.firstName = firstName;
    }
    Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;      
    }
    Student(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
}

public class Main {
    public static void main(String[] args){
        Student student1 = new Student("Celia");
        Student student2 = new Student("Celia", "Joy");
        Student student3 = new Student("Celia", "Joy", "celia.joy@gmail.com");
        
        System.out.println(student1.getFirstName());
        System.out.println(student2.getLastName());
        System.out.println(student3.getEmail());
        System.out.println(student2.getFullName());

    }
}