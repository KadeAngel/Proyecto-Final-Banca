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
public class Gestor {
    Scanner sc = new Scanner(System.in);
    
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public void crearCliente (String nombre, String apellidos, String direccion,
            String nif, int telefono, int edad){
        clientes.add(new Cliente(nombre, apellidos, 
                direccion, nif, telefono, edad));
    }
    
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
