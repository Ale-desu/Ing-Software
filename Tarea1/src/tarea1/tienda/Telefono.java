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
public class Telefono implements Tienda{

    private String Gen;
    private int RAM;
    private boolean funda;
    private boolean mica;

    public Telefono() {
    }

    public Telefono(String Gen, int RAM, boolean funda, boolean mica) {
        this.Gen = Gen;
        this.RAM = RAM;
        this.funda = funda;
        this.mica = mica;
    }

    public boolean isMica() {
        return mica;
    }

    public void setMica(boolean mica) {
        this.mica = mica;
    }

    public String getGen() {
        return Gen;
    }

    public void setMarca(String Gen) {
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
@Override
    public String toString() {
        return "Telefono{ "+"Generacion=" +Gen+", Ram="+RAM+", funda="+funda+
", mica="+mica+"}";
    }


}
