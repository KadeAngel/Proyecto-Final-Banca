package Banca;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Angel Garcia 1DAM B
 */
public class Cliente {
    
    Scanner sc = new Scanner(System.in);
    
    private String nombre;
    private String apellidos;
    private String direccion;
    private String nif;
    private int telefono;
    private int edad;
    private ArrayList<Cuenta> cuentas = new ArrayList<>();

    /**
     * Constructor de objetos Cliente
     * @param nombre nombre del cliente
     * @param apellidos apellidos del cliente
     * @param direccion direccion del cliente
     * @param nif nif del cliente
     * @param telefono telefono del cliente
     * @param edad edad del cliente
     */
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

    /**
     * Metodo Get del ArrayList cuentas
     * @return ArrayList cuentas
     */
    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
    
    /**
     * Metodo Get del nombre del cliente
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Metodo set del nombre del cliente
     * @param nombre nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo get de los apellidos del cliente
     * @return apellidos del cliente
     */
    public String getApellidos() {
        return apellidos;
    }
    
    /**
     * Metodo set de los apellidos del cliente
     * @param apellidos apellidos del cliente
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Metodo get de la direccion del cliente
     * @return direccion del cliente
     */
    public String getDireccion() {
        return direccion;
    }
    
    /**
     * Metodo set de la direccion del cliente
     * @param direccion direccion del cliente
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo get del NIF del cliente
     * @return NIF del cliente
     */
    public String getNif() {
        return nif;
    }

    /**
     * Metodo set del NIF del cliente
     * @param nif NIF del cliente
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Metodo get del telefono del cliente
     * @return telefono del cliente
     */
    public int getTelefono() {
        return telefono;
    }
    
    /**
     * Metodo set del telefono del cliente
     * @param telefono telefono del cliente
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Metodo get de la edad del cliente
     * @return edad del cliente
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Metodo set de la edad del cliente
     * @param edad edad del cliente
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * Metodo para crear una cuenta nueva para que se añade al ArrayList cuentas
     * @param numCuenta numero de cuenta de la nueva cuenta
     * @param saldo saldo de la nueva cuenta a introducir
     * @param limiteRetiradaCajero limite de dinero que se puede extraer de la nueva cuenta en el cajero
     * @param limitePagoInternet limite de valor de compra por internet
     * @param fechaApertura fecha de apertura de la cuenta
     */
    public void crearCuenta(int numCuenta, int saldo, int limiteRetiradaCajero, 
            int limitePagoInternet, String fechaApertura) {
        cuentas.add(new Cuenta(numCuenta, saldo, limiteRetiradaCajero,
                    limitePagoInternet, fechaApertura));
    }
    
    /**
     * Metodo para ingresar dinero en la cuenta e incrementar el saldo
     * @param numCuenta numero de la cuenta en la que ingresar
     * @param saldo saldo que ingresar en la cuenta seleccionada
     */
    public void ingresar(int numCuenta, int saldo) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNumCuenta() == numCuenta) {
                cuentas.get(i).setSaldo(cuentas.get(i).getSaldo() + saldo);
            }
        }
    }   
    
    /**
     * Metodo para sacar dinero de la cuenta seleccionada
     * @param numCuenta numero de la cuenta de la que sacar el dinero
     * @param retirada cantidad de dinero a sacar del banco con la tarjeta
     */
    public void sacarDinero(int numCuenta, int retirada) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNumCuenta() == numCuenta &&
                    (cuentas.get(i).getSaldo() - retirada) > 0 &&
                    cuentas.get(i).getLimiteRetiradaCajero() >= retirada) {
                cuentas.get(i).setSaldo(cuentas.get(i).getSaldo() - retirada);
            }
        }
    }
    
    /**
     * Metodo para realizar compras por internet
     * @param numCuenta numero de la cuenta que se usa para el pago
     * @param valorCompra valor de la compra que se realiza por internet
     */
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
    
    /**
     * Metodo para comprobar el total de dinero gastado en compras por interntet
     * @param numCuenta numero de la cuenta de la que comprobar los pagos
     * @return el valor de todas las compras realizadas por internet
     */
    public int totalPagosInternet(int numCuenta) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNumCuenta() == numCuenta) { 
                return cuentas.get(i).getTotalCompras();
            }
        } return -1;
    }
}
