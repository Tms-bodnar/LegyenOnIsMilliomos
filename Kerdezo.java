/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loimgui;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import model.Kerdesek;
import model.IModel;
/**
 *
 * @author Bodnár Tamás <tms.bodnar@gmail.com> | www.kalandlabor.hu
 */
public class Kerdezo extends Foablak{
    private Vector<Kerdesek> kerdesek;
    private Kerdesek kerdes;
    private boolean helyes = true;
    private int kerdesSzam = 1;
    private int helyesValasz;
    int valasz;





   public Kerdezo() {
       this.kerdes = kerdes;
    }
    public Kerdesek getKerdezo(int i){
        Collections.shuffle(kerdesek);
        kerdes = kerdesek.elementAt(i);
        return kerdes;
    }
   
    public boolean isHelyes() {
        return helyes;
    }

    public int getKerdesSzam() {
        return kerdesSzam;
    }

    public void setHelyes(boolean helyes) {
        this.helyes = helyes;
    }

    public int getHelyesValasz() {
        return helyesValasz;
    }

    public Kerdesek getKerdes() {
        return kerdes;
    }

    public void setKerdes(Kerdesek kerdes) {
        this.kerdes = kerdes;
    }

    public Vector<Kerdesek> getKerdesek() {
        return kerdesek;
    }

    public void setKerdesek(Vector<Kerdesek> kerdesek) {
        this.kerdesek = kerdesek;
    }
    
}
