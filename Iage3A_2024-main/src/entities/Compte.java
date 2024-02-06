package entities;

public class Compte {
    @Override
    public String toString() {
        return "Compte [id=" + id + ", numero=" + numero + ", solde=" + solde + ", client=" + client + "]";
    }
    private int id;
    private String numero; 
    private double solde;
    private ETypeCompte type;

    //Propriete Navigationnelle
     //ManyToOne : Plusieurs compte crees dans une Agence
     Agence agence;
    Client client;
    
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public Agence getAgence() {
        return agence;
    }
    public void setAgence(Agence agence) {
        this.agence = agence;
    }
    public ETypeCompte getType() {
        return type;
    }
    public void setType(ETypeCompte type) {
        this.type = type;
    }
    public Compte() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
}
