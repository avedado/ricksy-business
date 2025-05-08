package edu.estatuas.dispatchers;


import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import edu.estatuas.dispatchers.CristalExpender;
import edu.estatuas.payment.PaymentMethod;


public class CrystalExpenderTest {
    private CrystalExpender expender = null;

    @Before
    public void setupExpender() {
        expender = new CrystalExpender(100, 50.0);
        assertNotNull("Expender creado", expender);
    }

    @Test
    public void constructortest() {
        assertNotNull("Expender creado", expender);
        assertEquals(100, expender.stock());
    }

}
