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
    protected double myMoney;

    public CustomerAccount(Cart myCart, double myMoney, String username, String password, AccountStatus status, Person person) {
        super(username, password, status, person);
        this.myCart = myCart;
        this.myMoney = myMoney;
    }

    
    public void customerAddGameToCart(Cart cart,GameStore game){
        cart.addGameTOCart(game);
    }
    
    public void customerRemoveGameFromCart(Cart cart,GameStore game){
        cart.removeGameFromCart(game);
    }
    
    public void customerCheckOut(Cart cart,GameLibrary library){
        cart.checkoutGame(cart,library);
    }

    public double getMyMoney() {
        return this.myMoney;
    }
    
    public void TopupMoney(double topupmoney){
         this.myMoney = this.myMoney + topupmoney;
    }
    
//    public double calculateMyTotalMoney(){
//        
//    }
}
