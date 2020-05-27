/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electivojavaclases;

/**
 *
 * @author Hernàn
 */
public class Ejercicio31 {
    int numeroIngresado;
    
    public Ejercicio31(int numeroIngresado){
        this.numeroIngresado=numeroIngresado;
    }
    
    public void Primo(){   
        int numeroIn=2,i,j;
        boolean primo;
        for(i=numeroIn;i<=numeroIngresado;i++){
            primo=true;
            for(j=2;j<i;j++){
                if(i%j==0){
                    primo=false;
                }
            }
            if(primo){
                System.out.println(i);
            }
        }
    }
}
