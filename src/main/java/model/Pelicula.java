package model;

import org.example.model.Clasificacion;
import org.example.model.EstadoPelicula;
import org.example.model.Genero;

public class Pelicula {
    private String codigo;
    private String titulo;
    private int duracionMinutos;
    private Genero genero;
    private Clasificacion clasificacion;
    private EstadoPelicula estado;
    //metodo constructor
    public Pelicula(String codigo, String titulo, int duracionMinutos, Genero genero, Clasificacion clasificacion, EstadoPelicula estado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.estado = estado;
    }
//Metodo para desabilitar

    public void deshabilitar() {

        this.estado = EstadoPelicula.NO_DISPONIBLE;
    }

    public boolean estaDisponible() {

        return this.estado == EstadoPelicula.DISPONIBLE;
    }
    public void habilitar() {

        this.estado = EstadoPelicula.DISPONIBLE;
    }

    // Getters y Setters
    public String getCodigo() {

        return codigo;
    }
    public void setCodigo(String codigo) {

        this.codigo = codigo;
    }

    public String getTitulo() {

        return titulo;
    }
    public void setTitulo(String titulo)
    {

        this.titulo = titulo;
    }

    public int getDuracionMinutos() {

        return duracionMinutos;
    }
    public void setDuracionMinutos(int duracionMinutos) {

        this.duracionMinutos = duracionMinutos;
    }

    public Genero getGenero() {

        return genero;
    }
    public void setGenero(Genero genero) {

        this.genero = genero;
    }

    public Clasificacion getClasificacion() {

        return clasificacion;
    }
    public void setClasificacion(Clasificacion clasificacion) {

        this.clasificacion = clasificacion;
    }

    public EstadoPelicula getEstado() {

        return estado;
    }
    public void setEstado(EstadoPelicula estado) {

        this.estado = estado;
    }
}

