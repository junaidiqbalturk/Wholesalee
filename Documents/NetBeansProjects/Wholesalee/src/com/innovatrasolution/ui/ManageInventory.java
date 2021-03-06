/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatrasolution.ui;

/**
 *
 * @author junai
 */
public class ManageInventory extends javax.swing.JFrame {

    /**
     * Creates new form ManageProducts
     */
    public ManageInventory() {
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
        manage_cat_lbl = new javax.swing.JLabel();
        mng_invnt_txt = new javax.swing.JLabel();
        manage_pdt_lbl = new javax.swing.JLabel();
        mng_invnt_txt1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manage_cat_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manage_cat_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/innovatrasolution/images/Images/cat.png"))); // NOI18N
        manage_cat_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manage_cat_lblMouseClicked(evt);
            }
        });
        jPanel1.add(manage_cat_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 110, 82));

        mng_invnt_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mng_invnt_txt.setForeground(new java.awt.Color(255, 255, 255));
        mng_invnt_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mng_invnt_txt.setText("Manage Categories");
        jPanel1.add(mng_invnt_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 147, 31));

        manage_pdt_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manage_pdt_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/innovatrasolution/images/Images/pdct.png"))); // NOI18N
        manage_pdt_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manage_pdt_lblMouseClicked(evt);
            }
        });
        jPanel1.add(manage_pdt_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 110, 82));

        mng_invnt_txt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mng_invnt_txt1.setForeground(new java.awt.Color(255, 255, 255));
        mng_invnt_txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mng_invnt_txt1.setText("Manage Products");
        jPanel1.add(mng_invnt_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 147, 31));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/innovatrasolution/images/Images/crossbtn.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 40, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/innovatrasolution/images/Images/back-btn.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 60, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void manage_cat_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manage_cat_lblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_manage_cat_lblMouseClicked

    private void manage_pdt_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manage_pdt_lblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_manage_pdt_lblMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        Dashboard FormDashboard = new Dashboard();
        FormDashboard.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(ManageInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageInventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel manage_cat_lbl;
    private javax.swing.JLabel manage_pdt_lbl;
    private javax.swing.JLabel mng_invnt_txt;
    private javax.swing.JLabel mng_invnt_txt1;
    // End of variables declaration//GEN-END:variables
}
