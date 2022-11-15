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
public class WaterType extends SimpleMonster {
    /* 
     * a Monster that has a type "water", strong against "fire", weak against
     * "grass", and whose atk is 0.7 times the base value and def is 1.3 times 
     * the base value. The special of WaterTypes increase their def by 2 points
     * at the cost of reducing their HP by 10% of their maxHP.
    */
    
    public WaterType (String n, double m,  double base){
        atk = base*0.7;
        def = base*1.3;
    }

   
    
}
