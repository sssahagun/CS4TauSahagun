/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03.tau.sahagun;

/**
 *
 * @author TAU
 */
public class Friend {
    String name, favShow, favDrink, favSubject;
    int age;
    double gradeFavSubj;
    
    public Friend(String name){
        this.name = name;
        this.favShow = "Criminal Minds";
        this.favDrink = "Milo";
        this.favSubject = "Social Science";
        this.age = 15;
        this.gradeFavSubj = 1.00;
    }
}
