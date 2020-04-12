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
    
    private AdminAccount admin;
    private int count;

    public void addGameToStore(Game game) {
        admin.addGameToStore(game);
    }

    public boolean removeGameFromStore(Game game) {
        admin.removeGameFromStore(game);
    }
}
