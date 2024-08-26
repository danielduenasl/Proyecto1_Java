/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import forms.*;
import java.awt.BorderLayout;

/**
 *
 * @author Daniel
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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

        jpBg = new javax.swing.JPanel();
        jpLeftMenu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
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
        setMinimumSize(new java.awt.Dimension(970, 640));

        jpBg.setBackground(new java.awt.Color(255, 255, 255));
        jpBg.setLayout(new java.awt.BorderLayout());

        jpLeftMenu.setBackground(new java.awt.Color(102, 0, 0));
        jpLeftMenu.setMinimumSize(new java.awt.Dimension(200, 100));
        jpLeftMenu.setPreferredSize(new java.awt.Dimension(210, 484));

        jButton1.setText("WELCOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ALUMNOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("CALIFICACIONES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpLeftMenuLayout = new javax.swing.GroupLayout(jpLeftMenu);
        jpLeftMenu.setLayout(jpLeftMenuLayout);
        jpLeftMenuLayout.setHorizontalGroup(
            jpLeftMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLeftMenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpLeftMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        jpLeftMenuLayout.setVerticalGroup(
            jpLeftMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeftMenuLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(303, 303, 303))
        );

        jpBg.add(jpLeftMenu, java.awt.BorderLayout.LINE_START);

        jpContent.setBackground(new java.awt.Color(204, 204, 204));
        jpContent.setLayout(new java.awt.BorderLayout());

        jpHeader.setBackground(new java.awt.Color(255, 255, 255));
        jpHeader.setPreferredSize(new java.awt.Dimension(714, 34));
        jpHeader.setLayout(new java.awt.BorderLayout());

        jpBarClose.setBackground(new java.awt.Color(255, 255, 255));
        jpBarClose.setPreferredSize(new java.awt.Dimension(102, 34));
        jpBarClose.setLayout(new java.awt.BorderLayout());

        jpClose.setBackground(new java.awt.Color(255, 255, 255));
        jpClose.setPreferredSize(new java.awt.Dimension(34, 34));
        jpClose.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/x (3) (2).png"))); // NOI18N
        jpClose.add(jLabel2, java.awt.BorderLayout.CENTER);

        jpBarClose.add(jpClose, java.awt.BorderLayout.EAST);

        jpMin.setBackground(new java.awt.Color(255, 255, 255));
        jpMin.setPreferredSize(new java.awt.Dimension(34, 34));
        jpMin.setLayout(new java.awt.BorderLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/minus (3) (2).png"))); // NOI18N
        jpMin.add(jLabel3, java.awt.BorderLayout.CENTER);

        jpBarClose.add(jpMin, java.awt.BorderLayout.WEST);

        jpMax.setBackground(new java.awt.Color(255, 255, 255));
        jpMax.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/squares (4) (2).png"))); // NOI18N
        jpMax.add(jLabel1, java.awt.BorderLayout.CENTER);

        jpBarClose.add(jpMax, java.awt.BorderLayout.CENTER);

        jpHeader.add(jpBarClose, java.awt.BorderLayout.LINE_END);

        jpContent.add(jpHeader, java.awt.BorderLayout.PAGE_START);

        jpBg.add(jpContent, java.awt.BorderLayout.CENTER);

        getContentPane().add(jpBg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jpMainMenu mainMenu = new jpMainMenu();
        mainMenu.setSize(760, 606);
        mainMenu.setLocation(0, 0);
        
        jpHeader.setSize(760, 34);
        jpHeader.setLocation(0, 0);
        
        jpContent.removeAll();
        jpContent.add(jpHeader, BorderLayout.NORTH);
        jpContent.add(mainMenu, BorderLayout.CENTER);
        jpContent.revalidate();
        jpContent.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jpAlumnos alumnos = new jpAlumnos();
        alumnos.setSize(760, 606);
        alumnos.setLocation(0, 0);
        
        jpHeader.setSize(760, 34);
        jpHeader.setLocation(0, 0);
        
        jpContent.removeAll();
        jpContent.add(jpHeader, BorderLayout.NORTH);
        jpContent.add(alumnos, BorderLayout.CENTER);
        jpContent.revalidate();
        jpContent.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jpCalificaciones calificaiones = new jpCalificaciones();
        calificaiones.setSize(760, 606);
        calificaiones.setLocation(0, 0);
        
        jpHeader.setSize(760, 34);
        jpHeader.setLocation(0, 0);
        
        jpContent.removeAll();
        jpContent.add(jpHeader, BorderLayout.NORTH);
        jpContent.add(calificaiones, BorderLayout.CENTER);
        jpContent.revalidate();
        jpContent.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jpBarClose;
    private javax.swing.JPanel jpBg;
    private javax.swing.JPanel jpClose;
    private javax.swing.JPanel jpContent;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpLeftMenu;
    private javax.swing.JPanel jpMax;
    private javax.swing.JPanel jpMin;
    // End of variables declaration//GEN-END:variables
}
