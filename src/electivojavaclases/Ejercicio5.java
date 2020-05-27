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
public class Ejercicio5 {
    float ladoA;
    float ladoB;
    float ladoC;
    
    public Ejercicio5(float ladoA, float ladoB, float ladoC){
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.ladoC=ladoC;
    }
 
    public float perimetro(){
        float perimetro;
        perimetro=(ladoA+ladoB+ladoC);
        return perimetro;
    }
    
    public float area(){
        float area, semiper=(ladoA+ladoB+ladoC)/2;
        area=(float) Math.sqrt(semiper*(semiper-ladoA)*(semiper-ladoB)*(semiper-ladoC));
        return area;  
    }
    public String tipoTriangulo(){
        if(ladoA==ladoB && ladoB==ladoC){
            
            return "Triangulo Equilatero";
        }
        
        if(ladoA==ladoB && ladoB!=ladoC || ladoB==ladoC && ladoC!=ladoA || ladoC==ladoA && ladoA!=ladoB ){
            return "Triangulo Isoceles";  
        }else{
            
            return "Triangulo Escaleno";
        }           
       
    }
    
    public boolean formarTriangulo(){
        if(ladoA+ladoB>ladoC){
            return true;
        }else{
            return false;
        }    
  } 
    public void mostrar(){
        boolean puede=formarTriangulo();
        if(puede==true){
            System.out.println("Tipo :"+tipoTriangulo()+"\nPerimetro: "+perimetro()+"\nArea: "+area());       
        }else{
            System.out.println("No se puede formar triangulo");
        }           
    } 
}
