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
public class Clase01 extends Clase {
    public void calcular(){
            System.out.println("Que pasa");
    }
    
    
    @Override
    public int calcular(int a){
        return a+2*a;
    }
   
    
}
