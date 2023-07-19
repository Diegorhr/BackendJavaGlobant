/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Circunferencia {
    private float radio;

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese radio: ");
        float radio = scanner.nextFloat();
        this.radio = radio;
    }
    
    public double area(){
        return Math.pow(radio,2)*Math.PI;
    }
    
    public double perimetro(){
        return  2*Math.PI*radio;
    }  
}
