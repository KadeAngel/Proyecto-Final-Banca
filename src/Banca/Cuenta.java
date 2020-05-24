/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banca;

/**
 *
 * @author Angel Garcia 1ºDAM B
 */
public class Cuenta {
    private int numCuenta;
    private int saldo;
    private int limiteRetiradaCajero;
    private int limitePagoInternet;
    private String fechaApertura;
    private int totalCompras;

    public Cuenta(int numCuenta, int saldo, int limiteRetiradaCajero, 
            int limitePagoInternet, String fechaApertura) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.limiteRetiradaCajero = limiteRetiradaCajero;
        this.limitePagoInternet = limitePagoInternet;
        this.fechaApertura = fechaApertura;
        this.totalCompras = 0;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getLimiteRetiradaCajero() {
        return limiteRetiradaCajero;
    }

    public int getLimitePagoInternet() {
        return limitePagoInternet;
    }

    public int getTotalCompras() {
        return totalCompras;
    }

    public void setTotalCompras(int totalCompras) {
        this.totalCompras = totalCompras;
    }   
}
