package Nico.application;
import Nico.entites.Adresse;
import Nico.entites.Personne;
import Nico.utils.Utilitaires;
import static Nico.utils.Utilitaires.afficher;

public class Principale {

    public static void main(String[] args){
        System.out.println("Passage dans main");


           /* Personne Martin = new Personne ("Martin", "JAVA SARL" );
            Personne Dupont = new Personne ("Dupont");

            Martin.afficher();
            Dupont.afficher();

            Personne durand = new Personne("durand", "J2E SA");

            durand.afficher();
            durand.quitterSociete();
            durand.afficher();

            durand.setSociete("EJB COrporate");
            durand.afficher();
            /*durand.setSociete("java SA");
            durand.afficher();

            Personne dupont = new Personne("dupont", "?");
            dupont.afficher();*/

            Adresse adresse1 = new Adresse(2, "rue Victor Hugo", 75008, "Paris");
            Adresse adresse2 = new Adresse(17, "rue de la République", 44000, "Nantes");
            Adresse adresse3 = new Adresse(55, "rue Victor Hugo", 75008, "Paris");


       // System.out.println(adresse1.toString());
        Utilitaires.afficherBoiteDeDialogue(  adresse1.toString(), "voici l'adresse n°1");
        Utilitaires.afficherBoiteDeDialogue(  adresse2.toString(), "voici l'adresse n°2");
        Utilitaires.afficherBoiteDeDialogue(  adresse3.toString(), "voici l'adresse n°3");

        Personne jean = new Personne( "Dupont", "Jean", 30, adresse2 );
        Personne bernard = new Personne("Morin", "bernard", 45, adresse1);
        Personne nathalie = new Personne ("Durand", "Nathalie", 35, adresse3);

        Utilitaires.afficherBoiteDeDialogue( jean.toString() , "COUCOU");
        Utilitaires.afficherBoiteDeDialogue(nathalie.toString(), "COUCOU");
        Utilitaires.afficherBoiteDeDialogue(bernard.toString(), "COUCOU");


        //jean.setAdresse((new Adresse(44, "Rue des Docks", 33000, "Bordeaux")));

        Utilitaires.afficherBoiteDeDialogue( jean.toString(), "nouvelle adresse");

        nathalie.setAdresse(new Adresse(2, "rue vicxtor", 45250, "nancy"));

        Utilitaires.afficherBoiteDeDialogue(bernard.toString() + "\n" + nathalie.toString(), "Vive les marriés !!");

        Utilitaires.afficher("Jean", jean);
        afficher("nathalie", nathalie);


    }

}
