class Person{
    private String firstName;
    private String lastName;
    private int age;
    protected String address;
    public String email;
    private final int id;

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
        if(age >= 0 && age <= 100){
            this.age = age;
        }
    }
    public Person(String firstName, String lastName, int age){
        this.id = 0;
        this.firstName = firstName;
        this.lastName = lastName;
        if(age >= 0 && age <= 100){
            this.age = age;
        }
        System.out.println("Person constructor called");
    }

    public Person(int id, String firstName, String lastName, int age){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        if(age >= 0 && age <= 100){
            this.age = age;
        }
        System.out.println("Person constructor called");
    }
    public void introduce(){
        System.out.println("I am a person");
    }
}
