/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Diego
 */
public class Cadena {

    private String frase = "";
    private int longitud = frase.length();

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int mostrarVocales() {
        int vocales = 0;
        for (char letra : frase.toCharArray()) {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            }
        }
        return vocales;
    }
    
    public void vecesRepetido(char letra) {
        int contador = 0;
        for (char caracter : frase.toCharArray()) {
            if (letra == caracter) {
                contador++;
            }
        }
        System.out.println("Se repitio "+contador+" veces");              
    }

    public void compararLongitud(String nuevaFrase) {
        int longitudNF = nuevaFrase.length();
        longitud = frase.length();
        System.out.println("Longitud: NF = "+longitudNF+" F= "+longitud);
    }

    public void unirFrases(String nuevaFrase) {
        nuevaFrase = frase.concat(nuevaFrase);
        System.out.println(nuevaFrase);
    }

    public void reemplazar(char letra) {
        String nuevaFrase = frase.replace('a', letra);
        System.out.println(nuevaFrase);
    }

    public boolean contiene(String letras) {
        return frase.contains(letras);
    }

}
