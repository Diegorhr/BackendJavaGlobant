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
public class Movil {
    private String marca, modelo, memoriaRam, almacenamiento;
    private int precio;
    int[] codigo = new int[7];

    public Movil() {
    }

    public Movil(String marca, String modelo, String memoriaRam, String almacenamiento, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public int getPrecio() {
        return precio;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
    
    public void cargarCelular(){
        marca = "Samsumg";
        modelo = "A50";
        memoriaRam = "2GB";
        almacenamiento = "100 GB";
        precio = 100;
        ingresarCodigo();
    }
    
    public void ingresarCodigo(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        for (int i = 0; i < codigo.length; i++) {
            System.out.print("Digito " + (i + 1) + ": ");
            codigo[i] = scanner.nextInt();
        }
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", modelo=" + modelo + ", memoriaRam=" + memoriaRam + ", almacenamiento=" + almacenamiento + ", precio=" + precio + ", codigo=" + codigo + '}';
    } 
}
