package model;

import java.time.LocalDate;

public class Cliente {
    private String identificacion;
    private String nombre;
    private TipoCliente tipoCliente;
    private LocalDate fechaNacimiento;

    public Cliente(String identificacion, String nombre, TipoCliente tipoCliente, LocalDate fechaNacimiento) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.tipoCliente = tipoCliente;
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean esCumpleannos(LocalDate f) {
        if (this.fechaNacimiento == null || f == null) {
            return false;
        }
        return this.fechaNacimiento.getMonth() == f.getMonth() && 
               this.fechaNacimiento.getDayOfMonth() == f.getDayOfMonth();
    }

    public String getIdentificacion() { return identificacion; }
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public TipoCliente getTipoCliente() { return tipoCliente; }
    public void setTipoCliente(TipoCliente tipoCliente) { this.tipoCliente = tipoCliente; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
}
