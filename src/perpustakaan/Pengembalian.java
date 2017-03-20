package perpustakaan;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Pengembalian extends javax.swing.JFrame
{
    public Pengembalian()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        noanggota = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatpeminjam = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        namapeminjam = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tanggalkembali = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        tanggalpinjam = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        judulbuku = new javax.swing.JTextField();
        denda = new javax.swing.JTextField();
        belumkembali = new javax.swing.JRadioButton();
        kembali = new javax.swing.JRadioButton();
        umum = new javax.swing.JRadioButton();
        pelajaran = new javax.swing.JRadioButton();
        novel = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        print = new javax.swing.JButton();
        save = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Freehand521 BT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Perpustakaan Ainnaya");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 570, 50));

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buka setiap hari dari jam 8 am-22 pm");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("_________________________________________________");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 260, -1));

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("_______________________________________");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 260, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 120));

        jPanel2.setBackground(new java.awt.Color(0, 204, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 153, 153)));
        jPanel2.setForeground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data Pengembalian Buku");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Status:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("No Anggota:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        noanggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noanggotaActionPerformed(evt);
            }
        });
        jPanel2.add(noanggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 240, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nama Peminjam:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        alamatpeminjam.setColumns(20);
        alamatpeminjam.setRows(5);
        jScrollPane1.setViewportView(alamatpeminjam);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 240, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Alamat Peminjam:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Jenis Buku:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        namapeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namapeminjamActionPerformed(evt);
            }
        });
        jPanel2.add(namapeminjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 240, 30));

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("_______________________________________");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 260, -1));
        jPanel2.add(tanggalkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 400, 110, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Judul Buku:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        jPanel2.add(tanggalpinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 110, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tanggal Pinjam dan Kembali:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Denda:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        judulbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judulbukuActionPerformed(evt);
            }
        });
        jPanel2.add(judulbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 240, 30));

        denda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dendaActionPerformed(evt);
            }
        });
        jPanel2.add(denda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 240, 30));

        belumkembali.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(belumkembali);
        belumkembali.setForeground(new java.awt.Color(255, 255, 255));
        belumkembali.setText("Belum Kembali");
        jPanel2.add(belumkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, -1, 30));

        kembali.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(kembali);
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setText("Kembali");
        jPanel2.add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, 30));

        umum.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup2.add(umum);
        umum.setForeground(new java.awt.Color(255, 255, 255));
        umum.setText("Pengetahuan Umum");
        jPanel2.add(umum, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        pelajaran.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup2.add(pelajaran);
        pelajaran.setForeground(new java.awt.Color(255, 255, 255));
        pelajaran.setText("Pelajaran");
        jPanel2.add(pelajaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        novel.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup2.add(novel);
        novel.setForeground(new java.awt.Color(255, 255, 255));
        novel.setText("Novel");
        jPanel2.add(novel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 290, 570));

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 153, 153)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        print.setBackground(new java.awt.Color(0, 204, 204));
        print.setFont(new java.awt.Font("Aharoni", 0, 11)); // NOI18N
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel3.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, 30));

        save.setBackground(new java.awt.Color(0, 204, 204));
        save.setFont(new java.awt.Font("Aharoni", 0, 11)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel3.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        clear.setBackground(new java.awt.Color(0, 204, 204));
        clear.setFont(new java.awt.Font("Aharoni", 0, 11)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel3.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 30));

        delete.setBackground(new java.awt.Color(0, 204, 204));
        delete.setFont(new java.awt.Font("Aharoni", 0, 11)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, 30));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 610, 50));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NoAnggota", "NamaPeminjam", "Alamatpeminjam", "JenisBuku", "JudulBuku", "TanggalPinjam", "TanggalKembali", "Denda", "Status"
            }
        ));
        jScrollPane2.setViewportView(tabel);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 590, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 650, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noanggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noanggotaActionPerformed

    }//GEN-LAST:event_noanggotaActionPerformed

    private void namapeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namapeminjamActionPerformed

    }//GEN-LAST:event_namapeminjamActionPerformed

    private void judulbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judulbukuActionPerformed

    }//GEN-LAST:event_judulbukuActionPerformed

    private void dendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dendaActionPerformed

    }//GEN-LAST:event_dendaActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        MessageFormat header = new MessageFormat("Data Pengembalian Buku Di Perpustakaan Ainnaya");
        MessageFormat footer = new MessageFormat("Page (0,number,integer)       ");
        try
        {
            tabel.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        }
        catch (java.awt.print.PrinterException e)
        {
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_printActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
    String tanggal1 = dateFormat.format(tanggalpinjam.getDate());
    String tanggal2 = dateFormat.format(tanggalkembali.getDate());
    String statuspinjam = "";
        if (kembali.isSelected()){
            statuspinjam = "kembali";}
        else{
            statuspinjam = "belumkembali";} 
    String jenisbuku = "";
        if (pelajaran.isSelected()){
            jenisbuku = "pelajaran";}
        else{
            jenisbuku = "pengetahuan umum";} 
            
        if (noanggota.getText().equals("") ||
            namapeminjam.getText().equals("") ||
            alamatpeminjam.getText().equals("") ||
            jenisbuku.equals("") ||
            judulbuku.getText().equals("") ||
            tanggal1.equals("") ||
            tanggal2.equals("") ||
            denda.getText().equals("") ||
            statuspinjam.equals(""))
            {
                JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
            }
        else
        {
            String SQL = "INSERT INTO t_pengembalian (NoAnggota,NamaPeminjam,AlamatPeminjam,JenisBuku,JudulBuku,TanggalPinjam,TanggalKembali,Denda,Status) "
                    + "VALUES('"+noanggota.getText()
                    +"','"+namapeminjam.getText()
                    +"',"+alamatpeminjam.getText()
                    +"','"+jenisbuku
                    +"',"+judulbuku.getText()
                    +"','"+tanggal1
                    +"','"+tanggal2
                    +"',"+denda.getText()
                    +"','"+statuspinjam
                    +"')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1)
            {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan","Sukses",JOptionPane.WARNING_MESSAGE);
                selectData();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan","Sukses",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_saveActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        noanggota.setText("");
        namapeminjam.setText("");
        alamatpeminjam.setText("");
        buttonGroup2.clearSelection();
        judulbuku.setText("");
        
        
        denda.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_clearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int baris = tabel.getSelectedRow();
        if (baris != -1)
        {
            String NoAnggota = tabel.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM t_pengembalian WHERE NoAnggota='"+NoAnggota+"'";
            int status = KoneksiDB.execute(SQL);
            if (status==1)
            {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatpeminjam;
    private javax.swing.JRadioButton belumkembali;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JTextField denda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField judulbuku;
    private javax.swing.JRadioButton kembali;
    private javax.swing.JTextField namapeminjam;
    private javax.swing.JTextField noanggota;
    private javax.swing.JRadioButton novel;
    private javax.swing.JRadioButton pelajaran;
    private javax.swing.JButton print;
    private javax.swing.JButton save;
    private javax.swing.JTable tabel;
    private com.toedter.calendar.JDateChooser tanggalkembali;
    private com.toedter.calendar.JDateChooser tanggalpinjam;
    private javax.swing.JRadioButton umum;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"NoAnggota","NamaPeminjam","AlamatPeminjam","JenisBuku","JudulBuku","TanggalPinjam","TanggalKembali","Denda","Status"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM t_pengembalian";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try
        {
            while (rs.next())
            {
                String NoAnggota = rs.getString(1);
                String NamaPeminjam = rs.getString(2);
                String AlamatPeminjam = rs.getString(3);
                String JenisBuku = "";
                if ("pelajaran".equals(rs.getString(4))){
                    JenisBuku = "pelajaran";}
                else{
                    JenisBuku = "pengetahuan umum";
                    }
                String JudulBuku = rs.getString(6);
                String TanggalPinjam = rs.getString(7);
                String TanggalKembali = rs.getString(8);
                String Denda = rs.getString(8);
                String Status = rs.getString(8);
                String data[] = {NoAnggota,NamaPeminjam,AlamatPeminjam,JenisBuku,JudulBuku,TanggalPinjam,TanggalKembali,Denda,Status};
                dtm.addRow(data);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }
    tabel.setModel(dtm);
    }
}
