/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electivojavaclases;

import java.util.Arrays;

/**
 *
 * @author Hernàn
 */
public class Ejercicio12 {
    int N12; //tamaño
    float [] notas ;
    
    public Ejercicio12(float [] notas,int N12){
        this.notas=notas;
        this.N12=N12;
        
    }
    
    public void promedio(){
        float suma=0;
        float promedio;
        for(int i=1; i<N12;i++){
            System.out.println("Posicion: "+i+"="+notas[i]);
            suma=suma+notas[i];   
        }
        promedio=suma/(N12-1);
        System.out.println("Promedio: "+ promedio);
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
