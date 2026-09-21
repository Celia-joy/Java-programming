
public class Main{
    public static void main(String[] args){
        Student student1 = new Student("Celia", "Joy",16);
        Student student2 = new Student("Jenny", "Miriotta");
        Student student3 = new Student("Celia", "Joy",16,"joyihirwecelia@gmail.com", "Kigali, Rwanda");

        /*student1.setFirstName("Celia");
        student1.setLastName("Joy");
        student1.setAge(16);*/
        student1.introduceStudent();
        student1.displayInfo();
        student1.displayInfo("Welcome to the student information system!");
        student3.test();
        
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

        Person person1 = new Teacher("Hilaire", "HATANGIMBABAZI", 35);
        person1.introduce();
        Person person2 = new Student("Anne", "Line", 16);
        person2.introduce();

        Person[] people = {
            new Teacher("Awet", "Fesseha", 40),
            new Student("Belise", "MBARUSHIMANA", 17),
            new Teacher("Jean Bosco", "UWITONZE", 50),
            new Student("Pamela", "IMENA", 17)
        };
        for (Person person : people){
            person.introduce();
        }

        Person person3 = new Teacher("Aphrodice", "RWAGAJU", 45);
        /*Teacher teacher3 = (Teacher) person3;
        teacher3.teachClass();*/

        Person person4 = new Student("Henriette", "UMUHOZA", 17);
        /*Student student4 = (Student) person4;
        student4.Study();*/

        if(person3 instanceof Teacher){
            Teacher teacher3 = (Teacher) person3;
            teacher3.teachClass();
        }
        if(person4 instanceof Student){
            Student student4 = (Student) person4;
            student4.Study();
        }
    }
    
}