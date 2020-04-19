
import java.util.ArrayList;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MINI
 */
public class GameStore {

    //private Game itemInStore[];
    protected  ArrayList<Game> games;
    // private Game game;

//    private int count;
    private GameStatus gamestatus;

    public GameStore() {
        games = new ArrayList<Game>();
        
    }

//    protected static boolean addGame(AdminAccount admin, Game game) {
//        games.add(game);
//        return true;
//    }
//
//    protected static boolean removeGame(AdminAccount admin, Game game) {
//        games.remove(game);
//        return true;
//    }
//    public  boolean addGame(AdminAccount admin,Game game){
//        Objects.requireNonNull(admin, "Game Can't be Null");
//        //if(ac instanceof AdminAccount){
//        for (int i = 0; i < this.count; i++) {
//           if(this.itemInStore[i].equals(game)){
//               System.out.println("Game is already in the store");
//               return false;
//          }
//            
//        }
//        this.itemInStore[count++] = game;//admin.addGame(game);
//               return true;
//        //return false;
//        
//        //return false;
//    }

//    protected boolean removeGame(AdminAccount admin,Game game) {
//        Objects.requireNonNull(game, "Game Can't be Null");
//        for (int i = 0; i < count; i++) {
//            if(game.equals(this.itemInStore[i])){
//             this.count--;
//             this.itemInStore[i] = this.itemInStore[count];
//             this.itemInStore[count] = null;
//             return true;
//            }
//        }
//        
//        System.out.println("This game isn't in the Store");
//        return false;
//    }
    public boolean listGameFromStore() {
        System.out.println("Your Store Has ");
        if(this.games.size()==0){
            System.out.println("nothing");
            return false;
        }
        for (Game game : games) {
            System.out.print(game + "\t");
            System.out.println("Index is " + games.indexOf(game));

        }
        return true;
    }

//    public Game getGame(int i) {
//        return this.itemInStore[i];
//        
//    }
    public Game getGame(int i) {
        return games.get(i);

    }

//    @Override
//    public String toString() {
//        return "GameStore{" + "itemInStore=" +listGameFromStore() + '}';
//    }
//    public Game[] getItemInStore() {
//        return itemInStore;
//    }
//    public int getCount() {
//        return count;
//    }

    public ArrayList<Game> getGames() {
        return games;
    }
    
      public void addGame(AdminAccount admin,Game game) {       
         Objects.requireNonNull(game, "Game Can't be Null");
         //store.addGame(admin,game);
         
         //GameStore.addGame(admin, game);
         //this.store.addGame(admin, game);
        game.setStatus(GameStatus.ONSALED);
        this.games.add(game);
        
    }

    public boolean changeStatus(AdminAccount admin,String title,GameStatus status){
        for (int i = 0; i < this.games.size(); i++) {
            if(this.games.get(i).getTitle().equals(title)){
                this.games.get(i).setStatus(status);
                return true;
            }
            
        }
         System.out.println("not found the game to add");
        return false;
    }
    public void removeGame(AdminAccount admin,Game game){
            Objects.requireNonNull(game,"Game Can't be Null");
       //GameStore.removeGame(admin, game);
//         cart.clearCart();
            //this.store.removeGame(admin, game);
            //this.cart.clearCart();
            this.games.remove(game);
     }
}
