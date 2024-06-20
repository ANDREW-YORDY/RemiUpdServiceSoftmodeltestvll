package com.remfac.remfacviewdesign.ui.customcomponents;

import java.awt.Image;
import javax.swing.*;
import java.io.InputStream;
import javax.imageio.ImageIO;

// CLASE ADMINISTRADORA Y CONTROLADORA DE TODAS LAS IMÁGENES DE INTERFACES.
public class UIAdminImg {

    public UIAdminImg() {
    }

    public void setManageIMG(JPanel panel, String imgPath) {
//        try {
//            // Cargar la imagen desde el classpath
//            InputStream imgStream = getClass().getResourceAsStream(imgPath);
//            if (imgStream == null) {
//                System.out.println("El recurso no se encontró: " + imgPath);
//                return;
//            }
//            Image IMG = ImageIO.read(imgStream);
//            JLabel picLabel = new JLabel(new ImageIcon(IMG));
//            
//            panel.removeAll();
//            panel.add(picLabel);
//            panel.revalidate();
//            panel.repaint();
//        
//        } catch (Exception e) {
//           e.printStackTrace();
//        }     
    }
}
