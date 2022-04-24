/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1.factory;

import java.util.Scanner;

/**
 *
 * @author IIAN
 */
public class Test {

    public static void main(String[] args) {
        Scanner pedido = new Scanner(System.in);
        int seleccion = 0;

        System.out.println("que deseas?");
        System.out.println(Tienda.PC_HP + ".Computadora de escritorio");
        System.out.println(Tienda.PC_Alienware + ".-Laptop");
        System.out.println(Tienda.CEL_Xiaomi + ".-Telefono Xiaomi");
        System.out.println(Tienda.CEL_ZTE + ".-Telefono ZTE");
        System.out.println(Tienda.T_Apple + ".-Tablet Apple");
        System.out.println(Tienda.T_Samsung + ".-Tablet Samsung");
        try {
            System.out.print("Cual le interesa?");
            seleccion = pedido.nextInt();
        } catch (Exception e) {
            System.out.println("eso no es una eleccion");
        }
        Tienda item = TiendaFacts.producto(seleccion);
        System.out.println(item.toString());
    }
}
