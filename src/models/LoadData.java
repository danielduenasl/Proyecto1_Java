/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import data.Estudiante;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class LoadData {
    
    
    public static List<Estudiante> cargarEstudiantes(String archivo){
        List<Estudiante> students = new ArrayList<>();
        Estudiante newStudent;
        
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                newStudent = new Estudiante();
                String[] datos = linea.split(",");
                if (datos.length == 7) {  
                    newStudent.setCarne(datos[0]);
                    newStudent.setGrado(datos[1]);
                    newStudent.setName(datos[2]);
                    newStudent.setLastName(datos[3]);
                    newStudent.setAge(Integer.parseInt(datos[4]));
                    newStudent.setSexo(datos[5]);
                    
                    students.add(newStudent);
                }
            }
        }
        catch (Exception ex)
        {}
        
        return students;
    }
}
