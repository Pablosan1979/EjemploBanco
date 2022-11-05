
package main;

import java.util.Arrays;

public class Empleado extends Persona {

    private int añosAntiguedadEmpleado;
    public String cargoEmpleado;
    private int diasVacacionesEmpleado;
    private double salario;
    private String[] arrayCargos = {"cajero", "supervisor", "recepcionista"};

    public Empleado(int cedula, String nombres, String apellidos, int antiguedad, String cargo) {
        super(nombres, apellidos, cedula);
        añosAntiguedadEmpleado = antiguedad;
        cargoEmpleado = cargo;
    }

    public int getAniosAntiguedadEmpleado() {
        return añosAntiguedadEmpleado;
    }

    public void diasVacaciones(int antiguedad) {
        diasVacacionesEmpleado = 0;
        añosAntiguedadEmpleado = antiguedad;
        if (añosAntiguedadEmpleado <= 1) {
            diasVacacionesEmpleado = 0;
        } else if (añosAntiguedadEmpleado == 1) {
            diasVacacionesEmpleado = 5;
        } else if (añosAntiguedadEmpleado <= 8) {
            diasVacacionesEmpleado = (añosAntiguedadEmpleado - 1) * 2 + 5;
        } else {
            diasVacacionesEmpleado = 20;
        }
        //return diasVacacionesEmpleado;
        System.out.println("El empleado " + nombres + " " + apellidos + " tiene " + diasVacacionesEmpleado + " dias de vacaciones");
    }

    public void setCargo(String cargo) {
        if (validarCargo(cargo)) {
            cargoEmpleado = cargo;
        } else {
            System.out.println("Ese no es un cargo valido");
        }
    }

    public String getCargo() {
        return cargoEmpleado;
    }

    public void setAniosAntiguedadEmpleado(int antiguedad) {
        añosAntiguedadEmpleado = antiguedad;
    }

    public boolean validarCargo(String cargo) {
        return Arrays.asList(arrayCargos).contains(cargo);
    }
    
    public void Salario(double s){
        salario=s;
    }
}
