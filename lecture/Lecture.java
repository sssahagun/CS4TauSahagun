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
public class Lecture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student mark = new Student("Mark"); // instance
        // mark.name = "Mark";
        // mark.age = 16;
        // mark.friendship = 0;
        // mark.grade = 1.75;
        // mark.money = 500;
        
        Student josh = new Student("Josh",16); // instance
        // josh.name = "Josh";
        // josh.age = 18;
        // josh.friendship = 0;
        // josh.grade = 1.5;
        // josh.money = 1500;
        
        mark.bff = josh;
        System.out.println(mark.bff.money);
        
        mark.introduce();
        josh.introduce();
        System.out.println(mark.getGrade());
        mark.study(3);
        System.out.println(mark.getGrade());
    }
    
}
