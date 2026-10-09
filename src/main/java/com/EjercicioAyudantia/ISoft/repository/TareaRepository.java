package com.EjercicioAyudantia.ISoft.repository;
import com.EjercicioAyudantia.ISoft.model.Tarea;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class TareaRepository {
    private final List<Tarea> tareas = new ArrayList<>();
    private final AtomicLong secuencia = new AtomicLong(0);

    public List<Tarea> obtenerTodas() {return tareas;}
    public void agregar(Tarea tarea) {tareas.add(tarea);}

    public Tarea crear(String titulo, String prioridad, String fechaLimite) {
        Tarea tarea = new Tarea(secuencia.incrementAndGet(), titulo, prioridad, fechaLimite);
        agregar(tarea);
        return tarea;
    }
}