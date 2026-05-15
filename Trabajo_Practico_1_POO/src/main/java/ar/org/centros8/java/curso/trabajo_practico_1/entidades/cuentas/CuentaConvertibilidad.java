package ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas;
import ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes.ClienteEmpresa;
import lombok.ToString;


@ToString(callSuper = true)
public class CuentaConvertibilidad extends CuentaCorriente {
    private double saldoEnDolares;

    public CuentaConvertibilidad(int nroDeCuenta, ClienteEmpresa clienteAsociado, double giroEnDescubierto) {
        super(nroDeCuenta, clienteAsociado, giroEnDescubierto);
    }

    // convertir a dolar
    public double convertirADolares(double montoEnPeso, double precioDolar) {
        if (montoEnPeso <= getSaldo()) {
            System.out.println("Sr. Cliente la compra en dolares es solo con saldo en cuenta.");
            setSaldo(getSaldo() - montoEnPeso);
            this.saldoEnDolares = Math.round((saldoEnDolares + (montoEnPeso / precioDolar)) * 100.0) / 100.0;
            return saldoEnDolares;
        } else {
            System.out.println("Saldo en pesos insuficiente para realizar la operacion");
            return saldoEnDolares;
        }
    }

    // convertir a pesos
    public double convertirAPesos(double montoEnDolares, double precioDolar) {
        if (montoEnDolares <= saldoEnDolares) {
            saldoEnDolares -= montoEnDolares;
            setSaldo(getSaldo() + (montoEnDolares * precioDolar));
            return getSaldo();
        } else {
            System.out.println("Saldo en dolares insuficiente");
            return getSaldo();
        }
    }

    // Méto para depositar dolares
    public void depositarDolares(double monto) {
        saldoEnDolares = saldoEnDolares + monto;
    }

    // metodo extracion dolares, siempre y cuando haya saldoDolar positivo.
    public void extraerDolares(double monto) {
        if (saldoEnDolares >= monto) {
            saldoEnDolares -= monto;
        } else {
            System.out.println("Saldo en dolares Insuficiente");
        }
    }
}
