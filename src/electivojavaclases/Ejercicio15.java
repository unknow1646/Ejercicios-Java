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
    String numeroIngresado;
    
    
    public Ejercicio15(String numeroIngresado){
        this.numeroIngresado=numeroIngresado;
    }
    
    public void palindromo(){
       int numero= Integer.parseInt(numeroIngresado);
       int aux= Integer.parseInt(numeroIngresado);;
       int[] original = new int[numeroIngresado.length()];
       int[] auxiliar = new int[numeroIngresado.length()];
       int i=original.length - 1,k=0;
       boolean pal = false;
       
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
       
       for(int j = 0;j<original.length;j++){
           if(original[j]==auxiliar[j]){
               pal=true;
           }else{
               pal=false;
           }
           
       }
       if(pal==true){
               System.out.println("El numero: "+numeroIngresado+ " es palindromo");
           }else{
               System.out.println("El numero: "+numeroIngresado+ " no es palindromo");
               
       }  
    }
    
}
