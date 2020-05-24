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
public class Ejercicio2 {
    int numero1;
    int numero2;
    
    public Ejercicio2(int numero1, int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
                  
   }
    public void imprango()
    {
        int cant=0;
        for(int i=numero1+1;i<numero2;i++){
            System.out.println(i);
            cant=cant+1;
        }
        System.out.println("la cantidad de numeros que hay entre ambos números es :"+cant);
    } 
    
    public void contpar(){
        int cant=0;
        for(int i=numero1+1;i<numero2;i++){
            if(i%2==0){
               cant=cant+1;   
            }
        }
        System.out.println("La cantidad de pares entre los numeroes es:"+cant);
    }
    
    public void sumimpar(){
        int sum=0;
        for(int i=numero1+1;i<numero2;i++){
            if(i%2!=0){
                sum=sum+i;
                
            }
        }
        System.out.println("La suma de impares es: "+sum);
        
    }
}
