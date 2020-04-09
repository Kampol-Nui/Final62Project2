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
public class CustomerAc extends Cart{
    private Cart myCart;
    
   
    
    public CustomerAc(Cart cart){
        this.myCart = cart;
        
    };

  
    
    public void customerAddGameToCart(GameStore game){
    this.myCart.addGame(game);
    };
}
