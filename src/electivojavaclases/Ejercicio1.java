/*
 /**
     * Ejercicio 1: Para el intervalo cerrado [347, 2342]:
       Imprimir (mostrar) y contar los múltiplos de 7 y sumar el cuadrado de ellos.
       Contar los múltiplos de 3
 */
package electivojavaclases;

/**
 *
 * @author Hernàn
 */
public class Ejercicio1 {

    public void imprimir() {
        int i;
        int cont = 0;
        for (i = 347; i <= 2342; i++) {
            System.out.println(i);
            cont = cont + 1;

        }
        System.out.println("Numeros del rango: " + cont);

    }

    public int contar7() {
        int cant = 0;
        for (int i = 347; i <= 2342; i++) {
            if (i % 7 == 0) {
                cant = cant + 1;
            }
        }
        return cant;
    }

    public int contar3() {
        int cant = 0;
        for (int i = 347; i <= 2342; i++) {
            if (i % 3 == 0) {
                cant = cant + 1;
            }
        }
        return cant;

    }

    public int sumar7() {
        int suma = 0;
        for (int i = 347; i <= 2342; i++) {
            if (i % 7 == 0) {
                suma = suma + (int) (Math.pow(i, 2));
            }
        }
        return suma;
    }

}
