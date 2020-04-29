
import dataaccess.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GameLibrary {

    private ArrayList<Game> myGameLibrary;
    private CustomerAccount ac;
    
    public GameLibrary(CustomerAccount ac) {
        this.ac = ac;
        this.myGameLibrary = new ArrayList<>();
    }

    public void addGameFromCartToLibrary() {
        String sql1 = "INSERT INTO CUSTOMERACCOUNT " + "(id,name,password,carttotalprice,mymoney)" + "VALUES(?,?,?,?,?)";
        ac.getMyCart().calculateTotalPrice();
        try (Connection con = DBconnection.getConnecting();) {

            if (ac.getMyCart().getTotalprice() <= dataaccess.DBconnection.SelectLastMoney(ac.getUniqueId())) {
                this.myGameLibrary = (ArrayList<Game>) ac.getMyCart().itemInCart.clone();
                double oldmoney = dataaccess.DBconnection.SelectLastMoney(ac.getUniqueId());
                ac.myMoney = dataaccess.DBconnection.SelectLastMoney(ac.getUniqueId()) - ac.getMyCart().getTotalprice();
                try (
                        PreparedStatement stm = con.prepareStatement(sql1);) {

                    stm.setDouble(1, ac.getUniqueId());
                    stm.setString(2, ac.getUsername());
                    stm.setDouble(5, ac.myMoney);
                    stm.setString(3, ac.getPassword());
                    stm.setDouble(4, ac.getMyCart().getTotalprice());
                    stm.executeUpdate();

                } catch (SQLException ex) {
                    ex.getMessage();
                }
                String sql2 = "UPDATE CUSTOMERACCOUNT2 set mymoney=" + ac.myMoney + " WHERE id =" + ac.getUniqueId();
                try (Statement stm = con.createStatement();) {
                    stm.executeUpdate(sql2);
                    System.out.println("ชำระเงินเสร็จสมบูรณ์ โปรดตรวจสอบ Library ของคุณหลังชำระเงิน ");
                    System.out.println("ยอดเงินหลังชำระ : " + ac.myMoney + " ยอดเงินก่อนชำระ : " + oldmoney);
                } catch (SQLException ex) {
                    ex.getMessage();
                }

                ac.getMyCart().itemInCart.clear();

            } else {

                System.out.println("Please Topup Money First");
            }
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            ex.getMessage();
        }
        
    }

    public ArrayList<Game> getMyGameLibrary() {
        try {
            System.out.println("************************ MY Library *************************");
            return this.myGameLibrary;
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

    }

}
