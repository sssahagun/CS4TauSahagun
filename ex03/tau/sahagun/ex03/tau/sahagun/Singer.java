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
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public Singer(String name, Song s){
        this.name = name;
        this.noOfPerformances = 3;
        this.earnings = 100000;
        favoriteSong = s;
    }
    
    public void performForAudience(int noOfPeople){
        noOfPerformances = noOfPerformances + 1;
        earnings = earnings + 100*noOfPeople;
    }
    
    public void changeFavSong (Song favoriteSong){
        this.favoriteSong = favoriteSong;
}
}
