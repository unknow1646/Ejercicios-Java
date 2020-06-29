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
public class Ejercicio23 {
    int exp;
    int polinomio[];
    
    public Ejercicio23(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el exponente del polinomio");
        this.exp= sc.nextInt();
        String salto=sc.nextLine();
        polinomio= new int[exp+1];
        for(int i=0;i<=exp;i++){
            System.out.println("Ingrese el coeficiente (0 a 10)");
            this.polinomio[i]= sc.nextInt();
            salto=sc.nextLine();
            if(polinomio[i]<0 || polinomio[i]>9){
                System.out.println("De 0 a 10");
                this.polinomio[i]= sc.nextInt();
                salto=sc.nextLine();
            }
        }
    }
    
    public void evaluar(int x){
        int suma=0;
        for (int i=0; i<=exp;i++){
            suma=(int) ((Math.pow(x,i)*polinomio[i])+suma);
        }
        System.out.println("El entero asociado al polinomio es "+suma);
    }
}
