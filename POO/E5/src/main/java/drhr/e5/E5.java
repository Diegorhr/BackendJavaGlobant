/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package drhr.e5;

import Entidades.Cuenta;

/**
 *
 * @author Diego
 */
public class E5 {

    public static void main(String[] args) {
        Cuenta c = new Cuenta(1010,100,99999999);
        
        c.consultarDatos();
        c.consultarSaldo();
        c.extraccionRapida(20);
        c.ingresar(100);
        c.retirar(200);
    }
}
