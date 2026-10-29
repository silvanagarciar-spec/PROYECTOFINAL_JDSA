package model;

public class VentaNoEncontrada extends RuntimeException {
    public VentaNoEncontrada(String message) {
        super(message);
    }
}
