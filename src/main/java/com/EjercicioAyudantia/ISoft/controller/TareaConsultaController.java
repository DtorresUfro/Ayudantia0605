package com.EjercicioAyudantia.ISoft.controller;

import com.EjercicioAyudantia.ISoft.model.Tarea;
import com.EjercicioAyudantia.ISoft.repository.TareaRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TareaConsultaController {

    private TareaRepository tareaRepository;

    public TareaConsultaController(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    @GetMapping
    public List<Tarea> obtenerTodas(
            @RequestParam(required = false) String prioridad,
            @RequestParam(required = false) String titulo,
            @RequestParam(required = false) String fechaLimite) {

        List<Tarea> resultado = new ArrayList<>();

        for (Tarea tarea : tareaRepository.obtenerTodas()) {

            if ((prioridad == null ||
                    prioridad.isEmpty() ||
                    prioridad.equalsIgnoreCase(tarea.getPrioridad()))
                    &&
                    (titulo == null ||
                            titulo.isEmpty() ||
                            tarea.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                    &&
                    (fechaLimite == null ||
                            fechaLimite.isEmpty() ||
                            (tarea.getFechaLimite() != null &&
                                    tarea.getFechaLimite().equals(fechaLimite)))) {
                resultado.add(tarea);
            }
        }
        return resultado;
    }


}
