/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electivojavaclases;

/**
 *
 * @author Hernàn
 */
public class Ejercicio6 extends Ejercicio3{
    public float sueldoIngresado;

    public Ejercicio6(String nombre, String apellido, int horasTrabajo, float s) {
        super(nombre, apellido, horasTrabajo);
        this.sueldoIngresado=s;
        
    }
    
    
    public float salario(){
        int horasExtra= horasTrabajo-40;
        if(horasTrabajo<=40){
            salario=sueldoIngresado*horasTrabajo;
        }
        
        if(horasTrabajo>40 && horasExtra <=8){
            salario=sueldoIngresado*40+(sueldoIngresado*2)*horasExtra;
            
            
        }
        
        if(horasTrabajo>40 && horasExtra>8){
            salario=sueldoIngresado*40+(sueldoIngresado*2*8)+((horasExtra-8)*(sueldoIngresado*3));
        }
        
        return (float) salario;
        
        
    }
    
    
    public void mostrarcalculo6()
    {
        System.out.println("Nombre: "+getNombre()+"\nApellido: "+getApellido()+
                "\nSalario semanal: "+salario());
    }
    
    
    
}
