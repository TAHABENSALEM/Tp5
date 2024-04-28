/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice2;

/**
 *
 * @author DELL
 */
public class UserValidator extends Exception {
     public boolean validateAge(int age) throws UserAgeException {
        if(age < 18){
            throw new UserAgeException("trés petit.");
        }
        else {
            return true ;
        }
    }
}
