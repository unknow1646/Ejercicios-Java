/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electivojavaclases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Hernàn
 */
public class Ejercicio9 {
    String fecha1;
    String fecha2;
    
    
    public Ejercicio9(String fecha1,String fecha2){
        this.fecha1=fecha1;
        this.fecha2=fecha2;
    }
    
    public void fecha(){
        try {
            SimpleDateFormat sdformat = new SimpleDateFormat("dd-MM-yyyy");
            Date date1 = sdformat.parse(fecha1);
            Date date2 = sdformat.parse(fecha2);
            if(date1.compareTo(date2) > 0) {
                System.out.println("El medicamento aun no vence");
            } else if(date1.compareTo(date2) < 0) {
                System.out.println("El medicamento esta vencido");
            } else if(date1.compareTo(date2) == 0) {
                System.out.println("El medicamento vence hoy");
            } 
        }catch (ParseException ex) {System.out.println("formato ingresado invalido");}
    }
    
    
}
