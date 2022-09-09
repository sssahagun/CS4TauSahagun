/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01.tau.sahagun;

/**
 *
 * @author TAU
 */
public class Ex01TauSahagun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String title1 = "Black Mirror";
        String title2 = "Criminal Minds";
        String title3 = "Brooklyn 99";
        
        int seasons1 = 5;
        int seasons2 = 15;
        int seasons3 = 8;
        
        String company1 = "Netflix";
        String company2 = "CBS";
        String company3 = "Fox";
        
        System.out.println("Show 1");
        System.out.println("Title: " + title1);
        System.out.println("Number of seasons: " + seasons1);
        System.out.println("First aired by: " + company1);
        
        System.out.println("Show 2");
        System.out.println("Title: " + title2);
        System.out.println("Number of seasons: " + seasons2);
        System.out.println("First aired by: " + company2);
        
        System.out.println("Show 3");
        System.out.println("Title: " + title3);
        System.out.println("Number of seasons: " + seasons3);
        System.out.println("First aired by: " + company3);
        
        int totalseasons = seasons1 + seasons2 + seasons3;
        boolean isLonger = true; 
        boolean isSameCompany = false;
        
        System.out.println("Total number of seasons: " + totalseasons);
        System.out.println("Criminal Minds has the most seasons: " + isLonger);
        System.out.println("The shows were first aired by the same company: " + isSameCompany);
    }
    
}
