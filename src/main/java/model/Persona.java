package model;

public abstract class Persona {
    private String documento;
    private String nombreCompleto;
    private String correo;
    private String telefono;

    //Metodo constructor
    public Persona(String documento, String nombreCompleto, String correo, String telefono) {
        this.documento = documento;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.telefono = telefono;
    }

    //Metodo para validar que el documento sea valido
    public boolean validarDocumento() {
        // Simplemente revisa si el documento tiene algún valor (no es nulo)
        if (this.documento != null) {
            return true;
        } else {
            return false;
        }
    }

    // Getters y Setters
    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}
