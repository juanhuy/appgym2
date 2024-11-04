/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appgym;

/**
 *
 * @author HP
 */
import java.awt.Color;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class ResetPassword extends JFrame {
    
    static int otp;
    String emailAdd, subject, msg;
    //static boolean veritication;
    /**
     * Creates new form login
     */
    public ResetPassword() {
        initComponents();
        
        txtPassConfirmRegister.setBackground(new java.awt.Color(0,0,0, 1));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        disableConfirm = new javax.swing.JLabel();
        showConfirm = new javax.swing.JLabel();
        txtPassRegister = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        disable1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        show1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPassConfirmRegister = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnSendCode = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtOtp = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlbLogin = new javax.swing.JLabel();
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
        jLabel3.setText("RESET PASSWORD");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 312, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("Confirm:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 14));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 138, -1, -1));
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 202, -1, -1));

        disableConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pass_20.png"))); // NOI18N
        disableConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disableConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableConfirmMouseClicked(evt);
            }
        });
        jPanel3.add(disableConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        showConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password_view_20pixel.png"))); // NOI18N
        showConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showConfirmMouseClicked(evt);
            }
        });
        jPanel3.add(showConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtPassRegister.setText("________________________________________________");
        jPanel3.add(txtPassRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 240, -1));

        login.setBackground(new java.awt.Color(0, 153, 255));
        login.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Update");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel3.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 130, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("New Password:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 14));

        disable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pass_20.png"))); // NOI18N
        disable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disable1MouseClicked(evt);
            }
        });
        jPanel3.add(disable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        txtPassword.setBackground(new java.awt.Color(242, 242, 242));
        txtPassword.setFont(txtPassword.getFont());
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel3.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 180, 20));

        show1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password_view_20pixel.png"))); // NOI18N
        show1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show1MouseClicked(evt);
            }
        });
        jPanel3.add(show1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel11.setText("________________________________________________");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 240, -1));

        txtPassConfirmRegister.setBackground(new java.awt.Color(242, 242, 242));
        txtPassConfirmRegister.setFont(txtPassConfirmRegister.getFont());
        txtPassConfirmRegister.setBorder(null);
        txtPassConfirmRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassConfirmRegisterActionPerformed(evt);
            }
        });
        jPanel3.add(txtPassConfirmRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 180, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 153, 255));
        jLabel12.setText("Email:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mail-24.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txt_email.setBackground(new java.awt.Color(242, 242, 242));
        txt_email.setBorder(null);
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        jPanel3.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 160, -1));

        jLabel14.setText("________________________________________________");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 240, 20));

        btnSendCode.setBackground(new java.awt.Color(242, 242, 242));
        btnSendCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSendCode.setForeground(new java.awt.Color(0, 153, 255));
        btnSendCode.setText("Send Code");
        btnSendCode.setBorder(null);
        btnSendCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendCodeActionPerformed(evt);
            }
        });
        jPanel3.add(btnSendCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 90, 20));

        jLabel15.setForeground(new java.awt.Color(51, 153, 255));
        jLabel15.setText("OTP:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtOtp.setBackground(new java.awt.Color(242, 242, 242));
        txtOtp.setBorder(null);
        txtOtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtpActionPerformed(evt);
            }
        });
        jPanel3.add(txtOtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 230, -1));

        jLabel16.setText("________________________________________________");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 230, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pin-code-50.png"))); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 130, -1));

        jlbLogin.setForeground(new java.awt.Color(0, 153, 255));
        jlbLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbLogin.setText("Quay về đăng nhập");
        jlbLogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlbLoginMouseMoved(evt);
            }
        });
        jlbLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbLoginMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbLoginMouseExited(evt);
            }
        });
        jPanel3.add(jlbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 220, -1));

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

        String password=new String(txtPassword.getPassword());
        String passwordcf=new String (txtPassConfirmRegister.getPassword());
        emailAdd = txt_email.getText();
        if(emailAdd.isEmpty()){
            JOptionPane.showMessageDialog(null, "Hay nhap email cua ban!");
        }
        else if(password.equals(passwordcf)) {            
                String getOtp = txtOtp.getText();
                if (getOtp.equals(Integer.toString(otp))){
                    register.updatePassword(emailAdd, password);
                    JOptionPane.showMessageDialog(null, "Cap nhat mat khau thanh cong!");
            
                    this.setVisible(false);
                    login a = new login();   
                    a.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null, "Ma xac thuc sai!");
                }
        } else {
            JOptionPane.showMessageDialog(null, "Password and confirmation must be the same");
        }
        
    }//GEN-LAST:event_loginActionPerformed

    private void disable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disable1MouseClicked
        txtPassword.setEchoChar((char)0);
        disable1.setVisible(false);
        disable1.setEnabled(false);
        show1.setVisible(true);
        show1.setEnabled(true);
    }//GEN-LAST:event_disable1MouseClicked

    private void show1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show1MouseClicked
        txtPassword.setEchoChar((char)8226);
        disable1.setVisible(true);
        disable1.setEnabled(true);
        show1.setVisible(false);
        show1.setEnabled(false);
    }//GEN-LAST:event_show1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      this.setVisible(false);
        login a=new login();
        a.setVisible(true);
     
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void btnSendCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendCodeActionPerformed
        emailAdd = txt_email.getText();
        if(emailAdd.isEmpty()){
            JOptionPane.showMessageDialog(null, "Hay nhap email cua ban!");
        }
        else if(!register.checkTonTaiEmail(emailAdd)){
            Random random = new Random();
            int min = 100000;
            int max = 999999;
            otp = random.nextInt(max - min) + min;
            subject = "Email Reset Password";
            msg = "Your reset password code is: " + otp;
            EmailService.sendVerificationEmail(emailAdd, subject, msg);
            JOptionPane.showMessageDialog(null, "OTP sent, Please check your email!");
            btnSendCode.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Dia chi Email khong co trong he thong!");
        }
    }//GEN-LAST:event_btnSendCodeActionPerformed

    private void txtOtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOtpActionPerformed

    private void txtPassConfirmRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassConfirmRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassConfirmRegisterActionPerformed

    private void showConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showConfirmMouseClicked
        txtPassConfirmRegister.setEchoChar((char)8226);
        disableConfirm.setVisible(true);
        disableConfirm.setEnabled(true);
        showConfirm.setVisible(false);
        showConfirm.setEnabled(false);
    }//GEN-LAST:event_showConfirmMouseClicked

    private void disableConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableConfirmMouseClicked
        txtPassConfirmRegister.setEchoChar((char)0);
        disableConfirm.setVisible(false);
        disableConfirm.setEnabled(false);
        showConfirm.setVisible(true);
        showConfirm.setEnabled(true);
    }//GEN-LAST:event_disableConfirmMouseClicked

    private void jlbLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbLoginMouseExited
        jlbLogin.setForeground(new Color(0, 153, 255));
    }//GEN-LAST:event_jlbLoginMouseExited

    private void jlbLoginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbLoginMouseMoved
        jlbLogin.setForeground(new Color(255, 0, 0));
    }//GEN-LAST:event_jlbLoginMouseMoved

    private void jlbLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbLoginMouseClicked
        login a = new login();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jlbLoginMouseClicked

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
            new ResetPassword().setVisible(true);
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendCode;
    private javax.swing.JLabel disable1;
    private javax.swing.JLabel disableConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlbLogin;
    private javax.swing.JButton login;
    private javax.swing.JLabel show1;
    private javax.swing.JLabel showConfirm;
    private javax.swing.JTextField txtOtp;
    private javax.swing.JPasswordField txtPassConfirmRegister;
    private javax.swing.JLabel txtPassRegister;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txt_email;
    // End of variables declaration//GEN-END:variables
}
