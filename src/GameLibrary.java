
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class GameLibrary {
    protected ArrayList<Game> myGameLibrary;
    
    
    public void payGame(CustomerAccount ac){
        if(ac.getCart().getTotalprice() < ac.getMyMoney()){
           ac.myGameLibrary = ac.getCart().itemInCart;
            System.out.println(ac.myGameLibrary);
        }

}

    public ArrayList<Game> getMyGameLibrary() {
        return myGameLibrary;
    }
}