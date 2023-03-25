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
public class Partido implements Serializable{
    private String nombre1, nombre2;
    private String puntuaje1, puntuaje2;

    public Partido() {
    }

    public Partido(String nombre1, String nombre2, String puntuaje1, String puntuaje2) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.puntuaje1 = puntuaje1;
        this.puntuaje2 = puntuaje2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getPuntuaje1() {
        return puntuaje1;
    }

    public void setPuntuaje1(String puntuaje1) {
        this.puntuaje1 = puntuaje1;
    }

    public String getPuntuaje2() {
        return puntuaje2;
    }

    public void setPuntuaje2(String puntuaje2) {
        this.puntuaje2 = puntuaje2;
    }
    
}
