package cl.bootcamp.posvespertinomaven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TarjetaDeCreditoTest {
    
    private final double SALDO = 20000;
    private final double MONTO = 10000;
    public static TarjetaDeCredito tarjeta;
    
    @BeforeEach
    public void setUp() {
        tarjeta = new TarjetaDeCredito();
    }
    
    @Test
    public void testTieneSaldo() {
        tarjeta.setSaldo(SALDO);
        assertTrue(tarjeta.tieneSaldo(MONTO));
    }
    
    @Test
    public void testDescontarSaldo() {
        tarjeta.setSaldo(SALDO);
        tarjeta.descontarSaldo(MONTO);
        
        assertEquals(
                SALDO - MONTO,
                tarjeta.getSaldo(),
                "El saldo no se ha descontado correctamente"
        );
    }
    
    @Test
    public void testNombreCompleto() {
        tarjeta.setTitular(new Persona(
                12314123, 
                "Cristobal", 
                "Soto", 
                "123124123", 
                "cristobal@gmail.com"
            )
        );
        
        assertTrue(tarjeta.nombreCompleto() instanceof String);
    }

}
