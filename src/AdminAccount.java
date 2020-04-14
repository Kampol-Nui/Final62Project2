
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
    
    private Game[] game;
    private int count;
    
    public AdminAccount(String username, String password, AccountStatus status, Person person) {
        super(username, password, status, person);
        this.game = new Game[3];
        
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
    
   
    public void addGame(GameStore store,Game game) {
        
         Objects.requireNonNull(game, "Game Can't be Null");
//         for (int i = 0; i < count; i++) {
//            if(game.equals(this.game[i])){
//                System.out.println("The Game is already in the store");
//                
//         }else{
//             this.game[count++] = game;
//            }
//        }
//        
//          return this.game[count];

         //this.game[count++] = game;
         
         store.addGame(game);
        // return game ;
    }

    
     public Game removeGame(Game game){
//        Objects.requireNonNull(game,"Game Can't be Null");
//        int i;
//        for ( i = 0; i < count; i++) {
//            if(game.equals(this.game[i])){
//                this.game[i] = null;
//                count --;
//                this.game[i] = this.game[count];
//                this.game[count] = null;
//            }else{
//                System.out.println("The Game isn't in the store");
//            }
//        }
        return game;
     }
    
    
//    public void removeGame(Game game) {
//        admin.removeGameFromStore(game);
//    }
//    
//    public void listGameFromStore(){
//    admin.listGameFromStore();
//    }
}
