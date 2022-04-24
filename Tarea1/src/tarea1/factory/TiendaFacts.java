/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1.factory;

import tarea1.tienda.Computadora;
import tarea1.tienda.Tablet;
import tarea1.tienda.Telefono;

/**
 *
 * @author IIAN
 */
public class TiendaFacts {

    public static Tienda producto(int sel) {
        switch (sel) {
            case Tienda.PC_HP:
                return new Computadora("PC", "HP", true, true, true);
            case Tienda.PC_Alienware:
                return new Computadora("Laptop", "Alien", true, false, false);
            case Tienda.CEL_Xiaomi:
                return new Telefono("4 plus", 2, true, true);
            case Tienda.CEL_ZTE:
                return new Telefono("Blade A32", 4, true, true);
            case Tienda.T_Apple:
                return new Tablet("Max3", 4, false, false, false);
            case Tienda.T_Samsung:
                return new Tablet("Air 4", 4, true, true, true);
            default:
                throw new AssertionError("xd");
        }

    }
}
