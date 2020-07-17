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
public class Ejercicio32 {
    int n;
    int[][] parejas;
    
    public Ejercicio32(){
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de parejas");
        this.n= sc.nextInt();
        String salto=sc.nextLine();
        if(n<2)
            System.out.println("tiene que ser mayor o igual a 2");
        else{
            parejas= new int[n][2];
            for(int i=0;i<n;i++){
                j=i+1;
                System.out.println("Ingrese la pareja "+j);
                System.out.println("Ingrese x");
                this.parejas[i][0]=sc.nextInt();
                salto=sc.nextLine();
                System.out.println("Ingrese y");
                this.parejas[i][1]=sc.nextInt();
                salto=sc.nextLine();
            }
        }
    }
    
    public int sumax(){
        int suma=0;
        for(int i=0; i<n;i++){
            suma=suma+parejas[i][0];
        }
        return suma;
    }
    
    public int sumax2(){
        int suma=0;
        for(int i=0; i<n;i++){
            suma=(int) (suma+ Math.pow(parejas[i][0],2));
        }
        return suma;
    }
    
    public int sumay(){
        int suma=0;
        for(int i=0; i<n;i++){
            suma=suma+parejas[i][1];
        }
        return suma;
    }
    
    public int sumaxy(){
        int suma=0;
        for(int i=0; i<n;i++){
            suma=suma+(parejas[i][0]*parejas[i][1]);
        }
        return suma;
    }
    
    public float a(){
        return (float) ((n*sumaxy()-sumax()*sumay())/(n*sumax2()-Math.pow(sumax(),2)));
    }
    
    public float b(){
        return (sumay()-a()*sumax())/n;
    }
    
}
