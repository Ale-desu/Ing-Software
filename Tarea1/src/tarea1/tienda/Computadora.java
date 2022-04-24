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
public class Computadora implements Tienda{

    private String tipo;
    private String marca;
    private boolean teclado;
    private boolean raton;
    private boolean camara;

    public Computadora() {
    }

    public Computadora(String tipo, String marca, boolean raton, boolean camara, boolean teclado) {
        this.tipo = tipo;
        this.marca = marca;
        this.raton = raton;
        this.camara = camara;
        this.teclado = teclado;
    }

    public boolean isTeclado() {
        return teclado;
    }

    public void setTeclado(boolean teclado) {
        this.teclado = teclado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isRaton() {
        return raton;
    }

    public void setRaton(boolean raton) {
        this.raton = raton;
    }

    public boolean isCamara() {
        return camara;
    }

    public void setCamara(boolean camara) {
        this.camara = camara;
    }
@Override
    public String toString() {
        return "Computadora{ "+"Tipo=" +tipo+", marca="+marca+", teclado="+teclado+
", raton="+raton+", camara"+camara+"}";
    }
}

