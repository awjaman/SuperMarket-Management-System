/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Vector;
import java.sql.PreparedStatement;

/**
 *
 * @author PAWAN-AMAN
 */
public class jd {
    Connection con =null;
    java.sql.PreparedStatement pst;
    public static Connection JDconnect()
    {
        try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
             return conn;
        }
        catch(Exception e2){
            System.out.println(e2);
            return null;
        }
    }
    
}
