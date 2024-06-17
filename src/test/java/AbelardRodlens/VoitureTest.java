package AbelardRodlens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class VoitureTest {
    @Test

    public void defaultConstructorTest(){
        Voiture voiturea = new Voiture();
        assertEquals(voiturea.getMarque(),"Aston Martin");
        assertEquals(voiturea.getPrix(),95000000);
    }

    public void constructorTest(){
        Voiture voiture = new Voiture("Audi",15000);
        assertTrue(voiture instanceof Voiture);
        assertTrue(voiture.getMarque() instanceof String);
        assertEquals(int.class,voiture.getPrix());
            
        }
        
    }
