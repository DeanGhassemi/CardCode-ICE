/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dean, 991667422, 2022
 */
public class CardDealer 
{   
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        Card fourHearts = new Card("Hearts", 4);
        fourHearts.setSuit("diamonds");
        
    }
}
