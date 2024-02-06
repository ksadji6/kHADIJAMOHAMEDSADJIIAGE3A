package services;

import entities.Carte;
import repositories.CarteRepository;

public class CarteService {
    private CarteRepository carteRepository=new CarteRepository();
    public void addCarte(Carte carte){
        carteRepository.insert(carte);
    }
}
