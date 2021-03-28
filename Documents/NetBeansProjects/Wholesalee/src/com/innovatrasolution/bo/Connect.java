/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatrasolution.bo;


import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;  
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author junai
 */
public class Connect {
    public  static Connection con;
   
    public static Connection ConnectionDB(){
        
        try{
           Class.forName("org.sqlite.JDBC");
           Connection con = DriverManager.getConnection("jdbc:sqlite:temp.db");
           System.out.println("Connection To the DB succeeded ");
           
        } catch (Exception ex) {
            System.out.println("Connection Failed" + ex);
            return null;
        }
    return con;
    }
    
}
