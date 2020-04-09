/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MINI
 */
public class Payment {
    private double customermoney;
    private GameStore itemInCart[];
    
    public void payGame(double customermoney,Cart cart){
        if(customermoney == cart.getTotalprice()){
            //call methods to keep game in the library 
        }
    }
}
