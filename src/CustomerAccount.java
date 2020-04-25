




import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MINI
 */
public class CustomerAccount extends Account{
    private Cart cart;
    protected double myMoney;
    protected ArrayList<Game> myGameLibrary;

    
    public CustomerAccount(Cart myCart, double myMoney, String username, String password, AccountStatus status, Person person) {
        super(username, password, person);
        this.cart = myCart;
        this.myMoney = myMoney;
        this.myGameLibrary = new ArrayList<>();
    }

    
    public void addCustomerToServer(double myMoney, String username,String password,Cart cart){
        
       PreparedStatement pre = null;
        try(Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/finalproject", "Nui", "nui");
             //Statement st = con.createStatement();
             
                
               
               )
        {   
                String sql = "INSERT INTO CUSTOMERACCOUNT " +
					"(mymoney,name,password,carttotalprice)" + 
					"VALUES (?,?,?,?) ";
                 pre = con.prepareStatement(sql);  
                pre.setDouble(1, myMoney);
                pre.setString(2, username);
                pre.setString(3, password);
                pre.setDouble(4, cart.getTotalprice());
//                pre.setBlob(4, (Blob) cart);
               // pre.setObject(4, cart);
                pre.executeUpdate();
                //int row1 = st.executeUpdate("INSERT INTO CUSTOMERACCOUNT VALUES('123123')");
                 
               // int row2 = st.executeUpdate("INSERT INTO CUSTOMERACCOUNT VALUES(500,'Kampol','456789fgh')");
               // System.out.println(row1);
                //System.out.println(row2);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        try{
            if(pre != null){
                pre.close();
            }
        }catch(SQLException ex){
            ex.getMessage();
        }
        
    }
       
    
//    public void setCart(Cart cart) {
//        this.cart = cart;
//    }
//
//    public void setLb(GameLibrary[] lb) {
//        this.lb = lb;
//    }

    
//    public void customerAddGameToCart(String title){
//        cart.addGameTOCart(title);
//    }
//    
//    public void customerRemoveGameFromCart(String title){
//        cart.removeGameFromCart(title);
//        
//    }
    
//    public void customerCheckOut(Cart cart,GameLibrary library){
//        cart.checkoutGame(cart,library);
//    }

    
    
    public double getMyMoney() {
        return this.myMoney;
    }

    public Cart getCart() {
        return cart;
    }

//    public ArrayList<Cart> getLb() {
//        return lb;
//    }
    
    public void TopupMoney(double topupmoney){
        if(topupmoney == 0){
            System.out.println("Please in sert your money");
        }else{
         this.myMoney = this.myMoney + topupmoney;
        }
    }
    
//    public double calculateMyTotalMoney(){
//        
//    }
}
