/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.Koneksi;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hafid
 */
public class KeranjangOrder extends javax.swing.JFrame {
 
    /**
     * Creates new form KeranjangOrder
     */
    NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
    
    public KeranjangOrder() {
        initComponents();
        
        tglSekarang();
        tTglSekarang.setVisible(false);
        
        btnKembali.setBackground(new Color(0,0,0,0));
        btnKembali.setOpaque(false);
        
        btnBayarSekarang.setBackground(new Color(0,0,0,0));
        btnBayarSekarang.setOpaque(false);
    }
    
    public void bersih() {
    
    }
    
    public void tglSekarang() {
        long waktu = System.currentTimeMillis();
        Date today = new Date(waktu);
        
        tKalender.setMinSelectableDate(today);
        tKalender.setDate(today);
        tKalender.setLocale(new Locale("id", "ID"));
        
        tTglSekarang.setMinSelectableDate(today);
        tTglSekarang.setDate(today);
        tTglSekarang.setLocale(new Locale("id", "ID"));
    }
    
    public void getDataNama() {
        try {              
            String sql = "SELECT * FROM orders ORDER BY ID_orders DESC LIMIT 1";
            Statement stat = Koneksi.GetConnection().createStatement();
            ResultSet res = stat.executeQuery(sql);
            if (res.next()) {
                tNamaPemesan.setText(res.getString("nama_pemesan"));
                tIdOrder.setText(res.getString("ID_orders"));
            } else {
                JOptionPane.showMessageDialog(rootPane, "Nama Pemesan Tidak Di Temukan");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Gagal Mengambil Data");
            System.out.println(ex);
        }
    }

    public static void addDataTabel(Object[] dataRow) {
        DefaultTableModel model = (DefaultTableModel)keranjangTabel.getModel();        
        model.addRow(dataRow);
        keranjangTabel.getColumnModel().getColumn(0).setMaxWidth(80);
        keranjangTabel.getColumnModel().getColumn(1).setMinWidth(130);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        keranjangTabel.getTableHeader().setDefaultRenderer(centerRenderer);
        keranjangTabel.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        keranjangTabel.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        keranjangTabel.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        keranjangTabel.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        keranjangTabel.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        keranjangTabel.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
    }       
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        tNamaPemesan = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tTotalHarga = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tIdOrder = new javax.swing.JLabel();
        tTglSekarang = new com.toedter.calendar.JDateChooser();
        tKalender = new com.toedter.calendar.JDateChooser();
        btnBayarSekarang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tJumlahKue = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        keranjangTabel = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel4.setLayout(null);

        tNamaPemesan.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tNamaPemesan.setForeground(new java.awt.Color(255, 255, 255));
        tNamaPemesan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(tNamaPemesan);
        tNamaPemesan.setBounds(140, 80, 160, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Pemesan :");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(60, 88, 80, 17);

        tTotalHarga.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tTotalHarga.setForeground(new java.awt.Color(255, 255, 255));
        tTotalHarga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(tTotalHarga);
        tTotalHarga.setBounds(890, 440, 150, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pilih Tanggal :");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(720, 530, 110, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Total :");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(830, 447, 50, 17);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/SignIn.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel8);
        jLabel8.setBounds(1050, 17, 32, 40);

        tIdOrder.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tIdOrder.setForeground(new java.awt.Color(255, 255, 255));
        tIdOrder.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(tIdOrder);
        tIdOrder.setBounds(320, 80, 40, 30);
        jPanel4.add(tTglSekarang);
        tTglSekarang.setBounds(843, 570, 195, 30);
        jPanel4.add(tKalender);
        tKalender.setBounds(843, 530, 195, 30);

        btnBayarSekarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBayarSekarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBayarSekarangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnBayarSekarangLayout = new javax.swing.GroupLayout(btnBayarSekarang);
        btnBayarSekarang.setLayout(btnBayarSekarangLayout);
        btnBayarSekarangLayout.setHorizontalGroup(
            btnBayarSekarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        btnBayarSekarangLayout.setVerticalGroup(
            btnBayarSekarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel4.add(btnBayarSekarang);
        btnBayarSekarang.setBounds(450, 650, 200, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btn Hapus.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel1);
        jLabel1.setBounds(60, 440, 100, 40);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnCek.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel4);
        jLabel4.setBounds(170, 440, 80, 40);

        tJumlahKue.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tJumlahKue.setForeground(new java.awt.Color(255, 255, 255));
        tJumlahKue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(tJumlahKue);
        tJumlahKue.setBounds(560, 440, 160, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Jumlah :");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(490, 447, 60, 17);
        jLabel5.getAccessibleContext().setAccessibleName("");

        btnKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKembaliMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnKembaliLayout = new javax.swing.GroupLayout(btnKembali);
        btnKembali.setLayout(btnKembaliLayout);
        btnKembaliLayout.setHorizontalGroup(
            btnKembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        btnKembaliLayout.setVerticalGroup(
            btnKembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel4.add(btnKembali);
        btnKembali.setBounds(5, 10, 60, 50);

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        keranjangTabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        keranjangTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Kue", "Nama Kue", "Diameter", "Jumlah", "Harga Satuan", "Sub Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        keranjangTabel.setRowHeight(20);
        keranjangTabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                keranjangTabelKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(keranjangTabel);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(60, 120, 980, 310);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Cart Screen.png"))); // NOI18N
        jPanel4.add(jLabel2);
        jLabel2.setBounds(0, 0, 1100, 733);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 1100, 733);

        setSize(new java.awt.Dimension(1100, 733));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseClicked
        // TODO add your handling code here:
        DashboardOrder dhOrd = new DashboardOrder();
        dhOrd.setVisible(true);
    }//GEN-LAST:event_btnKembaliMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)keranjangTabel.getModel();  
        model.removeRow(keranjangTabel.getSelectedRow());
    }//GEN-LAST:event_jLabel1MouseClicked

    int total, subTotal, subTotalHrg;
                                        
    private void btnBayarSekarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBayarSekarangMouseClicked
        // TODO add your handling code here:
        int dataKue = keranjangTabel.getModel().getRowCount();
        
        for (int i = 0; i < dataKue; i++) {
            int jmlhKue = Integer.parseInt(keranjangTabel.getValueAt(i, 3).toString());
            int hrgKue = Integer.parseInt(keranjangTabel.getValueAt(i, 4).toString());
            
            this.subTotal = jmlhKue * hrgKue;
            keranjangTabel.getModel().setValueAt(subTotal, i, 5);
        }
        
        if (tJumlahKue.getText().isEmpty() && tTotalHarga.getText().isEmpty()) {
            for (int i = 0; i < dataKue; i++) {
                int jmlhKue = Integer.parseInt(keranjangTabel.getValueAt(i, 3).toString());

                this.total = total + jmlhKue;

                int subHrgKue = Integer.parseInt(keranjangTabel.getValueAt(i, 5).toString());
                this.subTotalHrg = this.subTotalHrg + subHrgKue;
            }
            
            tTotalHarga.setText(nf.format(subTotalHrg));
            tJumlahKue.setText(Integer.toString(total));
            getDataNama();
        } else {
            String tampilan = "dd";
            SimpleDateFormat fm = new SimpleDateFormat(tampilan);
            String tanggal1 = String.valueOf(fm.format(tTglSekarang.getDate()));
            String tanggal2 = String.valueOf(fm.format(tKalender.getDate()));
            
            int tglSekarang = Integer.parseInt(tanggal1);
            int tglPilihan = Integer.parseInt(tanggal2);
            
            if(tglPilihan - tglSekarang <= 3) {
                JOptionPane.showMessageDialog(rootPane, "Mohon Pilih Tanggal Minimal 3 Hari Dari Sekarang");
            } else {
                try {
                    String format = "YYYY-MM-dd";
                    SimpleDateFormat dFM = new SimpleDateFormat(format);
                    String tanggal = String.valueOf(dFM.format(tKalender.getDate()));
                    
                    String sql1 = "UPDATE transaksi SET tgl_ambil = '"+ tanggal +"', status_pesanan = 'Dipesan' WHERE ID_orders = '"+ tIdOrder.getText() +"'";
                    Statement stat1 = Koneksi.GetConnection().createStatement();
                    stat1.execute(sql1);
                    
                    for (int i = 0; i < dataKue; i++) {
                        Object kodeKue = keranjangTabel.getValueAt(i, 0);
                        Object namaKue = keranjangTabel.getValueAt(i, 1);
                        Object diameter = keranjangTabel.getValueAt(i, 2);
                        Object qtyKue = keranjangTabel.getValueAt(i, 3);
                        Object subHrg = keranjangTabel.getValueAt(i, 5);
                        
                        String dataTransaksi = "SELECT MAX(ID_transaksi), kode_sub_produk FROM transaksi, detail_produk "
                                             + "WHERE detail_produk.nama_produk = '"+ namaKue +"' AND detail_produk.ukuran = '"+ diameter +"'";
                        Statement stat2 = Koneksi.GetConnection().createStatement();
                        ResultSet res = stat2.executeQuery(dataTransaksi);
                        if (res.next()) {
                            String sqlDetailTransaksi = "INSERT INTO detail_transaksi (ID_transaksi, kode_produk, kode_sub_produk, total_kue, harga_total) "
                                    + "VALUES ('"+ res.getString("MAX(ID_transaksi)") +"', '"+ kodeKue +"', '"+ res.getString("kode_sub_produk") +"', '"+ qtyKue +"', '"+ subHrg +"')";
                            Statement stat3 = Koneksi.GetConnection().createStatement();
                            stat3.execute(sqlDetailTransaksi);
                        }
                    }
                    
                    JOptionPane.showMessageDialog(rootPane, "Data Pesanan Berhasil Di Simpan");
                    new CetakNoOrder().setVisible(true);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, "Data Pesanan Gagal Di Simpan");
                    System.out.println(ex);
                }
            }
        }
        getDataNama();
    }//GEN-LAST:event_btnBayarSekarangMouseClicked

    private void keranjangTabelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keranjangTabelKeyReleased
        // TODO add your handling code here:
        int i = keranjangTabel.getSelectedRow();
        TableModel tb = keranjangTabel.getModel();
        
        int qtyKue = Integer.parseInt(tb.getValueAt(i, 3).toString());
        int hrgKue = Integer.parseInt(tb.getValueAt(i, 4).toString());
        this.subTotal = qtyKue * hrgKue;
       
        keranjangTabel.getModel().setValueAt(subTotal, i, 5);
    }//GEN-LAST:event_keranjangTabelKeyReleased

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        int dataKue = keranjangTabel.getModel().getRowCount();
        
        for (int i = 0; i < dataKue; i++) {
            int jmlhKue = Integer.parseInt(keranjangTabel.getValueAt(i, 3).toString());
            int hrgKue = Integer.parseInt(keranjangTabel.getValueAt(i, 4).toString());
            
            this.subTotal = jmlhKue * hrgKue;
            keranjangTabel.getModel().setValueAt(subTotal, i, 5);
        }
        
        if (!tJumlahKue.getText().isEmpty() && !tTotalHarga.getText().isEmpty()) {
            tJumlahKue.setText("");
            tTotalHarga.setText("");
            total = 0;
            subTotalHrg = 0;
            getDataNama();
        } else {
            for (int i = 0; i < dataKue; i++) {
                int jmlhKue = Integer.parseInt(keranjangTabel.getValueAt(i, 3).toString());

                this.total = total + jmlhKue;

                int subHrgKue = Integer.parseInt(keranjangTabel.getValueAt(i, 5).toString());
                this.subTotalHrg = subTotalHrg + subHrgKue;
            }
            
            tTotalHarga.setText(nf.format(subTotalHrg));
            tJumlahKue.setText(Integer.toString(total));
            getDataNama();
        }
        getDataNama();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        Login_Screen login = new Login_Screen();
        login.setVisible(true); 
        
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked
       
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
            java.util.logging.Logger.getLogger(KeranjangOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KeranjangOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KeranjangOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KeranjangOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KeranjangOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBayarSekarang;
    private javax.swing.JPanel btnKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable keranjangTabel;
    private javax.swing.JLabel tIdOrder;
    private javax.swing.JLabel tJumlahKue;
    private com.toedter.calendar.JDateChooser tKalender;
    private javax.swing.JLabel tNamaPemesan;
    private com.toedter.calendar.JDateChooser tTglSekarang;
    private javax.swing.JLabel tTotalHarga;
    // End of variables declaration//GEN-END:variables
}
