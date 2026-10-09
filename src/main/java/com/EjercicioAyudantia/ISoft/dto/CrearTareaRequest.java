package com.EjercicioAyudantia.ISoft.dto;

public record CrearTareaRequest(
        String titulo,
        String prioridad,
        String fechaLimite
) {}
