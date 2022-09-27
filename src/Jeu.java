import java.util.ArrayList;
import java.util.Random;

public class Jeu {
    private String titre;
    private static final int NB_JOUEUR_MAX = 6;
    private static final int  NB_CASES = 50;
    private int  nbObstaclesMax = 10;

    private ArrayList<Joueur> listeJoueur;
    private static int nbEtapes;
    private int nbObstacles;
    private int scoreMax;
    Case tabCase[] = new Case[NB_CASES];
    private static Random r = new Random();

    public Jeu(String titre, int nbEtapes, int nbObstaclesMax) {
        this.titre = titre;
        this.nbEtapes = nbEtapes;
        this.nbObstaclesMax = nbObstaclesMax;

    }

    public void ajouterJoueur(Joueur player) {
        listeJoueur.add(player);
    }

    public ArrayList<Personnage> tousLesPersos() {
        ArrayList<Personnage> resultat = null;
        for(int i = 0 ; i < listeJoueur.size() ; i++) {

            for(int j = 0 ; j < listeJoueur.get(i).getListePersos().size() ; j++) {
                resultat.add(listeJoueur.get(i).getListePersos().get(j));
            }
        }
        return resultat;
    }

    public void initialiserCases() {
        for (int i = 0 ; i < 50 ; i++) {
            int nbAleatoire = r.nextInt(1, NB_CASES);
            tabCase[i].setGain(nbAleatoire);
            if (nbAleatoire % 5 == 0 && nbObstacles < nbObstaclesMax) {
                Obstacle obs = new Obstacle(nbAleatoire*2);
                tabCase[i].placerObstacle(obs);
                nbObstacles += 1;
            }
        }


    }

    public void lancerJeu() {
        for(int i = 0; i < tousLesPersos().size(); i++){

        }
    }

    public void afficherCases() {
        for(int i = 0 ; i < NB_CASES ; i++) {
            System.out.println(tabCase[i].toString());
        }
    }

    public void afficherParticipants() {
        System.out.println("LISTE DES JOUEURS");
        for(int i = 0; i < listeJoueur.size(); i++){
            System.out.println("-------------------------");
            System.out.println(tousLesPersos().get(i).toString());
        }
    }

    public void afficherResultats() {
        System.out.println("JEU" + titre);
        System.out.println("***********************************");
        System.out.println("RESULTATS");
        int max = listeJoueur.get(0).getNbPoints();
        int iMax = 0;
        for (int i = 1 ; i < listeJoueur.size() ; i++) {
            int valTest = listeJoueur.get(i).getNbPoints();
            if (max < valTest) {
                max = valTest;
                iMax = i;
            }
        }

        Joueur joueurGagnant = listeJoueur.get(iMax);
        System.out.println("Le gagnat est" + joueurGagnant.getNom() + "avec " +
                joueurGagnant.getNbPoints() + "points");

        if (joueurGagnant.getNbPoints() > scoreMax) {
            System.out.println("Record battu : Ancien score maximum" + scoreMax);
            scoreMax = joueurGagnant.getNbPoints();
        }
        else {
            System.out.println("Record non battu : " + scoreMax + " points");
        }

    }
}
