package ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas;

import ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class CajaDeAhorro extends Cuenta {
    private double tasaDeInteres;

    public CajaDeAhorro(int nroDeCuenta, Cliente clienteAsociado, double tasaDeInteres) {
        super(nroDeCuenta, clienteAsociado);
        this.tasaDeInteres = tasaDeInteres;
    }

    @Override // metodo depositar
    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Monto ingresado invalido");
        }
        else{
            setSaldo(getSaldo() + monto);}
        
    }

    @Override // metodo extraer
    public void extraer(double monto) {
        if (monto <= 0) {
            System.out.println("Monto ingresado invalido");
        }
        if (getSaldo() >= monto) {
            setSaldo(getSaldo() - monto);
        }
        else{
            System.out.println("Saldo insuficiente. Su saldo es de: " + getSaldo());
        }
    }

    // Método para cobrar intereses
    public void cobrarInteres() {
        setSaldo (getSaldo() + ((getSaldo() * getTasaDeInteres())/100));
        System.out.println("Se ha cobrado el interes correspondiente a la caja de ahorro, el nuevo saldo es: " + getSaldo());
    }
}
