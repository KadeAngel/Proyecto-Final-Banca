import Banca.Cliente;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Angel Garcia 1DAM B
 */
public class ClienteTest {
    private static Cliente cliente = new Cliente("Angel", "Garcia", 
            "Calle falsa", "1234W", 12345, 50);
    
    /**
     * Se testea el funcionamiento y encaminamiento del metodo crearCuenta()
     */
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
    
    /**
     * Se testea el funcionamiento y encaminamiento del metodo ingresar()
     */
    @Test
    public void ingresarTest() {
        cliente.ingresar(1, 500);
        assertTrue(cliente.getCuentas().get(0).getSaldo() == 1000);
    }
    
    /**
     * Se testea el funcionamiento y encaminamiento del metodo sacarDinero()
     */
    @Test
    public void sacarDineroTest() {
        cliente.sacarDinero(1, 50);
        assertTrue(cliente.getCuentas().get(0).getSaldo() == 950);
    }
    
    /**
     * Se testea el funcionamiento y encaminamiento del metodo pagoInternet()
     */
    @Test
    public void pagoInternetTest() {
        cliente.pagoInternet(1, 50);
        assertTrue(cliente.getCuentas().get(0).getSaldo() == 900);
    }
    
    /**
     * Se testea el funcionamiento y encaminamiento del metodo totalPagosInternet()
     */
    @Test
    public void totalPagosInternetTest() {
        cliente.pagoInternet(1, 50);
        assertTrue(cliente.totalPagosInternet(1) == 100);
        assertTrue(cliente.totalPagosInternet(2) == -1);
    }
    
    
}
