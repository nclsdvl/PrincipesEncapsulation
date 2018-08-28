package Nico.entites;

public class Personne {

    //Variables d'instance
    private String societe;
    private static final String PAS_DE_SOCIETE = "?";
    private final String nom;


//----------------------Constructeur---------------------------//

    public Personne(String nom, String societe) {
        this.nom = nom.toUpperCase();
        this.societe = societe;
    }

    public Personne(String nom){
        this.nom = nom.toUpperCase();
    }
//----------------------Getters---------------------//

    public String getNom() {
        return nom;
    }
    public String getSociete() {
        return societe;
    }

//----------------------Setters--------------------//

    public void setSociete(String societe) {
        this.societe = societe;
    }

//----------------------Methodes-------------------------//

    public void afficher(){

        if (societe.equals(PAS_DE_SOCIETE)){
            System.out.println(getNom() +" n'est pas en emploi");
        }
        else {System.out.println(getNom() + " travaille chez " +getSociete());}
    }

}
