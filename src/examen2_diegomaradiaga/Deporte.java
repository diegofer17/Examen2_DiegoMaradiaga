/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2_diegomaradiaga;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author df346
 */
public class Deporte implements Serializable{
    private String nombre;
    private ArrayList <Torneo> listaTroneos = new ArrayList();
    private String periodo;
    
    public Deporte() {
    }
    
    public Deporte(String nombre) {
        this.nombre = nombre;
    }
    
    public Deporte(String nombre, String periodo) {
        this.nombre = nombre;
        this.periodo = periodo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public ArrayList<Torneo> getListaTroneos() {
        return listaTroneos;
    }

    public void setListaTroneos(ArrayList<Torneo> listaTroneos) {
        this.listaTroneos = listaTroneos;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
}
