import controleatleta.Tenista;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TenistaTest {
    
    public static Tenista tenista;
    
    public TenistaTest() {
    }
 
    @Before
    public void setUp() {
        tenista = new Tenista("teste");
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    // @Test
    // public void hello() {}
    @Test
    public void getNomeTest(){
        String nome = tenista.getNome();
        assertEquals("teste", nome);
    }
}