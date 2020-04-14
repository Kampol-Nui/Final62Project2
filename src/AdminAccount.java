
import java.util.Objects;

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
    
    private GameStore admin;
    private Game[] itemInStore;
    private int count;
    public AdminAccount(String username, String password, AccountStatus status, Person person) {
        super(username, password, status, person);
    }
    
//    public void setStoreSize(int size){
//     admin = new GameStore(size) {};
//    }
    public boolean addGame(Game game){
        Objects.requireNonNull(game, "Game Can't be Null");
        this.itemInStore = new Game[10];
        for (int i = 0; i <= this.count; i++) {
            if (game.equals(this.itemInStore[i])) {
               return false;
            }
        }
        this.itemInStore[count++] = game;
         return true;
        //admin.addGameToStore(game);
       // admin.listGameFromStore();
    }

    public void removeGame(Game game) {
        admin.removeGameFromStore(game);
    }
    
//    public void listGameFromStore(){
//    admin.listGameFromStore();
//    }
}
