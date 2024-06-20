package com.remfac.main.remiupdservicesoftmodeltestvll;

//import com.remfac.persistence.DBAdminConn;
//import com.remfac.remfaccontroller.RemFacController;
import com.remfac.remfacviewdesign.MENUPANELRemFacDesign;
import com.remfac.remfacviewdesign.RemFacDesign;
import com.remfac.remfacviewdesign.RemFacAntiDesign;

public class RemiUpdServiceSoftmodeltestvll {

    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello World!");
        //CARGA DEL PANEL DE PPRESENTACIÓN.
        //UIIntroScreen introScreen = new UIIntroScreen();
        //introScreen.MessageIntro();
        //introScreen.setVisible(false);
        //Thread.sleep(2000);
        //introScreen.dispose();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MENUPANELRemFacDesign menuPanel = new MENUPANELRemFacDesign();
                menuPanel.setVisible(true);
                menuPanel.setLocationRelativeTo(null);
            }
        });
        
        //JFRAME PRINCIPAL
//        RemFacAntiDesign antiRemFacDesign = new RemFacAntiDesign();
//        antiRemFacDesign.setResizable(true);
//        antiRemFacDesign.setVisible(true);
//        antiRemFacDesign.setLocationRelativeTo(null);
        
        //JFRAME PRINCIPAL
//        RemFacDesign remFacDesign = new RemFacDesign();
//        remFacDesign.setResizable(true);
//        remFacDesign.setVisible(true);
//        remFacDesign.setLocationRelativeTo(null);

        //DBAdminConn DBAConn = new DBAdminConn();
        //DBAConn.DBGoToConnection();
    }
    
}
