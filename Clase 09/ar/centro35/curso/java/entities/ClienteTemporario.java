package ar.centro35.curso.java.entities;

public class ClienteTemporario {
    private int nro;
    private String nombre;
    private String direccion;
    private Cuenta cuenta;

    public ClienteTemporario(int nro, String nombre, String direccion, Cuenta cuenta) {
        this.nro = nro;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "ClienteTemporario [nro=" + nro + ", nombre=" + nombre + ", direccion=" + direccion + ", cuenta="
                + cuenta + "]";
    }

    public int getNro() {
        return nro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
 
}
