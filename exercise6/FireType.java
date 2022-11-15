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
public class FireType extends SimpleMonster {
    /*
     * a Monster that has a type "fire", strong against "grass", weak against
     * "water", and whose atk is 1.3 times the base value and def is 0.7 times
     * the base value. The special of FireTypes increase their atk by 2 points
     * at the cost of reducing their HP by 10% of their maxHP.
    */
    public FireType (String n, double m,  double base){
        super(n, "fire", "grass", "water", m, base);
        atk = base*1.3;
        def = base*0.7;
    }
    
    @Override
    public void special() {
        SimpleMonster.getAtk() += 2;
    }
}
