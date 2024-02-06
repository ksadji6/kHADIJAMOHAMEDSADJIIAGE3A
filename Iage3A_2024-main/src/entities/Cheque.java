package entities;

import java.util.ArrayList;
import java.util.List;

public class Cheque extends Compte {
    private double frais;
    List<Carte> carte=new ArrayList<>();
    public double getFrais() {
        return frais;
    }

    public void setFrais(double frais) {
        this.frais = frais;
    }
}
