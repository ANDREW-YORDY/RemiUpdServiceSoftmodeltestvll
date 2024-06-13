
package com.remfac.remfacviewdesign;

import com.remfac.persistence.DBAdminConn;
import com.remfac.remfaccontroller.RemFacController;

public class RemFacDesign extends javax.swing.JFrame {

    private RemFacController remFacController;
    
    public RemFacDesign() {
        initComponents();
        remFacController = new RemFacController(new DBAdminConn().DBGoToConnection());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CONTENT = new javax.swing.JPanel();
        jButton_UPDATEBTN = new javax.swing.JButton();
        jButton_SEARCHBTN = new javax.swing.JButton();
        jTextField_NRODOC_IN = new javax.swing.JTextField();
        jLabel_NroDoc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_ViewPrevRemFac = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_CONTENT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jButton_UPDATEBTN.setText("ACTUALIZAR");
        jButton_UPDATEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATEBTNActionPerformed(evt);
            }
        });

        jButton_SEARCHBTN.setText("🔎");
        jButton_SEARCHBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SEARCHBTNActionPerformed(evt);
            }
        });

        jLabel_NroDoc.setText("NRO DOCUMENTO");

        jTextArea_ViewPrevRemFac.setColumns(20);
        jTextArea_ViewPrevRemFac.setRows(5);
        jScrollPane1.setViewportView(jTextArea_ViewPrevRemFac);

        javax.swing.GroupLayout jPanel_CONTENTLayout = new javax.swing.GroupLayout(jPanel_CONTENT);
        jPanel_CONTENT.setLayout(jPanel_CONTENTLayout);
        jPanel_CONTENTLayout.setHorizontalGroup(
            jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton_UPDATEBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                        .addComponent(jLabel_NroDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_NRODOC_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_SEARCHBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel_CONTENTLayout.setVerticalGroup(
            jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CONTENTLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_SEARCHBTN)
                    .addComponent(jTextField_NRODOC_IN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_NroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton_UPDATEBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
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
                .addComponent(jPanel_CONTENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SEARCHBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SEARCHBTNActionPerformed
        String codigoIn = jTextField_NRODOC_IN.getText();
        //remFacController.displayData(jTextArea_ViewPrevRemFac); //1ra posicion.
        //remFacController.displayDataByCode(codigoIn, jTextArea_ViewPrevRemFac); //2da posicion
        remFacController.displayDataFromBothTables(jTextArea_ViewPrevRemFac); 
    }//GEN-LAST:event_jButton_SEARCHBTNActionPerformed

    private void jButton_UPDATEBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATEBTNActionPerformed
        remFacController.updateDataRemFac();
    }//GEN-LAST:event_jButton_UPDATEBTNActionPerformed

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
            java.util.logging.Logger.getLogger(RemFacDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemFacDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemFacDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemFacDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemFacDesign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_SEARCHBTN;
    private javax.swing.JButton jButton_UPDATEBTN;
    private javax.swing.JLabel jLabel_NroDoc;
    private javax.swing.JPanel jPanel_CONTENT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_ViewPrevRemFac;
    private javax.swing.JTextField jTextField_NRODOC_IN;
    // End of variables declaration//GEN-END:variables

}
