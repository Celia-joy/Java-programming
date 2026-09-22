class Student extends Person{
    public void introduceStudent(){
        System.out.println("Hello, my name is " + getFirstName() + " " + getLastName());
    }
    public int yearsUntil18(int age){
        return 18-age;
    }
    public void displayInfo(){
        System.out.println(" Here's the Student Information:");
    }
    public void displayInfo(String message){
        System.out.println(message);
        System.out.println("Student name is: " + getFirstName() + " " + getLastName());
        System.out.println("Student age is: " + getAge());
    }

    public Student(String firstName, String lastName, int age){
        super(firstName, lastName, age);
        /*this.firstName = firstName;
        this.lastName = lastName;
        if(age >= 0 && age <=100){
            this.age = age;
        }*/
        System.out.println("Student object is created");
    }

    public Student(int id, String firstName, String lastName, int age){
        super(id, firstName, lastName, age);
        System.out.println("Student object is created");
    }

    public Student(String firstName, String lastName, int age, String email, String address){
        super(firstName,lastName,age);
        this.email = email;
        this.address = address;
    }
    public Student(String firstName, String lastName){
        /*this.firstName = firstName;
        this.lastName = lastName;*/
        this(firstName, lastName, 0);
    }
    @Override
    public void introduce(){
        System.out.println("I'm a student");
    }
    public void Study(){
        System.out.println("Studying java");
    }
    public void test(){
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }
}
