package com.remfac.remfacviewdesign;

import com.remfac.persistence.DBAdminConn;
import com.remfac.remfaccontroller.core.CORERemfactRevise;
import com.remfac.remfaccontroller.core.CORERemfactObtain;

public class RemFacAntiDesign extends javax.swing.JFrame {

    private CORERemfactRevise remfactRevise;
    private CORERemfactObtain remfactObtain;

    public RemFacAntiDesign() {
        initComponents();
        remfactRevise = new CORERemfactRevise(new DBAdminConn().DBGoToConnection());
        remfactObtain = new CORERemfactObtain(new DBAdminConn().DBGoToConnection());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CONTENT = new javax.swing.JPanel();
        jLabel_TitleMain = new javax.swing.JLabel();
        jLabel_RE = new javax.swing.JLabel();
        jTextField_REMI_IN = new javax.swing.JTextField();
        jButton_UPDTBTN_ANTIREMFACT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_ViewPrevAntiRemFac = new javax.swing.JTextArea();
        jButton_SEARCHBTN_ANTIREMFACT = new javax.swing.JButton();
        jButton_BACK_GOMENU = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_CONTENT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel_TitleMain.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_TitleMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TitleMain.setText("MODIFICACIÓN DE FACTURA REMI-FACT");

        jLabel_RE.setText("INGRESAR REMISION");

        jButton_UPDTBTN_ANTIREMFACT.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_UPDTBTN_ANTIREMFACT.setText("CREAR REMISION");
        jButton_UPDTBTN_ANTIREMFACT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDTBTN_ANTIREMFACTActionPerformed(evt);
            }
        });

        jTextArea_ViewPrevAntiRemFac.setColumns(20);
        jTextArea_ViewPrevAntiRemFac.setRows(5);
        jScrollPane1.setViewportView(jTextArea_ViewPrevAntiRemFac);

        jButton_SEARCHBTN_ANTIREMFACT.setText("BUSCAR REMISION");
        jButton_SEARCHBTN_ANTIREMFACT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SEARCHBTN_ANTIREMFACTActionPerformed(evt);
            }
        });

        jButton_BACK_GOMENU.setText("◀ Back");
        jButton_BACK_GOMENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BACK_GOMENUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_CONTENTLayout = new javax.swing.GroupLayout(jPanel_CONTENT);
        jPanel_CONTENT.setLayout(jPanel_CONTENTLayout);
        jPanel_CONTENTLayout.setHorizontalGroup(
            jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel_TitleMain, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_BACK_GOMENU, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                        .addComponent(jButton_SEARCHBTN_ANTIREMFACT, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                        .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_UPDTBTN_ANTIREMFACT, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                                .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                                        .addGap(0, 181, Short.MAX_VALUE)
                                        .addComponent(jTextField_REMI_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                                        .addComponent(jLabel_RE, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(166, 166, 166)))
                                .addGap(76, 76, 76)))
                        .addGap(63, 63, 63))))
        );
        jPanel_CONTENTLayout.setVerticalGroup(
            jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_BACK_GOMENU, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_TitleMain, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_REMI_IN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_RE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton_SEARCHBTN_ANTIREMFACT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_UPDTBTN_ANTIREMFACT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_CONTENT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_CONTENT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_UPDTBTN_ANTIREMFACTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDTBTN_ANTIREMFACTActionPerformed
        // Obtener el número de remisión del campo de texto
        String remisionNum = jTextField_REMI_IN.getText();

        // Llamar al método del controlador para actualizar las tablas
        remfactRevise.updateRemifactNRInBothTables(remisionNum);
    }//GEN-LAST:event_jButton_UPDTBTN_ANTIREMFACTActionPerformed

    private void jButton_SEARCHBTN_ANTIREMFACTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SEARCHBTN_ANTIREMFACTActionPerformed
        //remfactObtain.testBTN();
        String NumRemi = jTextField_REMI_IN.getText();
        remfactObtain.DisplayDataTables(NumRemi, jTextArea_ViewPrevAntiRemFac);
//        String NumRemi = jTextField_REMI_IN.getText().trim();
//        if (NumRemi.isEmpty()) {
//            remfactObtain.DisplayDataTables("", jTextArea_ViewPrevAntiRemFac);
//        } else {
//            remfactObtain.DisplayDataTables(NumRemi, jTextArea_ViewPrevAntiRemFac);
//        }
    }//GEN-LAST:event_jButton_SEARCHBTN_ANTIREMFACTActionPerformed

    private void jButton_BACK_GOMENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BACK_GOMENUActionPerformed
        MENUPANELRemFacDesign menuPanel = new MENUPANELRemFacDesign();
        menuPanel.setResizable(true);
        menuPanel.setVisible(true);
        menuPanel.setLocationRelativeTo(null);
        dispose(); // Cierra la interfaz actual
    }//GEN-LAST:event_jButton_BACK_GOMENUActionPerformed

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
            java.util.logging.Logger.getLogger(RemFacAntiDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemFacAntiDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemFacAntiDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemFacAntiDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemFacAntiDesign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_BACK_GOMENU;
    private javax.swing.JButton jButton_SEARCHBTN_ANTIREMFACT;
    private javax.swing.JButton jButton_UPDTBTN_ANTIREMFACT;
    private javax.swing.JLabel jLabel_RE;
    private javax.swing.JLabel jLabel_TitleMain;
    private javax.swing.JPanel jPanel_CONTENT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_ViewPrevAntiRemFac;
    private javax.swing.JTextField jTextField_REMI_IN;
    // End of variables declaration//GEN-END:variables
}
