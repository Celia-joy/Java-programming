
public class Main{
    public static void main(String[] args){
        Student student1 = new Student("Celia", "Joy",16);
        Student student2 = new Student("Jenny", "Miriotta");
        /*student1.setFirstName("Celia");
        student1.setLastName("Joy");
        student1.setAge(16);*/
        student1.introduceStudent();
        student1.displayInfo();
        student1.displayInfo("Welcome to the student information system!");
        
        System.out.println(student1.getFirstName());
        System.out.println(student1.getLastName());
        System.out.println(student1.getAge());

        int remaining = student1.yearsUntil18(student1.getAge());
        System.out.println("You have " + remaining + " years to be an adult 😭😭😭");
        //System.out.println(student1.yearsUntil18(student1.getAge()));

        student2.introduceStudent();
        student2.displayInfo();
        student2.displayInfo("Welcome to the student information system!");
        
        System.out.println(student2.getFirstName());
        System.out.println(student2.getLastName());


        Teacher teacher1 = new Teacher("Jean Damascene", "HABANABASHAKA", 45);
        /*Teacher teacher = new Teacher();
        teacher.setFirstName("Larissa");
        teacher.setLastName("MUSANINYANGE");
        teacher.setAge(30);*/

        // System.out.println(teacher.getFirstName());
        // System.out.println(teacher.getLastName());
        // System.out.println(teacher.getAge());

        System.out.println(teacher1.getFirstName());
        System.out.println(teacher1.getLastName());
        System.out.println(teacher1.getAge());
        teacher1.introduce();

        Person person = new Teacher("Hilaire", "HATANGIMBABAZI", 35);
        person.introduce();
        
    }
    
}