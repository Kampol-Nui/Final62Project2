/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class GameLibrary {
    private Cart myGameLibrary[];

    public Cart[] getMyGameLibrary() {
        return myGameLibrary;
    }
    
    public void setLibrary(Cart cart){
        this.myGameLibrary = cart;
    }
}
