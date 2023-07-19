/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package drhr.ee5;

import Entidades.Mes;
import Servicios.MesServicio;

/**
 *
 * @author Diego
 */
public class EE5 {

    public static void main(String[] args) {
        MesServicio ms = new MesServicio();
        Mes m1 = ms.CrearMes();
        ms.AdivinarMes(m1);
        
        
    }
}
