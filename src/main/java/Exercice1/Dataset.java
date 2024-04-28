/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice1;

/**
 *
 * @author DELL
 */
abstract class Dataset {
    protected boolean isTrain ;
    protected String path ;
    public Dataset(String path,boolean isTrain){
        this.isTrain = isTrain ;
        this.path = path ;
        
    }
    abstract void prechargement(String path) ;
    abstract void pretraitement() ;
    
}