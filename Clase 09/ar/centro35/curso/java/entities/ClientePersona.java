package ar.centro35.curso.java.entities;

public class ClientePersona {
    private int nro;
    private String nombre;
    private int edad;
    private Cuenta cuenta;
    

    //Cliente puede crearse sin cuenta
    public ClientePersona(int nro, String nombre, int edad) {
        this.nro = nro;
        this.nombre = nombre;
        this.edad = edad;
    }

    //Cliente siempre tiene una cuenta
    //Una cuenta puede pertenecer a más de un cliente
    public ClientePersona(int nro, String nombre, int edad, Cuenta cuenta) {
        this.nro = nro;
        this.nombre = nombre;
        this.edad = edad;
        this.cuenta = cuenta;
    }

    //Cliente siempre tiene una cuenta
    //La cuenta solo pertenece a este cliente
    public ClientePersona(int nro, String nombre, int edad, int nroCuenta, String moneda) {
        this.nro = nro;
        this.nombre = nombre;
        this.edad = edad;
        this.cuenta = new Cuenta(nroCuenta, moneda);
    }


    @Override
    public String toString() {
        return "ClientePersona [nro=" + nro + ", nombre=" + nombre + ", edad=" + edad + ", cuenta=" + cuenta + "]";
    }

    public int getNro() {
        return nro;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    
}
