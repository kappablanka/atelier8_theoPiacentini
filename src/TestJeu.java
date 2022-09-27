public class TestJeu {
    public static void main(String[] args) {

        Jeu jeuPourTester = new Jeu("AtelierOOP", 4, 10);
        Joueur j1 = new Joueur("Paul");
        Tauren perso1 = new Tauren("Hector", 15, 10);
        Humain perso2 = new Humain("Jean", 10);
        j1.ajouterPersonnages(perso1);
        j1.ajouterPersonnages(perso2);

        Joueur j2 = new Joueur("Lucien");
        Humain perso3 = new Humain("Marie", 10);
        Tauren perso4 = new Tauren("Hercule", 15, 10);
        j2.ajouterPersonnages(perso3);
        j2.ajouterPersonnages(perso4);

        jeuPourTester.ajouterJoueur(j1);
        jeuPourTester.ajouterJoueur(j2);

        jeuPourTester.lancerJeu();


    }
}