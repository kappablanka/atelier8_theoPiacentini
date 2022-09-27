import java.util.Random;

public class Tauren extends Personnage{

    private int taille;
    private static Random r = new Random();

    public Tauren(String nom, int age, int taille) {
        super(nom, age);
        this.taille = taille;
    }

    @Override
    public int positionSouhaitee() {
        return r.nextInt(1, taille+1);
    }


    @Override
    public String toString() {
        return "Tauren " + nom;
    }
}
