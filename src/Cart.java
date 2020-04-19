

import java.util.ArrayList;

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
//    private GameStore itemInStore; 
    // private int count;

    private double totalprice;
    private CustomerAccount customerAccount;
    private Payment paygame;
    //  private Game itemInCart[];
    private ArrayList<Game> itemInCart;

//    private double changemoney;

    public Cart() {
        itemInCart = new ArrayList<Game>();
    }
    protected boolean addGameTOCart(String title) {
        for (int i = 0; i < GameStore.games.size(); i++) {
            if (GameStore.games.get(i).getTitle().equals(title)) {
                this.itemInCart.add(GameStore.games.get(i));
            }
        }

        return false;
    }

//    protected void removeGameFromCart(GameStore game) {
//        for (int i = 0; i < this.count; i++) {
//
//            if(game.equals(itemInCart[i])){
//            itemInCart[i] = null;
//            this.count--;
//            itemInCart[i] = itemInCart[count];
//            itemInCart[count] = null;
//            }
//        }     
//    }
    protected boolean removeGameFromCart(String title) {
//        for (int i = 0; i < GameStore.games.size(); i++) {
//            
//            
//        }
        //allitemInStore.getGame(i).getTitle() == null ? title == null : allitemInStore.getGame(i).getTitle().equals(title)
        for (int i = 0; i < GameStore.games.size(); i++) {
            if (GameStore.games.get(i).getTitle().equals(title)) {
                this.itemInCart.remove(GameStore.games.get(i));
                return true;
            }

        }
        System.out.println("not found the game to remove");
        return false;
    }

//    public void calculatetotalprice(Cart cart) {
//        for (int i = 0; i < count; i++) {           
//            this.totalprice = this.totalprice+this.itemInCart[i].getGame(i).getPrice();
//         }       
//    }
//    public void checkoutGame(Cart cart,GameLibrary library) {
//        paygame.payGame(cart,library);
//        
//    }
    public double getTotalprice() {
        return this.totalprice;
    }

//    public void calculateChangeMoney(double customermoney){
//        this.changemoney = customermoney - this.totalprice;
//    }
//    public double getChangeMoney(){
//        return this.changemoney;
//    }
//    public void getItemInCart() {
//        for (int i = 0; i < count; i++) {
//            //System.out.println(this.itemInCart[i]);
//            this.itemInCart[i].listGameFromStore();
//        }
//        
//    }
    public CustomerAccount getCustomerAccount() {
        return customerAccount;
    }

//    @Override
//    public String toString() {
//        return "Cart{" + "itemInCart=" + itemInCart + '}';
//    }
//    public boolean listGameFromCart() {
//        for (Game game : itemInCart) {
//            System.out.println(game);
//        }
//        return false;
//    }
      public boolean listGameFromCart() {
        System.out.println("Your Cart Has ");
        if(itemInCart.isEmpty()){
               System.out.println("nothing");
               return false;
        }
        for (Game game : this.itemInCart) {

            System.out.print(game + "\t");
            System.out.println("Index is " + this.itemInCart.indexOf(game));
            //System.out.println(this.itemInCart);

        }
               
        
        return true;
    }
      
          public void clearCart(){
        this.itemInCart.clear();
    }

}
