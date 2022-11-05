
package main;

public class Cliente extends Persona {

    private int numeroCliente;

    public Cliente(int cedula, String nombres, String apellidos, int numero) {
        super(nombres, apellidos, cedula);
        numeroCliente = numero;
    }

    public boolean Identificacion(int c) {
        return cedula == c;
    }

    public void setNumeroCliente(int n) {
        numeroCliente = n;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }
}