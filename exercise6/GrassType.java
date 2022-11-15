/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise6;

/**
 *
 * @author TAU
 */
public class GrassType extends SimpleMonster {
    /* 
     * a Monster that has a type "grass", strong against "water", weak 
     * against "fire", and whose atk and def is equal to the base value. 
     * The rest() of GrassTypes heal by half the maxHP. The special of 
     * GrassTypes raise their health by 20% of the maxHP.
    */
    
    public GrassType (String n, double m,  double base){
        atk = base;
        def = base;
    }

    public void rest() {
        hp = maxHP*1.5;
    }
}
