/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package drhr.e9;

import Entidades.Matematica;

/**
 *
 * @author Diego
 */
public class E9 {

    public static void main(String[] args) {

        Matematica m1 = new Matematica(Math.random() * 10, Math.random() * 10);
        System.out.println("N1= "+m1.getNum1()+"  N2= "+m1.getNum2());
        System.out.println("Mayor= " + m1.devolverMayor());
        System.out.println("Potencia= " + m1.calcularPotencia());
        System.out.println("Raiz= " + m1.calcularRaiz());

    }
}
