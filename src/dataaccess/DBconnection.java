package dataaccess;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
}
