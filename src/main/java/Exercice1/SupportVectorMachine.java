/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice1;

/**
 *
 * @author DELL
 */

    public class SupportVectorMachine extends BaseModel {
    int iterations;
    double learningRate;

    public SupportVectorMachine(String name, int version, String description) {
        super(name, version, description);
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
