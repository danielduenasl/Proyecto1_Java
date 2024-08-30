/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Estudiante extends Persona {
    
    private String carne;
    private String grado;
 
    public static List<Estudiante> studentList = new ArrayList<>();

    //private List<Calificacion> calificacion;

//    
//    public List<Calificacion> getCalificacion() {
//        return calificacion;
//    }
//
//    public void setQualifications(List<Calificacion> calificacion) {
//        this.calificacion = calificacion;
//    }
   

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Estudiante() {
    }

    public Estudiante(String carne, String grado, String nombre, String apellido, int edad, String sexo) {
        super(nombre, apellido, edad,sexo);
        this.carne = carne;
        this.grado = grado;
       // this.calificacion = calificacion;
    }
    public static void addEstudent(Estudiante estudiante) {
        studentList.add(estudiante);
    }

   

}
