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
public class Ex03TauSahagun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Friend gwen = new Friend("Gwen");
        Friend anika = new Friend("Anika"); 
        Friend sheena = new Friend("Sheena");
        
        Singer mayahawke = new Singer("Maya Hawke");
        mayahawke.favoriteSong("The Second Time I Met You");
        mayahawke.performForAudience(12);
    }
    
}
