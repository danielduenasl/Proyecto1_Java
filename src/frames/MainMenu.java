/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import data.Calificacion;
import data.EventMenuSelected;
import data.Estudiante;
import data.Materia;
import forms.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;
import models.LoadData;

/**
 *
 * @author Daniel
 */
public class MainMenu extends javax.swing.JFrame {

    private jpMainMenu MainM;
    private jpAlumnos alumnos;
    private jpCalificaciones calif;
    private jpPromedio promed;
    private jpMejoresAlumnos mejorAlum;
    private jpMateria materia;
   
    
    private static List<Estudiante> estudiantes;
    private static List<Materia> materias;
    private static List<Calificacion> calificaciones;
    
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        
        getDataEstudiante();
        getDataMateria();
        getDataCalificaciones();
        
        setBackground(new Color(0, 0, 0, 0));
        MainM = new jpMainMenu();
        alumnos = new jpAlumnos(this, estudiantes, calificaciones);
        calif = new jpCalificaciones(this, calificaciones, estudiantes);
        promed = new jpPromedio();
        mejorAlum = new jpMejoresAlumnos(this, calificaciones);
        materia = new jpMateria(this, materias);
        
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
                } else if (index == 5){
                    setForm(promed);
                } else if (index == 6){
                    setForm(mejorAlum);
                } else if (index == 7){
                    setForm(materia);
                }
              
            }
        });
        //  set when system open start with home form
        setForm(new jpMainMenu());
    }

    private void setForm(JComponent com) {
        jpContentMain contentMain = new jpContentMain();
        contentMain.removeAll();
        contentMain.add(jpBarHeader, BorderLayout.NORTH);
        contentMain.add(com, BorderLayout.CENTER);
        contentMain.revalidate();
        contentMain.repaint();
        
        jpContent.removeAll();
        jpContent.add(contentMain, BorderLayout.CENTER);
        jpContent.revalidate();
        jpContent.repaint();
    }
    
    public static void getDataEstudiante() {
        String archivo = new File("").getAbsolutePath() + "\\src\\data_files\\Estudiante.txt";
        estudiantes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), "UTF-8"))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                // Dividir la línea por comas
                String[] datos = linea.split(",");

                // Asignar valores a variables
                String carnet = datos[0];
                String grado = datos[1];
                String nombre = datos[2];
                String apellido = datos[3];
                int edad = Integer.parseInt(datos[4]);
                String sexo = datos[5];

                // Crear un objeto de tipo Estudiante
                Estudiante estudiante = new Estudiante(carnet, grado, nombre, apellido, edad, sexo);

                // Agregar el estudiante a la lista estática
                Estudiante.addEstudent(estudiante);
                //--------------
                estudiantes.add(estudiante);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void getDataMateria(){
        String archivo = new File("").getAbsolutePath() + "\\src\\data_files\\Materia.txt";
        materias = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), "UTF-8"))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                // Dividir la línea por comas
                String[] datos = linea.split(",");

                 if (datos.length == 3) {
                int idMateria = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                String descripcion = datos[2];

                // Crear objeto Materia y agregarlo a la lista
                Materia materia = new Materia(idMateria, nombre, descripcion);
                Materia.agregarMaterias(materia);
                
                materias.add(materia);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void getDataCalificaciones(){
        String archivo = new File("").getAbsolutePath() + "\\src\\data_files\\Calificaciones.txt";
        calificaciones = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), "UTF-8"))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                // Dividir la línea por comas
                String[] datos = linea.split(",");

                 if (datos.length == 6) {
                String carnet = datos[0];
                String materia = datos[1];
                float nota1 = Float.parseFloat(datos[2]);
                float nota2 = Float.parseFloat(datos[3]);
                float nota3 = Float.parseFloat(datos[4]);
                float nota4 = Float.parseFloat(datos[5]);

                // Crear objeto Materia y agregarlo a la lista
                Calificacion califc = new Calificacion(carnet, materia, nota1, nota2, nota3, nota4);
                //califc. (califc);
                
                calificaciones.add(califc);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        jpBarHeader = new javax.swing.JPanel();
        jpBarClose = new javax.swing.JPanel();
        jpClose = new javax.swing.JPanel();
        jlClose = new javax.swing.JLabel();
        jpMin = new javax.swing.JPanel();
        jlMin = new javax.swing.JLabel();
        jpMax = new javax.swing.JPanel();
        jlMax = new javax.swing.JLabel();

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

        jpBarHeader.setBackground(new java.awt.Color(255, 255, 255));
        jpBarHeader.setPreferredSize(new java.awt.Dimension(100, 34));
        jpBarHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpBarHeaderMouseDragged(evt);
            }
        });
        jpBarHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBarHeaderMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpBarHeaderMousePressed(evt);
            }
        });
        jpBarHeader.setLayout(new java.awt.BorderLayout());

        jpBarClose.setBackground(new java.awt.Color(255, 255, 255));
        jpBarClose.setPreferredSize(new java.awt.Dimension(102, 34));
        jpBarClose.setLayout(new java.awt.BorderLayout());

        jpClose.setBackground(new java.awt.Color(255, 255, 255));
        jpClose.setPreferredSize(new java.awt.Dimension(34, 34));
        jpClose.setLayout(new java.awt.BorderLayout());

        jlClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/x (3) (2).png"))); // NOI18N
        jlClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlCloseMouseExited(evt);
            }
        });
        jpClose.add(jlClose, java.awt.BorderLayout.CENTER);

        jpBarClose.add(jpClose, java.awt.BorderLayout.EAST);

        jpMin.setBackground(new java.awt.Color(255, 255, 255));
        jpMin.setPreferredSize(new java.awt.Dimension(34, 34));
        jpMin.setLayout(new java.awt.BorderLayout());

        jlMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/minus (3) (2).png"))); // NOI18N
        jlMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMinMouseExited(evt);
            }
        });
        jpMin.add(jlMin, java.awt.BorderLayout.CENTER);

        jpBarClose.add(jpMin, java.awt.BorderLayout.WEST);

        jpMax.setBackground(new java.awt.Color(255, 255, 255));
        jpMax.setLayout(new java.awt.BorderLayout());

        jlMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/squares (4) (2).png"))); // NOI18N
        jlMax.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlMaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMaxMouseExited(evt);
            }
        });
        jpMax.add(jlMax, java.awt.BorderLayout.CENTER);

        jpBarClose.add(jpMax, java.awt.BorderLayout.CENTER);

        jpBarHeader.add(jpBarClose, java.awt.BorderLayout.LINE_END);

        jpContent.add(jpBarHeader, java.awt.BorderLayout.PAGE_START);

        jpBg.add(jpContent, java.awt.BorderLayout.CENTER);

        getContentPane().add(jpBg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jlCloseMouseClicked

    private void jlCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseMouseEntered
        jpClose.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jlCloseMouseEntered

    private void jlCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseMouseExited
        jpClose.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jlCloseMouseExited

    private void jlMaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMaxMouseEntered
        jpMax.setBackground(new Color(224, 224, 224));
    }//GEN-LAST:event_jlMaxMouseEntered

    private void jlMaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMaxMouseExited
        jpMax.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jlMaxMouseExited

    private void jlMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinMouseEntered
        jpMin.setBackground(new Color (224, 224, 224));
    }//GEN-LAST:event_jlMinMouseEntered

    private void jlMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinMouseExited
        jpMin.setBackground(new Color (255, 255, 255));
    }//GEN-LAST:event_jlMinMouseExited

    private void jlMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMaxMouseClicked
        if(this.getExtendedState()!= MainMenu.MAXIMIZED_BOTH){
          this.setExtendedState(MainMenu.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(MainMenu.NORMAL);
        }
    }//GEN-LAST:event_jlMaxMouseClicked

    private void jlMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinMouseClicked
        if(this.getExtendedState()!= MainMenu.HIDE_ON_CLOSE){
          this.setExtendedState(MainMenu.HIDE_ON_CLOSE);
        }
    }//GEN-LAST:event_jlMinMouseClicked

    private int getX;
    private int getY;
    private void jpBarHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarHeaderMousePressed
        getX = evt.getX();
        getY = evt.getY();
    }//GEN-LAST:event_jpBarHeaderMousePressed

    private void jpBarHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarHeaderMouseDragged
        this.setLocation(evt.getXOnScreen() - getX, evt.getYOnScreen() - getY);
    }//GEN-LAST:event_jpBarHeaderMouseDragged

    private void jpBarHeaderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarHeaderMouseClicked
        if (evt.getClickCount()== 2){

        if(this.getExtendedState()!= MainMenu.MAXIMIZED_BOTH){
                  this.setExtendedState(MainMenu.MAXIMIZED_BOTH);
                }
                else{
                    this.setExtendedState(MainMenu.NORMAL);
            }
        }
    }//GEN-LAST:event_jpBarHeaderMouseClicked

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
    private javax.swing.JLabel jlClose;
    private javax.swing.JLabel jlMax;
    private javax.swing.JLabel jlMin;
    private javax.swing.JPanel jpBarClose;
    public javax.swing.JPanel jpBarHeader;
    private javax.swing.JPanel jpBg;
    private javax.swing.JPanel jpClose;
    public javax.swing.JPanel jpContent;
    private javax.swing.JPanel jpLeftMenu;
    private javax.swing.JPanel jpMax;
    private forms.jpMenu jpMenu1;
    private javax.swing.JPanel jpMin;
    // End of variables declaration//GEN-END:variables
}
