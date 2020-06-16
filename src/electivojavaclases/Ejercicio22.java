package electivojavaclases;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hernàn
 */
public class Ejercicio22 extends Ejercicio21 {
    int numeroIngresadoA;
    int numeroIngresadoB;
    
    
    public Ejercicio22(){
          
    }
    
    public void combinatoria(int numeroIngresadoA, int numeroIngresadoB){
        int N= factorial(numeroIngresadoA);
        int K= factorial(numeroIngresadoB);
        int DIF = numeroIngresadoA-numeroIngresadoB;
        int DF= factorial(DIF);
        float comb;
        comb= N/(K*DF);
        System.out.println("El resultado de la combinatoria entre "+numeroIngresadoA+
                " y "+numeroIngresadoB+" es: "+comb);
        
        
        
    }
    
 
    
    
    
}
