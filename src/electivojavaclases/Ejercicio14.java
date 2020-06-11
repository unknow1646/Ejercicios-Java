package electivojavaclases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hernàn
 */
public class Ejercicio14 {
    int valorA;
    int valorB;
    
    
    public Ejercicio14(int a, int b){
        this.valorA=a;
        this.valorB=b;
    }
    
    public void division(){
        int residuo=0, contador=0, i=0;
        while(valorA>=valorB){
            residuo=valorA-valorB;
            contador=contador+1;
            valorA=residuo;
            
        }
        
        System.out.println("Cuociente: "+contador+"\nResiduo :"+residuo);
        
    }
            
    
}
