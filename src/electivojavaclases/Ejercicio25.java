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
public class Ejercicio25 {
    int año;
    
    public Ejercicio25(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el año");
        this.año= sc.nextInt();
        String salto=sc.nextLine();
    }
    
    public void domingopas(){
        int a,b,c,d,e, fecha, mes;
        a=this.año%19;
        b=this.año%4;
        c=this.año%7;
        d=(19*a+24)%30;
        e=(2*b+4*c+6*d+5)%7;
        fecha=22+d+e;
        mes=3;
        if(fecha>31){
            fecha=fecha-31;
            mes=4;
        }
        System.out.println("La fecha del domingo de pascua es: "+fecha+"/0"+mes+"/"+this.año);
    }
}
