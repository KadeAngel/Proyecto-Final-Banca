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
    
    private ArrayList<Cliente> clientes;
    private String nombreCliente;
    private String apellidosCliente;
    private String direccionCliente;
    private String nifCliente;
    private int telefonoCliente;
    private int edadCliente;
    
    public void crearCliente (){
        System.out.println("Introduce el nombre del cliente:");
        nombreCliente = sc.nextLine();
        System.out.println("Introduce los apellidos del cliente:");
        apellidosCliente = sc.nextLine();
        System.out.println("Introduce la dirección del cliente:");
        direccionCliente = sc.nextLine();
        System.out.println("Introduce el NIF del cliente:");
        nifCliente = sc.nextLine();
        System.out.println("Introduce el telefono del cliente:");
        telefonoCliente = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce la edad del cliente:");
        edadCliente = sc.nextInt();
        sc.nextLine();
        clientes.add(new Cliente(nombreCliente, apellidosCliente, 
                direccionCliente, nifCliente, telefonoCliente, edadCliente));
    }
    
    public void modificarCliente() {
        System.out.println("Introduce el nif del cliente a modificar:");
        nifCliente = sc.nextLine();
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNif() == nifCliente) {
                System.out.println("Introduce el nombre del cliente:");
                nombreCliente = sc.nextLine();
                clientes.get(i).setNombre(nombreCliente);
                System.out.println("Introduce los apellidos del cliente:");
                apellidosCliente = sc.nextLine();
                clientes.get(i).setApellidos(apellidosCliente);
                System.out.println("Introduce la dirección del cliente:");
                direccionCliente = sc.nextLine();
                clientes.get(i).setDireccion(direccionCliente);
                System.out.println("Introduce el NIF del cliente:");
                nifCliente = sc.nextLine();
                clientes.get(i).setNif(nifCliente);
                System.out.println("Introduce el telefono del cliente:");
                telefonoCliente = sc.nextInt();
                sc.nextLine();
                clientes.get(i).setTelefono(telefonoCliente);
                System.out.println("Introduce la edad del cliente:");
                edadCliente = sc.nextInt();
                sc.nextLine();
                clientes.get(i).setEdad(edadCliente);
            }
        }
    }
        
}
