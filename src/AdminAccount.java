
import java.util.ArrayList;
import java.util.Objects;
//testnewrepo
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//asdasdasdasdasdasdasdd
/**
 *
 * @author MINI
 */
public class AdminAccount extends Account{
    
    //private Game game;
   // private int count;
    //GameStore store;
    Cart cart;
    
    public AdminAccount(String username, String password, AccountStatus status, Person person,Cart cart) {
        super(username, password, status, person);
        this.cart = cart;
        //ArrayList<AdminAccount> ad = new ArrayList<AdminAccount>();
        //game = new Game[10];
        
    }
    
//    public void setStoreSize(int size){
//     admin = new GameStore(size) {};
//    }
//    public boolean addGame(Game game){
//        Objects.requireNonNull(game, "Game Can't be Null");
//        this.itemInStore = new Game[10];
//        for (int i = 0; i <= this.count; i++) {
//            if (game.equals(this.itemInStore[i])) {
//               return false;
//            }
//        }
//        this.itemInStore[count++] = game;
//         return true;
//        //admin.addGameToStore(game);
//       // admin.listGameFromStore();
//    }
    
   
    public void addGame(AdminAccount admin,Game game) {       
         Objects.requireNonNull(game, "Game Can't be Null");
         //store.addGame(admin,game);
         
         GameStore.addGame(admin, game);
         //this.store.addGame(admin, game);
    }

    
    public void removeGame(AdminAccount admin,Game game){
       GameStore.removeGame(admin, game);
//         cart.clearCart();
            //this.store.removeGame(admin, game);
            this.cart.clearCart();
     }
    
    
//    public void removeGame(Game game) {
//        admin.removeGameFromStore(game);
//    }
//    
//    public void listGameFromStore(){
//    admin.listGameFromStore();
//    }
}
