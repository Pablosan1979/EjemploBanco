
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean eleccionCorrecta = true;
        int operacion;
        Scanner reader = new Scanner(System.in);
        double inicial;
        double totalCuenta;

        while (eleccionCorrecta) {
            eleccionCorrecta = false;
            System.out.print("Que operacion desea realizar \n");
            System.out.print("Elija \n 1. Cuenta de Ahorros. \n 2. Cuenta de Inversión \n 3. Calcular vacaciones empleado \n");
            operacion = reader.nextInt();

            //Operacion
            switch (operacion) {
                case 1 -> {
                    // Crear la cuenta
                    eleccionCorrecta = true;
                    Cuenta Cuenta1;
                    Cuenta1 = new Cuenta(0, "", "", 0, 0, 0);
                    System.out.print("Cedula cliente: ");
                    int cedula = reader.nextInt();
                    Cuenta1.setCedula(cedula);
                    System.out.print("Nombres cliente: ");
                    String nombres = reader.next();
                    Cuenta1.setNombres(nombres);
                    System.out.print("Nombres Apellidos: ");
                    String apellidos = reader.next();
                    Cuenta1.setNombres(apellidos);
                    System.out.print("Numero de cuenta: ");
                    int numero = reader.nextInt();
                    Cuenta1.setNumeroCliente(numero);
                    boolean valor = true;
                    while (valor) {
                        System.out.print("Cantidad inicial: ");
                        inicial = reader.nextInt();
                        Cuenta1.setInicial(inicial);
                        if (Cuenta1.verificarInicial(inicial)) {
                            valor = false;
                        } else {
                            System.out.println("El primer deposito debe ser igual a 1000");
                        }
                    }
                    System.out.print("Porcentaje de Ahorro Anual: ");
                    double porcentaje = reader.nextDouble();
                    Cuenta1.setPorcentajeAhorroAnual(porcentaje);

                    while (eleccionCorrecta) {
                        eleccionCorrecta = false;
                        System.out.print("Que operacion desea realizar \n");
                        System.out.print("Elija \n 1. Para deposito. \n 2. Para retiro \n");
                        operacion = reader.nextInt();

                        //Operacion
                        switch (operacion) {
                            case 1 -> {
                                // hacemos un ingreso en la cuenta
                                System.out.print("Cantidad depositar: ");
                                double deposito = reader.nextDouble();
                                Cuenta1.deposito(deposito);
                                // break es opcional
                            }
                            case 2 -> {
                                // hacemos un ingreso en la cuenta
                                System.out.print("Cantidad a retirar: ");
                                double retiro = reader.nextDouble();
                                System.out.print("Ingrese su cedula: ");
                                int c = reader.nextInt();
                                Cuenta1.retiro(retiro, c);
                                // break es opcional
                            }
                            default -> {
                                System.out.print("Elija una opcion valida \n");
                                eleccionCorrecta = true;
                            }
                        }
                        // declaracion case
                        // los valores deben ser del mismo tipo de la expresion

                        System.out.println("-------------------------------------------------");
                        // Consultamos el saldo de nuevo
                        totalCuenta = Cuenta1.getSaldo();
                        System.out.println("Total actual en la cuenta: " + totalCuenta + " pesos");
                    }
                }

                case 2 -> {
                    // Crear la cuenta
                    eleccionCorrecta = true;
                    CuentaInversion CuentaInversion1;
                    CuentaInversion1 = new CuentaInversion(0, "", "", 0, 0, 0);
                    System.out.print("Cedula cliente: ");
                    int cedula = reader.nextInt();
                    CuentaInversion1.setCedula(cedula);
                    System.out.print("Nombres cliente: ");
                    String nombres = reader.next();
                    CuentaInversion1.setNombres(nombres);
                    System.out.print("Nombres Apellidos: ");
                    String apellidos = reader.next();
                    CuentaInversion1.setNombres(apellidos);
                    System.out.print("Numero de cuenta: ");
                    int numero = reader.nextInt();
                    CuentaInversion1.setNumeroCliente(numero);
                    boolean valor = true;
                    while (valor) {
                        System.out.print("Cantidad inicial: ");
                        inicial = reader.nextInt();
                        CuentaInversion1.setInicial(inicial);
                        if (CuentaInversion1.verificarInicial(inicial)) {
                            valor = false;
                        } else {
                            System.out.println("El primer deposito debe ser igual a 25000");
                        }
                    }
                    while (eleccionCorrecta) {
                        eleccionCorrecta = false;
                        System.out.print("Que operacion desea realizar \n");
                        System.out.print("Elija \n 1. Para deposito. \n 2. Para retiro \n 3. Cancelar cuenta (Retirar todo)\n");
                        operacion = reader.nextInt();

                        //Operacion
                        switch (operacion) {
                            case 1 -> {
                                // hacemos un ingreso en la cuenta
                                System.out.print("Cantidad depositar: ");
                                double deposito = reader.nextDouble();
                                CuentaInversion1.deposito(deposito);
                                // break es opcional
                            }
                            case 2 -> {
                                // hacemos un ingreso en la cuenta
                                System.out.print("Cantidad a retirar: ");
                                double retiro = reader.nextDouble();
                                System.out.print("Ingrese su cedula: ");
                                int c = reader.nextInt();
                                CuentaInversion1.retiro(retiro, c);
                                // break es opcional
                            }
                            case 3 -> {
                                double cantidad = CuentaInversion1.getSaldo();
                                System.out.print("Cantidad a retirar: \n" + cantidad + "\n");
                                System.out.print("Ingrese su cedula: ");
                                int c = reader.nextInt();
                                CuentaInversion1.cancelarCuenta(cantidad, c);
                                // break es opcional
                            }
                            default -> {
                                System.out.print("Elija una opcion valida \n");
                                eleccionCorrecta = true;
                            }
                        }
                        // declaracion case
                        // los valores deben ser del mismo tipo de la expresion

                        System.out.println("-------------------------------------------------");
                        // Consultamos el saldo de nuevo
                        totalCuenta = CuentaInversion1.getSaldo();
                        System.out.println("Total actual en la cuenta: " + totalCuenta + " pesos");
                    }
                }
                case 3 -> {
                    //Crear el empleado
                    Empleado Empleado1;
                    Empleado1 = new Empleado(0, "0", "0", 0, "");
                    System.out.print("Nombres empleado: ");
                    String nombres = reader.next();
                    Empleado1.setNombres(nombres);
                    System.out.print("Apellidos empleado: ");
                    String apellidos = reader.next();
                    Empleado1.setApellidos(apellidos);
                    System.out.print("Cedula del empleado: ");
                    int cedula = reader.nextInt();
                    Empleado1.setCedula(cedula);
                    System.out.print("Cargo: ");
                    String cargo = reader.next();
                    Empleado1.setCargo(cargo);
                    System.out.print("Años de antigüedad: ");
                    int antiguedad = reader.nextInt();
                    Empleado1.setAniosAntiguedadEmpleado(antiguedad);
                    Empleado1.diasVacaciones(Empleado1.getAniosAntiguedadEmpleado());
                }
                default -> {
                    System.out.print("Elija una opcion valida \n");
                    eleccionCorrecta = true;
                }
            }

        }
        reader.close();
    }
}