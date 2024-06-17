package AbelardRodlens;

import com.sun.istack.internal.NotNull;
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
        assertEquals(voiture.getMarque(),"Aston Martin");

            
        }

    @Test

    public void setPrixTest(){
        Voiture voiture = new Voiture("Audi",15000);
        voiture.setPrix(10000);
        assertEquals(voiture.getPrix(),10000);

    }

    @Test

    public void setMarqueTest(){
        Voiture voiture = new Voiture("Audi",15000);
        voiture.setMarque("Audi");
        assertEquals(voiture.getMarque(),"Audi");
    }


    @Test

    public void getMarqueTest(){
        Voiture voiture = new Voiture("Audi",15000);
        voiture.setMarque("Audi");
        assertEquals(voiture.getMarque(),"Audi");
    }

    @Test

    public void getPrixTest(){
        Voiture voiture = new Voiture("Audi",15000);
        assertEquals(15000,voiture.getPrix());

    }




        
    }
