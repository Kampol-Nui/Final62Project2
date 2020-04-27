package dataaccess;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MINI
 */
public class DBconnection {
    private static final String DRIVER="org.apache.derby.jdbc.ClientDriver";
    private static final String URL="jdbc:derby://localhost:1527/finalproject";
    private static final String USERNAME="Nui";
    private static final String PASSWORD="nui";
    
    public static Connection getConnecting(){
        Connection conn = null;
        try{
            Class.forName(DRIVER);
            conn=DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } 
        catch(ClassNotFoundException ex){
            System.out.println("Database driver doesn't exist");
        }
        catch(SQLException ex){
            System.out.println("Can not connect to database");
        }
        return conn;
    }
    
    public static double SelectLastMoney(double id){
        double money=0;
        //double c1[] = new double[100];
        try(Connection con = DBconnection.getConnecting();
             Statement stm = con.createStatement();){
            ResultSet rs = null;

            String query = ("SELECT * FROM CUSTOMERACCOUNT WHERE ORDER_NUMBER=(SELECT MAX(ORDER_NUMBER) FROM CUSTOMERACCOUNT) and id="+ id);
            //String query = ("SELECT * FROM PASSWORD P ,CUSTOMERACCOUNT2 C WHERE P.PASSWORD = C.PASSWORD AND C.ID=(SELECT MAX(C.ID) FROM CUSTOMERACCOUNT2)"+"AND C.PASSWORD = '"+id+"'");
         rs = stm.executeQuery(query);
         
         if (rs.next()) {
            //String ps = rs.getString("PASSWORD");
            //System.out.println(ps);
            //if(ps==password){
            money = rs.getDouble("MYMONEY");
            //String lname = rs.getString("LastName");
            //System.out.println("" + money);
            }
            //System.out.println("LastName:" + lname);
         //}
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
            System.out.println(ex.getMessage());
        }
        return money;
    }
}
