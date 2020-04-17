
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

    private Game itemInStore[];
   // private Game game;
    private int count;
    private GameStatus gamestatus;
    
    
    public GameStore(int size) {
       
        this.itemInStore = new Game[size];
    }


    public  boolean addGame(AdminAccount admin,Game game){
        Objects.requireNonNull(admin, "Game Can't be Null");
        //if(ac instanceof AdminAccount){
        for (int i = 0; i < this.count; i++) {
           if(this.itemInStore[i].equals(game)){
               System.out.println("Game is already in the store");
               return false;
          }
            
        }
        this.itemInStore[count++] = game;//admin.addGame(game);
               return true;
        //return false;
        
        //return false;
    }

 

    protected boolean removeGame(AdminAccount admin,Game game) {
        Objects.requireNonNull(game, "Game Can't be Null");
        for (int i = 0; i < count; i++) {
            if(game.equals(this.itemInStore[i])){
             this.count--;
             this.itemInStore[i] = this.itemInStore[count];
             this.itemInStore[count] = null;
             return true;
            }
        }
        
        System.out.println("This game isn't in the Store");
        return false;
    }

    public void listGameFromStore() {
        for (Game game : itemInStore) {
            System.out.println(game);
        }
    }

    public Game getGame(int i) {
        return this.itemInStore[i];
    }


}
