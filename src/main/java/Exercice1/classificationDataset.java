/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice1;

/**
 *
 * @author DELL
 */
public class classificationDataset extends Dataset {
    String labels[];
    int numClasses ;
    public classificationDataset(String path , boolean train){
        super(path,train);
    }
    @Override
    public void prechargement(String path){
        System.out.println("donnees chargees !");
    }
    @Override
    public void pretraitement(){
        System.out.println("donnees traitees !");
    }
}
