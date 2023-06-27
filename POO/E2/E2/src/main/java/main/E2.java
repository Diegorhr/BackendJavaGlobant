/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Entidades.Circunferencia;

/**
 *
 * @author Diego
 */
public class E2 {

    public static void main(String[] args) {

        Circunferencia c = new Circunferencia(5);
        System.out.println("Radio: " + c.getRadio());
        System.out.println("Area: " + c.area());
        System.out.println("Perimetro: " + c.perimetro());
        
        c.crearCircunferencia();//Se registra el radio en el scanner
        System.out.println("La nueva circunferencia es: "+c.getRadio());
    }
}
