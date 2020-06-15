package electivojavaclases;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hernàn
 */
public class Ejercicio21 {
    int numeroIngresado;
    
    public Ejercicio21(){
        Scanner sc21 = new Scanner (System.in);
        System.out.println("Introduzca un número");
        this.numeroIngresado = sc21.nextInt();
        System.out.println("El factorial de "+numeroIngresado+" es: "+factorial(numeroIngresado));
        
        
    }
    
    
    public int factorial(int numeroIngresado){
        if (numeroIngresado==0)
            return 1;
        else
            return numeroIngresado * factorial(numeroIngresado-1);
        
    }
}
