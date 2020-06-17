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
public class Ejercicio30 {
    String numeroIngresado;
    
    public Ejercicio30(String numero){
        this.numeroIngresado=numero;
        
    }
    
    public void isTio(){
       int numero= Integer.parseInt(numeroIngresado);
       int aux= Integer.parseInt(numeroIngresado);;
       int[] original = new int[numeroIngresado.length()];
       int[] auxiliar = new int[numeroIngresado.length()];
       int i=original.length - 1;
       boolean tio = false;
       
       while (numero > 0) {
            original[i] = numero%10;
            numero = numero/10;
            i--;
        } 
       for(int j=1;j<numeroIngresado.length();j++){
           if(original[j-1]==original[j]){
               tio=true;
           }else{
               tio=false;
           }
           
       }
       if(tio==true){
           System.out.println("El numero: "+numeroIngresado+ " es numero tio");
           
       }
       else {
           System.out.println("El numero: "+numeroIngresado+ " NO es numero tio");
           
       }
          
    }
       
}
