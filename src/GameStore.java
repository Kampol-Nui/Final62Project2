
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
    private int count;
    private GameStatus gamestatus;

    public GameStore() {
       
        this.itemInStore = new Game[100];
    }


    protected boolean addGameToStore(Game game) {
        Objects.requireNonNull(game, "Game Can't be Null");
        for (int i = 0; i < this.count; i++) {
            if (game.equals(itemInStore[i])) {
                return false;
            }
        }
        this.itemInStore[count++] = game;
        return true;
    }

    protected boolean removeGameFromStore(Game game) {
        Objects.requireNonNull(game, "Game Can't be Null");
        for (int i = 0; i < this.count; i++) {
            if (game.equals(itemInStore[i])) {
                itemInStore[i] = null;
                this.count--;
                itemInStore[i] = itemInStore[count];
                itemInStore[count] = null;
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


}
