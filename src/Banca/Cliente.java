/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Angel Garcia 1ºDAM B
 */
public class Cliente {
    
    Scanner sc = new Scanner(System.in);
    
    private String nombre;
    private String apellidos;
    private String direccion;
    private String nif;
    private int telefono;
    private int edad;
    private ArrayList<Cuenta> cuentas;

    public Cliente(String nombre, String apellidos, String direccion, 
            String nif, int telefono, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.nif = nif;
        this.telefono = telefono;
        this.edad = edad;
        this.cuentas = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void añadirCuenta() {
        System.out.println("Introduce el numero de cuenta de la nueva cuenta");
        int numCuentaAux = sc.nextInt();
        sc.nextInt();
        System.out.println("Introduce el saldo que vas a ingresar en la cuenta"
                + " ahora:");
        int saldoAux = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el limite de retirada de dinero en"
                + " cajero");
        int limiteRetiradaCajeroAux = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el limite de compra online:");
        int limitePagoInternetAux = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce la fecha de hoy:");
        String fechaAperturaAux = sc.nextLine();
        cuentas.add(new Cuenta(numCuentaAux, saldoAux, limiteRetiradaCajeroAux,
                    limitePagoInternetAux, fechaAperturaAux));
    }
    
    public void ingresar() {
        System.out.println("Introduce el numero de cuenta a ingresar dinero");
        int numCuentaAux = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce la cantidad que vas a ingresar:");
        int saldoAux = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNumCuenta() == numCuentaAux) {
                cuentas.get(i).setSaldo(cuentas.get(i).getSaldo() + saldoAux);
            }
        }
    }   
    
    public void sacarDinero() {
        System.out.println("Introduce el numero de cuenta de la que deseas"
                + " sacar dinero:");
        int numCuentaAux = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce la cantidad de dinero a sacar:");
        int retirada = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNumCuenta() == numCuentaAux &&
                    (cuentas.get(i).getSaldo() - retirada) > 0 &&
                    cuentas.get(i).getLimiteRetiradaCajero() > retirada) {
                cuentas.get(i).setSaldo(cuentas.get(i).getSaldo() - retirada);
            } else if (cuentas.get(i).getNumCuenta() == numCuentaAux &&
                    (cuentas.get(i).getSaldo() - retirada) <= 0){
                System.out.println("No tienes suficiente saldo.");
            } else if (cuentas.get(i).getNumCuenta() == numCuentaAux &&
                    cuentas.get(i).getLimiteRetiradaCajero() < retirada) {
                System.out.println("No puede retirar una cantidad superior"
                        + " al límite de retirada de dinero de su cuenta.");
            }
        }
    }
    
    public void pagoInternet() {
        System.out.println("Introduce el numero de cuenta de la que deseas"
                + " sacar dinero:");
        int numCuentaAux = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el valor de la compra:");
        int valorCompra = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNumCuenta() == numCuentaAux &&
                    (cuentas.get(i).getSaldo() - valorCompra) > 0 &&
                    cuentas.get(i).getLimiteRetiradaCajero() > valorCompra) {
                cuentas.get(i).setSaldo(cuentas.get(i).getSaldo() - valorCompra);
                cuentas.get(i).setTotalCompras(cuentas.get(i).getTotalCompras()
                        + valorCompra);
            } else if (cuentas.get(i).getNumCuenta() == numCuentaAux &&
                    (cuentas.get(i).getSaldo() - valorCompra) <= 0){
                System.out.println("No tienes suficiente saldo.");
            } else if (cuentas.get(i).getNumCuenta() == numCuentaAux &&
                    cuentas.get(i).getLimiteRetiradaCajero() < valorCompra) {
                System.out.println("No puede retirar una cantidad superior"
                        + " al límite de retirada de dinero de su cuenta.");
            }
        }
    }
    
    public void TotalPagosInternet() {
        System.out.println("Introduce el numero de cuenta del que deseas "
                + "comprobar el total de pagos realizados con tarjeta:");
        int numCuentaAux = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNumCuenta() == numCuentaAux) {
                System.out.println("El total de pagos realizados con la "
                        + "tarjeta de esta cuenta es de: " + 
                        cuentas.get(i).getTotalCompras());
            }
        }
        
    }
}
