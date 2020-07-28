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
public class Ejercicio15 {
    String numeroIngresado15;
    
    
    public Ejercicio15(String numeroIngresado15){
        this.numeroIngresado15=numeroIngresado15;
    }
    
    public void palindromo(){
       int numero= Integer.parseInt(numeroIngresado15);
       int aux= Integer.parseInt(numeroIngresado15);
       int[] original = new int[numeroIngresado15.length()];
       int[] auxiliar = new int[numeroIngresado15.length()];
       int i=original.length - 1,k=0,j=0;
       boolean pal = true;
       
       while (numero > 0) {
            original[i] = numero%10;
            numero = numero/10;
            i--;
        } 
       while(aux>0){
           auxiliar[k]=aux%10;
           aux=aux/10;
           k++;
       }
       
       while(pal==true && j<original.length){
           System.out.println("Esto es original "+original[j]);
           System.out.println("Esto es auxiliar "+auxiliar[j]);
           if(original[j]==auxiliar[j]){
               pal=true;
           }else{
               pal=false;
           }
           j++;
           
       }
       if(pal==true){
               System.out.println("El numero: "+numeroIngresado15+ " es palindromo");
           }else{
               System.out.println("El numero: "+numeroIngresado15+ " no es palindromo");
               
       }  
    }
    
}
