/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ADMIN
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cart c1 = new Cart();
        CustomerAc a1 = new CustomerAc(c1);
        GameStore g1 = new GameStore();
        
       // a1.myCart.addGame(g1);
        a1.customerAddGameToCart(g1);
    }
    
}
