/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import data.Estudiante;
import data.Materia;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import frames.*;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class jpMateria extends javax.swing.JPanel {

    private MainMenu mainMenu;
    private List<Materia> ListMaterias;
//    private JComboBox<String> gradoComboBox;   
//    private DefaultTableModel tableModel;
    /**
     * Creates new form jpAlumnos
     */
    public jpMateria(MainMenu mainM, List<Materia> materias) {
        initComponents();
        
        ListMaterias = new ArrayList<>();
        ListMaterias = materias;
//       // addRows();
//        
//        this.mainMenu = mainM;
//        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
//        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
//        tableMateria.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
//        
         
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMateria = new javax.swing.JTable();
        jpBtnInfo = new javax.swing.JPanel();
        jlBtnInfo = new javax.swing.JLabel();
        jpBtnNotas = new javax.swing.JPanel();
        jlBtnInfo1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(760, 606));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel1.setText("Materias");

        tableMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id Materia", "Nombre", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableMateria.setOpaque(false);
        tableMateria.setSelectionBackground(new java.awt.Color(255, 102, 0));
        tableMateria.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableMateria.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableMateria);
        if (tableMateria.getColumnModel().getColumnCount() > 0) {
            tableMateria.getColumnModel().getColumn(0).setMinWidth(200);
            tableMateria.getColumnModel().getColumn(0).setPreferredWidth(200);
            tableMateria.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        jpBtnInfo.setBackground(new java.awt.Color(247, 220, 5));
        jpBtnInfo.setLayout(new java.awt.BorderLayout());

        jlBtnInfo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jlBtnInfo.setForeground(new java.awt.Color(51, 51, 0));
        jlBtnInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlBtnInfo.setText("CONSULTAR INFORMACIÓN");
        jlBtnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBtnInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlBtnInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlBtnInfoMouseExited(evt);
            }
        });
        jpBtnInfo.add(jlBtnInfo, java.awt.BorderLayout.CENTER);

        jpBtnNotas.setBackground(new java.awt.Color(247, 220, 5));
        jpBtnNotas.setLayout(new java.awt.BorderLayout());

        jlBtnInfo1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jlBtnInfo1.setForeground(new java.awt.Color(51, 51, 0));
        jlBtnInfo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlBtnInfo1.setText("CONSULTAR NOTAS");
        jlBtnInfo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBtnInfo1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlBtnInfo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlBtnInfo1MouseExited(evt);
            }
        });
        jpBtnNotas.add(jlBtnInfo1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpBtnNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpBtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jpBtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jpBtnNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jlBtnInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseEntered
        jpBtnInfo.setBackground(new Color (236, 179, 6));
    }//GEN-LAST:event_jlBtnInfoMouseEntered

    private void jlBtnInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseExited
        jpBtnInfo.setBackground(new Color (247, 220, 5));
    }//GEN-LAST:event_jlBtnInfoMouseExited

    private void jlBtnInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseClicked
       
//        Estudiante alumno = new Estudiante();
//        int row = tableMateria.getSelectedRow();
//            if (row != -1) {
//                
//            alumno.setCarne((String) tableMateria.getValueAt(row, 0));
//            alumno.setGrado((String) tableMateria.getValueAt(row, 1));
//            alumno.setName((String) tableMateria.getValueAt(row, 2));
//            alumno.setLastName((String) tableMateria.getValueAt(row, 3));
//            alumno.setAge((Integer) tableMateria.getValueAt(row, 4));
//            alumno.setSexo((String) tableMateria.getValueAt(row, 5));
//
//        }
//        
//        jpInfoAlumno infoAlumno = new jpInfoAlumno(alumno);
//        infoAlumno.setSize(760, 606);
//        infoAlumno.setLocation(0, 0);
//
//        jpContentMain contentMain = new jpContentMain();
//        contentMain.removeAll();
//        contentMain.add(mainMenu.jpBarHeader, BorderLayout.NORTH);
//        contentMain.add(infoAlumno, BorderLayout.CENTER);
//        contentMain.revalidate();
//        contentMain.repaint();
//        
//        mainMenu.jpContent.removeAll();
//        mainMenu.jpContent.add(contentMain, BorderLayout.CENTER);
//        mainMenu.jpContent.revalidate();
//        mainMenu.jpContent.repaint();
//        
    }//GEN-LAST:event_jlBtnInfoMouseClicked

    private void jlBtnInfo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfo1MouseClicked

//        jpNotasAlumno notasAlumno = new jpNotasAlumno();
//        notasAlumno.setSize(760, 606);
//        notasAlumno.setLocation(0, 0);
//
//        jpContentMain contentMain = new jpContentMain();
//        contentMain.removeAll();
//        contentMain.add(mainMenu.jpBarHeader, BorderLayout.NORTH);
//        contentMain.add(notasAlumno, BorderLayout.CENTER);
//        contentMain.revalidate();
//        contentMain.repaint();
//        
//        mainMenu.jpContent.removeAll();
//        mainMenu.jpContent.add(contentMain, BorderLayout.CENTER);
//        mainMenu.jpContent.revalidate();
//        mainMenu.jpContent.repaint();
    }//GEN-LAST:event_jlBtnInfo1MouseClicked

    private void jlBtnInfo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfo1MouseEntered
        jpBtnNotas.setBackground(new Color (236, 179, 6));
    }//GEN-LAST:event_jlBtnInfo1MouseEntered

    private void jlBtnInfo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfo1MouseExited
        jpBtnNotas.setBackground(new Color (247, 220, 5));
    }//GEN-LAST:event_jlBtnInfo1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlBtnInfo;
    private javax.swing.JLabel jlBtnInfo1;
    private javax.swing.JPanel jpBtnInfo;
    private javax.swing.JPanel jpBtnNotas;
    private javax.swing.JTable tableMateria;
    // End of variables declaration//GEN-END:variables
}
