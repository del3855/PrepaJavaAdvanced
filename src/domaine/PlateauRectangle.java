package domaine;

public class PlateauRectangle extends Plateau{

    private int longueur;
    private int largeur;


    public PlateauRectangle(String code, int nbPlace, Matiere matiere, int longueur, int largeur) {
        super(code, nbPlace, matiere);
        this.longueur = longueur;
        this.largeur = largeur;
    }


    @Override
    double calculSurface() {
        return longueur * largeur;
    }


    @Override
    public String toString() {
        return super.toString() +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }



}
