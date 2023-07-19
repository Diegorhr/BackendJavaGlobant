/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package drhr.e10;

import java.util.Arrays;

/**
 *
 * @author Diego
 */
public class E10 {

//    public static void main(String[] args) {
//        float[] arreglo1 = new float[50];
//        float[] arreglo2 = new float[20];
//        llenarMatriz(arreglo1);
//        llenarMatriz(arreglo2);
//        ordenarMatriz(arreglo1);
//
//        for (int i = 0; i < arreglo2.length; i++) {
//            if (i < 10) {
//                arreglo2[i] = arreglo1[i];
//            } else {
//                arreglo2[i] = (float) 0.5;
//            }
//        }
//        
//        System.out.println("-------------------------");
//
//        imprimirMatriz(arreglo1);
//        imprimirMatriz(arreglo2);
//
//    }
//
//    public static void llenarMatriz(float[] arreglo) {
//        for (int i = 0; i < arreglo.length; i++) {
//            arreglo[i] = (float) Math.random();
//            System.out.println("[" + i + "]=" + arreglo[i]);
//        }
//    }
//
//    public static void ordenarMatriz(float[] arreglo) {
//        float c;
//        for (int i = 0; i < arreglo.length; i++) {
//            for (int j = i; j < arreglo.length; j++) {
//
//                if (arreglo[i] < arreglo[j]) {
//                    c = arreglo[i];
//                    arreglo[i] = arreglo[j];
//                    arreglo[j] = c;
//                }
//            }
//        }
//    }
//
//    public static void imprimirMatriz(float[] arreglo) {
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.println("[" + i + "]=" + arreglo[i]);
//        }
//    }

        public static void main(String[] args) {
        float[] arreglo1 = new float[50];
        float[] arreglo2 = new float[20];
        llenarMatriz(arreglo1);
        llenarMatriz(arreglo2);
        Arrays.sort(arreglo1);

        for (int i = 0; i < arreglo2.length; i++) {
            if (i < 10) {
                arreglo2[i] = arreglo1[i];
            } else {
                arreglo2[i] = (float) 0.5;
            }
        }
        
        System.out.println("-------------------------");

        imprimirMatriz(arreglo1);
        imprimirMatriz(arreglo2);

    }

    public static void llenarMatriz(float[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (float) Math.random();
            System.out.println("[" + i + "]=" + arreglo[i]);
        }
    }
    
        public static void imprimirMatriz(float[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + i + "]=" + arreglo[i]);
        }
    }
        
}




