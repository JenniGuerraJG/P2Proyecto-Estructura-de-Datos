package com.mycompany.p2proyecto_estructuradatos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grafo {

    private Map<String, Estudiante> estudiantes;

    public Grafo() {
        estudiantes = new HashMap<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.put(estudiante.getNombre(), estudiante);
    }

    public Map<String, Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantesList) {
        estudiantes.clear();
        for (Estudiante estudiante : estudiantesList) {
            estudiantes.put(estudiante.getNombre(), estudiante);
        }
    }
}
