public class Case {
    private int gain;
    private Personnage perso;
    private Obstacle obs;

    public Case(int gain, Obstacle obs) {
        this.gain = gain;
        this.obs = obs;
    }

    public Case(int gain) {
        this.gain = gain;
    }

    public int getPenalite() {
        int resultat;
        if (java.util.Objects.isNull(obs)) {
            resultat = 0;
        }
        else {
            resultat = obs.getPenalite();
        }
        return resultat;
    }

    public void placerPersonnage(Personnage perso) {
        this.perso = perso;
    }

    public void placerObstacle(Obstacle obs) {
        this.obs = obs;
    }

    public void enleverPersonnage() {
        perso = null;
    }

    public boolean estLibre() {
        return sansObstacle() && sansPerso();
    }

    public boolean sansObstacle(){
        return java.util.Objects.isNull(obs);
    }

    public boolean sansPerso(){
        return java.util.Objects.isNull(perso);
    }

    @Override
    public String toString() {
        String resultat;
        if(this.estLibre()) {
            resultat = "Libre";
        }
        else if (this.sansPerso()) {
            return obs.toString();
        }
        else {
            resultat = perso.toString();
        }

        resultat += " (";

        if (gain > 0) {
            resultat += "gain";
        }
        else {
            resultat += "penalité";
        }

        resultat += " = " + gain + ")";

        return resultat;
    }

    public int getGain() {
        return gain;
    }

    public void setGain(int gain) {
        this.gain = gain;
    }


}
