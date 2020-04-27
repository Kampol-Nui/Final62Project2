
import dataaccess.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
        String sql1 = "INSERT INTO CUSTOMERACCOUNT " + "(id,name,password,carttotalprice,mymoney)" + "VALUES(?,?,?,?,?)";
        //String sql2 = "INSERT INTO PASSWORD " + "(password,mymoney)" + "VALUES(?,?)";
        try (Connection con = DBconnection.getConnecting();) {

            if (ac.getCart().getTotalprice() <= dataaccess.DBconnection.SelectLastMoney(ac.getUniqueId())) {
                ac.myGameLibrary = (ArrayList<Game>) ac.getCart().itemInCart.clone();
                ac.myMoney = dataaccess.DBconnection.SelectLastMoney(ac.getUniqueId()) - ac.getCart().getTotalprice();
                try (
                        PreparedStatement stm = con.prepareStatement(sql1); //PreparedStatement stm2 = con.prepareStatement(sql2);
                        ) {
                    //stm.setInt(1, 1);
//                    stm2.setDouble(2, ac.getMyMoney());
//                    stm2.setString(1, ac.getPassword());
                    stm.setDouble(1, ac.getUniqueId());
                    stm.setString(2, ac.getUsername());
                    stm.setDouble(5, ac.myMoney);
                    stm.setString(3, ac.getPassword());
                    stm.setDouble(4, ac.getCart().getTotalprice());
                    stm.executeUpdate();
                    // stm2.executeUpdate();

                } catch (SQLException ex) {
                    ex.getMessage();
                }

                ac.getCart().itemInCart.clear();

                //ac.getCart().itemInCart.removeAll(ac.getCart().itemInCart) ;
            } else {

                System.out.println("Please Topup Money First");
            }
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            ex.getMessage();
        }
//SelectTest();
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
