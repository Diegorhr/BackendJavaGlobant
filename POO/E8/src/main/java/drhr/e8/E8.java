/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package drhr.e8;

import Entidades.Cadena;

/**
 *
 * @author Diego
 */
public class E8 {

    public static void main(String[] args) {
        Cadena c1 = new Cadena("Hola soy German");
        
        System.out.println("La cantidad de vocales de: "+c1.getFrase()+" es "+ c1.mostrarVocales());
        c1.vecesRepetido('a');
        c1.compararLongitud("Hola");
        c1.unirFrases(" suscribete y dale like");
        c1.reemplazar('∟');
        c1.contiene("a");
    }
}
