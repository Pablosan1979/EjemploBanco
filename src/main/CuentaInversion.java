
package main;

public class CuentaInversion extends Cuenta {

    public CuentaInversion(int cedula, String nombres, String apellidos, int numero, double inicial, double porcentaje) {
        super(cedula, nombres, apellidos, numero, inicial, porcentaje);
    }

    @Override
    public boolean puedoSacar(double cantidad) {
        return (saldo >= 10000) & (saldo - cantidad >= 10000);
    }

    @Override
    public boolean verificarInicial(double inicial) {
        return inicial == 25000;
    }

    public void cancelarCuenta(double cantidad, int c) {
        System.out.println("Cantidad" + cantidad + " Saldo" + saldo);
        if (Identificacion(c)) {
            saldo = saldo - cantidad;
            System.out.println("Se retiran de la cuenta " + cantidad + " pesos");
        }
    }
}