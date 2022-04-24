/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1.tienda;

import tarea1.factory.Tienda;

/**
 *
 * @author IIAN
 */
public class Tablet implements Tienda{
    private String Gen;
    private int RAM;
    private boolean funda;
    private boolean mica;
    private boolean pluma;

    public Tablet() {
    }

    public Tablet(String Gen, int RAM, boolean funda, boolean mica, boolean pluma) {
        this.Gen = Gen;
        this.RAM = RAM;
        this.funda = funda;
        this.mica = mica;
        this.pluma = pluma;
    }

    public String getGen() {
        return Gen;
    }

    public void setGen(String Gen) {
        this.Gen = Gen;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public boolean isFunda() {
        return funda;
    }

    public void setFunda(boolean funda) {
        this.funda = funda;
    }

    public boolean isMica() {
        return mica;
    }

    public void setMica(boolean mica) {
        this.mica = mica;
    }

    public boolean isPluma() {
        return pluma;
    }

    public void setPluma(boolean pluma) {
        this.pluma = pluma;
    }
@Override
    public String toString() {
        return "Tablet{ "+"Generacion=" +Gen+", Ram="+RAM+", funda="+funda+
", mica="+mica+", pluma="+pluma+"}";
    }
}
