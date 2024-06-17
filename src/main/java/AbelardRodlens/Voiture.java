package AbelardRodlens;// then press Enter. You can now see whitespace characters in your code.

public class Voiture {
    private String marque;
    private int prix;

    public Voiture(){
        this.marque="Aston Martin";
        this.prix=95000000;

    }

    public Voiture(String marque, int prix){
        this.marque=marque;
        this.prix=prix;
    }

    public String getMarque(){
        return this.marque;

    }

    public int getPrix(){
        return this.prix;

    }

    public void setMarque(String marque){
        this.marque=marque;

    }

    public void setPrix(int prix){
        this.prix=prix;

    }
}

