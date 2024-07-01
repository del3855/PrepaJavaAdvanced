package metier;

import domaine.Matiere;
import domaine.Plateau;

import java.util.ArrayList;
import java.util.List;

public class Appli {

    public List<Plateau> filtreMatiere(Matiere m, List<Plateau> plateau){
        List<Plateau> fileredPlateau = new ArrayList<>();
        for(Plateau p : plateau){
            if(p.getMatiere().equals(m)){
                fileredPlateau.add(p);
            }
        }

        fileredPlateau.sort();

        return fileredPlateau;
    };

}
