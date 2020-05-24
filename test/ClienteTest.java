
import Banca.Cliente;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kade
 */
public class ClienteTest {
    private static Cliente cliente = new Cliente("Angel", "Garcia", 
            "Calle falsa", "1234W", 12345, 50);
    
    @Test
    public void crearCuentaTest () {
        cliente.crearCuenta(1, 500, 100, 100, "10/01/2020");
        assertTrue(cliente.getCuentas().get(0).getNumCuenta() == 1);
        assertTrue(cliente.getCuentas().get(0).getSaldo() == 500);
        assertTrue(cliente.getCuentas().get(0).
                getLimiteRetiradaCajero() == 100);
        assertTrue(cliente.getCuentas().get(0).getLimitePagoInternet() == 100);
        assertTrue(cliente.getCuentas().get(0).getFechaApertura().
                equals("10/01/2020"));
    }
    
    @Test
    public void ingresarTest() {
        cliente.ingresar(1, 500);
        assertTrue(cliente.getCuentas().get(0).getSaldo() == 1000);
    }
    
    @Test
    public void sacarDineroTest() {
        cliente.sacarDinero(1, 50);
        assertTrue(cliente.getCuentas().get(0).getSaldo() == 950);
    }
    
    @Test
    public void pagoInternetTest() {
        cliente.pagoInternet(1, 50);
        assertTrue(cliente.getCuentas().get(0).getSaldo() == 900);
    }
    
    @Test
    public void totalPagosInternetTest() {
        cliente.pagoInternet(1, 50);
        assertTrue(cliente.totalPagosInternet(1) == 100);
        assertTrue(cliente.totalPagosInternet(2) == -1);
    }
    
    
}
