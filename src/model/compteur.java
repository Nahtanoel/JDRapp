package model;
public class compteur extends module {

    private int valeur;
    public compteur(String nom){
        super(nom);
        this.valeur = 0;
    }

    public void setValeur(int valeur){
        this.valeur = valeur;
    }

    public int getValeur(){
        return this.valeur;
    }

    public void increase(){
        this.valeur =+ 1;
    }

    public void decrease(){
        this.valeur =- 1;
    }
}
