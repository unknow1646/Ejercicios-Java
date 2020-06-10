/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electivojavaclases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Hernàn
 */
public class Ejercicio10 {
    String fechaNacimiento;
    
    public Ejercicio10(String a){
        this.fechaNacimiento=a;
        
    }
    
    public void fecha(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, fmt);
        LocalDate fechaAct = LocalDate.now();
        Period periodo = Period.between(fechaNac, fechaAct);
        System.out.printf("Su edad es: %s años, %s meses y %s días",
                periodo.getYears(), periodo.getMonths(), periodo.getDays());
        
    }
    
    
    
    
    
}
