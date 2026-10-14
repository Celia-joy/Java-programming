package com.lala;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String firstName;
    private String lastName;
    private double grade;

    public Student(int id, String firstName, String lastName, double grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
    public int getId(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public double getGrade(){
        return grade;
    }

    @Override
    public int compareTo(Student other){
        return Integer.compare(this.id, other.id);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Student other)){
            return false;
        }

        return id == other.id &&Objects.equals(lastName, other.lastName);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, lastName);
    }

    @Override
    public String toString(){
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                '}';
    }

}
