class Teacher extends Person{
    public Teacher(String firstName, String lastName, int age){
        super(firstName, lastName,age);
        System.out.println("Teacher constructor called");
    }
    @Override
    public void introduce(){
        System.out.println("I am a teacher");
    }
    public void teachClass(){
        System.out.println("Teaching Java!");
    }
    public Teacher(int id, String firstName, String lastName, int age){
        super(id, firstName, lastName,age);
        System.out.println("Teacher constructor called");
    }

}