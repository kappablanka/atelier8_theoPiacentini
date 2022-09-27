public abstract class Personnage {
    protected final String nom;
    private int age;
    protected int position = 0;
    private Joueur proprietaire;

    public Personnage(String nom, int age){
        this.nom = nom;
        this.age = age;
    }

    public void deplacer(int destination, int gain) {
        position = destination;
        proprietaire.modifierPoints(proprietaire.getNbPoints() + gain);
    }

    public void penaliser(int penalite) {
        proprietaire.modifierPoints(proprietaire.getNbPoints() - penalite);
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                '}';
    }

    public abstract int positionSouhaitee();
}
