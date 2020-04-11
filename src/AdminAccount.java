/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MINI
 */
import java.util.Objects;

public class AdminAccount extends Account{

    private Game itemInStore[];
    private int count;

    public boolean addGameToStore(Game game) {
        Objects.requireNonNull(game, "Game Can't be Null");
        for (int i = 0; i < this.count; i++) {

            if (game.equals(itemInStore[i])) {
                return false;
            }
        }
        this.itemInStore[count++] = game;
        return true;
    }

    public boolean removeGameFromStore(Game game) {
        Objects.requireNonNull(game, "Game Can't be Null");
        for (int i = 0; i < this.count; i++) {
            if (game.equals(itemInStore[i])) {
                itemInStore[i] = null;
                this.count--;
                itemInStore[i] = itemInStore[count];         
                return true;
            }
        }
        System.out.println("This game isn't in the Store");
        return false;
    }
}
