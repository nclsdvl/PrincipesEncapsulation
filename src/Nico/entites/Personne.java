package Nico.entites;

public class Personne {

    //Variables d'instance
    private String societe;
    private static final String PAS_DE_SOCIETE = "?";
    private final String nom;


//----------------------Constructeur---------------------------//

    public Personne(String nom, String societe) {
        this.nom = nom.toUpperCase();
        validerSociete(societe.toUpperCase());
    }


    public Personne(String nom){
        this.nom = nom.toUpperCase();
        this.societe = "?";
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
        if ((societe.length()<= 30)) {
            this.societe = societe.toUpperCase();
        }
     /*   else if(!societe.equals(PAS_DE_SOCIETE)){
            System.out.println("on ne peut pas integrer une seconde entreprise!!!! RESULTAT ---> BUG");
            System.out.println("il faut demissionner avant!!!!");
            System.exit(1);
        }*/
        else {
            System.out.println("le nom de la societe doit faire moins de 30 caracteres et different de '?'!!!! RESULTAT ---> BUG");
            System.out.println("le nom de societe posant probleme est : " + societe);
            System.exit(3);
        }
    }
}



