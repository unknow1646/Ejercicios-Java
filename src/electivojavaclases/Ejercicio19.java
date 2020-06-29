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
public class Ejercicio19 {
    int n;
    float sueldo[];
    
    public Ejercicio19(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de trabajadores");
        this.n= sc.nextInt();
        sueldo= new float[n];
        String salto=sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Ingrese el sueldo");
            this.sueldo[i]=sc.nextFloat();
            salto=sc.nextLine();
            if(this.sueldo[i]<280000){
                System.out.println("Tiene que ser mayor a 280000");
            }
        }
    }
    
    public void aumento(){
        for(int i=0; i<n;i++){
            if (280000<=sueldo[i] && sueldo[i]<350000)
                sueldo[i]=sueldo[i]+(sueldo[i]*0.15f);
            
            if (350000<=sueldo[i] && sueldo[i]<450000)
                sueldo[i]=sueldo[i]+(sueldo[i]*0.1f);
            
            if (sueldo[i]>= 450000)
                sueldo[i]=sueldo[i]+(sueldo[i]*0.05f);
        }
    }
    
    public void porcentaje(){
        int count=0;
        for (int i=0;i<n;i++){
            if(sueldo[i]<380000.0)
                count++;
        }
        float por=(float)count*100/n;
        System.out.println("Un "+por+"% de los trabajadores tienen un sueldo inferior a 380000");
    }
    
    public void cantidad(){
        int count=0;
        for (int i=0; i<n;i++){
            if(sueldo[i]>395000.0)
                count++;
        }
        System.out.println("Hay "+count+" trabajadores que ganan más de 395000");
    }
    
    public void promedio(){
        float suma=0;
        for (int i=0;i<n;i++)
            suma=suma+sueldo[i];
        float prom=suma/n;
        System.out.println("El promedio de los sueldos es: "+prom);
    }
    
}
