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
    //private Cart myCart;
    protected double myMoney;
    
    public CustomerAccount(){}
    
    
    public CustomerAccount(double myMoney) {
        //myCart = cart;
        this.myMoney = myMoney;
    }
    public void customerAddGameToCart(GameStore game){
        myCart.addGameTOCart(game, 1);
    }
    
    public void customerCheckOut(double customermoney,Cart cart,GameLibrary library){
        myCart.checkoutGame(customermoney,cart,library);
    }

    public double getMyMoney() {
        return myMoney;
    }
    
//    public double calculateMyTotalMoney(){
//        
//    }
}
