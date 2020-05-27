/*
 * En una empresa se requiere calcular el salario semanal de cada uno de los N obreros que laboran en ella. El
valor de N lo ingresa el usuario y se debe validar que sea un número mayor a cinco. El salario se obtiene de la
siguiente forma:
❑ Si el obrero trabaja 40 horas o menos se le paga $20 por hora
❑ Si trabaja más de 40 horas se le paga $20 por cada una de las primeras 40 horas y $25 por cada hora extra. 
 */
package electivojavaclases;

/**
 *
 * @author Hernàn
 */
public class Ejercicio3 {
    public String nombre;
    public String apellido;
    int horasTrabajo;
    double salario;

   public Ejercicio3 ( String nombre, String apellido,int horasTrabajo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.horasTrabajo=horasTrabajo;
    }
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
     *
     * @return
     */
    public double salariosemanal(){
        if(horasTrabajo<=40){
            salario=20*horasTrabajo;
        
        }else{
            if(horasTrabajo>40){
                salario=(20*40)+(horasTrabajo-40)*25;
            }
            
          
      }
        return salario;
    }
    public void mostrarcalculo()
    {
        System.out.println("Nombre: "+getNombre()+"\nApellido: "+getApellido()+
                "\nSalario semanal: "+salariosemanal());
    }
    
    
    
   
}
