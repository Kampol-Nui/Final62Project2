/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MINI
 */
public interface CustomerService {
    public abstract boolean addGameToCart(GameStore gameStore, CustomerAccount ca, String title);
    public abstract boolean removeGameFromCart(CustomerAccount ca, String title);

}
