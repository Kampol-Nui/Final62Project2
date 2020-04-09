/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MINI
 */
public class Payment extends CustomerAccount{
    //private CustomerAccount customermoney;
    private GameStore itemInCart[];
    
    public void payGame(Cart cart,GameLibrary library){
        if(super.myMoney == cart.getTotalprice()){
            //call methods to keep game in the library
            library.addToLibrary(cart);
            super.myMoney = 0;
        }else if(this.myMoney > cart.getTotalprice()){
            library.addToLibrary(cart);
//            cart.calculateChangeMoney(customermoney);
//            super.myMoney = cart.getChangeMoney();
            super.myMoney = super.myMoney - cart.getTotalprice();
            //customeraccount.getMyMoney() = customeraccount.getMyMoney()+ cart.getChangeMoney()  ;
            //customeraccount.calculateMyTotalMoney(cart.calculateChangeMoney(customermoney));
        }
    }
}
