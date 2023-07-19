/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Persona {
    String nombre;
    LocalDate fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void crearPersona(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = scanner.next();
//        System.out.println("Fecha: ");
        String fechaStr = "12/05/2000";
//        String fechaStr = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(fechaStr, formatter);
        this.nombre = nombre;
        this.fechaNacimiento = fecha;
    }
    
    public int calcularEdad(){
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        System.out.println("Edad: "+edad);
        return edad;
    }
    
    public void menorQue(int edadIngrsada){
        int edad = edadIngrsada - calcularEdad();
        System.out.println("La diferencia de edades es "+edad);     
    }
    
    public void mostrarPersona(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Fecha de Nacimiento: "+fechaNacimiento);
    }
}
