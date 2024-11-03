/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appgym;

/**
 *
 * @author HP
 */

import java.sql.Connection;
import java.sql.DriverManager;



public class database {
    public static Connection connectDatabase(){
        String nameFileDatabase = "com.mysql.jdbc.Driver";
        try{
            
            Class.forName(nameFileDatabase);
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "");
            return connect;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }   
}
