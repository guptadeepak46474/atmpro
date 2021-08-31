package acer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class cone {
    Connection c;
    Statement s;
    public cone(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///project7","root","sushmavijay@123apple");
            s =c.createStatement();


        }catch(Exception e){
            System.out.println(e);
        }
    }
}