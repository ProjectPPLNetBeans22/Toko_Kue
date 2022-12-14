/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import popMessage.PopUpLogin;
import popMessage.PopUpLoginErr;

/**
 *
 * @author hafid
 */
public class Login_Screen extends javax.swing.JFrame {

    /**
     * Creates new form Login_Screen
     */
    public Login_Screen() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        tForgetPass = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tnamaLogin = new javax.swing.JLabel();
        tIdLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        username.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        username.setBorder(null);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel2.add(username);
        username.setBounds(750, 220, 330, 50);

        password.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        password.setBorder(null);
        jPanel2.add(password);
        password.setBounds(760, 370, 310, 50);

        jButton1.setBackground(new java.awt.Color(145, 109, 83));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setText("Login");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(810, 540, 170, 50);

        tForgetPass.setBackground(new java.awt.Color(163, 135, 114));
        tForgetPass.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tForgetPass.setForeground(new java.awt.Color(255, 255, 255));
        tForgetPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tForgetPass.setText("Lupa Password ?");
        tForgetPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tForgetPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tForgetPassMouseClicked(evt);
            }
        });
        jPanel2.add(tForgetPass);
        tForgetPass.setBounds(800, 460, 190, 50);

        jPanel1.setBackground(new java.awt.Color(163, 135, 114));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(810, 450, 170, 70);

        tnamaLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tnamaLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(tnamaLogin);
        tnamaLogin.setBounds(850, 320, 230, 30);

        tIdLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tIdLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(tIdLogin);
        tIdLogin.setBounds(850, 170, 230, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Login Screen.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1200, 650);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1200, 650);

        setSize(new java.awt.Dimension(1200, 642));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            if (username.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Mohon Masukan Email anda!");
                username.requestFocus();
            } else if (password.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Password Tidak Boleh Kosong!");
                password.requestFocus();
            } else {
                String sql = "SELECT * FROM pegawai WHERE email_pegawai='"+ username.getText() +"' AND "
                            + "password_pegawai = '"+ password.getText() +"'";
                PreparedStatement stat = Koneksi.GetConnection().prepareStatement(sql);
                ResultSet res = stat.executeQuery();
                if(res.next()) {
                    if (username.getText().equals(res.getString("email_pegawai")) && 
                        password.getText().equals(res.getString("password_pegawai"))) {
                        tIdLogin.setText(res.getString("ID_pegawai"));
                        tnamaLogin.setText(res.getString("nama_pegawai"));
                        PopUpLogin mLogin = new PopUpLogin();
                        mLogin.setData(tnamaLogin, tIdLogin);
                        mLogin.setVisible(true);
                        this.dispose();
                    }
                } else {
                    PopUpLoginErr mLoginErr = new PopUpLoginErr();
                    mLoginErr.setVisible(true);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tForgetPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tForgetPassMouseClicked
        // TODO add your handling code here:
        Forget_Password fp = new Forget_Password();
        this.dispose();
        fp.setVisible(true);
    }//GEN-LAST:event_tForgetPassMouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel tForgetPass;
    private javax.swing.JLabel tIdLogin;
    private javax.swing.JLabel tnamaLogin;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
