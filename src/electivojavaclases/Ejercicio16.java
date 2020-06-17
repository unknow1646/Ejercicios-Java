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
public class Ejercicio16 implements Comparable<Ejercicio16> {
    private String sexo;
    private float puntaje;
    
    
    public Ejercicio16(String s, float p){
        this.sexo=s;
        this.puntaje=p;
        
        
       
    }
    
    @Override
    public int compareTo(Ejercicio16 E){
        if (puntaje < E.puntaje) {
                return 1;
            }
            if (puntaje > E.puntaje) {
                return -1;
            }
            return 0;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the puntaje
     */
    public float getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(float puntaje) {
        this.puntaje = puntaje;
    }
        
}
