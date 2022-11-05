
package main;

public class Cuenta extends Cliente {

    private int numeroCuenta;
    protected double saldo;
    private double porcentajeAhorroAnual;

    public Cuenta(int cedula, String nombres, String apellidos, int numero, double inicial, double porcentaje) {
        super(cedula, nombres, apellidos, numero);
        saldo = inicial;
        porcentajeAhorroAnual = porcentaje;
    }

    public void deposito(double cantidad) {
        saldo = saldo + cantidad;
        System.out.println("Se depositan en la cuenta: " + cantidad + " pesos");
    }

    public void retiro(double cantidad, int c) {
        if (Identificacion(c)) {
            if (puedoSacar(cantidad)) {
                saldo = saldo - cantidad;
                System.out.println("Se retiran de la cuenta " + cantidad + " pesos");
            } else {
                System.out.println("Saldo"+saldo+"retiro"+cantidad);
                System.out.println("Su saldo es insuficiente para ese retiro");
            }
        } else {
            System.out.println("Usted no es cliente, no puede hacer el retiro");
        }
    }

    public boolean puedoSacar(double cantidad) {
        return (saldo >= 500) & (saldo - cantidad >= 500);
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numero) {
        numeroCuenta = numero;
    }

    public void setInicial(double inicial) {
        if (verificarInicial(inicial)) {
            saldo = inicial;
        }
    }

    public boolean verificarInicial(double inicial) {
        return inicial == 1000;
    }

    public void setPorcentajeAhorroAnual(double porcentaje) {
        porcentajeAhorroAnual = porcentaje;
    }

    public double incrementarSaldo() {
        return saldo = saldo + porcentajeAhorroAnual * saldo;
    }
}

