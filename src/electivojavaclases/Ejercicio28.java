/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electivojavaclases;

import java.util.HashMap;


public class Ejercicio28 { //informacion del candidato
    String NOMBRE1;
    String NOMBRE2;
    String NOMBRE3;
    
    
    public Ejercicio28(String NOMBRE1,String NOMBRE2, String NOMBRE3){
        this.NOMBRE1=NOMBRE1;
        this.NOMBRE2=NOMBRE2;
        this.NOMBRE3=NOMBRE3;   
        
    }
    
    public void votacion(){
        int cantvotos1=0;
        int cantvotos2=0;
        int cantvotos3=0;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<2500000;i++){
            int valorEntero = (int) Math.floor(Math.random()*(3-1+1)+1);;
            if(valorEntero == 1 ){
                cantvotos1=cantvotos1+1;    
                map.put(NOMBRE1, cantvotos1);
            }
            
            if(valorEntero == 2 ){
                cantvotos2=cantvotos2+1;
                map.put(NOMBRE2, cantvotos2);
            }
            
            if(valorEntero == 3 ){
                cantvotos3=cantvotos3+1;
                map.put(NOMBRE3, cantvotos3);
            }
        }
        if(cantvotos1>cantvotos2 && cantvotos1>cantvotos3){
        System.out.println("El ganador de la elecion es: "+NOMBRE1+" con "+map.get(NOMBRE1)+" votos.");
        System.out.println("Nombre: "+NOMBRE2+" VOTOS: "+map.get(NOMBRE2));
        System.out.println("Nombre: "+NOMBRE3+" VOTOS: "+map.get(NOMBRE3));  
        }
        
        if(cantvotos2>cantvotos1 && cantvotos2>cantvotos3){
        System.out.println("El ganador de la elecion es: "+NOMBRE2+" con "+map.get(NOMBRE2)+" votos.");
        System.out.println("Nombre: "+NOMBRE1+" VOTOS: "+map.get(NOMBRE1));
        System.out.println("Nombre: "+NOMBRE3+" VOTOS: "+map.get(NOMBRE3));  
        }
        
        if(cantvotos3>cantvotos1 && cantvotos3>cantvotos2){
        System.out.println("El ganador de la elecion es: "+NOMBRE3+" con "+map.get(NOMBRE3)+" votos.");
        System.out.println("Nombre: "+NOMBRE2+" VOTOS: "+map.get(NOMBRE2));
        System.out.println("Nombre: "+NOMBRE1+" VOTOS: "+map.get(NOMBRE1));  
        }
        
        
        
    }
    
    
    

    
    
    
    
    
    
    
  
    
    
}
