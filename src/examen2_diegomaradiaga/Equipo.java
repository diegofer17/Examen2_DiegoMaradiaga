/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2_diegomaradiaga;

import java.io.Serializable;

/**
 *
 * @author df346
 */
public class Equipo implements Serializable{
    private String nombre;
    private int puntos;

    public Equipo() {
    }

    public Equipo(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }
    
    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
