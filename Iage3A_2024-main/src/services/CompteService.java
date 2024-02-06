package services;


import java.util.List;
import entities.Compte;
import repositories.CompteRepository;

public class CompteService {
    CompteRepository compteRepository;
    public void ajouterCompte(Compte compte){
        compteRepository.insert(compte);
    }
public List<Compte> listerCompte(){
    return compteRepository.selectAll();
}
/*public ArrayList<Compte> listerCompte(Client client){
    return null;
}*/
}
