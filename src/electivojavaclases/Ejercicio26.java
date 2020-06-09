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
public class Ejercicio26 {
    int cantAsig;
    String asig[];
    int notas[];
    
    public Ejercicio26(){
        Scanner sc26 = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de asignaturas ");
        this.cantAsig= sc26.nextInt();
        String salto=sc26.nextLine();
        asig = new String[cantAsig];
        notas = new int[cantAsig];
        for(int i=0;i<cantAsig;i++){
            int j=i+1;
            System.out.println("Ingrese el nombre de la asignatura "+j);
            asig[i]= sc26.nextLine();
            System.out.println("Ingrese la nota de la asignatura "+j);
            notas[i]=sc26.nextInt();
            salto=sc26.nextLine();
        }
    }
    
    
    public void menornota(){
        int menor=this.notas[0], ban=0;
        for (int i=0;i<cantAsig;i++){
            if(menor>this.notas[i]){
                menor=this.notas[i];
                ban=i;
            }
        }
        System.out.println("La nota más baja es "+asig[ban]+" con nota "+menor);
    }
    
    public float promedio(){
        int suma=0;
        for(int i=0;i<cantAsig;i++)
            suma=suma+notas[i];
        return suma/cantAsig;
    }
    
    
    
}
