package ar.centro35.curso.java.test;

import ar.centro35.curso.java.entities.Cliente;
import ar.centro35.curso.java.entities.Cuenta;
import ar.centro35.curso.java.entities.Direccion;
import ar.centro35.curso.java.entities.Persona;
import ar.centro35.curso.java.entities.Vendedor;

public class TestHerencia {
    public static void main(String[] args) {
        System.out.println("-- dir1 --");
        Direccion dir1=new Direccion("Lima", 222, "3", "e");
        System.out.println(dir1);

        System.out.println("-- dir2 --");
        Direccion dir2=new Direccion("Belgrano", 49, null, null, "Moron");
        System.out.println(dir2);

        /* 
        System.out.println("-- persona1 --");
        Persona persona1=new Persona("Cristina",26,dir1);
        System.out.println(persona1);
        persona1.saludar();

        System.out.println("-- persona2 --");
        Persona persona2=new Persona("Teresa", 50, dir2);
        System.out.println(persona2);
        persona2.saludar();
        */
        
        System.out.println("-- vendedor1 --");
        Vendedor vendedor1=new Vendedor(
                            "Lusi", 
                            22, 
                            dir2, 
                            1, 
                            380000
                );
        System.out.println(vendedor1);
        vendedor1.saludar();

        System.out.println("-- cliente1 --");
        Cliente cliente1=new Cliente(
                                    "Jose",
                                    36,
                                    dir1,
                                    1,
                                    new Cuenta(1,"arg$")
                );
        System.out.println(cliente1);
        cliente1.saludar();

        

    }
}
