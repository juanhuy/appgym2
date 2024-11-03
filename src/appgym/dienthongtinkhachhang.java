/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appgym;

/**
 *
 * @author HP
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class dienthongtinkhachhang extends JFrame {

    /**
     * Creates new form login
     */
    public dienthongtinkhachhang() {
        initComponents();
        this.setVisible(true);
        
        
     
    }
    private static Connection getConnection() throws Exception {
    String url="jdbc:sqlserver://HUY:1433;databaseName=appgym;encrypt=true;trustServerCertificate=true;";
	              String userName="sa";
	              String password="123";
        return DriverManager.getConnection(url, userName, password);
    }
public static void check(String firstname, String lastname,String gender,String gmail,String address,String phonenumber) {
        String sql = "INSERT INTO khach (firstname,lastname,gmail,gender,address,phonenumber) VALUES (?, ?, ?, ?,?,?)";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Thiết lập các tham số cho câu truy vấn
            
            stmt.setString(1, firstname);
            stmt.setString(2, lastname);
            stmt.setString(3, gmail);
            stmt.setString(4, gender);
            stmt.setString(5, address);
            stmt.setString(6,phonenumber);

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
    // </editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jtffirstname = new javax.swing.JTextField();
        jlabelfirstname = new javax.swing.JLabel();
        jtflastname = new javax.swing.JTextField();
        jlbgmail = new javax.swing.JLabel();
        jtfaddress = new javax.swing.JTextField();
        jtfgmail = new javax.swing.JTextField();
        jtfgender = new javax.swing.JTextField();
        jtfphone = new javax.swing.JTextField();
        jlbaddress = new javax.swing.JLabel();
        jLabelLastname2 = new javax.swing.JLabel();
        jlbgender = new javax.swing.JLabel();
        jLabelLastname4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gym-logo-300_1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(245, 244, 244));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Information");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 312, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hãy điền thông tin của bạn");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 312, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 138, -1, -1));
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 202, -1, -1));

        login.setBackground(new java.awt.Color(0, 153, 255));
        login.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Next");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel3.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 249, -1));
        jPanel3.add(jtffirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 190, -1));

        jlabelfirstname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlabelfirstname.setText("First name:");
        jPanel3.add(jlabelfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jtflastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtflastnameActionPerformed(evt);
            }
        });
        jPanel3.add(jtflastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 190, -1));

        jlbgmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbgmail.setText("Gmail:");
        jPanel3.add(jlbgmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jtfaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfaddressActionPerformed(evt);
            }
        });
        jPanel3.add(jtfaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 190, -1));

        jtfgmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfgmailActionPerformed(evt);
            }
        });
        jPanel3.add(jtfgmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 190, -1));

        jtfgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfgenderActionPerformed(evt);
            }
        });
        jPanel3.add(jtfgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 190, -1));

        jtfphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfphoneActionPerformed(evt);
            }
        });
        jPanel3.add(jtfphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 190, -1));

        jlbaddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbaddress.setText("Address:");
        jPanel3.add(jlbaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabelLastname2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelLastname2.setText("Last name:");
        jPanel3.add(jLabelLastname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jlbgender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbgender.setText("Gender:");
        jPanel3.add(jlbgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabelLastname4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelLastname4.setText("Phone:");
        jPanel3.add(jLabelLastname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Cancel_1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addContainerGap(270, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 451));

        setSize(new java.awt.Dimension(750, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

        String first_name=jtffirstname.getText();
        String last_name=jtflastname.getText();
        String gmail=jtfgmail.getText();
        String gender=jtfgender.getText();
        String phone=jtfphone.getText();
        String address=jtfaddress.getText();
        check(first_name,last_name,gmail,gender,phone,address);
        new login();
        
       
      
        
    }//GEN-LAST:event_loginActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      this.setVisible(false);
        login a=new login();
        a.setVisible(true);
     
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jtfaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfaddressActionPerformed

    private void jtflastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtflastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtflastnameActionPerformed

    private void jtfgmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfgmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfgmailActionPerformed

    private void jtfgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfgenderActionPerformed

    private void jtfphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfphoneActionPerformed

    /**
     * @param args the command line arguments
     */
//    public void display() {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new login().setVisible(true);
//            }
//        });
//    }
//    java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new login().setVisible(true);
//            }
//        });
    public void startLogin() {
        java.awt.EventQueue.invokeLater(() -> {
            new dienthongtinkhachhang().setVisible(true);
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelLastname2;
    private javax.swing.JLabel jLabelLastname4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlabelfirstname;
    private javax.swing.JLabel jlbaddress;
    private javax.swing.JLabel jlbgender;
    private javax.swing.JLabel jlbgmail;
    private javax.swing.JTextField jtfaddress;
    private javax.swing.JTextField jtffirstname;
    private javax.swing.JTextField jtfgender;
    private javax.swing.JTextField jtfgmail;
    private javax.swing.JTextField jtflastname;
    private javax.swing.JTextField jtfphone;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables

   
}
