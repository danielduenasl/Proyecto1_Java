/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Dell
 */
public class Calificacion {
    
    private String carnet;
    private String materia;
    private float note1;
    private float note2;
    private float note3;
    private float note4;
    private float promedio;

    /**
     * @return the carnet
     */
    public Calificacion(String carnet, String materia, float note1, float note2, float note3, float note4) {
        this.carnet = carnet;
        this.materia = materia;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
        this.note4 = note4;
        this.promedio = calcularPromedio();  // Calcula el promedio al crear el objeto
    }
    
     private float calcularPromedio() {
        return (note1 + note2 + note3 + note4) / 4;
    }
    public String getCarnet() {
        return carnet;
    }   

    /**
     * @param carnet the carnet to set
     */
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    /**
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * @return the note1
     */
    public float getNote1() {
        return note1;
    }

    /**
     * @param note1 the note1 to set
     */
    public void setNote1(float note1) {
        this.note1 = note1;
    }

    /**
     * @return the note2
     */
    public float getNote2() {
        return note2;
    }

    /**
     * @param note2 the note2 to set
     */
    public void setNote2(float note2) {
        this.note2 = note2;
    }

    /**
     * @return the note3
     */
    public float getNote3() {
        return note3;
    }

    /**
     * @param note3 the note3 to set
     */
    public void setNote3(float note3) {
        this.note3 = note3;
    }

    /**
     * @return the note4
     */
    public float getNote4() {
        return note4;
    }

    /**
     * @param note4 the note4 to set
     */
    public void setNote4(float note4) {
        this.note4 = note4;
    }

    /**
     * @return the promedio
     */
    public float getAverage() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setAverage(float promedio) {
        this.promedio = promedio;
    }
    
    
}
