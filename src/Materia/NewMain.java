/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materia;

/**
 *
 * @author Hernàn
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Clase obj= new Clase();
        //NORMAL
        System.out.println("Sobrecarga: "+obj.calcular(3));
        
        
        
        //Sobrecarga
        System.out.println("Sobrecarga: "+obj.calcular(3.0));
        
        
    }
    
}
