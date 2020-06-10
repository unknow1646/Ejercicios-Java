/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electivojavaclases;


import java.util.Arrays;
import java.util.HashMap;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Hernàn
 */
public class ELECTIVOJAVACLASES {

    /**
     * Para el intervalo cerrado [347, 2342]:
       Imprimir (mostrar) y contar los múltiplos de 7 y sumar el cuadrado de ellos.Contar los múltiplos de 3
     * @param args
     */
    public static void main(String[] args) {
        String menu = "Elija una opción:  \n";
		for (int i = 1; i <= 32; i++) {
			menu = menu + " opción " + i + "\n";
		}
		String option = JOptionPane.showInputDialog(menu);
                switch(option){
                    case "1":
                        Ejercicio1 itv = new Ejercicio1();
                        itv.imprimir();
                        System.out.println("Cantidad de multiplos de 7: "+itv.contar7());
                        System.out.println("Cantidad de multiplos de 3: "+itv.contar3());
                        System.out.println("Suma de cuadrados de multiplos de 7: "+itv.sumar7());
                        break;
                    
                    case "2":
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Ingrese un numero");
                        int numero1 = sc.nextInt();
                        System.out.println("Ingrese otro numero");  
                        int numero2 = sc.nextInt();
                        Ejercicio2 eje2 = new Ejercicio2(numero1,numero2);
                        System.out.println("--------- o ----------------- "); 
                        eje2.imprango();
                        eje2.contpar();
                        eje2.sumimpar();
                        break;
                        
                    case "3":
                        Scanner sc1 = new Scanner(System.in);
                        System.out.println("Ingrese el numero de obreros ");
                        int N= sc1.nextInt();
                        String salto1=sc1.nextLine();
                        Ejercicio3 a[]= new Ejercicio3[N];
                        if(N<6){
                            System.out.println("Debe ser un numero mayor a 5");
                        }else{
                            for(int i=0;i<N;i++){
                                System.out.println("Ingrese Nombre del obrero: ");
                                String nombre= sc1.nextLine();
                                System.out.println("Ingrese Apellido del obrero: ");
                                String apellido = sc1.nextLine();
                                System.out.println("Ingrese horas de trabajo del obrero: ");
                                int horasTrabajo= sc1.nextInt();
                                String salto=sc1.nextLine();
                                a[i] = new Ejercicio3(nombre,apellido,horasTrabajo);
                            } 
                            for(int i=0; i<N;i++){
                                a[i].mostrarcalculo();
                            }
                        }
                        
                        break;
                        
                    case "4":
                        Scanner sc4 = new Scanner(System.in);
                        System.out.println("Ingrese el numero de alumnos ");
                        
                        int n= sc4.nextInt();
                        String salto=sc4.nextLine();
                        Ejercicio4 eje4[]= new Ejercicio4[n];
                        for(int i=0;i<n;i++)
                            eje4[i]= new Ejercicio4();
                        for(int i=0;i<n;i++){
                            int j=i+1;
                            System.out.println("Alumno: "+j);
                            eje4[i].menornota();
                        }
        
                        float menor=eje4[0].promedio();
                        int ban=0;
                        for (int i=0;i<n;i++){
                            if(menor>eje4[i].promedio()){
                                menor=eje4[i].promedio();
                                ban=i+1;
                            }
                        }
                        System.out.println("El menor promedio es "+menor+" del alumno "+ban);
                        int cont=0;
                        for(int i=0;i<n;i++){
                            if(eje4[i].cantAsig>4)
                                cont++;
                        }
                        int porcentaje=cont*100/n;
                        System.out.println("Un "+porcentaje+"% tiene más de 4 asignaturas");
                        
                        
                        break;
                        
                    case "5":
                        Scanner sc5 = new Scanner(System.in);
                        System.out.println("Ingrese la dimension del lado A: ");
                        float ladoA= sc5.nextFloat();
                        String salto51=sc5.nextLine();
                        System.out.println("Ingrese la dimension del lado B: ");
                        float ladoB= sc5.nextFloat();
                        String salto52=sc5.nextLine();
                        System.out.println("Ingrese la dimension del lado C: ");
                        float ladoC= sc5.nextFloat();
                        String salto53=sc5.nextLine();
                        Ejercicio5 eje5 = new Ejercicio5(ladoA,ladoB,ladoC);
                        eje5.mostrar();
                        break;
                        
                    case "7":
                        Ejercicio7 eje7 = new Ejercicio7();
                        eje7.suma();
                        break;
                        
                    case "9":
                         System.out.println("Introduzca la fecha con formato dd-mm-yyyy");
                         Scanner sc9 = new Scanner(System.in);
                         System.out.println("Ingrese la fecha de caducidad del medicamento");
                         String fecha1 = sc9.nextLine();
                         System.out.println("Ingrese la fecha actual");
                         String fecha2= sc9.nextLine();
                         Ejercicio9 eje9 = new Ejercicio9(fecha1,fecha2);
                         eje9.fecha();
                         break;
                         
                    case "10":
                        System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
                        Scanner sc10 = new Scanner(System.in);
                        System.out.println("Ingrese la fecha de su nacimiento");
                        String fechaNacimiento = sc10.nextLine();
                        Ejercicio10 eje10 = new Ejercicio10(fechaNacimiento);
                        eje10.fecha();
                        break;

                    case "11":
                        Scanner sc11 = new Scanner(System.in);
                        System.out.println("Introduce un número");
                        String numeroIngresado = sc11.nextLine();
                        Ejercicio11 eje11 = new Ejercicio11(numeroIngresado);
                        eje11.pares();
                        break;
                        
                        
                    case "12":
                        Scanner sc12 = new Scanner(System.in);
                        System.out.println("Ingrese la cantidad de notas ");
                        int N12= sc12.nextInt();
                        String salto12=sc12.nextLine();
                        float [] notas = new float[N12];
                        if(N12<2){
                            System.out.println("Debe ser un numero mayor a 2");
                        }else{
                            for(int i=0;i<N12;i++){
                                System.out.println("Ingrese Nota: "+ i);
                                Float nota= sc12.nextFloat();
                                notas[i]=nota;
                            }
                            Arrays.sort(notas);
                        }
                        Ejercicio12 eje12 = new Ejercicio12(notas,N12);
                        eje12.promedio();
                        break;
                        
                        
                        
                    case "15":
                        Scanner sc15 = new Scanner(System.in);
                        System.out.println("Introduce un número");
                        String numeroIngresado15 = sc15.nextLine();
                        Ejercicio15 eje15 = new Ejercicio15(numeroIngresado15);
                        eje15.palindromo();
                        break;
                        
                    case "26":
                        Ejercicio26 eje26 = new Ejercicio26();
                        System.out.println("El promedio de notas es :"+eje26.promedio());
                        eje26.menornota();
                        
                        break;
                        
                    case "28":
                        Scanner sc28 = new Scanner(System.in);
                        System.out.println("INTRODUCE EL NOMBRE DEL PRIMER CANDIDATO");
                        String NOMBRE1= sc28.nextLine();
                        System.out.println("INTRODUCE EL NOMBRE DEL SEGUNDO CANDIDATO");
                        String NOMBRE2= sc28.nextLine();
                        System.out.println("INTRODUCE EL NOMBRE DEL TERCER CANDIDATO");
                        String NOMBRE3= sc28.nextLine();
                        Ejercicio28 eje28 = new Ejercicio28(NOMBRE1,NOMBRE2,NOMBRE3);
                        eje28.votacion();
                        
                        break;
                               
                 
                    case "31":
                        Scanner sc31 = new Scanner(System.in);
                        System.out.println("Ingrese un numero mayor o igual a 15");
                        int numeroIngresado31 = sc31.nextInt();
                        Ejercicio31 eje31 = new Ejercicio31(numeroIngresado31);
                        System.out.println("-----------------o--------------");
                        eje31.Primo();
                        break;

                }
    }
}
    
