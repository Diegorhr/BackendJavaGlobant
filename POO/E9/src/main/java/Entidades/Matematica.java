/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Diego
 */
public class Matematica {

    double num1, num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double devolverMayor() {
        return Math.max(num1, num2);
    }

    public double calcularPotencia() {
        int nuevoN1 = (int) Math.round(num1);
        int nuevoN2 = (int) Math.round(num2);
        return Math.pow(Math.max(nuevoN1, nuevoN2), Math.min(nuevoN1, nuevoN2));
    }

    public double calcularRaiz() {
        double nuevoN = Math.abs(Math.min(num1, num2));
        return Math.sqrt(nuevoN);
    }

}
