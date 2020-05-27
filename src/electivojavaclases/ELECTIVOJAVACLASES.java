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
    /*
     Scanner sc = new Scanner(System.in);
     System.out.println("Ingrese un numero");
     int numero1 = sc.nextInt();
     System.out.println("Ingrese otro numero");  
     int numero2 = sc.nextInt();
     Ejercicio2 eje2 = new Ejercicio2(numero1,numero2);
     System.out.println("--------- o ----------------- "); 
     eje2.imprango();
     eje2.contpar();
     eje2.sumimpar();
     */
    
    
    //EJERCICIO 3
    /* Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el numero de obreros ");
    int N= sc.nextInt();
    String salto1=sc.nextLine();
    Ejercicio3 a[]= new Ejercicio3[N];
    if(N<6){
        System.out.println("Debe ser un numero mayor a 5");
    }else{
        for(int i=0;i<N;i++){
        System.out.println("Ingrese Nombre del obrero: ");
        String nombre= sc.nextLine();
        System.out.println("Ingrese Apellido del obrero: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese horas de trabajo del obrero: ");
        int horasTrabajo= sc.nextInt();
        String salto=sc.nextLine();
        
        a[i] = new Ejercicio3(nombre,apellido,horasTrabajo);
        } 
        for(int i=0; i<N;i++){
        a[i].mostrarcalculo();
        }
    
    }*/
    //EJERCICIO 31
    /*Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un numero mayor o igual a 15");
    int numeroIngresado = sc.nextInt();
    Ejercicio31 eje31 = new Ejercicio31(numeroIngresado);
    System.out.println("-----------------o--------------");
    eje31.Primo();
   */
    
    //EJERCICIO 7
    /*
    Ejercicio7 eje7 = new Ejercicio7();
    eje7.suma();
    */
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la dimension del lado A: ");
    float ladoA= sc.nextFloat();
    String salto=sc.nextLine();
    System.out.println("Ingrese la dimension del lado B: ");
    float ladoB= sc.nextFloat();
    String salto1=sc.nextLine();
    System.out.println("Ingrese la dimension del lado C: ");
    float ladoC= sc.nextFloat();
    String salto2=sc.nextLine();
    Ejercicio5 eje5 = new Ejercicio5(ladoA,ladoB,ladoC);
    eje5.mostrar();
    
    
    
   }
 }
    
