/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice2;

/**
 *
 * @author DELL
 */
public class MathOperations {
     public int calculateFactorial( int n) throws IllegalArgumentException{
        if( n < 0){
            throw new IllegalArgumentException("le nombre est negatif .") ;
        }
        else if (n == 0){
            return 1 ;    
        }
        else {
            int fac = 1 ;
            for(int i = n ; i > 0 ; i--){
                fac *= i ;
            }
            return fac ;
        }
    }
    public float calculateSquareRoot( float n) throws ArithmeticException{
        if( n < 0){
            throw new ArithmeticException("le nombre est negatif .") ;
        }
        else {
            return (float) Math.sqrt(n) ;    
        }

    }
}
