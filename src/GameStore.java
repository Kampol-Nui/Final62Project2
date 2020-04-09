/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MINI
 */
public class GameStore extends Game{
    private Game itemInStore[];
    private int gameCount;
    private GameStatus gamestatus;

    public Game[] getItemInStore() {
        return itemInStore;
    }
    
    public addGameToStore(Game game);
    
    public removeGameFromStore(Game game);

    public GameStatus getGamestatus() {
        return gamestatus;
    }
    
}
