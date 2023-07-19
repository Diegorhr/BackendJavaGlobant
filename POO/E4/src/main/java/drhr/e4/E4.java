/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package drhr.e4;

import Entidades.Rectangulo;

/**
 *
 * @author Diego
 */
public class E4 {

    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();
        r.crearRectangulo();
        
        System.out.println("Alto= "+r.getAltura()+" Base= "+r.getBase());
        System.out.println("Superficie= "+r.superficieRectangulo());
        System.out.println("Perimetro= "+r.perimetroRectangulo());
    }
}
