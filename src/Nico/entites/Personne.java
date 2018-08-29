package Nico.entites;
import Nico.entites.Adresse;

public class Personne {

    //Variables d'instance
    private String societe;
    private static final String PAS_DE_SOCIETE = "?";
    private final String nom;
    int age;
    Adresse adresse;
    String prenom;


//----------------------Constructeur---------------------------//

    public Personne(String nom, String societe) {
        this.nom = nom.toUpperCase();
        validerSociete(societe.toUpperCase());
    }


    public Personne(String nom){
        this.nom = nom.toUpperCase();
        this.societe = "?";
    }

    public Personne (String nom, String prenom, int age, Adresse adresse ){
        this.nom = nom.toUpperCase();
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;



    }
//----------------------Getters---------------------//

    public String getNom() {
        return nom;
    }
    public String getSociete() {return societe;}
    public int getAge() {return age;}
    public Adresse getAdresse() { return adresse; }


    @Override
    public  String toString(){
        return prenom + " " + nom + " " +  age + " ans\n" + adresse.toString();
    }

    //----------------------Setters--------------------//

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSociete(String societe) {
        if (PAS_DE_SOCIETE.equals(this.societe)){
            validerSociete(societe);
        }
        else {

            System.out.println("bye bye");
            System.exit(2);}
    }


//----------------------Methodes-------------------------//

    public void afficher(){

        if (societe.equals(PAS_DE_SOCIETE)){
            System.out.println(getNom() +" n'est pas en emploi");
        }
        else {System.out.println(getNom() + " travaille chez " +getSociete());}
    }

    public void quitterSociete(){
        if (societe.equals(PAS_DE_SOCIETE)){
            System.out.println("Je ne suis pas salarié donc je fais bugger ton appli!!!!!!");
            System.exit(1);
        }
        else {this.societe=PAS_DE_SOCIETE;}
    }

    private void validerSociete(String societe){
        if ((societe.length()<= 30) && !societe.equals(PAS_DE_SOCIETE)) {
            this.societe = societe.toUpperCase();
        }
        else if(societe.equals(PAS_DE_SOCIETE)){
            System.out.println("Il n'existe pas de societe ayant pour nom : ? RESULTAT ---> BUG");

            System.exit(6);
        }
        else {
            System.out.println("le nom de la societe doit faire moins de 30 caracteres et different de '?'!!!! RESULTAT ---> BUG");
            System.out.println("le nom de societe posant probleme est : " + societe);
            System.exit(3);
        }
    }
}



