/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MINI
 */
public class Cart {
    private GameStore itemInCart[];
    private int count;
    private int qunatiity;
    private Game game;
    private double totalprice;
    

    public Cart(int size) {
        itemInCart = new GameStore[size];
    }
    
    public boolean addGameTOCart(GameStore game){
        itemInCart[count++] = game;
            return true;
    }
    
    public void removeGameFromCart(GameStore game){
        for (int i = 0; i < this.count; i++) {
            if(game)
            itemInCart[i] = null;         
        }
        
    }
    
    public void calculatetotalprice(Game game){
       this.totalprice = game.getPrice();
    }
    
    public void checkoutGame(){
        payGame();
    }

    public double getTotalprice() {
        return totalprice;
    }
    
}
