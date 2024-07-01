package domaine;

public class PlateauRond extends Plateau{
    private int diametre;

    public PlateauRond(String code, int nbPlace, Matiere matiere, int diametre) {
        super(code, nbPlace, matiere);
        this.diametre = diametre;
    }


    @Override
    double calculSurface() {
        float rayon = diametre / 2;
        return Math.PI * Math.pow(rayon, 2);
    }


    @Override
    public String toString() {
        return super.toString() +
                "diametre=" + diametre +
                '}';
    }


}
