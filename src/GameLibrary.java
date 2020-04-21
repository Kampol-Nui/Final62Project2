
import java.util.ArrayList;
import java.util.Objects;

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
        try{
            Objects.requireNonNull(ac, "CustomerAccount cannot be null");
        if(ac.getCart().getTotalprice() < ac.getMyMoney()){
           ac.myGameLibrary = ac.getCart().itemInCart;
            System.out.println(ac.myGameLibrary);
        }
        }catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }
}

    public ArrayList<Game> getMyGameLibrary(CustomerAccount ac) {
        try{
            Objects.requireNonNull(ac, "CustomerAccount cannot be null");
        
        return ac.myGameLibrary;
        }catch(NullPointerException ex){
            System.out.println(ex.getMessage());
             return null;
        }
               
    }
}