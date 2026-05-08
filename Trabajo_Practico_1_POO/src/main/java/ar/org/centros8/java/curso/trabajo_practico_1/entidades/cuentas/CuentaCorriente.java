package ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas;

import ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class CuentaCorriente extends Cuenta {
    private double giroEnDescubierto;

    public CuentaCorriente(int nroDeCuenta, Cliente clienteAsociado, double giroEnDescubierto) {
        super(nroDeCuenta, clienteAsociado);
        this.giroEnDescubierto = giroEnDescubierto;
    }

    // metodo depositar
    @Override
    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Monto ingresado invalido");
        }
        else{
            setSaldo(getSaldo() + monto);}
    }

    // metodo extraer con giro al descubierto
    @Override
    public void extraer(double monto) {
        if (monto <= 0) {
            System.out.println("Monto ingresado invalido");
        }
        if (getSaldo() + giroEnDescubierto >= monto) {
            setSaldo(getSaldo() - monto);
        } else {
            System.out.println("Supera el límite de descubierto");
        }
    }

    // Metodo para depositar cheque
    public void depositarCheque(Cheque cheque) {
        setSaldo(getSaldo() + cheque.getMonto());
    }
}
