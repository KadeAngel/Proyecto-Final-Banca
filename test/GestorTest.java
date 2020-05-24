import Banca.Gestor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Angel Garcia 1DAM B
 */
public class GestorTest {
    private static Gestor gestor = new Gestor();

    /**
     * Se testea el funcionamiento y encaminamiento del metodo crearCliente()
     */
    @Test
    public void crearClienteTest() {
        gestor.crearCliente("Angel", "Garcia", "Calle falsa", "1234W", 
                12345, 50);
        assertTrue(gestor.getClientes().get(0).getNombre().equals("Angel"));
        assertTrue(gestor.getClientes().get(0).getApellidos().equals("Garcia"));
        assertTrue(gestor.getClientes().get(0).getDireccion().equals("Calle "
                + "falsa"));
        assertTrue(gestor.getClientes().get(0).getNif().equals("1234W"));
        assertTrue(gestor.getClientes().get(0).getTelefono() == 12345);
        assertTrue(gestor.getClientes().get(0).getEdad() == 50);
    }

    /**
     * Se testea el funcionamiento y encaminamiento del metodo modificarCliente()
     */
    @Test
    public void modificarClienteTest() {
        gestor.modificarCliente("1234W", "5678W", "Pepe", "Perez", 
                "Calle Verdadera", 67890, 60);
        gestor.modificarCliente("1235W", "5678W", "Pepe", "Perez", 
                "Calle Verdadera", 67890, 60);
        assertTrue(gestor.getClientes().get(0).getNombre().equals("Pepe"));
        assertTrue(gestor.getClientes().get(0).getApellidos().equals("Perez"));
        assertTrue(gestor.getClientes().get(0).getDireccion().equals("Calle "
                + "Verdadera"));
        assertTrue(gestor.getClientes().get(0).getNif().equals("5678W"));
        assertTrue(gestor.getClientes().get(0).getTelefono() == 67890);
        assertTrue(gestor.getClientes().get(0).getEdad() == 60);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
