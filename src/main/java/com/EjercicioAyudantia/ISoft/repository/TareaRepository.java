package com.EjercicioAyudantia.ISoft.repository;
import com.EjercicioAyudantia.ISoft.model.Tarea;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TareaRepository {
    private final List<Tarea> tareas = new ArrayList<>();
    public List<Tarea> obtenerTodas() {return tareas;}
    public void agregar(Tarea tarea) {tareas.add(tarea);}}