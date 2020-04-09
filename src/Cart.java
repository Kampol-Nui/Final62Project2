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
    
    public double calculatetotalprice(Cart cart) {
        for (int i = 0; i < count; i++) {           
            this.totalprice = this.totalprice+this.itemInCart[i].getPrice();
         }
        return this.totalprice;
        }

    
    
    public void checkoutGame(double customermoney,Cart cart,GameLibrary library) {
        super.payGame(customermoney,cart);
       
    }
    
    public double getTotalprice() {
        return this.totalprice;
    }

    public GameStore[] getItemInCart() {
        return itemInCart;
    }

   

    
    
}
