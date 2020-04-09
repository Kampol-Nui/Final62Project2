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
            if(game.equals(itemInCart[i])){
            itemInCart[i] = null;
            this.count--;
            }
        }     
    }
    
    public void calculateTotalPrice(){
       this.totalprice = game.getPrice();
        for (int i = 0; i < this.count; i++) {
            this.totalprice = this.itemInCart[i].getPrice();
            
        }
    }
    
    public void checkoutGame(){
        payGame();
    }

    public double getTotalprice() {
        return totalprice;
    }
    
}
