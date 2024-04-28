/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice1;

/**
 *
 * @author DELL
 */
public class NeuralNetwork extends BaseModel {
    int layers[];
    String activisionFunction ;
    public NeuralNetwork(String name , int version , String description , int layers[] , String activisionFunction){
        super(name , version, description) ;  
        this.layers = layers ;
        this.activisionFunction = activisionFunction ;
    }
    
    @Override
    public void train(Dataset dataset){
        System.out.println("modéle trainée.");
    }


    @Override
    public void predict(Dataset dataset) {
        System.out.println("prédiction prête."); 
    }
    
}
    
