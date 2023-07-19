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
public class Operaciones {
    private float n1,n2;

    public Operaciones() {
    } 

    public Operaciones(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public float getN1() {
        return n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }
    
    
    
    public void crearOperacion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese n1: ");
        float n1 = scanner.nextFloat();
        System.out.println("Ingrese n2: ");
        float n2 = scanner.nextFloat();
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public float sumar(){
        return n1+n2;
    }
    
    public float restar(){
        return n1-n2;
    }
    
    public float multiplicar(){
        if (n1 == 0 ||n2==0) {
            System.out.println("Error el numero es 0");
            return 0;
        } else{
            return n1*n2;
        }
    }
    
    public float dividir(){
        if (n1 == 0 ||n2==0) {
            System.out.println("Error el numero es 0");
            return 0;
        } else{
            return n1/n2;
        }
    }

    @Override
    public String toString() {
        return "Operaciones{" + "n1=" + n1 + ", n2=" + n2 + '}';
    }
    
    
}
