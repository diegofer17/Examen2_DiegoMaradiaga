/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2_diegomaradiaga;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author df346
 */
public class admDeportes {

    File f;
    ArrayList<Deporte> list_dep;

    public admDeportes(String path) {
        f = new File(path);
    }

    public File getF() {
        return f;
    }

    public void setF(File f) {
        this.f = f;
    }

    public ArrayList<Deporte> getList_dep() {
        return list_dep;
    }

    public void setList_vivo(ArrayList<Deporte> list_dep) {
        this.list_dep = list_dep;
    }

    public void cargarArchivo() {
        try {
            list_dep = new ArrayList();
            Deporte temp;
            if (f.exists()) {
                FileInputStream entrada
                        = new FileInputStream(f);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Deporte) objeto.readObject()) != null) {
                        list_dep.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(f);
            bw = new ObjectOutputStream(fw);
            for (Deporte t : list_dep) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
