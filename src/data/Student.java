/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author PC
 */
public class Student extends Person {
    
    private String carne;
    private String degree;

    public Student(String carne, String degree, String name, String lastName, int age, float size) {
        super(name, lastName, age, size);
        this.carne = carne;
        this.degree = degree;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Student() {
    }
    
    
}
