import dao.ReadCsv;
import domaine.Matiere;
import domaine.Plateau;
import metier.Appli;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Appli appli = new Appli();
        List<Plateau> res = appli.filtreMatiere(Matiere.BOIS, ReadCsv.getListePlateaux());




    }
}