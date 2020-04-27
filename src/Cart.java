
import java.util.ArrayList;


public class Cart implements CustomerService {

    private String id;
    private double totalprice;
    protected ArrayList<Game> itemInCart;
    public Cart(String id) {
        this.id = id;
        itemInCart = new ArrayList<>();
    }

    public double getTotalprice() {
        return this.totalprice;
    }


    public void calculateTotalPrice() {
        for (int i = 0; i < this.itemInCart.size(); i++) {
            this.totalprice += this.itemInCart.get(i).getPrice();

        }

    }


    public boolean listGameFromCart() {
        System.out.println("************************ Game in " + id + " *************************");
        if (itemInCart.isEmpty()) {
            System.out.println("nothing");
            
            return false;
        }
        for (Game game : this.itemInCart) {

            System.out.print(game + "\t");
            System.out.println("Index is " + this.itemInCart.indexOf(game));
        }

        return true;
        
    }

    public void removeallItemFromCart(CustomerAccount ac){
        ac.getCart().itemInCart = null;
    }
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
