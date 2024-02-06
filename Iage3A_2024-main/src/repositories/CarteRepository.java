package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Carte;

public class CarteRepository {
    private List<Carte> cartes=new ArrayList<>();
    public void insert(Carte carte){
        cartes.add(carte);
    }
}
