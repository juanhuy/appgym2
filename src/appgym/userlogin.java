/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appgym;

/**
 *
 * @author huyju
 */

import com.microsoft.sqlserver.jdbc.SQLServerStatementColumnEncryptionSetting;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
/**
 *
 * @author huyju
 */ 
public class userlogin {
     private static Connection getConnection() throws Exception {
    String url="jdbc:sqlserver://HUY:1433;databaseName=appgym;encrypt=true;trustServerCertificate=true;";
	              String userName="sa";
	              String password="123";
        return DriverManager.getConnection(url, userName, password);
    }

    // Hàm kiểm tra đăng nhập: kiểm tra username và password từ cơ sở dữ liệu
    public static boolean checkLogin(String username, String password) {
        String query = "SELECT * FROM account WHERE username = ? AND password = ?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            // Thiết lập các tham số cho câu truy vấn
            
            stmt.setString(1, username);
            stmt.setString(2, password);

            // Thực hiện truy vấn
            ResultSet rs = stmt.executeQuery();

            // Nếu tìm thấy dòng dữ liệu phù hợp, tức là username và password đúng
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }}
