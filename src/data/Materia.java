/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Materia {
    
    private int idMateria;  // Identificador único de la materia
    private String nombre;  // Nombre de la materia
    private String descripcion;  // Descripción breve de la materia
    public static List<Materia> materiaList = new ArrayList<>(); // Lista estática para almacenar las materias

 public Materia() {
    }

    // Constructor con parámetros
    public Materia(int idMateria, String nombre, String descripcion) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método para mostrar la información de la materia
    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    public static void agregarMaterias(Materia materia){
        materiaList.add(materia);
    }
}