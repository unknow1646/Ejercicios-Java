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
public class Ejercicio20 {
    int a;
    int b;
    
    public Ejercicio20(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese a");
        this.a= sc.nextInt();
        String salto=sc.nextLine();
        System.out.println("Ingrese b");
        this.b= sc.nextInt();
    }
    
    public void multiplicar(){
        int suma=0;
        while(a!=0)
        {
            if(a%2!=0)
                suma=suma+b;
            a=a/2;
            b=b*2;
        }
        System.out.println("El resultado es "+ suma);
    }
}
