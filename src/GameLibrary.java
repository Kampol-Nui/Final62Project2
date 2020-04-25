
import dataaccess.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

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


    public void payGame(CustomerAccount ac) {
        String sql1 = "INSERT INTO CUSTOMERACCOUNT " + "(mymoney,name,password,carttotalprice)" + "VALUES(?,?,?,?)";
//        try {

            if (ac.getCart().getTotalprice() < ac.getMyMoney()) {
                ac.myGameLibrary = (ArrayList<Game>)ac.getCart().itemInCart.clone();
                ac.myMoney = ac.myMoney - ac.getCart().getTotalprice();
//                try (Connection con = DBconnection.getConnecting();
//                        PreparedStatement stm = con.prepareStatement(sql1);) {
//                    stm.setString(2, ac.getUsername());
//                    stm.setDouble(1, ac.getMyMoney());
//                    stm.setString(3, ac.getPassword());
//                    stm.setDouble(4, ac.getCart().getTotalprice());
//                    stm.executeUpdate();
//                } catch (SQLException ex) {
//                    ex.getMessage();
//                }
                ac.getCart().listGameFromCart();
                ac.getCart().itemInCart.clear();
                ac.getCart().listGameFromCart();
                //ac.getCart().itemInCart.removeAll(ac.getCart().itemInCart) ;
            }
//        } catch (NullPointerException ex) {
//            System.out.println(ex.getMessage());
//        }

    }

    public ArrayList<Game> getMyGameLibrary(CustomerAccount ac) {
        try {
            System.out.println("************************ MY Library *************************");
            return ac.myGameLibrary;
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

    }

}
