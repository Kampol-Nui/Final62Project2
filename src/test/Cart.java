/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
//aasdasdasdasdadasdasd
/**
 *
 * @author ADMIN
 */
public class Cart {
    private GameStore itemInCart[];
    private int count;
    private int quality;
    private Game game;
    private double totalprice;
    

    public Cart(int size) {
        itemInCart = new GameStore[size];
    }
    
    public boolean addGameTOCart(GameStore game,int quality){
        if(quality == 0){
            return false;
        }
        itemInCart[count] = game;
            return true;
    }
    
    public void removeGameFromCart(GameStore game){
        
    }
    
    public void calculatetotalprice(Game game,int quality){
       this.totalprice = quality*game.getPrice();
    }
    
    public void checkoutGame(){
        payGame();
    }

    public double getTotalprice() {
        return totalprice;
    }
    
}
