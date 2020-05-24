package Banca;

/**
 *
 * @author Angel Garcia 1DAM B
 */
public class Cuenta {
    private int numCuenta;
    private int saldo;
    private int limiteRetiradaCajero;
    private int limitePagoInternet;
    private String fechaApertura;
    private int totalCompras;

    /**
     * Constructor de objetos Cuenta
     * @param numCuenta numero de la cuenta
     * @param saldo saldo o dinero en la cuenta
     * @param limiteRetiradaCajero limite de dinero que se puede retirar del cajero con la tarjeta
     * @param limitePagoInternet limite de valor de compra por internet
     * @param fechaApertura fecha de apertura de la cuenta
     */
    public Cuenta(int numCuenta, int saldo, int limiteRetiradaCajero, 
            int limitePagoInternet, String fechaApertura) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.limiteRetiradaCajero = limiteRetiradaCajero;
        this.limitePagoInternet = limitePagoInternet;
        this.fechaApertura = fechaApertura;
        this.totalCompras = 0;
    }

    /**
     * Metodo get del numero de cuenta
     * @return numero de cuenta
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
     * Metodo get del saldo de la cuenta
     * @return saldo de la cuenta
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * Metodo set del saldo de la cuenta
     * @param saldo saldo de la cuenta
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo get del limite de retirada de dinero en cajero
     * @return limite de retirada de dinero en cajero
     */
    public int getLimiteRetiradaCajero() {
        return limiteRetiradaCajero;
    }

    /**
     * Metodo get del limite de valor de compra por internet
     * @return limite de valor de compra por internet
     */
    public int getLimitePagoInternet() {
        return limitePagoInternet;
    }
    
    /**
     * Metodo get de la fecha de apertura de la cuenta
     * @return fecha de apertura de la cuenta
     */
    public String getFechaApertura() {
        return fechaApertura;
    }
    
    /**
     * Metodo get del valor total de compras realizadas por internet
     * @return valor total de las compras realizadas por internet
     */
    public int getTotalCompras() {
        return totalCompras;
    }

    /**
     * Metodo set del valor total de las compras realizadas por internet
     * @param totalCompras valor total de las compras realizadas por internet
     */
    public void setTotalCompras(int totalCompras) {
        this.totalCompras = totalCompras;
    }
}
