/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MINI
 */
public class CustomerAccount extends Account{
    private Cart myCart;
    public CustomerAccount(Cart cart) {
        myCart = cart;
    }
    public void customerAddGameToCart(GameStore game){
        myCart.addGameTOCart(game, 1);
    }
    
}
