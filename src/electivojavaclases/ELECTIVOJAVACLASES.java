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
public class ELECTIVOJAVACLASES {

    /**
     * Para el intervalo cerrado [347, 2342]:
       Imprimir (mostrar) y contar los múltiplos de 7 y sumar el cuadrado de ellos.
       Contar los múltiplos de 3
     */
    public static void main(String[] args) {
     // EJERCICIO1
    /* Ejercicio1 itv = new Ejercicio1();
     itv.imprimir();
     System.out.println("Cantidad de multiplos de 7: "+itv.contar7());
     System.out.println("Cantidad de multiplos de 3: "+itv.contar3());
     System.out.println("Suma de cuadrados de multiplos de 7: "+itv.sumar7());
     */
     
    
    //EJERCICIO2
     Scanner sc = new Scanner(System.in);
     System.out.println("Ingrese un numero");
     int numero1 = sc.nextInt();
     System.out.println("Ingrese otro numero");  
     int numero2 = sc.nextInt();
     Ejercicio2 eje2 = new Ejercicio2(numero1,numero2);
     eje2.imprango();
     eje2.contpar();
     eje2.sumimpar();
    
    }
    
}
