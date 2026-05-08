package ar.org.centros8.java.curso.trabajo_practico_1.tests;

import java.time.LocalDate;

import ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes.Cliente;
import ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes.ClienteEmpresa;
import ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes.ClienteIndividual;
import ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas.CajaDeAhorro;
import ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas.Cheque;
import ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas.CuentaConvertibilidad;
import ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas.CuentaCorriente;

public class TestTP1 {
    public static void main(String[] args) {
        System.out.println("######################Test de la clase ClienteIndividual######################");

        Cliente clienteIndividual1 = new ClienteIndividual(1, "Alan", "Brado", "33944177");
        System.out.println(clienteIndividual1);
        clienteIndividual1.saludar();
        System.out.println("****ClienteIndividual funcionando*****");
        System.out.println();
        System.out.println();

        System.out.println("######################Test de la clase ClienteEmpresa######################");   
        ClienteEmpresa clienteEmpresa1 = new ClienteEmpresa(101, "Financiera Franciasco", "27-40157963-3");
        System.out.println(clienteEmpresa1);
        clienteEmpresa1.saludar();
        System.out.println("****ClienteEmpresa funcionando*****");        
        System.out.println();
        System.out.println();

        System.out.println("######################Test de la clase CajaDeAhorro######################");
        CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro(10, clienteIndividual1, 5);
        System.out.println(cajaDeAhorro1);
        cajaDeAhorro1.depositar(100000);
        System.out.println(cajaDeAhorro1);
        cajaDeAhorro1.extraer(50000);
        System.out.println(cajaDeAhorro1);
        cajaDeAhorro1.cobrarInteres();
        System.out.println("****CajaDeAhorro funcionando*****");
        System.out.println();        
        System.out.println();

        System.out.println("######################Test de la clase CuentaCorriente######################");
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(102, clienteEmpresa1, 10000);
        System.out.println(cuentaCorriente1);
        cuentaCorriente1.depositar(100000);
        System.out.println(cuentaCorriente1);
        cuentaCorriente1.extraer(105000);
        System.out.println(cuentaCorriente1);
        cuentaCorriente1.extraer(10000);
        cuentaCorriente1.extraer(5000);
        System.out.println(cuentaCorriente1);
        cuentaCorriente1.extraer(5000);
        System.out.println(cuentaCorriente1);
        cuentaCorriente1.extraer(100000);
        System.out.println(cuentaCorriente1);
        Cheque cheque1 = new Cheque(10000, "Galicia", LocalDate.of(2026, 04, 27));
        cuentaCorriente1.depositarCheque(cheque1);
        System.out.println(cuentaCorriente1);
        cuentaCorriente1.depositar(14000);
        System.out.println(cuentaCorriente1);
        System.out.println("****CuentaCorriente funcionando*****");
        System.out.println();
        System.out.println();

        System.out.println("######################Test de la clase cuentaConvertibilidad######################");
        CuentaConvertibilidad cuentaConvertibilidad1 = new CuentaConvertibilidad(1, clienteEmpresa1, 0);
        System.out.println(cuentaConvertibilidad1);
        cuentaConvertibilidad1.depositarDolares(100);
        System.out.println(cuentaConvertibilidad1);
        cuentaConvertibilidad1.extraerDolares(50);
        System.out.println(cuentaConvertibilidad1);
        cuentaConvertibilidad1.convertirADolares(14000, 1400);
        cuentaConvertibilidad1.convertirAPesos(50, 1400);
        System.out.println(cuentaConvertibilidad1);
        cuentaConvertibilidad1.convertirADolares(70000, 1400);
        System.out.println(cuentaConvertibilidad1);
        System.out.println("****CuentaCorriente funcionando*****");

    }

}
