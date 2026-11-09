package model;
import org.example.model.TipoMembresia;


import java.time.LocalDate;

public class Cliente extends model.Persona  {
    private LocalDate fechaNacimiento;
    private TipoCliente tipoCliente;
    private TipoMembresia membresia;
    private int puntosFidelizacion;

    public Cliente(String documento, String nombreCompleto, String correo, String telefono,
                   LocalDate fechaNacimiento, model.TipoCliente tipoCliente, TipoMembresia membresia, int puntosFidelizacion) {
        super(documento, nombreCompleto, correo, telefono);
        this.fechaNacimiento = fechaNacimiento;
        this.tipoCliente = tipoCliente;
        this.membresia = membresia;
        this.puntosFidelizacion = puntosFidelizacion;
    }

    //cumple años cliente
    public boolean esCumpleanos(LocalDate fecha) {
        if (this.fechaNacimiento == null || fecha == null) {
            return false;
        }
        return this.fechaNacimiento.getMonth() == fecha.getMonth() &&
                this.fechaNacimiento.getDayOfMonth() == fecha.getDayOfMonth();
    }

    // Metodo para acumular puntos
    public void acumularPuntos(int puntos) {
        if (puntos > 0) {
            this.puntosFidelizacion += puntos;
        }
    }

    // Getters y Setters
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public model.TipoCliente getTipoCliente() { return tipoCliente; }
    public void setTipoCliente(model.TipoCliente     tipoCliente) { this.tipoCliente = tipoCliente; }

    public TipoMembresia getMembresia() { return membresia; }
    public void setMembresia(TipoMembresia membresia) { this.membresia = membresia; }

    public int getPuntosFidelizacion() { return puntosFidelizacion; }
    public void setPuntosFidelizacion(int puntosFidelizacion) { this.puntosFidelizacion = puntosFidelizacion; }
}