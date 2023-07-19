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
public class Juego {

    private int intentos = 5;
    Palabra p1 = new Palabra();

    String palabra = p1.getPalabra();
    String[] palabraOculta = new String[palabra.length()];

    Scanner scanner = new Scanner(System.in);

    public Juego() {
    }

    public void ocultarPalabra() {
        for (int i = 0; i < palabra.length(); i++) {
            palabraOculta[i] = " _";
        }
    }

    public void comprobarPalabra(char letra) {
        if (palabra.indexOf(letra) != -1) {
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    palabraOculta[i] = Character.toString(letra);
                }
            }
        }
        for (int i = 0; i < palabraOculta.length; i++) {
            System.out.print(palabraOculta[i]);
        }
    }

    public void intentos() {

    }

    public void iniciarJuego() {
        ocultarPalabra();

        for (int i = 0; i < intentos; i++) {
            System.out.println("Ingrese la letra");
            char letra = (scanner.nextLine()).charAt(0);
            comprobarPalabra(letra);
        }

    }

}
