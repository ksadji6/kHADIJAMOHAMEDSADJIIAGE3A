package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Compte;

public class CompteRepository {
    List<Compte> comptes=new ArrayList<>();
    public void insert(Compte compte){
        comptes.add(compte);
    }
    public List<Compte> selectAll(){
    return comptes;
    }
}
