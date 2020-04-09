/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
//aasdasdasdasdadasdasd
/**
 *
 * @author ADMIN
 */
public class Cart {
   
    private GameStore itemInCart[];
    protected int count=0;
    
    
    public void addGame(GameStore game){
    this.itemInCart[count++] = game;
    
    };
    
    
}
