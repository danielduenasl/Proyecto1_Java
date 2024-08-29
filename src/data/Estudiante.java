/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.List;

/**
 *
 * @author PC
 */
public class Student extends Person {
    
    private String carne;
    private String degree;
    private List<Qualification> qualifications;

    public List<Qualification> getQualifications() {
        return qualifications;
    }

    public void setQualifications(List<Qualification> qualifications) {
        this.qualifications = qualifications;
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

    public Student(String carne, String degree, List<Qualification> qualifications, String name, String lastName, int age, float size) {
        super(name, lastName, age, size);
        this.carne = carne;
        this.degree = degree;
        this.qualifications = qualifications;
    }
    
}
