/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package drhr.e11;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class E11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Año: ");
        int anio = scanner.nextInt();
        System.out.println("Mes: ");
        int mes = scanner.nextInt();
        System.out.println("Dia: ");
        int dia = scanner.nextInt();
        
        LocalDate fechaInicial = LocalDate.of(anio,mes,dia);
        LocalDate fechaActual = LocalDate.now();
        
        System.out.println("Fecha ingresada: " + fechaInicial);
        
        int aniosDiferencia = fechaActual.getYear() - fechaInicial.getYear();
        System.out.println("Diferencia de años: " + aniosDiferencia);
    }
}
