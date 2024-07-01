package domaine;

public abstract class Plateau {
    private String code;
    private int nbPlace;
    private Matiere matiere;

    public Plateau(String code, int nbPlace, Matiere matiere) {
        this.code = code;
        this.nbPlace = nbPlace;
        this.matiere = matiere;
    }


    abstract double calculSurface();


    @Override
    public String toString() {
        return "Plateau{" +
                "code='" + code + '\'' +
                ", nbPlace=" + nbPlace +
                ", matiere=" + matiere +
                '}';
    }


    public String getCode() {
        return code;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public Matiere getMatiere() {
        return matiere;
    }
}
