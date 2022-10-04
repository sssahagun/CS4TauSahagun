/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.pkg13.pkg22.lecture;

/**
 *
 * @author TAU
 */
public class Student { // constructors
    String name;
    int age, friendship;
    double grade, money;
    Student bff;
    
    public Student(String name){
        // System.out.println("A new student has enrolled.");
        this.name = name;
        this.age = 16;
        this.friendship = 0;
        this.grade = 1.75;
        this.money = 1500;
    }
    
    public Student (String name, int age){
        this.name = name;
        this.age = age;
        this.friendship = 0;
        this.grade = 1.75;
        this.money = 1500;
    }
    
    public void introduce(){
        // method, function attached to an object
        // particular object performs an action
        System.out.printf("Hi, my name is %s.%n", name);
    }
    
    public void study(int hours){
        grade -= hours * 0.05;
    }
    
    public double getGrade(){
        return grade;
    }
    
    public void talk(Student other){
        friendship += 1;
        other.friendship += 1;
    }
}
