/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop.pict;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class equipment extends javax.swing.JFrame {
int vip,ekonomi,harga,hari,total,bayar,kembali;
    /**
     * Creates new form Kucing
     */
    public equipment() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pelayanan = new javax.swing.JComboBox();
        rbvip = new javax.swing.JRadioButton();
        rbekonomi = new javax.swing.JRadioButton();
        txtharga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtpemilik = new javax.swing.JTextField();
        txthp = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txtjumlah = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        txtbayar = new javax.swing.JTextField();
        txtkembali = new javax.swing.JTextField();
        btninput = new javax.swing.JButton();
        btncetak = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tekton Pro Cond", 1, 48)); // NOI18N
        jLabel1.setText("Jungle  Petshop");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel2.setText("Toys");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petshop/pict/icons8-black-cat-100.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petshop/pict/icons8-black-cat-100.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 90, 100));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Data Pelayanan"));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Jenis Mainan");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Jenis Ukuran");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Harga");

        pelayanan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Boneka Burung", "Tikus Mainan", "Mainan Pancing", "Kupu Kupu elektrik", "Mainan Bentuk Bulu", "Rainbow Kitten Ball" }));
        pelayanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pelayananActionPerformed(evt);
            }
        });

        rbvip.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbvip.setText("Besar");
        rbvip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbvipActionPerformed(evt);
            }
        });

        rbekonomi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbekonomi.setText("Kecil");
        rbekonomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbekonomiActionPerformed(evt);
            }
        });

        txtharga.setBackground(new java.awt.Color(255, 204, 204));
        txtharga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtharga)
                    .addComponent(rbvip)
                    .addComponent(pelayanan, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbekonomi))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pelayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbvip))
                .addGap(4, 4, 4)
                .addComponent(rbekonomi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, 300, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Nama Pembeli");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Nomor Handphone");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 91, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Alamat");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 129, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Jumlah Barang");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 164, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Total Bayar");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 199, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Uang Bayar");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 234, 80, 14));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Uang Kembali");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 271, -1, -1));

        txtpemilik.setBackground(new java.awt.Color(255, 204, 204));
        txtpemilik.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(txtpemilik, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 250, -1));

        txthp.setBackground(new java.awt.Color(255, 204, 204));
        txthp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(txthp, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 90, 250, -1));

        txtalamat.setBackground(new java.awt.Color(255, 204, 204));
        txtalamat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 128, 250, -1));

        txtjumlah.setBackground(new java.awt.Color(255, 204, 204));
        txtjumlah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahActionPerformed(evt);
            }
        });
        txtjumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtjumlahKeyReleased(evt);
            }
        });
        jPanel3.add(txtjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 163, 250, -1));

        txttotal.setBackground(new java.awt.Color(255, 204, 204));
        txttotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });
        jPanel3.add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 198, 250, -1));

        txtbayar.setBackground(new java.awt.Color(255, 204, 204));
        txtbayar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtbayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbayarKeyReleased(evt);
            }
        });
        jPanel3.add(txtbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 232, 250, -1));

        txtkembali.setBackground(new java.awt.Color(255, 204, 204));
        txtkembali.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(txtkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 270, 250, -1));

        btninput.setBackground(new java.awt.Color(153, 153, 255));
        btninput.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        btninput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petshop/pict/icons8-delete-30.png"))); // NOI18N
        btninput.setText("Hapus");
        btninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputActionPerformed(evt);
            }
        });
        jPanel3.add(btninput, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        btncetak.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        btncetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petshop/pict/icons8-cat-footprint-30.png"))); // NOI18N
        btncetak.setText("Cetak");
        btncetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetakActionPerformed(evt);
            }
        });
        jPanel3.add(btncetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        btnkeluar.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        btnkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petshop/pict/icons8-exit-sign-30.png"))); // NOI18N
        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        jPanel3.add(btnkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, -1, -1));

        txtarea.setBackground(new java.awt.Color(255, 204, 204));
        txtarea.setColumns(20);
        txtarea.setRows(5);
        txtarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setViewportView(txtarea);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 300, 174));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pelayananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pelayananActionPerformed
        // TODO add your handling code here:
        if(pelayanan.getSelectedItem().equals("Pilih Pelayanan")){
            buttonGroup1.clearSelection();
            txtharga.setText("");
        }
        else if(pelayanan.getSelectedItem().equals("Boneka Burung")){
            vip=70000;
            ekonomi=35000;
        }
        else if(pelayanan.getSelectedItem().equals("Tikus Mainan")){
            vip=50000;
            ekonomi=25000;
        }
        else if(pelayanan.getSelectedItem().equals("Mainan Pancing")){
            vip=20000;
            ekonomi=10000;
        }
        else if(pelayanan.getSelectedItem().equals("Kupu Kupu Elektrik")){
            vip=100000;
            ekonomi=50000;
        }
        else if(pelayanan.getSelectedItem().equals("Mainan Bentuk Bulu")){
            vip=30000;
            ekonomi=15000;
        }
        else if(pelayanan.getSelectedItem().equals("Rainbow Kitten Ball")){
            vip=80000;
            ekonomi=40000;
        }
    }//GEN-LAST:event_pelayananActionPerformed

    private void rbvipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbvipActionPerformed
        // TODO add your handling code here:
        if(rbvip.isSelected()){
            txtharga.setText(String.valueOf(vip));
        }
    }//GEN-LAST:event_rbvipActionPerformed

    private void rbekonomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbekonomiActionPerformed
        // TODO add your handling code here:
        if(rbekonomi.isSelected()){
            txtharga.setText(String.valueOf(ekonomi));
        }
    }//GEN-LAST:event_rbekonomiActionPerformed

    private void txtjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahActionPerformed
        // TODO add your handling code here:
        hari=Integer.parseInt(txtjumlah.getText());
        harga=Integer.parseInt(txtharga.getText());
        total=bayar*harga;
        txttotal.setText(String.valueOf(total));
    }//GEN-LAST:event_txtjumlahActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
        bayar=Integer.parseInt(txtbayar.getText());
        kembali=Integer.parseInt(txttotal.getText());
        total=bayar-kembali;
        txtkembali.setText(String.valueOf(total));                                      
    }//GEN-LAST:event_txttotalActionPerformed

    private void txtjumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlahKeyReleased
        // TODO add your handling code here:
        int a,b,c;
        a=Integer.valueOf(txtharga.getText());
        b=Integer.valueOf(txtjumlah.getText());
        c=a*b;
        txttotal.setText(""+c);
    }//GEN-LAST:event_txtjumlahKeyReleased

    private void txtbayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbayarKeyReleased
        // TODO add your handling code here:
        int a,b,c;
        a=Integer.valueOf(txtbayar.getText());
        b=Integer.valueOf(txttotal.getText());
        c=a-b;
        txtkembali.setText(""+c);
    }//GEN-LAST:event_txtbayarKeyReleased

    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
        // TODO add your handling code here:
        buttonGroup1.clearSelection();
        txtharga.setText("");
        pelayanan.setSelectedItem("Pilih Pelayanan");
        txtpemilik.setText("");
        txthp.setText("");
        txtalamat.setText("");
        txtjumlah.setText("");
        txttotal.setText("");
        txtbayar.setText("");
        txtkembali.setText("");
        txtarea.setText("");
    }//GEN-LAST:event_btninputActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        cover cr=new cover();
        cr.setVisible(true);
        cr.pack();
                cr.setLocationRelativeTo(null);
                cr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btncetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetakActionPerformed
        // TODO add your handling code here:
        //btncetak.setText((String)pelayanan.getSelectedItem());
        txtarea.setText(
                "Nama Pemilik               :"+txtpemilik.getText()+"\n"+
                "Nomor Handphone      :"+txthp.getText()+"\n"+
                "Alamat                            :"+txtalamat.getText()+"\n"+
                "Jumlah Hari                    :"+txtjumlah.getText()+"\n"+
                "Total Bayar                     :"+txttotal.getText()+"\n"+
                "Uang Bayar                    :"+txtbayar.getText()+"\n"+
                "Uang Kembali               :"+txtkembali.getText()+"\n");
    }//GEN-LAST:event_btncetakActionPerformed

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
            java.util.logging.Logger.getLogger(equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new equipment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncetak;
    private javax.swing.JButton btninput;
    private javax.swing.JButton btnkeluar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox pelayanan;
    private javax.swing.JRadioButton rbekonomi;
    private javax.swing.JRadioButton rbvip;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txthp;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtkembali;
    private javax.swing.JTextField txtpemilik;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
