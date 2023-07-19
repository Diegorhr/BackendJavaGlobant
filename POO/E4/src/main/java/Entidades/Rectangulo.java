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
public class Rectangulo {
    private int base,altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese base: ");
        int base = scanner.nextInt();
        System.out.println("Ingrese altura: ");
        int altura = scanner.nextInt();
        this.base = base;
        this.altura = altura;
    }
    
    public int superficieRectangulo(){
        return base*altura;
    }
    
    public int perimetroRectangulo(){
        return (base+altura)*2;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }    
}
