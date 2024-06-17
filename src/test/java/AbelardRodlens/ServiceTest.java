package AbelardRodlens;
import org.junit.jupiter.api.Test;

public class ServiceTest {
    @Test

    public void testRemise(){

        Voiture voiturea=new Voiture();
        Voiture voitureb=new Voiture("Audi",10000);
        Voiture voiturec=new Voiture("Peugeot",8000);

        Service servicea =new Service();
        servicea.ajouter(voiturea);
        servicea.ajouter(voitureb);
        servicea.ajouter(voiturec);

        servicea.prix();

    }


}

