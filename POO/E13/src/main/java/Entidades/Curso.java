/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Curso {
    private String nombreCurso,turno;
    private int cantidadHorasPorDia,cantidadDiasPorSemana,precioPorHora;
    String[] alumnos = new String[5];
    int numAlumnos = 0;

    public Curso() {
    }

    public Curso(String nombreCurso, String turno, int cantidadHorasPorDia, int cantidadDiasPorSemana, int precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getTurno() {
        return turno;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    public void cargarAlumnos() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese la cantidad de alumnos");
        numAlumnos = scanner.nextInt();

        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            alumnos[i] = scanner.next();
        }
    }
    
    public void crearCurso(){
        
        nombreCurso = "Historia";
        turno = "mañana";
        cantidadHorasPorDia = 3;
        cantidadDiasPorSemana = 2;
        precioPorHora = 15;
        cargarAlumnos();
        
    }
    
    public void calcularGananciaSemanal(){
        int ganancia = cantidadHorasPorDia*cantidadDiasPorSemana*precioPorHora*numAlumnos;
        System.out.println("La ganancia es "+ganancia);
    }
    
}
