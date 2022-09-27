public class Obstacle {
    private int penalite;

    public Obstacle(int penalite) {
        this.penalite = penalite;
    }

    public int getPenalite() {
        return penalite;
    }

    public void setPenalite(int penalite) {
        this.penalite = penalite;
    }

    @Override
    public String toString() {
        return "Obstacle (" +
                "penalite = -" + penalite +
                ')';
    }
}
