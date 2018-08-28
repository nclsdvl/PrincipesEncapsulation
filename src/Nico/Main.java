package Nico;


import Nico.entites.Personne;

public class Main {

    public static void main(String[] args) {
	Personne Martin = new Personne ("Martin", "afpa" );
        Personne Dupont = new Personne ("Dupont", "?" );

Martin.afficher();
Dupont.afficher();


    }
}
