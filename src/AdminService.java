/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MINI
 */
public interface AdminService {
    public abstract boolean addGame(AdminAccount admin, Game game);
    public abstract boolean removeGame(AdminAccount admin, Game game);
    public abstract boolean changeStatus(AdminAccount admin, String title, GameStatus status);
}
