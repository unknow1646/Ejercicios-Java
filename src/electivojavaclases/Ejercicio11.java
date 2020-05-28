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
public class Ejercicio11 {
    String numeroIngresado;
    
    public Ejercicio11(String numeroIngresado){
        this.numeroIngresado=numeroIngresado;   
    }
    
    
    public void pares(){
       int cont=0;
       int numero= Integer.parseInt(numeroIngresado);
       int[] arreglo = new int[numeroIngresado.length()];
       int i = arreglo.length - 1;
       while(numero>0){
            arreglo[i] = numero%10;
            numero = numero / 10;
            i--;
           
       }
       
       for(int j=0; j < arreglo.length; j++){
           if(arreglo[j]%2==0){
               cont=cont+1;
           }  
       }
       System.out.println("El numero "+numeroIngresado+" contiene "+cont+" numeros pares.");
       }  
    }
    


