/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Mes;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class MesServicio {

    Scanner scanner = new Scanner(System.in);

    public Mes CrearMes() {    
//        System.out.println("Ingrese mes Secreto: ");
//        String mesSecreto = scanner.next();
        return new Mes("Enero");
    }

    public void AdivinarMes(Mes m1) {
        String[] meses = m1.getMeses();
        String mesSec = m1.getMesSecreto();

        // Generar un número aleatorio entre 0 y 11
        Random random = new Random();
        int indiceAleatorio = random.nextInt(12);

        String mesAdivinado = meses[indiceAleatorio];

        if (mesAdivinado.equals(mesSec)) {
            System.out.println("¡Correcto! El mes secreto era " + mesSec);
        } else {
            System.out.println("No adivinaste el mes secreto. El mes secreto era " + mesAdivinado + " pero adivinaste " + mesSec);
        }

    }
}
