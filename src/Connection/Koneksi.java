/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

/**
 *
 * @author Smktelkom
 */
import java.sql.*;
public class Koneksi {
    public koneksi(){
          
    }
    public Connection bukakoneksi() throws SQLException, ClassNotFoundException{
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/sia","root","");
            return con;
        }catch(SQLException se){
            System.out.println("No Connection Open");
            return null;
        }catch(SQLException ex){
            System.out.println("Couldn't open connection"+ex);
            return null;
        }
    }
}
