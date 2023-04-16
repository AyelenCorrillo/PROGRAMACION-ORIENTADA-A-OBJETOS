package ar.centro35.curso.java.entities;

public class Direccion{

    private String calle;
    private int nro;
    private String piso;
    private String depto;
    private String ciudad;
    
    /**
     * Constructor para direcciones de Ciudad Autonoma de Buenos Aires
     */
    public Direccion(String calle, int nro, String piso, String depto) {
        this.calle = calle;
        this.nro = nro;
        this.piso = piso;
        this.depto = depto;
        this.ciudad = "CABA";
    }

    public Direccion(String calle, int nro, String piso, String depto, String ciudad) {
        this.calle = calle;
        this.nro = nro;
        this.piso = piso;
        this.depto = depto;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Direccion [calle=" + calle + ", nro=" + nro + ", piso=" + piso + ", depto=" + depto + ", ciudad="
                + ciudad + "]";
    }

    public String getCalle() {
        return calle;
    }

    public int getNro() {
        return nro;
    }

    public String getPiso() {
        return piso;
    }

    public String getDepto() {
        return depto;
    }

    public String getCiudad() {
        return ciudad;
    }

    
}