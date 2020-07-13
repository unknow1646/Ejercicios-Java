/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electivojavaclases;

import java.util.Scanner;

/**
 *
 * @author Hernàn
 */
public class Ejercicio27 {
    public String tipoAnimal;
    public int edadAnimal[];
    
    
    public Ejercicio27(String tipoAnimal){
        this.tipoAnimal=tipoAnimal;
        
           
    }
    public void animales(){
        int rango1=0, rango2=0,rango3=0;
        int porcentajeA, porcentajeB, porcentajeC;
        Scanner sc1 = new Scanner(System.in);
        if("ELEFANTE".equals(tipoAnimal)){
            edadAnimal= new int[20];
        }
        
        if("JIRAFA".equals(tipoAnimal)){
            edadAnimal= new int[15];
        }
        
        if("CHIMPANCE".equals(tipoAnimal)){
            edadAnimal= new int [40];
        }
        for(int i=0;i<edadAnimal.length;i++){
                int contador=i+1;
                System.out.println("INGRESE LA EDAD DEL ANIMAL "+contador+": ");
                edadAnimal[i]=sc1.nextInt();
                String salto=sc1.nextLine(); 
                if(edadAnimal[i]==1 || edadAnimal[i]==2){
                    rango1=rango1+1;
                }
                if(edadAnimal[i]>2 && edadAnimal[i]<4){
                    rango2=rango2+1;
                    
                }
                if(edadAnimal[i]>=4){
                    rango3=rango3+1;
                }   
        }
        porcentajeA=(rango1*100)/edadAnimal.length;
        porcentajeB=(rango2*100)/edadAnimal.length;
        porcentajeC=(rango3*100)/edadAnimal.length;
        System.out.println("Porcentaje de categoria de edad 1: "+porcentajeA+"%");
        System.out.println("Porcentaje de categoria de edad 2: "+porcentajeB+"%");
        System.out.println("Porcentaje de categoria de edad 3: "+porcentajeC+"%");
        
        
        
        
        
        
    
      
    
}
    
    
    
    
    
    
    
    
    
}

