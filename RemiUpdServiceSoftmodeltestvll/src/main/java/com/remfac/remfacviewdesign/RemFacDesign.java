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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel_CONT_ACTUALNRODOC = new javax.swing.JPanel();
        jLabel_NEWNRODOC_IN = new javax.swing.JLabel();
        jTextField_NEWNRODOC_IN = new javax.swing.JTextField();

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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACTUALIZADOR [ REM - FAC ]");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Systemas UNIROCA Software");

        jPanel_CONT_ACTUALNRODOC.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACTUALIZAR NRO DOCUMENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jLabel_NEWNRODOC_IN.setText("INGRESE EL NUEVO NRO");

        javax.swing.GroupLayout jPanel_CONT_ACTUALNRODOCLayout = new javax.swing.GroupLayout(jPanel_CONT_ACTUALNRODOC);
        jPanel_CONT_ACTUALNRODOC.setLayout(jPanel_CONT_ACTUALNRODOCLayout);
        jPanel_CONT_ACTUALNRODOCLayout.setHorizontalGroup(
            jPanel_CONT_ACTUALNRODOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONT_ACTUALNRODOCLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel_NEWNRODOC_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jTextField_NEWNRODOC_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel_CONT_ACTUALNRODOCLayout.setVerticalGroup(
            jPanel_CONT_ACTUALNRODOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONT_ACTUALNRODOCLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel_CONT_ACTUALNRODOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_NEWNRODOC_IN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_NEWNRODOC_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_CONTENTLayout = new javax.swing.GroupLayout(jPanel_CONTENT);
        jPanel_CONTENT.setLayout(jPanel_CONTENTLayout);
        jPanel_CONTENTLayout.setHorizontalGroup(
            jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jButton_UPDATEBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel_CONT_ACTUALNRODOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CONTENTLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CONTENTLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CONTENTLayout.createSequentialGroup()
                        .addComponent(jLabel_NroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_NRODOC_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_SEARCHBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        jPanel_CONTENTLayout.setVerticalGroup(
            jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CONTENTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_SEARCHBTN)
                    .addComponent(jLabel_NroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_NRODOC_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel_CONT_ACTUALNRODOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton_UPDATEBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addContainerGap())
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
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SEARCHBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SEARCHBTNActionPerformed
        String codigoIn = jTextField_NRODOC_IN.getText();
        remFacController.displayDataFromBothTablesByCode(codigoIn, jTextArea_ViewPrevRemFac);
        jTextField_NEWNRODOC_IN.setText(codigoIn);
        //remFacController.displayData(jTextArea_ViewPrevRemFac); //1ra PROCESO.
        //remFacController.displayDataByCode(codigoIn, jTextArea_ViewPrevRemFac); //2da PROCESO
        //remFacController.displayDataFromBothTables(jTextArea_ViewPrevRemFac); //3ra PROCESO
    }//GEN-LAST:event_jButton_SEARCHBTNActionPerformed

    private void jButton_UPDATEBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATEBTNActionPerformed
        String OldCod = jTextField_NRODOC_IN.getText();
        String NewCod = jTextField_NEWNRODOC_IN.getText(); //Actualizar automáticamente el nuevo código con el mismo valor que el código consultado
        remFacController.updateCodigoInBothTables(OldCod, NewCod);
        
        remFacController.limpiarCampos(jTextField_NRODOC_IN, jTextField_NEWNRODOC_IN, jTextArea_ViewPrevRemFac);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_NEWNRODOC_IN;
    private javax.swing.JLabel jLabel_NroDoc;
    private javax.swing.JPanel jPanel_CONTENT;
    private javax.swing.JPanel jPanel_CONT_ACTUALNRODOC;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_ViewPrevRemFac;
    private javax.swing.JTextField jTextField_NEWNRODOC_IN;
    private javax.swing.JTextField jTextField_NRODOC_IN;
    // End of variables declaration//GEN-END:variables

}
