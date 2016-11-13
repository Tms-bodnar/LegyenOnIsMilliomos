/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Bodnár Tamás <tms.bodnar@gmail.com> | www.kalandlabor.hu
 */
public class Kerdesek implements Serializable{
    private int idkerdesek;
    private String kerdes;
    private String valasz0;
    private String valasz1;
    private String valasz2;
    private String valasz3;
    private int helyesvalasz;

    public Kerdesek(int idkerdesek, String kerdes, String valasz0, String valasz1, String valasz2, String valasz3, int helyesvalasz) {
        this.idkerdesek = idkerdesek;
        this.kerdes = kerdes;
        this.valasz0 = valasz0;
        this.valasz1 = valasz1;
        this.valasz2 = valasz2;
        this.valasz3 = valasz3;
        this.helyesvalasz = helyesvalasz;
    }

    public Kerdesek(String kerdes, String valasz0, String valasz1, String valasz2, String valasz3, int helyesvalasz) {
        this.kerdes = kerdes;
        this.valasz0 = valasz0;
        this.valasz1 = valasz1;
        this.valasz2 = valasz2;
        this.valasz3 = valasz3;
        this.helyesvalasz = helyesvalasz;
    }

    public Kerdesek() {
    }

    public int getHelyesvalasz() {
        return helyesvalasz;
    }

    public void setHelyesvalasz(int helyesvalasz) {
        this.helyesvalasz = helyesvalasz;
    }

    public int getIdkerdesek() {
        return idkerdesek;
    }

    public void setIdkerdesek(int idkerdesek) {
        this.idkerdesek = idkerdesek;
    }

    public String getKerdes() {
        return kerdes;
    }

    public void setKerdes(String kerdes) {
        this.kerdes = kerdes;
    }

    public String getValasz0() {
        return valasz0;
    }

    public void setValasz0(String valasz0) {
        this.valasz0 = valasz0;
    }

    public String getValasz1() {
        return valasz1;
    }

    public void setValasz1(String valasz1) {
        this.valasz1 = valasz1;
    }

    public String getValasz2() {
        return valasz2;
    }

    public void setValasz2(String valasz2) {
        this.valasz2 = valasz2;
    }

    public String getValasz3() {
        return valasz3;
    }

    public void setValasz3(String valasz3) {
        this.valasz3 = valasz3;
    }

    @Override
    public String toString() {
        return "Id: "+ idkerdesek + ". "+ kerdes;
    }
    
    
    
    
}
