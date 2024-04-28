/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice2;
import java.io.FileNotFoundException;
import java.io.File;
/**
 *
 * @author DELL
 */
public class FileManager {
     public void readFile(String filePath) throws FileNotFoundException{
        File file = new File(filePath);
        if(file.exists()){
            System.out.println("file exist");
        }
        else {
            throw new FileNotFoundException("file not found at:" + filePath) ; 
        }
    }
}
