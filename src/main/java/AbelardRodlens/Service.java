package AbelardRodlens;

import java.util.ArrayList;

public class Service  implements Statistique {
    private ArrayList<Voiture> voitures;

    public Service() {
        this.voitures = new ArrayList<Voiture>();
    }

    public void ajouter(Voiture voiture) {
        voitures.add(voiture);
    }


    /**
     * Calcul d'un prix dégressif en fonction du nombre de voitures :
     * 5% de remise supplémentaire sur chaque voiture à chaque fois que 5 voitures sont ajoutées
     * et une remise maxi de 20 000 euros.
     *
     * @return le prix des voitures
     * @throws ArithmeticException s'il n'y a pas de voiture
     */

    public int prix() throws ArithmeticException {
        int remise = 0;
        int voitures_prix = 0;
        int nb_remise = 0;


        for (int i = 0; i < voitures.size(); i++) {
            voitures_prix += voitures.get(i).getPrix();

        }

        for (int i = voitures.size(); i >= 5; i -= 5) {
            nb_remise += 1;
        }


        if (nb_remise < 1) {
            return voitures_prix;

        } else {

            remise = voitures_prix * ((nb_remise * 5) / 100);
            if (nb_remise > 20000) {
                remise = 20000;
            }
            return voitures_prix - remise;

        }


    }

}
