package Nico.application;
import Nico.entites.Personne;

public class Principale {

    public static void main(String[] args){
        System.out.println("Passage dans main");


            Personne Martin = new Personne ("Martin", "JAVA SARL" );
            Personne Dupont = new Personne ("Dupont");

            Martin.afficher();
            Dupont.afficher();

            Personne durand = new Personne("durand", "J2E SA");

            durand.afficher();
            durand.quitterSociete();
            durand.afficher();

            durand.setSociete("EJB COrporate");
            durand.afficher();
            durand.setSociete("java SA");
            durand.afficher();
    }

}
