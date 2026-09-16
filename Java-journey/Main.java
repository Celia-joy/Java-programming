
public class Main{
    public static void main(String[] args){
        Student student1 = new Student();
        student1.setFirstName("Celia");
        student1.setLastName("Joy");
        student1.setAge(16);
        
        System.out.println(student1.getFirstName());
        System.out.println(student1.getLastName());
        System.out.println(student1.getAge());
    }
    
}