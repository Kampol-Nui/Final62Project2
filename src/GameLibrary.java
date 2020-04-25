
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
        String sql1 = "INSERT INTO CUSTOMERACCOUNT2 " + "(name,password,carttotalprice,mymoney)" + "VALUES(?,?,?,?)";
        String sql2 = "INSERT INTO PASSWORD " + "(password,mymoney)" + "VALUES(?,?)";
        try(Connection con = DBconnection.getConnecting();) {

            if (ac.getCart().getTotalprice() < ac.getMyMoney()) {
                ac.myGameLibrary = (ArrayList<Game>)ac.getCart().itemInCart.clone();
                ac.myMoney = ac.myMoney - ac.getCart().getTotalprice();
                try (
                        PreparedStatement stm = con.prepareStatement(sql1);
                        PreparedStatement stm2 = con.prepareStatement(sql2);) {
                    //stm.setInt(1, 1);
                    stm2.setDouble(2, ac.getMyMoney());
                    stm2.setString(1, ac.getPassword());
                    stm.setString(1, ac.getUsername());
                    stm.setDouble(4, ac.getMyMoney());
                    stm.setString(2, ac.getPassword());
                    stm.setDouble(3, ac.getCart().getTotalprice());
                    stm.executeUpdate();
                    stm2.executeUpdate();
                } catch (SQLException ex) {
                    ex.getMessage();
                }
                ac.getCart().listGameFromCart();
                ac.getCart().itemInCart.clear();
                ac.getCart().listGameFromCart();
                //ac.getCart().itemInCart.removeAll(ac.getCart().itemInCart) ;
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

    
    public void SelectTest(){
        //double c1[] = new double[100];
        try(Connection con = DBconnection.getConnecting();
             Statement stm = con.createStatement();){
            ResultSet rs = null;
            //double d = rs.getDouble("MYMONEY");
            String query = ("SELECT * FROM PASSWORD P");
         rs = stm.executeQuery(query);
         if (rs.next()) {
            double money = rs.getDouble("MYMONEY");
            //String lname = rs.getString("LastName");
            System.out.println("" + money);
            //System.out.println("LastName:" + lname);
         }
//            System.out.println(d);
//            System.out.println(rs.getDouble("MYMONEY"));
//            int i=0;
//            while(rs.next()){
////                System.out.print(rs.getInt("Id")+"\t");
////               System.out.println(rs.getString("Name"));
//                   
//                  c1[i++] = rs.getDouble("MYMONEY");
//                
//            }
//            for (int j = 0; j < c1.length; j++) {
//            System.out.println(c1[j]);
            
//        }
            
        } catch (SQLException ex) {
           ex.getMessage();
        }
    }
}
