/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import data.EventMenuSelected;
import data.Student;
import forms.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author Daniel
 */
public class MainMenu extends javax.swing.JFrame {

    private jpMainMenu MainM;
    private jpAlumnos alumnos;
    private jpCalificaciones calif;
    
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        
        
//        
//        jpContentMain contentMain = new jpContentMain();
//        contentMain.setSize(760, 606);
//        contentMain.setLocation(0, 0);
//        
//        jpContent.removeAll();
//        jpContent.add(contentMain, BorderLayout.CENTER);
//        jpContent.revalidate();
//        jpContent.repaint();
//        
//        jpMainMenu mainMenu = new jpMainMenu();
//        mainMenu.setSize(760, 606);
//        mainMenu.setLocation(0, 0);
//        
//        jpHeader.setSize(760, 34);
//        jpHeader.setLocation(0, 0);
//        
//        contentMain.removeAll();
//        contentMain.add(jpHeader, BorderLayout.NORTH);
//        contentMain.add(mainMenu, BorderLayout.CENTER);
//        contentMain.revalidate();
//        contentMain.repaint();
//        
//        jpContent.removeAll();
//        jpContent.add(contentMain, BorderLayout.CENTER);
//        jpContent.revalidate();
//        jpContent.repaint();
        
        setBackground(new Color(0, 0, 0, 0));
        MainM = new jpMainMenu();
        alumnos = new jpAlumnos(this);
        calif = new jpCalificaciones();
        
        jpMenu1.initMoving(MainMenu.this);
        jpMenu1.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                if (index == 2) {
                    setForm(MainM);
                } else if (index == 3) {
                    setForm(alumnos);
                } else if (index == 4) {
                    setForm(calif);
                }
            }
        });
        //  set when system open start with home form
        setForm(new jpMainMenu());
    }

    private void setForm(JComponent com) {
        jpContentMain contentMain = new jpContentMain();
        contentMain.removeAll();
        contentMain.add(jpHeader, BorderLayout.NORTH);
        contentMain.add(com, BorderLayout.CENTER);
        contentMain.revalidate();
        contentMain.repaint();
        
        jpContent.removeAll();
        jpContent.add(contentMain, BorderLayout.CENTER);
        jpContent.revalidate();
        jpContent.repaint();
    }
    
    private int x;
    private int y;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBg = new javax.swing.JPanel();
        jpLeftMenu = new javax.swing.JPanel();
        jpMenu1 = new forms.jpMenu();
        jpContent = new javax.swing.JPanel();
        jpHeader = new javax.swing.JPanel();
        jpBarClose = new javax.swing.JPanel();
        jpClose = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpMin = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpMax = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(970, 640));
        setUndecorated(true);

        jpBg.setBackground(new java.awt.Color(255, 255, 255));
        jpBg.setLayout(new java.awt.BorderLayout());

        jpLeftMenu.setBackground(new java.awt.Color(102, 0, 102));
        jpLeftMenu.setMinimumSize(new java.awt.Dimension(200, 100));
        jpLeftMenu.setPreferredSize(new java.awt.Dimension(210, 484));
        jpLeftMenu.setLayout(new java.awt.BorderLayout());
        jpLeftMenu.add(jpMenu1, java.awt.BorderLayout.CENTER);

        jpBg.add(jpLeftMenu, java.awt.BorderLayout.LINE_START);

        jpContent.setBackground(new java.awt.Color(204, 204, 204));
        jpContent.setLayout(new java.awt.BorderLayout());

        jpHeader.setBackground(new java.awt.Color(255, 255, 255));
        jpHeader.setPreferredSize(new java.awt.Dimension(714, 34));
        jpHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpHeaderMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jpHeaderMouseMoved(evt);
            }
        });
        jpHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpHeaderMousePressed(evt);
            }
        });
        jpHeader.setLayout(new java.awt.BorderLayout());

        jpBarClose.setBackground(new java.awt.Color(255, 255, 255));
        jpBarClose.setPreferredSize(new java.awt.Dimension(102, 34));
        jpBarClose.setLayout(new java.awt.BorderLayout());

        jpClose.setBackground(new java.awt.Color(255, 255, 255));
        jpClose.setPreferredSize(new java.awt.Dimension(34, 34));
        jpClose.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/x (3) (2).png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jpClose.add(jLabel2, java.awt.BorderLayout.CENTER);

        jpBarClose.add(jpClose, java.awt.BorderLayout.EAST);

        jpMin.setBackground(new java.awt.Color(255, 255, 255));
        jpMin.setPreferredSize(new java.awt.Dimension(34, 34));
        jpMin.setLayout(new java.awt.BorderLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/minus (3) (2).png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpMin.add(jLabel3, java.awt.BorderLayout.CENTER);

        jpBarClose.add(jpMin, java.awt.BorderLayout.WEST);

        jpMax.setBackground(new java.awt.Color(255, 255, 255));
        jpMax.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/squares (4) (2).png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpMax.add(jLabel1, java.awt.BorderLayout.CENTER);

        jpBarClose.add(jpMax, java.awt.BorderLayout.CENTER);

        jpHeader.add(jpBarClose, java.awt.BorderLayout.LINE_END);

        jpContent.add(jpHeader, java.awt.BorderLayout.PAGE_START);

        jpBg.add(jpContent, java.awt.BorderLayout.CENTER);

        getContentPane().add(jpBg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpHeaderMouseDragged
        this.setLocation(evt.getXOnScreen() - x, evt.getYOnScreen() - y);
    }//GEN-LAST:event_jpHeaderMouseDragged

    private void jpHeaderMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpHeaderMouseMoved
        
    }//GEN-LAST:event_jpHeaderMouseMoved

    private void jpHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpHeaderMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jpHeaderMousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jpClose.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jpClose.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel2MouseExited

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jpBarClose;
    private javax.swing.JPanel jpBg;
    private javax.swing.JPanel jpClose;
    public javax.swing.JPanel jpContent;
    public javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpLeftMenu;
    private javax.swing.JPanel jpMax;
    private forms.jpMenu jpMenu1;
    private javax.swing.JPanel jpMin;
    // End of variables declaration//GEN-END:variables
}
