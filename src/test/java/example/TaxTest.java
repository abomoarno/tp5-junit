package example;

import org.example.Employe;
import org.example.Tax;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaxTest {

    private Tax tax;

    @Before
    public void setUp() {
        tax = new Tax(new Employe(
                "ARNO",
                30,
                67000.0,
                0
        ));
    }

    @Test
    public void test_calcul_tax_67keuros_zero_enfant() {

        assertEquals(10050.0, tax.calculTax(), 0.0);

    }


    @Test
    public void test_calcul_net_67keuros_zero_enfant() {
        assertEquals(56950.0, tax.calculNet(), 0.0);
    }
}