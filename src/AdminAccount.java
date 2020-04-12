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
    
    private GameStore admin;
            
    public AdminAccount(String username, String password, AccountStatus status, Person person) {
        super(username, password, status, person);
    }
    
    public void addGame(Game game){
        admin = new GameStore() {};
        admin.addGameToStore(game);
        admin.listGameFromStore();
    }

    public void removeGame(Game game) {
        admin.removeGameFromStore(game);
    }

}
