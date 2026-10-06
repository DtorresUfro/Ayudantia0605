package com.EjercicioAyudantia.ISoft;

import java.util.Date;

public class task {
    private int id;
    private String titulo;
    private Prioridad prioridad;
    private Date fechaLimite;
    private boolean completada;

    public task(int id, String titulo, Prioridad prioridad, Date fechaLimite, boolean completada) {
        this.id = id;
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.fechaLimite = fechaLimite;
        this.completada = completada;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public Prioridad getPrioridad() {return prioridad;}
    public void setPrioridad(Prioridad prioridad) {this.prioridad = prioridad;}

    public Date getFechaLimite() {return fechaLimite;}
    public void setFechaLimite(Date fechaLimite) {this.fechaLimite = fechaLimite;}

    public boolean isCompletada() {return completada;}
    public void setCompletada(boolean completada) {this.completada = completada;}

    @Override
    public String toString() {
        return "task{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", prioridad=" + prioridad +
                ", fechaLimite=" + fechaLimite +
                ", completada=" + completada +
                '}';
    }
}