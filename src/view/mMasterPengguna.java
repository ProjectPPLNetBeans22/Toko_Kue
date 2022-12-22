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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hafid
 */
public class mMasterPengguna extends javax.swing.JInternalFrame {

    /**
     * Creates new form mMasterPengguna
     */
    public mMasterPengguna() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        
        tIdPegawai.setVisible(false);
        tIdJabatan.setVisible(false);
        
        btnSimpan.setBackground(new Color(0,0,0,0));
        btnSimpan.setOpaque(false);
        
        btnEdit.setBackground(new Color(0,0,0,0));
        btnEdit.setOpaque(false);
        
        btnHapus.setBackground(new Color(0,0,0,0));
        btnHapus.setOpaque(false);
        
        dataCombo();
        dataTable();
        
        btnEdit.setEnabled(false);
        btnHapus.setEnabled(false);
    }
    
    public void dataCombo() {
        try {
            String sql = "SELECT * FROM jabatan";
            Statement stat = Koneksi.GetConnection().createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next()) {
                combo.addItem(res.getString(2));
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
     public void dataTable() {
        DefaultTableModel tbl = new DefaultTableModel(){
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };
        
        tbl.addColumn("ID Pegawai");
        tbl.addColumn("Nama");
        tbl.addColumn("Email");
        tbl.addColumn("Jabatan");
        tbl.addColumn("Hobi");
        tabel.setModel(tbl);
        
        try {
            String sql = "SELECT * FROM pegawai, jabatan WHERE pegawai.jabatan = jabatan.ID_jabatan ORDER BY pegawai.ID_pegawai ASC";
            Statement stat = Koneksi.GetConnection().createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("pegawai.ID_pegawai"),
                    res.getString("pegawai.nama_pegawai"),
                    res.getString("pegawai.email_pegawai"),
                    res.getString("jabatan.nama_jabatan"),
                    res.getString("pegawai.hobi"),
                });
                tabel.setModel(tbl);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Data Gagal Diambil");
            System.out.println(ex);
        }
    }

    public void bersih() {
        tNama.setText("");
        tEmail.setText("");
        tPassword.setText("");
        combo.setSelectedIndex(0);
        tHobi.setText("");
        tCari.setText("");
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
        btnHapus = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JPanel();
        btnEdit = new javax.swing.JPanel();
        tHobi = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        tEmail = new javax.swing.JTextField();
        tPassword = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox<>();
        tIdPegawai = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tCari = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tIdJabatan = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(845, 690));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(845, 690));
        jPanel2.setPreferredSize(new java.awt.Dimension(845, 690));
        jPanel2.setLayout(null);

        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus.setEnabled(false);
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnHapusLayout = new javax.swing.GroupLayout(btnHapus);
        btnHapus.setLayout(btnHapusLayout);
        btnHapusLayout.setHorizontalGroup(
            btnHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        btnHapusLayout.setVerticalGroup(
            btnHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jPanel2.add(btnHapus);
        btnHapus.setBounds(412, 329, 100, 31);

        btnSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSimpanLayout = new javax.swing.GroupLayout(btnSimpan);
        btnSimpan.setLayout(btnSimpanLayout);
        btnSimpanLayout.setHorizontalGroup(
            btnSimpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        btnSimpanLayout.setVerticalGroup(
            btnSimpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jPanel2.add(btnSimpan);
        btnSimpan.setBounds(188, 331, 100, 31);

        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.setEnabled(false);
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnEditLayout = new javax.swing.GroupLayout(btnEdit);
        btnEdit.setLayout(btnEditLayout);
        btnEditLayout.setHorizontalGroup(
            btnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        btnEditLayout.setVerticalGroup(
            btnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jPanel2.add(btnEdit);
        btnEdit.setBounds(310, 331, 80, 31);

        tHobi.setBackground(new java.awt.Color(248, 248, 245));
        tHobi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tHobi.setBorder(null);
        jPanel2.add(tHobi);
        tHobi.setBounds(190, 266, 162, 28);

        tNama.setBackground(new java.awt.Color(248, 248, 245));
        tNama.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tNama.setBorder(null);
        jPanel2.add(tNama);
        tNama.setBounds(190, 98, 222, 28);

        tEmail.setBackground(new java.awt.Color(248, 248, 245));
        tEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tEmail.setBorder(null);
        jPanel2.add(tEmail);
        tEmail.setBounds(190, 140, 180, 28);

        tPassword.setBackground(new java.awt.Color(248, 248, 245));
        tPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tPassword.setToolTipText("");
        tPassword.setBorder(null);
        jPanel2.add(tPassword);
        tPassword.setBounds(190, 185, 180, 28);

        combo.setBackground(new java.awt.Color(204, 204, 204));
        combo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Jabatan -" }));
        combo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        jPanel2.add(combo);
        combo.setBounds(185, 224, 195, 30);
        jPanel2.add(tIdPegawai);
        tIdPegawai.setBounds(440, 97, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Form Pengguna.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(65, 43, 450, 320);

        tCari.setBackground(new java.awt.Color(248, 248, 245));
        tCari.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tCariKeyReleased(evt);
            }
        });
        jPanel2.add(tCari);
        tCari.setBounds(593, 400, 170, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Cari :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(550, 400, 31, 30);
        jPanel2.add(tIdJabatan);
        tIdJabatan.setBounds(400, 225, 80, 30);

        jScrollPane2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        )
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
    );
    tabel.setRowHeight(20);
    tabel.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tabelMouseClicked(evt);
        }
    });
    jScrollPane2.setViewportView(tabel);

    jPanel2.add(jScrollPane2);
    jScrollPane2.setBounds(65, 450, 700, 190);

    getContentPane().add(jPanel2);
    jPanel2.setBounds(0, 0, 845, 690);

    setBounds(0, 0, 851, 724);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseClicked
        // TODO add your handling code here:
        if (tNama.getText().isEmpty() || tEmail.getText().isEmpty() || tPassword.getText().isEmpty() 
            || combo.getSelectedIndex() == 0 || tHobi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Mohon Isi Seluruh Form Data Pegawai!");
        } else if (!tEmail.getText().contains("@gmail.com")) {
            JOptionPane.showMessageDialog(rootPane, "Mohon Pastikan Email Mengandung @gmail.com");
        } else {
            try {
                String sql = "INSERT INTO pegawai (nama_pegawai, email_pegawai, password_pegawai, jabatan, hobi) "
                             + "VALUES ('"+ tNama.getText() +"', '"+ tEmail.getText() +"', '"+ tPassword.getText() +"',"
                             + "'"+ tIdJabatan.getText() +"', '"+ tHobi.getText() +"')";
                Statement stat = Koneksi.GetConnection().createStatement();
                stat.execute(sql);
                JOptionPane.showMessageDialog(rootPane, "Data Pegawai Berhasil Di Tambahkan!");
                bersih();
                dataTable();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Data Pegawai Gagal Di Tambahkan!");
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_btnSimpanMouseClicked

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "SELECT * FROM jabatan WHERE jabatan.nama_jabatan = '"+ combo.getSelectedItem() +"'";
            Statement stat = Koneksi.GetConnection().createStatement();
            ResultSet res = stat.executeQuery(sql);
            if (res.next()) {
                tIdJabatan.setText(res.getString("jabatan.ID_jabatan"));
            } else {
                tIdJabatan.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_comboActionPerformed

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        // TODO add your handling code here:
        if (tNama.getText().isEmpty() || tEmail.getText().isEmpty() || combo.getSelectedIndex() == 0 || tHobi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Mohon Isi Seluruh Form Data Pegawai!");
        } else {
            if (tPassword.getText().isEmpty()) {
                try {
                    String sqll = "SELECT * FROM pegawai WHERE ID_pegawai = '"+ tIdPegawai.getText() +"'";
                    Statement stat = Koneksi.GetConnection().createStatement();
                    ResultSet res = stat.executeQuery(sqll);
                        if (res.next()) {
                            try {
                                String sql = "UPDATE pegawai SET nama_pegawai = '"+ tNama.getText() +"', "
                                             + "email_pegawai = '"+ tEmail.getText() +"', password_pegawai = '"+ res.getString("password_pegawai") +"',"
                                             + "jabatan = '"+ tIdJabatan.getText() +"', hobi = '"+ tHobi.getText() +"' WHERE ID_pegawai = '"+ tIdPegawai.getText() +"'";
                                stat.execute(sql);
                                JOptionPane.showMessageDialog(rootPane, "Data Pegawai Berhasil Di Ubah!");
                                bersih();
                                dataTable();
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(rootPane, "Data Pegawai Gagal Di Ubah!");
                                System.out.println(ex);
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Password Pegawai Tidak Di Temukan");
                        }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, "Data Gagal Diambil");
                    System.out.println(ex);
                }
            } else {
                try {
                    String sql = "UPDATE pegawai SET nama_pegawai = '"+ tNama.getText() +"', "
                                 + "email_pegawai = '"+ tEmail.getText() +"', password_pegawai = '"+ tPassword.getText() +"',"
                                 + "jabatan = '"+ tIdJabatan.getText() +"', hobi = '"+ tHobi.getText() +"' WHERE ID_pegawai = '"+ tIdPegawai.getText() +"'";
                    Statement stat = Koneksi.GetConnection().createStatement();
                    stat.execute(sql);
                    JOptionPane.showMessageDialog(rootPane, "Data Pegawai Berhasil Di Ubah!");
                    bersih();
                    dataTable();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, "Data Pegawai Gagal Di Ubah!");
                    System.out.println(ex);
                } 
            }   
        }
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        // TODO add your handling code here:
         if (tNama.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Mohon Pilih Data Pegawai!");
        } else {
            try {
                String sql = "DELETE FROM pegawai WHERE ID_pegawai = '"+ tIdPegawai.getText() +"'";
                Statement stat = Koneksi.GetConnection().createStatement();
                stat.execute(sql);
                JOptionPane.showMessageDialog(rootPane, "Data Pegawai Berhasil Di Hapus!");
                bersih();
                dataTable();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Data Pegawai Gagal Di Hapus!");
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_btnHapusMouseClicked

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        int i = tabel.getSelectedRow();
        TableModel tb = tabel.getModel();

        String data1 = tb.getValueAt(i, 0).toString();
        String data2 = tb.getValueAt(i, 1).toString();
        String data3 = tb.getValueAt(i, 2).toString();
        String data4 = tb.getValueAt(i, 3).toString();
        String data5 = tb.getValueAt(i, 4).toString();


        tIdPegawai.setText(data1);
        tNama.setText(data2);
        tEmail.setText(data3);
        combo.setSelectedItem(data4);
        tHobi.setText(data5);
    }//GEN-LAST:event_tabelMouseClicked

    private void tCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCariKeyReleased
        // TODO add your handling code here:
        DefaultTableModel tbl = new DefaultTableModel(){
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };
        
        tbl.addColumn("ID Pegawai");
        tbl.addColumn("Nama");
        tbl.addColumn("Email");
        tbl.addColumn("Jabatan");
        tbl.addColumn("Hobi");
        tabel.setModel(tbl);
        
        try {
            String sql = "SELECT * FROM pegawai, jabatan WHERE pegawai.jabatan = jabatan.ID_jabatan "
                         + "AND pegawai.ID_pegawai LIKE '%"+ tCari.getText() +"%' ORDER BY pegawai.ID_pegawai ASC";
            Statement stat = Koneksi.GetConnection().createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("pegawai.ID_pegawai"),
                    res.getString("pegawai.nama_pegawai"),
                    res.getString("pegawai.email_pegawai"),
                    res.getString("jabatan.nama_jabatan"),
                    res.getString("pegawai.hobi"),
                });
                tabel.setModel(tbl);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Data Gagal Diambil");
            System.out.println(ex);
        }
    }//GEN-LAST:event_tCariKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnEdit;
    private javax.swing.JPanel btnHapus;
    private javax.swing.JPanel btnSimpan;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tCari;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tHobi;
    private javax.swing.JLabel tIdJabatan;
    private javax.swing.JLabel tIdPegawai;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tPassword;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
