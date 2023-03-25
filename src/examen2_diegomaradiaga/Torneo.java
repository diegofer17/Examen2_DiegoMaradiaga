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
public class Torneo implements Serializable{
    private String nombre, periodo;
    private ArrayList <Equipo> listaEquipos = new ArrayList();
    private ArrayList <Partido> listaPartidos = new ArrayList();

    public Torneo() {
    }

    public Torneo(String nombre, String periodo) {
        this.nombre = nombre;
        this.periodo = periodo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public ArrayList<Partido> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(ArrayList<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
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
