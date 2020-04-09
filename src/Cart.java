/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MINI
 */
public class Cart extends Payment{

    private GameStore itemInCart[];
    private int count;
    private Game game;
    private double totalprice;
//    private double changemoney;
    
    public Cart(int size) {
        itemInCart = new GameStore[size];
    }
    
    public boolean addGameTOCart(GameStore game) {
        itemInCart[count++] = game;
        return true;
    }
    
    public void removeGameFromCart(GameStore game) {
        for (int i = 0; i < this.count; i++) {

            if(game.equals(itemInCart[i])){
            itemInCart[i] = null;
            this.count--;
            }
        }     
    }
    
    public void calculatetotalprice(Cart cart) {
        for (int i = 0; i < count; i++) {           
            this.totalprice = this.totalprice+this.itemInCart[i].getPrice();
         }       
        }

    
    
    public void checkoutGame(Cart cart,GameLibrary library) {
        super.payGame(cart,library);
        
    }
    
    public double getTotalprice() {
        return this.totalprice;
    }
    
//    public void calculateChangeMoney(double customermoney){
//        this.changemoney = customermoney - this.totalprice;
//    }
    
//    public double getChangeMoney(){
//        return this.changemoney;
//    }

    public GameStore[] getItemInCart() {
        return itemInCart;
    }

   

    
    
}
