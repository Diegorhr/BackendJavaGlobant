/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package drhr.e12;

import Entidades.Persona;

/**
 *
 * @author Diego
 */
public class E12 {

    public static void main(String[] args) {
        Persona p =new Persona();
        
        p.crearPersona();
        p.calcularEdad();
        p.menorQue(23);
        p.mostrarPersona();
    }
}
