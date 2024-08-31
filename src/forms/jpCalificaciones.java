/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import data.Calificacion;
import data.Estudiante;
import frames.MainMenu;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class jpCalificaciones extends javax.swing.JPanel {

    private MainMenu mainMenu;
    private List<Calificacion> listcalificaciones;
    private List<Estudiante> ListEstudiantes;
    /**
     * Creates new form jpCalificaciones
     */
    public jpCalificaciones(MainMenu mainM, List<Calificacion> calificaciones, List<Estudiante> estudiantes) {
        initComponents();
        
        mainMenu = mainM;
        listcalificaciones = calificaciones;
        ListEstudiantes = estudiantes;
        addRows();
        
        this.mainMenu = mainM;
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jTable1.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        
    }
    
    private void addRows(){
        String[] columnas = {"Carnet", "Nombre", "Materia", "Nota 1", "Nota 2", "Nota 3", "Nota 4"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        
        for(Calificacion calif : listcalificaciones ){
            
            String nombreEstudiante = "";
        
            // Buscamos en la lista de estudiantes el que coincida con el carnet
            for(Estudiante est : ListEstudiantes){
                if(est.getCarne().equals(calif.getCarnet())){
                    nombreEstudiante = est.getName()+ " " + est.getLastName();
                    break; // Encontramos el estudiante, podemos salir del loop
                }
            }
        
            Object[] fila = {calif.getCarnet(), nombreEstudiante, calif.getMateria(), calif.getNote1(), calif.getNote2(), calif.getNote3(), calif.getNote4()};
            modelo.addRow(fila);
        }  
        jTable1.setModel(modelo);
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
        jLabel2 = new javax.swing.JLabel();
        materiaComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        gradoComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(760, 606));
        setPreferredSize(new java.awt.Dimension(760, 606));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel1.setText("CALIFICACIONES");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Materia");

        materiaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matemáticas", "Ciencias", "Historia", "Lenguaje", "Geografía" }));
        materiaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materiaComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Grado");

        gradoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primero primaria", "Segundo primaria", "Tercero primaria", "Cuarto primaria", "Sexto primaria" }));
        gradoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradoComboBoxActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Clave", "Nombre", "Apellido", "Nota 1", "Nota 2", "Nota 3", "Nota 4", "Promedio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(materiaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gradoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(245, 245, 245))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(materiaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void gradoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradoComboBoxActionPerformed
            // Obtener los valores seleccionados de los ComboBox
        String materiaSeleccionada = (String) materiaComboBox.getSelectedItem();
        String gradoSeleccionado = (String) gradoComboBox.getSelectedItem();

        // Filtrar la lista de calificaciones por materia y grado
        List<Calificacion> ListCalif = obtenerListMateria(listcalificaciones, materiaSeleccionada, gradoSeleccionado, ListEstudiantes);

        // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);  // Limpiar la tabla antes de agregar nuevas filas

        // Iterar sobre la lista filtrada de calificaciones
        for (Calificacion calif : ListCalif) {
            String nombreEstudiante = "";

            // Buscar el estudiante correspondiente al carnet en la lista de estudiantes
            for (Estudiante est : ListEstudiantes) {
                if (est.getCarne().equals(calif.getCarnet())) { // Asegúrate de usar el método correcto
                    nombreEstudiante = est.getName()+ " " + est.getLastName(); // Usa los nombres correctos de los métodos
                    break; // Salimos del loop cuando encontramos al estudiante
                }
            }

            // Crear un objeto con los datos del estudiante y las calificaciones
            Object[] fila = {
                calif.getCarnet(),
                nombreEstudiante,
                calif.getMateria(),
                calif.getNote1(), 
                calif.getNote2(), 
                calif.getNote3(), 
                calif.getNote4()
            };

            // Agregar la fila al modelo de la tabla
            modelo.addRow(fila);
        }
    }//GEN-LAST:event_gradoComboBoxActionPerformed

    private void materiaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materiaComboBoxActionPerformed
            // Obtener los valores seleccionados de los ComboBox
        String materiaSeleccionada = (String) materiaComboBox.getSelectedItem();
        String gradoSeleccionado = (String) gradoComboBox.getSelectedItem();

        // Filtrar la lista de calificaciones por materia y grado
        List<Calificacion> ListCalif = obtenerListMateria(listcalificaciones, materiaSeleccionada, gradoSeleccionado, ListEstudiantes);

        // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);  // Limpiar la tabla antes de agregar nuevas filas

        // Iterar sobre la lista filtrada de calificaciones
        for (Calificacion calif : ListCalif) {
            String nombreEstudiante = "";

            // Buscar el estudiante correspondiente al carnet en la lista de estudiantes
            for (Estudiante est : ListEstudiantes) {
                if (est.getCarne().equals(calif.getCarnet())) { // Asegúrate de usar el método correcto
                    nombreEstudiante = est.getName()+ " " + est.getLastName(); // Usa los nombres correctos de los métodos
                    break; // Salimos del loop cuando encontramos al estudiante
                }
            }

            // Crear un objeto con los datos del estudiante y las calificaciones
            Object[] fila = {
                calif.getCarnet(),
                nombreEstudiante,
                calif.getMateria(),
                calif.getNote1(), 
                calif.getNote2(), 
                calif.getNote3(), 
                calif.getNote4()
            };

            // Agregar la fila al modelo de la tabla
            modelo.addRow(fila);
        }
    }//GEN-LAST:event_materiaComboBoxActionPerformed

    public static List<Calificacion> obtenerListMateria(List<Calificacion> calificaciones, String materia, 
            String grado, List<Estudiante> estudiantes) {
        return calificaciones.stream()
                .filter(c -> c.getMateria().equals(materia))  // Filtra por materia
                .filter(c -> {
                // Buscar el estudiante correspondiente a la calificación
                Estudiante estudiante = estudiantes.stream()
                        .filter(e -> e.getCarne().equals(c.getCarnet()))
                        .findFirst()
                        .orElse(null);
                
                    // Verificar si el estudiante existe y si su grado coincide
                    return estudiante != null && estudiante.getGrado().equals(grado);
                })
                .sorted(Comparator.comparing(Calificacion::getAverage).reversed())  // Ordena por promedio descendente
                .collect(Collectors.toList());  // Colecta en una lista
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> gradoComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> materiaComboBox;
    // End of variables declaration//GEN-END:variables
}
