/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author PC
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;

    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getLastName() {
        return apellido;
    }

    public void setLastName(String apellido) {
        this.apellido = apellido;
    }

    public int getAge() {
        return edad;
    }

    public void setAge(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Persona(){}
    public Persona(String nombre, String apellido, int edad, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
      
    }

   
    
}
