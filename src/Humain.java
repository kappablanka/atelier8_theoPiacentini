public class Humain extends Personnage {
    private int niveau = 1;
    private static int nbDeplacement = 0;

    public Humain(String nom, int age) {
        super(nom, age);
    }

    @Override
    public int positionSouhaitee() {
        return position + niveau * nbDeplacement;
    }

    public void deplacer(int destination, int gain) {
        super.deplacer(destination, gain);
        nbDeplacement += 1;
    }




    @Override
    public String toString() {
        return "Humain" + nom;
    }
}
