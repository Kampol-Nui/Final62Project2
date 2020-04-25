
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
public class Cart implements CustomerService {
//    private GameStore itemInStore; 
    // private int count;

    private String id;
    private double totalprice;

    //  private Game itemInCart[];
    protected ArrayList<Game> itemInCart;

//    private double changemoney;
    public Cart(String id) {
        this.id = id;
        itemInCart = new ArrayList<>();
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
    public void calculateTotalPrice() {
        for (int i = 0; i < this.itemInCart.size(); i++) {
            this.totalprice += this.itemInCart.get(i).getPrice();

        }

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
//        try{
        System.out.println("************************ Game in " + id + " *************************");
        if (itemInCart.isEmpty()) {
            System.out.println("nothing");
            return false;
        }
        for (Game game : this.itemInCart) {

            System.out.print(game + "\t");
            System.out.println("Index is " + this.itemInCart.indexOf(game));
            //System.out.println(this.itemInCart);
            //return true;
        }
//        }catch(NullPointerException ex){
//            System.out.println("This cart have nothing");
//        }
        return true;
        
    }

//          public void clearCart(){
//        this.itemInCart.clear();
//    }
    @Override
    public String toString() {
        return " " + id;
    }

    @Override
    public boolean addGameToCart(GameStore gameStore, CustomerAccount ca, String title) {
        try {
            for (int i = 0; i < gameStore.games.size(); i++) {
                if (gameStore.games.get(i).getTitle().equals(title)) {
                    this.itemInCart.add(gameStore.games.get(i));
                    System.out.println("Successfully Added");
                    return true;
                }
                for (int j = 0; j < itemInCart.size(); j++) {
                    if (itemInCart.get(j).getTitle().equals(title)) {
                        System.out.println("You already have this game in cart");
                        return false;
                    }
                }

            }
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException Caught");
            return false;

        }

        System.out.println("not found the game to add");
        return false;
    }

    @Override
    public boolean removeGameFromCart(CustomerAccount ca, String title) {
        try {
            for (int i = 0; i < this.itemInCart.size(); i++) {
                if (this.itemInCart.get(i).getTitle().equals(title)) {
                    // this.itemInCart.remove(GameStore.games.get(i));
                    this.itemInCart.remove(this.itemInCart.get(i));
                    System.out.println("Successfully Removed");
                    return true;
                }

            }
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        System.out.println("not found the game to remove");
        return false;

    }
}
