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
public class petshop extends javax.swing.JFrame {

    /**
     * Creates new form petshop
     */
    public petshop() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 48)); // NOI18N
        jLabel2.setText("Selamat Datang");

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jLabel3.setText("Jungle Petshop");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(75, 75, 75))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 590, 120));

        jPanel4.setBackground(new java.awt.Color(204, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petshop/pict/icons8-black-cat-100.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 1, 10)); // NOI18N
        jLabel4.setText("Jungle Cat");

        jToggleButton4.setFont(new java.awt.Font("Kristen ITC", 1, 10)); // NOI18N
        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petshop/pict/icons8-dog-bowl-30.png"))); // NOI18N
        jToggleButton4.setText("FOOD");
        jToggleButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton4.setIconTextGap(10);
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton3.setFont(new java.awt.Font("Kristen ITC", 1, 10)); // NOI18N
        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petshop/pict/icons8-webbing-30.png"))); // NOI18N
        jToggleButton3.setText("ACCESSORIES");
        jToggleButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton3.setIconTextGap(10);
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton9.setFont(new java.awt.Font("Kristen ITC", 1, 10)); // NOI18N
        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petshop/pict/icons8-supplement-bottle-30.png"))); // NOI18N
        jToggleButton9.setText("VITAMIN");
        jToggleButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton9.setIconTextGap(10);
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jToggleButton5.setFont(new java.awt.Font("Kristen ITC", 1, 10)); // NOI18N
        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petshop/pict/icons8-maneki-30.png"))); // NOI18N
        jToggleButton5.setText("TOY");
        jToggleButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton5.setIconTextGap(10);
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton8.setBackground(new java.awt.Color(204, 153, 255));
        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petshop/pict/icons8-exit-sign-30.png"))); // NOI18N
        jToggleButton8.setBorder(null);
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jToggleButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jToggleButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addComponent(jToggleButton4)
                .addGap(26, 26, 26)
                .addComponent(jToggleButton3)
                .addGap(29, 29, 29)
                .addComponent(jToggleButton9)
                .addGap(28, 28, 28)
                .addComponent(jToggleButton5)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 480));

        jTextArea3.setBackground(new java.awt.Color(204, 153, 255));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Toy\n\nMenyediakan berbagai jenis mainan untuk\nkucing mulai deri ukuran kecil hingga\nbesar dan menyediakan catnip dalam\nbentuk serbuk yang telah dikeringkan");
        jTextArea3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane3.setViewportView(jTextArea3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 280, 120));

        jTextArea4.setBackground(new java.awt.Color(204, 153, 255));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("Food\n\nTersedia Dry Food dengan berbagai ukuran\ndan merek, mulai dari 0.5kg hingga 5kg");
        jTextArea4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane4.setViewportView(jTextArea4);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 280, 110));

        jTextArea5.setBackground(new java.awt.Color(204, 153, 255));
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.setText("Vitamin\n\nTersedia berbagai jenis vitamin dan obat\ntetes untuk kutu, jamus, dan membersihka\ntelingan kucing");
        jTextArea5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane5.setViewportView(jTextArea5);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 280, 120));

        jTextArea6.setBackground(new java.awt.Color(204, 153, 255));
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextArea6.setRows(5);
        jTextArea6.setText("Accesories\n\nMenyediakan berbagai aksesoriss mulai\ndari perlengkapan jalan, tas ransel untuk\nkucing hingga baju kucing");
        jTextArea6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane6.setViewportView(jTextArea6);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 280, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        // TODO add your handling code here:
        home hm=new home();
        hm.setVisible(true);
        hm.pack();
                hm.setLocationRelativeTo(null);
                hm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
        
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        food fd=new food();
                fd.setVisible(true);
                fd.pack();
                fd.setLocationRelativeTo(null);
                fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        toys ty=new toys();
                ty.setVisible(true);
                ty.pack();
                ty.setLocationRelativeTo(null);
                ty.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
        accessories ar=new accessories();
                ar.setVisible(true);
                ar.pack();
                ar.setLocationRelativeTo(null);
                ar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        // TODO add your handling code here:
        vitamin vn=new vitamin();
                vn.setVisible(true);
                vn.pack();
                vn.setLocationRelativeTo(null);
                vn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
    }//GEN-LAST:event_jToggleButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(petshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(petshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(petshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(petshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new petshop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables

   

   
    
}
