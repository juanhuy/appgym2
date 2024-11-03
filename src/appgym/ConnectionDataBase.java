
package appgym;


import java.sql.Connection;
import java.sql.DriverManager;
//import javax.swing.*;
/**
 *
 * @author HP
 */
public class ConnectionDataBase {
    Connection db;
    public Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://"
                    + "LAPTOP-23G6G0AF:1433;"
                    + "databaseName=GymManagement;"
                    + "user=sa;"
                    + "password=123";
            conn = DriverManager.getConnection(connectionUrl);
            if(conn != null)
                System.out.println("Connect database sussecfull............");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}