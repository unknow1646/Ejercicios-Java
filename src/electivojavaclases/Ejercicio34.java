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
public class Ejercicio34 extends Ejercicio21{
    public int ingresoN;
    public int ingresoX;
    
    
    public Ejercicio34(int N, int X){
        this.ingresoN=N;
        this.ingresoX=X;
        
    }
    
    
    public void serie(){
        float resultado=0,terminos=0,signo=-1;
        System.out.println("TERMINOS DE LA SERIE :");
        for (int i=1;i<=ingresoN;i++){
            if((i-1)%2==0){
                terminos=-(float) ((Math.pow(ingresoX, i))/factorial(i));   
            }else{
                terminos=+(float) ((Math.pow(ingresoX, i))/factorial(i));     
            }
            resultado=terminos+resultado;
            //System.out.println(resultado);
            System.out.print(terminos+"  ");
            
        }
        System.out.println("\nEl resultado de la serie es: "+resultado);
        
    }
    
}
