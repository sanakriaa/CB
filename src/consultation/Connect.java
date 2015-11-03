
package consultation;
import java.sql.DriverManager;
import  java.sql.*;
import java.sql.SQLException;


public class Connect {
    String url1="com.mysql.jdbc.Driver";
    String url2="jdbc:mysql://localhost:3306/consultation";
Connection con ;
    public Connect()
    {
        try{
            Class.forName(url1);
            System.out.println("chargement de pilote reussie");
        }catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        
        try{
          con=DriverManager.getConnection(url2,"root","");
            System.out.print("connection reussie");
            
        }catch(SQLException e)
        {
            System.out.print(e);
        }
    }
    public static void main(String[] args) {
       
    }
    Connection obtenirconnection()
    {
        return con;
    }
    
}
