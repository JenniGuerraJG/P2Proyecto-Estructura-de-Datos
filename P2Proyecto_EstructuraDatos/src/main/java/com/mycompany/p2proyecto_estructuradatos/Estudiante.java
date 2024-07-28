
package com.mycompany.p2proyecto_estructuradatos;

public class Estudiante {
    private String nombre;
    private double notaP1;
    private double notaP2;
    private double notaP3;

    public Estudiante(String nombre, double notaP1, double notaP2, double notaP3) {
        this.nombre = nombre;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaP3 = notaP3;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaP1() {
        return notaP1;
    }

    public double getNotaP2() {
        return notaP2;
    }

    public double getNotaP3() {
        return notaP3;
    }

    public double calcularNotaFinal() {
        return (notaP1 + notaP2 + notaP3) / 3.0;
    }
}
