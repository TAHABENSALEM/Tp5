/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice1;

/**
 *
 * @author DELL
 */
abstract class BaseModel implements MachineLearningModel {
    protected String name ;
    int version ;
    String description ;
    String device ;
    public BaseModel(String name , int version , String description){
        this.description = description ;
        this.name = name ;
        this.version = version ;
    }
    public void displayDetails(){
        System.out.println("name : " + this.name + " , version : " + this.version + " , descriptio : " + this.description);
    } 
}