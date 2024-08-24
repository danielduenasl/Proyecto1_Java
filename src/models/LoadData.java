/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import data.Student;
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
    
    public static List<Student> cargarPersonas(String archivo) throws IOException {
        List<Student> students = new ArrayList<>();
        Student newStudent;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                newStudent = new Student();
                String[] datos = linea.split(",");
                if (datos.length == 4) {   
                    students.add(newStudent);
                }
            }
        }
        return students;
    }
    
}
