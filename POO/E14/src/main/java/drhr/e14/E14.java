/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package drhr.e14;

import Entidades.Movil;

/**
 *
 * @author Diego
 */
public class E14 {

    public static void main(String[] args) {
        Movil m = new Movil();
        
        m.cargarCelular();
        System.out.println(m.toString());
    }
}
