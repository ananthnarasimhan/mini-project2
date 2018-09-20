/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class MP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try {
                String Query="SELECT DISTINCT area FROM senior_citizen";
                System.out.println("ausfxv");
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                System.out.println("ausfxv");
               // Connection con;
                Connection conn;
                conn = DriverManager.getConnection("jdbc:mysql://localhost/mp?" +"user=root&password=9422349317");
                System.out.println("ausfxv");
                Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(Query);
        while (rs.next()) {
                    String sname=rs.getString("area");
                    System.out.println(sname);
                }
        conn.close();
            } 
            catch (Exception e)
            {   
                String S;
                System.out.println("ausfxv1234");
            }
            
        }
    }
    
