/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MINI
 */

public class AdminAccount extends Account{
    
    private AdminAccount admin;
    private int count;

    public void addGameToStore(Game game) {
        admin.addGameToStore(game);
    }

    public void removeGameFromStore(Game game) {
        admin.removeGameFromStore(game);
    }
}
