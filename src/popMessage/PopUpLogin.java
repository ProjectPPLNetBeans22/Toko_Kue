/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popMessage;

import javax.swing.JLabel;
import view.Dashboard;
import view.Login_Screen;

/**
 *
 * @author hafid
 */
public class PopUpLogin extends javax.swing.JFrame {

    /**
     * Creates new form PopUpLogin
     */
    public PopUpLogin() {
        initComponents();
        
        tIdUserLogin.setVisible(false);
        tuserLogin.setVisible(false);
    }
    
    public void setData(JLabel data1, JLabel data2) {
        tuserLogin.setText(data1.getText());
        tIdUserLogin.setText(data2.getText());
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        tuserLogin = new javax.swing.JLabel();
        tIdUserLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(75, 53, 36));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Okay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(230, 320, 140, 50);

        tuserLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tuserLogin.setText("jLabel2");
        jPanel1.add(tuserLogin);
        tuserLogin.setBounds(480, 140, 90, 40);

        tIdUserLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tIdUserLogin.setText("jLabel2");
        jPanel1.add(tIdUserLogin);
        tIdUserLogin.setBounds(480, 80, 90, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Pop Up Login.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 400);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 400);

        setSize(new java.awt.Dimension(600, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Dashboard dsbh = new Dashboard();
        dsbh.setData(tuserLogin, tIdUserLogin);
        dsbh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PopUpLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUpLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tIdUserLogin;
    private javax.swing.JLabel tuserLogin;
    // End of variables declaration//GEN-END:variables
}
