package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Agence;
//SOLID
//Single Responsability
public class AgenceRepository {
    //Table  
     private List<Agence> tAgences=new ArrayList<>();
    //select
    public  List<Agence> selectAll(){
       return tAgences;
    }
    public  Agence selectByNumero(String numero){
        //select * from agence where numero=numero
        for (Agence ag : tAgences) {
             if (ag.getNumero().compareTo(numero)==0) {
                  return ag;
             } 
        }
         return null;
     }
    //update
    //delete
    //insert
    public  void insert(Agence agence){
        tAgences.add(agence);
     }
}
