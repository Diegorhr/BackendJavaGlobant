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
public class Persona {

    private String nombre, sexo;
    private int edad, peso, altura;

    public Persona() {
    }

    public Persona(String nombre, String sexo, int edad, int peso, int altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + '}';
    }

    public void crearPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nombre= ");
        nombre = scanner.next();
        do {
            System.out.println("sexo= ");
            sexo = scanner.next();
        } while (!(sexo.equals("M") || sexo.equals("H") || sexo.equals("O")));

        System.out.println("edad= ");
        edad = scanner.nextInt();
        System.out.println("peso= ");
        peso = scanner.nextInt();
        System.out.println("altura= ");
        altura = scanner.nextInt();
    }

    public int calcularIMC() {
        float pesoIdeal = (float) (peso / Math.pow((altura/100), 2));

        if (pesoIdeal < 20) {
            return -1;
        } else if (pesoIdeal <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(){
        return edad>=18;
    }

}
