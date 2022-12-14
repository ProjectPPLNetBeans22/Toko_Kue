/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.glass.events.KeyEvent;
import database.Koneksi;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author hafid
 */
public class mTransaksi extends javax.swing.JInternalFrame {

    /**
     * Creates new form mTransaksi
     */
    public mTransaksi() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        
        btnKonfirmasi.setBackground(new Color(0,0,0,0));
        btnKonfirmasi.setOpaque(false);
        
        btnBatal.setBackground(new Color(0,0,0,0));
        btnBatal.setOpaque(false);
    }
    
    public void setData(JLabel data) {
        tIdKaryawan.setText(data.getText());
    }
    
    public void bersih() {
        tNoOrder.setText("");
        tNamaPemesan.setText("");
        tJumlahKue.setText("");
        tComboBayar.setSelectedIndex(0);
        tTotalHarga.setText("");
        tTotalBayar.setText("");
        tKembali.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        btnKonfirmasi = new javax.swing.JPanel();
        btnBatal = new javax.swing.JPanel();
        tKembali = new javax.swing.JTextField();
        tTotalBayar = new javax.swing.JTextField();
        tTotalHarga = new javax.swing.JTextField();
        tJumlahKue = new javax.swing.JTextField();
        tNamaPemesan = new javax.swing.JTextField();
        tNoOrder = new javax.swing.JTextField();
        tComboBayar = new javax.swing.JComboBox<>();
        tIdKaryawan = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        tCari = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(845, 690));
        setPreferredSize(new java.awt.Dimension(845, 690));
        getContentPane().setLayout(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMinimumSize(new java.awt.Dimension(845, 690));
        jPanel6.setPreferredSize(new java.awt.Dimension(845, 690));
        jPanel6.setLayout(null);

        btnKonfirmasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKonfirmasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKonfirmasiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnKonfirmasiLayout = new javax.swing.GroupLayout(btnKonfirmasi);
        btnKonfirmasi.setLayout(btnKonfirmasiLayout);
        btnKonfirmasiLayout.setHorizontalGroup(
            btnKonfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        btnKonfirmasiLayout.setVerticalGroup(
            btnKonfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel6.add(btnKonfirmasi);
        btnKonfirmasi.setBounds(666, 231, 100, 30);

        btnBatal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBatalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnBatalLayout = new javax.swing.GroupLayout(btnBatal);
        btnBatal.setLayout(btnBatalLayout);
        btnBatalLayout.setHorizontalGroup(
            btnBatalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        btnBatalLayout.setVerticalGroup(
            btnBatalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel6.add(btnBatal);
        btnBatal.setBounds(574, 231, 55, 30);

        tKembali.setEditable(false);
        tKembali.setBackground(new java.awt.Color(248, 248, 245));
        tKembali.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tKembali.setBorder(null);
        tKembali.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel6.add(tKembali);
        tKembali.setBounds(578, 183, 190, 28);

        tTotalBayar.setBackground(new java.awt.Color(248, 248, 245));
        tTotalBayar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tTotalBayar.setBorder(null);
        tTotalBayar.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tTotalBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tTotalBayarKeyTyped(evt);
            }
        });
        jPanel6.add(tTotalBayar);
        tTotalBayar.setBounds(578, 141, 190, 28);

        tTotalHarga.setEditable(false);
        tTotalHarga.setBackground(new java.awt.Color(248, 248, 245));
        tTotalHarga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tTotalHarga.setBorder(null);
        tTotalHarga.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel6.add(tTotalHarga);
        tTotalHarga.setBounds(578, 98, 190, 28);

        tJumlahKue.setEditable(false);
        tJumlahKue.setBackground(new java.awt.Color(248, 248, 245));
        tJumlahKue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tJumlahKue.setBorder(null);
        tJumlahKue.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel6.add(tJumlahKue);
        tJumlahKue.setBounds(188, 185, 130, 28);

        tNamaPemesan.setEditable(false);
        tNamaPemesan.setBackground(new java.awt.Color(248, 248, 245));
        tNamaPemesan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tNamaPemesan.setBorder(null);
        tNamaPemesan.setDisabledTextColor(new java.awt.Color(248, 248, 245));
        jPanel6.add(tNamaPemesan);
        tNamaPemesan.setBounds(188, 140, 225, 28);

        tNoOrder.setBackground(new java.awt.Color(248, 248, 245));
        tNoOrder.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tNoOrder.setBorder(null);
        tNoOrder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tNoOrderKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tNoOrderKeyTyped(evt);
            }
        });
        jPanel6.add(tNoOrder);
        tNoOrder.setBounds(188, 98, 123, 28);

        tComboBayar.setBackground(new java.awt.Color(204, 204, 204));
        tComboBayar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tComboBayar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Metode -", "Tunai", "Non-Tunai" }));
        tComboBayar.setBorder(null);
        jPanel6.add(tComboBayar);
        tComboBayar.setBounds(180, 223, 190, 35);

        tIdKaryawan.setText("jLabel2");
        jPanel6.add(tIdKaryawan);
        tIdKaryawan.setBounds(670, 10, 65, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Form Transaksi.png"))); // NOI18N
        jPanel6.add(jLabel1);
        jLabel1.setBounds(40, 30, 750, 250);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel);

        jPanel6.add(jScrollPane1);
        jScrollPane1.setBounds(40, 430, 750, 180);

        tCari.setBackground(new java.awt.Color(248, 248, 245));
        tCari.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tCariKeyReleased(evt);
            }
        });
        jPanel6.add(tCari);
        tCari.setBounds(618, 380, 170, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Cari :");
        jPanel6.add(jLabel3);
        jLabel3.setBounds(580, 380, 31, 30);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 845, 690);

        setBounds(0, 0, 845, 690);
    }// </editor-fold>//GEN-END:initComponents

    private void tNoOrderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tNoOrderKeyReleased
        // TODO add your handling code here:
        if (tNoOrder.getText().isEmpty()) {
            tNamaPemesan.setText("");
            tJumlahKue.setText("");
            tComboBayar.setSelectedIndex(0);
            tTotalHarga.setText("");
        } else {
            try {
                String sql = "SELECT transaksi.ID_orders, orders.nama_pemesan, detail_transaksi.total_kue, transaksi.metode_bayar, detail_transaksi.harga_total "
                           + "FROM transaksi, detail_transaksi, detail_produk, orders "
                           + "WHERE transaksi.ID_transaksi = detail_transaksi.ID_transaksi "
                           + "OR detail_produk.kode_produk = detail_transaksi.kode_sub_produk "
                           + "OR orders.ID_orders = transaksi.ID_orders "
                           + "GROUP BY transaksi.ID_orders HAVING transaksi.ID_orders = '"+ tNoOrder.getText() +"'";
                Statement stat = Koneksi.GetConnection().createStatement();
                ResultSet res = stat.executeQuery(sql);
                if (res.next()) {
                    tNamaPemesan.setText(res.getString("orders.nama_pemesan"));
                    tJumlahKue.setText(res.getString("detail_transaksi.total_kue"));
                    tComboBayar.setSelectedItem(res.getString("transaksi.metode_bayar"));
                    tTotalHarga.setText(res.getString("detail_transaksi.harga_total"));
                } 
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_tNoOrderKeyReleased

    private void tCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCariKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tCariKeyReleased

    private void btnBatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseClicked
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_btnBatalMouseClicked

    private void btnKonfirmasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKonfirmasiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKonfirmasiMouseClicked

    private void tTotalBayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tTotalBayarKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tTotalBayarKeyTyped

    private void tNoOrderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tNoOrderKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tNoOrderKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBatal;
    private javax.swing.JPanel btnKonfirmasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tCari;
    private javax.swing.JComboBox<String> tComboBayar;
    private javax.swing.JLabel tIdKaryawan;
    private javax.swing.JTextField tJumlahKue;
    private javax.swing.JTextField tKembali;
    private javax.swing.JTextField tNamaPemesan;
    private javax.swing.JTextField tNoOrder;
    private javax.swing.JTextField tTotalBayar;
    private javax.swing.JTextField tTotalHarga;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
