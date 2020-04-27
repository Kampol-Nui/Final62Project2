
import dataaccess.DBconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MINI
 */
public class CustomerAccount extends Account {

    private double uniqueId;
    private Cart cart;
    protected double myMoney;
    protected ArrayList<Game> myGameLibrary;

    public CustomerAccount(Cart myCart, String username, String password, AccountStatus status, Person person) {
        super(username, password, person);
        this.cart = myCart;
        this.uniqueId = GetNextID.getNext();
        this.myGameLibrary = new ArrayList<>();

    }


    public double getMyMoney() {
        return this.myMoney = dataaccess.DBconnection.SelectLastMoney(getUniqueId());
    }

    public Cart getCart() {
        return cart;
    }

    public void TopupMoney(double topupmoney) {

        if (topupmoney <= 0) {
            System.out.println("Please insert your money");

        } else {
            this.myMoney = topupmoney + dataaccess.DBconnection.SelectLastMoney(getUniqueId());
            String sql1 = "INSERT INTO CUSTOMERACCOUNT " + "(id,name,password,carttotalprice,mymoney,topupmoney)" + "VALUES(?,?,?,?,?,?)";

            try (Connection con = DBconnection.getConnecting();) {
                try (
                        PreparedStatement stm = con.prepareStatement(sql1); 
                        ) {
                    stm.setDouble(6, topupmoney);
                    stm.setDouble(1, this.getUniqueId());
                    stm.setString(2, this.getUsername());
                    stm.setDouble(5, this.myMoney);
                    stm.setString(3, this.getPassword());
                    stm.setDouble(4, this.cart.getTotalprice());
                    stm.executeUpdate();

                } catch (SQLException ex) {
                    ex.getMessage();
                }
            } catch (SQLException ex) {
                ex.getMessage();
            }
        }
    }

    public double getUniqueId() {
        return uniqueId;
    }
    
    public void listBuyingHistory(){
        
    }
}
