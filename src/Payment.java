/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MINI
 */
public class Payment{
    //private CustomerAccount customermoney;
    private GameStore itemInCart[];
    
    public void payGame(Cart cart,GameLibrary library){
        if(cart.getCustomerAccount().getMyMoney() == cart.getTotalprice()){
            //call methods to keep game in the library
            library.addToLibrary(cart);
            cart.getCustomerAccount().myMoney = 0;
        }else if(cart.getCustomerAccount().getMyMoney() > cart.getTotalprice()){
            library.addToLibrary(cart);
//            cart.calculateChangeMoney(customermoney);
//            super.myMoney = cart.getChangeMoney();
            cart.getCustomerAccount().myMoney = cart.getCustomerAccount().myMoney - cart.getTotalprice();
            //customeraccount.getMyMoney() = customeraccount.getMyMoney()+ cart.getChangeMoney()  ;
            //customeraccount.calculateMyTotalMoney(cart.calculateChangeMoney(customermoney));
        }
    }
}
