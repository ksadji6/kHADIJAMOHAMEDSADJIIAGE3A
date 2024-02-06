package entities;
import java.util.List;

import repositories.CompteRepository;

public class Client {
    private int id;
    private String nom; 
    private String prenom; 
    private String telephone;
    private CompteRepository compteRepository=new CompteRepository();
    public List<Compte> getComptes(){
        return compteRepository.selectAll();
    };
    public void setCompte(Compte compte){
        compteRepository.insert(compte);
    }
    public Client() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
}
