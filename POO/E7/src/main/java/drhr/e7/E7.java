/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package drhr.e7;

import Entidades.Persona;

/**
 *
 * @author Diego
 */
public class E7 {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", "H", 20, 65, 179);
        Persona p2 = new Persona("Pedro", "H", 20, 70, 170);
        Persona p3 = new Persona("Jose", "H", 20, 80, 160);
        Persona p4 = new Persona("Carlos", "H", 20, 90, 165);

        System.out.println("IMC de " + p1.getNombre() + " es " + p1.calcularIMC());
        System.out.println("IMC de " + p2.getNombre() + " es " + p1.calcularIMC());
        System.out.println("IMC de " + p3.getNombre() + " es " + p1.calcularIMC());
        System.out.println("IMC de " + p4.getNombre() + " es " + p1.calcularIMC());

    }
}
