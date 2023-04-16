package ar.centro35.curso.java.entities;

public class Cliente extends Persona{

    private int nroCliente;
    private Cuenta cuenta;
    
    public Cliente(String nombre, int edad, Direccion direccion, int nroCliente, Cuenta cuenta) {
        super(nombre, edad, direccion);
        this.nroCliente = nroCliente;
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return super.toString()+" Cliente [nroCliente=" + nroCliente + ", cuenta=" + cuenta + "]";
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
 
}
