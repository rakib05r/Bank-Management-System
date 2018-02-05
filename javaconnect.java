/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rakib05
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
    Connection conn=null;
    
    public static Connection ConnecrDb(){
        try{
           Class.forName("oracle.jdbc.OracleDriver");
           Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
        return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
