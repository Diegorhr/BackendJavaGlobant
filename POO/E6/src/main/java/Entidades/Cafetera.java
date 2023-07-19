/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Diego
 */
public class Cafetera {
    private int capacidadMaxima,cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        cantidadActual=capacidadMaxima;
    }
    
    public void servirTasa(int tasa){
        if (tasa<=cantidadActual) {
            System.out.println("Se lleno la tasa");
        } else {
            System.out.println("No hay suficiente cafe, se lleno hasta "+cantidadActual);
        }
    }
    
    public void vaciarCafetera(){
        cantidadActual=0;
    }
    
    public void agregarCafe(int agregar){
        cantidadActual +=agregar;
        if (cantidadActual>=capacidadMaxima) {
            cantidadActual = capacidadMaxima;
        }
        System.out.println("La cantidad actual es: "+cantidadActual);
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }

}
