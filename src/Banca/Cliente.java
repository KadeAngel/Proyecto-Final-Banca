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
 * @author Angel Garcia 1Ã‚ÂºDAM B
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
    
    public void crearCuenta(int numCuenta, int saldo, int limiteRetiradaCajero, 
            int limitePagoInternet, String fechaApertura) {
        cuentas.add(new Cuenta(numCuenta, saldo, limiteRetiradaCajero,
                    limitePagoInternet, fechaApertura));
    }
    
    public void ingresar(int numCuenta, int saldo) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNumCuenta() == numCuenta) {
                cuentas.get(i).setSaldo(cuentas.get(i).getSaldo() + saldo);
            }
        }
    }   
    
    public void sacarDinero(int numCuenta, int retirada) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNumCuenta() == numCuenta &&
                    (cuentas.get(i).getSaldo() - retirada) > 0 &&
                    cuentas.get(i).getLimiteRetiradaCajero() >= retirada) {
                cuentas.get(i).setSaldo(cuentas.get(i).getSaldo() - retirada);
            }
        }
    }
    
    public void pagoInternet(int numCuenta, int valorCompra) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNumCuenta() == numCuenta &&
                    (cuentas.get(i).getSaldo() - valorCompra) > 0 &&
                    cuentas.get(i).getLimiteRetiradaCajero() > valorCompra) {
                cuentas.get(i).setSaldo(cuentas.get(i).getSaldo() - valorCompra);
                cuentas.get(i).setTotalCompras(cuentas.get(i).getTotalCompras()
                        + valorCompra);
            }
        }
    }
    
    public void TotalPagosInternet(int numCuenta) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNumCuenta() == numCuenta) { 
                cuentas.get(i).getTotalCompras();
            }
        } 
    }
}
