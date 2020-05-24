package Banca;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Angel Garcia 1DAM B
 */
public class Gestor {
    Scanner sc = new Scanner(System.in);
    
    private ArrayList<Cliente> clientes = new ArrayList<>();

    /**
     * Metodo Get del ArrayList clientes
     * @return ArrayList clientes
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    /**
     * Metodo para crear un nuevo cliente del banco
     * @param nombre nombre del nuevo cliente
     * @param apellidos apellidos del nuevo cliente
     * @param direccion direccion del nuevo cliente
     * @param nif nif del nuevo cliente
     * @param telefono telefono del nuevo cliente
     * @param edad edad del nuevo cliente
     */
    public void crearCliente (String nombre, String apellidos, String direccion,
            String nif, int telefono, int edad){
        clientes.add(new Cliente(nombre, apellidos, 
                direccion, nif, telefono, edad));
    }
    
    /**
     * Metodo para modificar los atributos de un cliente buscado con su nif
     * @param nif nif para buscar el cliente a modificar en el ArrayList
     * @param nif2 nuevo nif para el cliente
     * @param nombre nuevo nombre para el cliente
     * @param apellidos nuevos apellidos para el cliente
     * @param direccion nueva direccion para el cliente
     * @param telefono nuevo telefono para el cliente
     * @param edad nueva edad para el cliente
     */
    public void modificarCliente(String nif, String nif2, String nombre, 
            String apellidos, String direccion, int telefono, int edad) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNif().equals(nif)) {
                clientes.get(i).setNombre(nombre);
                clientes.get(i).setApellidos(apellidos);
                clientes.get(i).setDireccion(direccion);
                clientes.get(i).setNif(nif2);
                clientes.get(i).setTelefono(telefono);
                clientes.get(i).setEdad(edad);
            }
        }
    }
        
}
