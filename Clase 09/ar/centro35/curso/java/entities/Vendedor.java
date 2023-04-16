package ar.centro35.curso.java.entities;

public class Vendedor extends Persona {

    private int nroLegajo;
    private double sueldoBasico;

    public Vendedor(String nombre, int edad, Direccion direccion, int nroLegajo, double sueldoBasico) {
        super(nombre, edad, direccion); // super llama al constructor de la clase padre
        this.nroLegajo = nroLegajo;
        this.sueldoBasico = sueldoBasico;

    }

    @Override
    public void saludar() {
        super.saludar();
    }

    @Override
    public String toString() {
        return super.toString() + " Vendedor [nroLegajo=" + nroLegajo + ", sueldoBasico=" + sueldoBasico + "]";
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

}
