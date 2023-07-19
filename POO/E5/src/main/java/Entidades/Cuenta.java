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
public class Cuenta {

    private int numeroCuenta, saldoActual;
    private long DNI;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int saldoActual, long DNI) {
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.DNI = DNI;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public float getDNI() {
        return DNI;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void cuenta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar DNI: ");
        long DNI = scanner.nextInt();
        System.out.println("Ingresar numero de cuenta: ");
        int numeroCuenta = scanner.nextInt();
        this.DNI = DNI;
        this.numeroCuenta = numeroCuenta;

    }

    public void ingresar(double ingreso) {
        saldoActual += ingreso;
        System.out.println("Saldo Actual = " + saldoActual);
    }

    public void retirar(double retiro) {
        if (saldoActual > retiro) {
            saldoActual -= retiro;
        } else {
            System.out.println("No tiene suficiente dinero");
        }

        System.out.println("Saldo Actual = " + saldoActual);
    }

    public void extraccionRapida(double retiroRapido) {
        if (saldoActual * 0.2 >= retiroRapido) {
            saldoActual -= retiroRapido;
        } else {
            System.out.println("No tiene suficiente dinero para retiro rapido");
        }

        System.out.println("Saldo Actual = " + saldoActual);
    }

    public void consultarSaldo() {
        System.out.println("Saldo Actual = " + saldoActual);
    }

    public void consultarDatos() {
        System.out.println("DNI= " + DNI);
        System.out.println("Numero de Cuenta= " + numeroCuenta);
    }

}
