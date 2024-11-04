/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appgym;

/**
 *
 * @author huyju
 */
 import javax.activation.DataHandler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.util.Scanner;

/**
 *
 * @author huyju
 */
public class register {
    private String username;
    private String password;
    
     private static Connection getConnection() throws Exception {
    String url="jdbc:sqlserver://HUY:1433;databaseName=appgym;encrypt=true;trustServerCertificate=true;";
	              String userName="sa";
	              String password="123";
        return DriverManager.getConnection(url, userName, password);
    }

   public static boolean checktontai(String username) {
        String query = "SELECT * FROM account WHERE username = ? ";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            // Thiết lập các tham số cho câu truy vấn
            
            stmt.setString(1, username);
           
           
            // Thực hiện truy vấn
            ResultSet rs = stmt.executeQuery();

          
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
   
   public static boolean checkTonTaiEmail(String gmail) {
        String query = "SELECT * FROM account WHERE gmail = ? ";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            // Thiết lập các tham số cho câu truy vấn
            
            stmt.setString(1, gmail);
           
           
            // Thực hiện truy vấn
            ResultSet rs = stmt.executeQuery();

          
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
   
    public static boolean Check(String username, String password, String gmail) {
        
         String insertUserSQL = "INSERT INTO account (username, password, gmail) VALUES (? ,? ,? )";
                      try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(insertUserSQL);) {
             
        stmt.setString(1, username);
            stmt.setString(2,password);
            stmt.setString(3, gmail);
           
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("User registered successfully!");
            }
           
            
          
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean updatePassword(String gmail, String newPassword) {
        String updatePasswordSQL = "UPDATE account SET password = ? WHERE gmail = ?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(updatePasswordSQL)) {
                // Thiết lập tham số cho câu truy vấn
            stmt.setString(1, newPassword); // Mật khẩu mới
            stmt.setString(2, gmail);    // Tên người dùng
        
            // Thực hiện lệnh cập nhật
            int rowsUpdated = stmt.executeUpdate();
        
            if (rowsUpdated > 0) {
                System.out.println("Password updated successfully!");
                return true; // Cập nhật thành công
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; 
    }
    
    public static void check(String fullname,String gender,String gmail,String address,String phonenumber) {
        String sql = "INSERT INTO account (fullname,gmail,gender,address,phonenumber) VALUES ( ?, ?, ?,?,?)";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Thiết lập các tham số cho câu truy vấn
            
            stmt.setString(1, fullname);

            stmt.setString(2, gmail);
            stmt.setString(3, gender);
            stmt.setString(4, address);
            stmt.setString(5,phonenumber);

            // Thực hiện truy vấn
            ResultSet rs = stmt.executeQuery();

             int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Dữ liệu đã được chèn thành công.");
            }

    }catch(Exception e)
    {
        e.printStackTrace();
    }}

    
      
    }

