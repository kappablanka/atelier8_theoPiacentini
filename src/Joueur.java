import java.util.ArrayList;

public class Joueur {
    private String nom;
    private String code;
    private int nbJoueurs;
    private int nbPoints;
    ArrayList<Personnage> listePersos = new ArrayList<>();

    /**
     *
     * @param nom
     */
    public Joueur(String nom) {
        this.nom = nom;
    }

    public void ajouterPersonnages(Personnage perso) {
        listePersos.add(perso);
    }

    public void modifierPoints(int nb) {
        nbPoints = nb;
    }

    public boolean peutJouer() {
        boolean resultat = true;
        if (listePersos.isEmpty()) {
            resultat = false;
        }
        return resultat;
    }

    @Override
    public String toString() {
        String resultat = "J" + nbJoueurs +
                " " + nom +
                " (" + nbPoints + " points)";
        if (listePersos.size() == 0) {
            resultat += "avec aucun personnage";
        }
        else {
            resultat = "avec" + listePersos.size() + "personnage(s)";
        }
        return resultat;
    }

    public int getNbPoints() {
        return nbPoints;
    }

    public void setNbPoints(int nbPoints) {
        this.nbPoints = nbPoints;
    }

    public ArrayList<Personnage> getListePersos() {
        return listePersos;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
