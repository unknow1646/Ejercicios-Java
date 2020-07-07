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
        float resultado=0,terminos=0;
        System.out.println("TERMINOS DE LA SERIE :");
        for (int i=1;i<=ingresoN;i++){
            resultado=(float) ((Math.pow(-ingresoX, i))/factorial(i))+resultado;
            terminos=(float) ((Math.pow(-ingresoX, i))/factorial(i));
            System.out.print(terminos+"  ");
            
        }
        System.out.println("\nEl resultado de la serie es: "+resultado);
        
    }
    
}
