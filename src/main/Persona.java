
package main;

public class Persona {

    String nombres;
    String apellidos;
    int cedula;

    public Persona(String n, String a, int c) {
        nombres = n;
        apellidos = a;
        cedula = c;
    }

    public void setNombres(String n) {
        nombres = n;
    }

    public void setApellidos(String a) {
        apellidos = a;
    }

    public void setCedula(int c) {
        cedula = c;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getCedula() {
        return cedula;
    }
    
    
}