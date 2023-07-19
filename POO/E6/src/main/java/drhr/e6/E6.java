/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package drhr.e6;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class E6 {

    public static void main(String[] args) {       
        Scanner scanner = new Scanner(System.in);
        Cafetera c = new Cafetera(100,10);
        
        System.out.println("Ingresar cantidad de cafe a servir a tasa");
        int tasa = scanner.nextInt();
        c.servirTasa(tasa);
        
        System.out.println("Ingresar cantidad de cafe a agregar a la cafetera");
        int cantidad = scanner.nextInt();
        c.agregarCafe(cantidad);
        
        System.out.println(c.toString());
    }  
}
