
import dataaccess.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GameLibrary {

    public void payGame(CustomerAccount ac) {
        String sql1 = "INSERT INTO CUSTOMERACCOUNT " + "(id,name,password,carttotalprice,mymoney)" + "VALUES(?,?,?,?,?)";
        ac.getCart().calculateTotalPrice();
        try (Connection con = DBconnection.getConnecting();) {

            if (ac.getCart().getTotalprice() <= dataaccess.DBconnection.SelectLastMoney(ac.getUniqueId())) {
                ac.myGameLibrary = (ArrayList<Game>) ac.getCart().itemInCart.clone();
                ac.myMoney = dataaccess.DBconnection.SelectLastMoney(ac.getUniqueId()) - ac.getCart().getTotalprice();
                try (
                        PreparedStatement stm = con.prepareStatement(sql1);) {

                    stm.setDouble(1, ac.getUniqueId());
                    stm.setString(2, ac.getUsername());
                    stm.setDouble(5, ac.myMoney);
                    stm.setString(3, ac.getPassword());
                    stm.setDouble(4, ac.getCart().getTotalprice());
                    stm.executeUpdate();

                } catch (SQLException ex) {
                    ex.getMessage();
                }
                String sql2 = "UPDATE CUSTOMERACCOUNT2 set mymoney=" + ac.myMoney + " WHERE id =" + ac.getUniqueId();
                try (Statement stm = con.createStatement();) {
                    stm.executeUpdate(sql2);
                    System.out.println("Paygame successfully ");
                    System.out.println("เงินเหลือ : " + ac.myMoney);
                } catch (SQLException ex) {
                    ex.getMessage();
                }

                ac.getCart().itemInCart.clear();

            } else {

                System.out.println("Please Topup Money First");
            }
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            ex.getMessage();
        }

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
