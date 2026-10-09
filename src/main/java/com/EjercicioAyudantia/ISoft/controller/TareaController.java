package com.EjercicioAyudantia.ISoft.controller;
import com.EjercicioAyudantia.ISoft.dto.CrearTareaRequest;
import com.EjercicioAyudantia.ISoft.model.Tarea;
import com.EjercicioAyudantia.ISoft.repository.TareaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TareaController {
    private final TareaRepository repository;

    public TareaController(TareaRepository repository) {this.repository = repository;}
    @PostMapping
    public ResponseEntity<Tarea> crear(@RequestBody CrearTareaRequest request) {
        Tarea creada = repository.crear(request.titulo(), request.prioridad(), request.fechaLimite());
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);}
}