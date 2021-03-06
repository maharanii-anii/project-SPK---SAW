/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAW;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Hasil extends javax.swing.JFrame {
    
    DefaultTableModel tabelDatakaryawan;
    DefaultTableModel tabelNormalisasi;
    DefaultTableModel tabelPeringkat;
    
    koneksi con= new koneksi();

    /**
     * Creates new form ProsesData
     */
    public Hasil() {
        initComponents();
        setLocationRelativeTo(this);
        tabelModelkaryawan();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_karyawan = new javax.swing.JTable();
        btn_peringkat = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel_peringkat = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_normalisasi = new javax.swing.JTable();
        btn_normalisasi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_kesimpulan = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DAFTAR ALTERNATIF");

        tabel_karyawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NAMA", "C1", "C2", "C3", "C4", "C5"
            }
        ));
        jScrollPane1.setViewportView(tabel_karyawan);

        btn_peringkat.setText("Tentukan Peringkat");
        btn_peringkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_peringkatActionPerformed(evt);
            }
        });

        tabel_peringkat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nama", "Nilai"
            }
        ));
        jScrollPane3.setViewportView(tabel_peringkat);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TABEL PERINGKAT");

        tabel_normalisasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "C1", "C2", "C3", "C4", "C5"
            }
        ));
        jScrollPane2.setViewportView(tabel_normalisasi);

        btn_normalisasi.setText("Normalisasikan");
        btn_normalisasi.setMaximumSize(new java.awt.Dimension(125, 23));
        btn_normalisasi.setMinimumSize(new java.awt.Dimension(125, 23));
        btn_normalisasi.setPreferredSize(new java.awt.Dimension(125, 23));
        btn_normalisasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_normalisasiMouseClicked(evt);
            }
        });
        btn_normalisasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_normalisasiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TABEL NORMALISASI");

        btn_kesimpulan.setText("KESIMPULAN");
        btn_kesimpulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kesimpulanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(72, 72, 72))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(btn_normalisasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 58, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_kesimpulan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_peringkat)
                                .addGap(71, 71, 71))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_peringkat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_kesimpulan, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_normalisasi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Home");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Kriteria");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Alternatif");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Hasil");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_peringkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_peringkatActionPerformed
        // TODO add your handling code here:
        cariperingkat();
    }//GEN-LAST:event_btn_peringkatActionPerformed

    private void btn_normalisasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_normalisasiActionPerformed
        // TODO add your handling code here:
        normalisasi();
    }//GEN-LAST:event_btn_normalisasiActionPerformed

    private void btn_kesimpulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kesimpulanActionPerformed
        // TODO add your handling code here:
        kesimpulan kesimpulan_ = new kesimpulan();
        kesimpulan_.setVisible(true);
    }//GEN-LAST:event_btn_kesimpulanActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Home Home = new Home();
        Home.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        Kriteria Kriteria = new Kriteria();
        Kriteria.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        Alternatif Alternatif = new Alternatif();
        Alternatif.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked

    }//GEN-LAST:event_jMenu4MouseClicked

    private void btn_normalisasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_normalisasiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_normalisasiMouseClicked
    
    public void tabelModelkaryawan(){
       tabelDatakaryawan = new DefaultTableModel();
       tabelDatakaryawan.addColumn("Nama");
       tabelDatakaryawan.addColumn("Pendidikan");
       tabelDatakaryawan.addColumn("Pengalaman Kerja");
       tabelDatakaryawan.addColumn("Wawancara");
       tabelDatakaryawan.addColumn("Usia");
       tabelDatakaryawan.addColumn("Status");
       tabel_karyawan.setModel(tabelDatakaryawan);
        try {
         ResultSet res = con.ambilData("SELECT * FROM tbl_alternatif ");
        while (res.next()){
                    tabelDatakaryawan.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6) });
                } 
      
        tabel_karyawan.setModel(tabelDatakaryawan);
          } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, ex);
        }   
     }
    
    public void tabelModelNormalisasi(){
       tabelNormalisasi = new DefaultTableModel();
       tabelNormalisasi.addColumn("Nama");
       tabelNormalisasi.addColumn("Pendidikan");
       tabelNormalisasi.addColumn("Pengalaman Kerja");
       tabelNormalisasi.addColumn("Wawancara");
       tabelNormalisasi.addColumn("Usia");
       tabelNormalisasi.addColumn("Status");
       
       tabel_normalisasi.setModel(tabelNormalisasi);
    }
    
    public void tabelmodelPeringkat(){
        try {
            tabelPeringkat = new DefaultTableModel();
            tabelPeringkat.addColumn("Nama");
            tabelPeringkat.addColumn("Nilai");
            
            tabel_peringkat.setModel(tabelPeringkat);
            ResultSet res = con.ambilData("SELECT * FROM tbl_peringkat ORDER BY nilai desc");
             while (res.next()){
                         tabelPeringkat.addRow(new Object[]{res.getString(1),res.getString(2)}); 
                     }
        } catch (SQLException ex) {
            Logger.getLogger(Hasil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cariperingkat(){
        try{
            LinkedList mm = new LinkedList();
            ResultSet res3 = con.ambilData("SELECT * FROM tbl_bobot");
            tabelmodelPeringkat();
            while (res3.next()){
                 mm.add(res3.getString(1));
                 mm.add(res3.getString(2));
                 mm.add(res3.getString(3));
                 mm.add(res3.getString(4));
                 mm.add(res3.getString(5));
            }
            for (int t = 0; t < tabel_normalisasi.getRowCount(); t++) {
                String sql = "DELETE FROM tbl_peringkat WHERE Nama = Nama";
                con.simpanData(sql);
            }
            for (int x = 0; x < tabel_normalisasi.getRowCount(); x++){
                double r1;
                double r2;
                double r3;
                double r4;
                double r5;
                double w;
                
                r1 = (Float.valueOf(tabel_normalisasi.getValueAt(x, 1).toString())*Float.valueOf(mm.get(0).toString()));
                r2=(Float.valueOf(tabel_normalisasi.getValueAt(x, 2).toString())*Float.valueOf(mm.get(1).toString()));
                r3=(Float.valueOf(tabel_normalisasi.getValueAt(x, 3).toString())*Float.valueOf(mm.get(2).toString()));
                r4=(Float.valueOf(tabel_normalisasi.getValueAt(x, 4).toString())*Float.valueOf(mm.get(3).toString()));
                r5=(Float.valueOf(tabel_normalisasi.getValueAt(x, 5).toString())*Float.valueOf(mm.get(4).toString()));
                w=r1+r2+r3+r4+r5;
                
                String sql = "insert into tbl_peringkat  values"+"(  '"+tabel_normalisasi.getValueAt(x, 0).toString()+"' , "+" '"+w+"' )";
                con.simpanData(sql);
            }
            tabelModelNormalisasi();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    
    public  void normalisasi(){
        LinkedList max = new LinkedList();
        LinkedList mm = new LinkedList();
        
        try{
            ResultSet res = con.ambilData("select max(C1),"+ 
                "max(C2), "+
                "max(C3), "+
                "max(C4), "+
                "max(C5)"+  
                "from "+"tbl_alternatif ");
            
            while (res.next()){
                max.add(res.getString(1));
                max.add(res.getString(2));
                max.add(res.getString(3));
                max.add(res.getString(4));
                max.add(res.getString(5));
            }
            ResultSet res2 = con.ambilData("select *"+"from "+"tbl_alternatif");
            tabelModelNormalisasi();
            
            while (res2.next()){
                tabelNormalisasi.addRow(new Object[]{res2.getString(1),
                    (res2.getFloat (2)/Float.valueOf(max.get(0).toString())),
                    (res2.getFloat(3)/Float.valueOf(max.get(1).toString())),
                    (res2.getFloat(4)/Float.valueOf(max.get(2).toString())),
                    (res2.getFloat(5)/Float.valueOf(max.get(3).toString())),
                    (res2.getFloat(6)/Float.valueOf(max.get(4).toString())),
                    (Float.valueOf(max.get(4).toString())/res2.getFloat(6))});
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    
    public boolean isCellEditable(int row, int column){
        return false;//This causes all cells to be not editable
    }
    
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
            java.util.logging.Logger.getLogger(Hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hasil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kesimpulan;
    private javax.swing.JButton btn_normalisasi;
    private javax.swing.JButton btn_peringkat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabel_karyawan;
    private javax.swing.JTable tabel_normalisasi;
    private javax.swing.JTable tabel_peringkat;
    // End of variables declaration//GEN-END:variables
}