package electivojavaclases;


import electivojavaclases.Ejercicio6;
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
public class Ejercicio24 implements Comparable<Ejercicio24>{
    private int codTrabajador;
    private int horasTrabajo;
    private int horasExtra;
    public float sueldo;
    
    public Ejercicio24(int cod, int horasT, int horasE){
        this.codTrabajador=cod;
        this.horasTrabajo=horasT;
        this.horasExtra=horasE;
        
        }
    @Override
    public int compareTo(Ejercicio24 E){
        if (sueldo < E.sueldo) {
                return 1;
            }
            if (sueldo > E.sueldo) {
                return -1;
            }
            return 0;
    }

    /**
     * @return the codTrabajador
     */
    public int getCodTrabajador() {
        return codTrabajador;
    }

    /**
     * @param codTrabajador the codTrabajador to set
     */
    public void setCodTrabajador(int codTrabajador) {
        this.codTrabajador = codTrabajador;
    }

    /**
     * @return the horasTrabajo
     */
    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    /**
     * @param horasTrabajo the horasTrabajo to set
     */
    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    /**
     * @return the horasExtra
     */
    public int getHorasExtra() {
        return horasExtra;
    }

    /**
     * @param horasExtra the horasExtra to set
     */
    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
    
    public float sueldoCalculo(){
        
        sueldo=1450*horasTrabajo+2175*horasExtra;
        return sueldo;
        
    }
    
    
    
    public void mostrar(){
        System.out.println("Codigo trabajador: "+getCodTrabajador()+"\nSueldo: "+sueldoCalculo());
    }
    
    
    
 
    
    
    
    
    

    
    
}
