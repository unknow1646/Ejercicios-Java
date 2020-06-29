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
public class Ejercicio13 {
    public int a;
    public int b;
    
    public Ejercicio13(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        this.a= sc.nextInt();
        System.out.println("Ingrese otro número");
        this.b= sc.nextInt();
    }
    
    public void multiplicar(){
        int resultado=0;
        for(int i=0; i<a; i++){
            resultado=resultado+b;
            System.out.println(b);
        }
        System.out.println("El resultado de la multiplicacion "+a+"*"+b+" es: "+resultado);
    }
}
