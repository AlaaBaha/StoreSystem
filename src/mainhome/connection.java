package mainhome;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connection {
    Connection con;
    Statement st;
    boolean check;
    public  Statement connect(){
      
        try { 
            String url= " " ;
          Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/Store","root","");
            st=  con.createStatement();
           check=true;
        } 
        catch (Exception ex) {
             Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }  
        check=false;
     
        return st;
    }
  
   
}
