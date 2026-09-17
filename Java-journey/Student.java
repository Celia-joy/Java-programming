class Student{
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        if(age>=0 && age<=100){
            this.age = age;
        }
    }
    public void introduceStudent(){
        System.out.println("Hello, my name is " + firstName + " " + lastName);
    }
    public int yearsUntil18(int age){
        return 18-age;
    }
    public void displayInfo(){
        System.out.println(" Here's the Student Information:");
    }
    public void displayInfo(String message){
        System.out.println(message);
        System.out.println("Student name is: " + firstName + " " + lastName);
        System.out.println("Student age is: " + age);
    }
    public Student(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        System.out.println("Student object is created");
    }
    public Student(String firstName, String lastName){
        /*this.firstName = firstName;
        this.lastName = lastName;*/
        this(firstName, lastName, 0);
    }
}
