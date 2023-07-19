/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package drhr.e3;

import Entidades.Operaciones;

/**
 *
 * @author Diego
 */
public class E3 {

    public static void main(String[] args) {
        
        Operaciones o = new Operaciones();
        
        o.crearOperacion();

        System.out.println("n1: "+ o.getN1()+" n2: "+o.getN2());      
        System.out.println("sumar: "+ o.sumar());
        System.out.println("restar: "+ o.restar());
        System.out.println("multiplicar: "+ o.multiplicar());
        System.out.println("dividir: "+ o.dividir());

    }
}
