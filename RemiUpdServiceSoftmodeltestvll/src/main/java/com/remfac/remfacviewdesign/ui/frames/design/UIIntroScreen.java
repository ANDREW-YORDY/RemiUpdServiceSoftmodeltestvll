
package com.remfac.remfacviewdesign.ui.frames.design;

import javax.swing.JOptionPane;


public class UIIntroScreen extends javax.swing.JPanel {
    
    private IntroScreenListener listener;

    public UIIntroScreen(IntroScreenListener listener) {
        this.listener = listener;
        initComponents();
        MessageIntro();
     }

    public void MessageIntro(){
        JOptionPane.showMessageDialog(null, "NUEVA CLASE JPANEL INTRO SCREEN");
        //
        if (listener != null){
            listener.onIntroScreenFinished();
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CONTENT = new javax.swing.JPanel();
        jLabel_Title = new javax.swing.JLabel();
        jPanel_CONT_IMGMAIN = new javax.swing.JPanel();

        jPanel_CONTENT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("BIENVENIDO");

        jPanel_CONT_IMGMAIN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel_CONT_IMGMAINLayout = new javax.swing.GroupLayout(jPanel_CONT_IMGMAIN);
        jPanel_CONT_IMGMAIN.setLayout(jPanel_CONT_IMGMAINLayout);
        jPanel_CONT_IMGMAINLayout.setHorizontalGroup(
            jPanel_CONT_IMGMAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_CONT_IMGMAINLayout.setVerticalGroup(
            jPanel_CONT_IMGMAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_CONTENTLayout = new javax.swing.GroupLayout(jPanel_CONTENT);
        jPanel_CONTENT.setLayout(jPanel_CONTENTLayout);
        jPanel_CONTENTLayout.setHorizontalGroup(
            jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CONTENTLayout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_CONT_IMGMAIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_CONTENTLayout.setVerticalGroup(
            jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Title)
                .addGap(18, 18, 18)
                .addComponent(jPanel_CONT_IMGMAIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JPanel jPanel_CONTENT;
    private javax.swing.JPanel jPanel_CONT_IMGMAIN;
    // End of variables declaration//GEN-END:variables
}
