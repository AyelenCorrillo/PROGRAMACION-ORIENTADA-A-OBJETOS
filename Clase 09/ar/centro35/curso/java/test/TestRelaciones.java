package ar.centro35.curso.java.test;

import ar.centro35.curso.java.entities.ClienteEmpresa;
import ar.centro35.curso.java.entities.ClientePersona;
import ar.centro35.curso.java.entities.ClienteTemporario;
import ar.centro35.curso.java.entities.Cuenta;

public class TestRelaciones {
    public static void main(String[] args) {
        System.out.println("-- cuenta1 --");
        Cuenta cuenta1 = new Cuenta(1,"arg$");
        cuenta1.depositar(40000);
        cuenta1.depositar(50000);
        cuenta1.debitar(15000);
        System.out.println(cuenta1);

        System.out.println("-- clientePersona1 --");
        //Cliente sin Cuenta
        ClientePersona clientePersona1=new ClientePersona(1, "Javier", 35);
        System.out.println(clientePersona1);

        System.out.println("-- clientePersona2 --");
        ClientePersona marcos=new ClientePersona(
                                            1,                                  //nro
                                            "Marcos",                        //nombre
                                            40,                                //edad
                                            new Cuenta(2,"arg$")         //cuenta
                            );
        marcos.getCuenta().depositar(250000);
        marcos.getCuenta().debitar(20000);
        System.out.println(marcos);

        ClientePersona claudia=new ClientePersona(3, "Claudia", 40, marcos.getCuenta());
        claudia.getCuenta().debitar(80000);
        claudia.getCuenta().debitar(50000);
        System.out.println(claudia);
        System.out.println(marcos);

        System.out.println("-- clientePersona3 --");
        ClientePersona clientePersona3=new ClientePersona(
                        30, 
                        "Hernan", 
                        33, 
                        4, 
                        "arg$"
                    );
        
        clientePersona3.getCuenta().depositar(50000);
        System.out.println(clientePersona3);

        //Generar una clase llamada ClienteTemporario, que tiene como atributos
        //  - nro   -nombre -direccion y una cuenta que debe ser compartida con otro cliente,
        // Este cliente no puede tener una cuenta propia
        // Este cliente siempre debe tener una cuenta asociada.(no se puede crear sin una cuenta)
        ClienteTemporario clienteTemporario1=new ClienteTemporario(
                    1, 
                    "Jose", 
                    "Lima 222", 
                    marcos.getCuenta()
            );
        System.out.println(clienteTemporario1);

        System.out.println("-- clienteEmpresa1 --");
        ClienteEmpresa clienteEmpresa1=new ClienteEmpresa(
                            1, 
                            "Todo Limpio SRL", 
                            "Peru 654"
            );
        Cuenta[] cuentas=clienteEmpresa1.getCuentas();
        cuentas[0] = new Cuenta(10, "arg$");
        cuentas[1] = new Cuenta(11, "Reales");
        cuentas[2] = new Cuenta(12, "U$S");
        cuentas[0].depositar(450000);
        cuentas[0].depositar(540000);
        cuentas[0].debitar(120000);
        cuentas[1].depositar(35000);
        cuentas[2].depositar(12000);
        System.out.println(clienteEmpresa1);

        

    }
}
