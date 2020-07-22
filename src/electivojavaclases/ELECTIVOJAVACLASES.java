/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electivojavaclases;


import java.lang.reflect.Array;
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
                        String salir="N";
                        Scanner sc4 = new Scanner(System.in);
                        while(salir!="S"){
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
                            System.out.println("El promedio es "+eje4[i].promedio());
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
                        System.out.println("Desea continuar? [S/N] ");
                        salir=sc4.nextLine();
                        if(salir.equals("S")){
                            salir="N";
                        }else
                            salir="S";
                        }
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
                        
                    case "6":
                        int contador=0;
                        Scanner sc6 = new Scanner(System.in);
                        System.out.println("Ingrese el numero de obreros ");
                        int N6= sc6.nextInt();
                        String salto6=sc6.nextLine();
                        Ejercicio6 arreglo6[]= new Ejercicio6[N6];
                        for(int i=0;i<N6;i++){
                            contador=contador+1;
                            System.out.println("Ingrese Nombre del obrero "+contador+" :");
                            String nombre= sc6.nextLine();
                            System.out.println("Ingrese Apellido del obrero "+contador+" :");
                            String apellido = sc6.nextLine();
                            System.out.println("Ingrese horas de trabajo del obrero "+contador+" :");
                            int horasTrabajo= sc6.nextInt();
                            String salto66=sc6.nextLine();
                            System.out.println("Ingrese sueldo por hora");
                            float sueldoIngresado=sc6.nextInt();
                            String salto666=sc6.nextLine();
                            arreglo6[i] = new Ejercicio6(nombre,apellido,horasTrabajo,sueldoIngresado);
                        } 
                        for(int i=0; i<N6;i++){
                            arreglo6[i].mostrarcalculo6();
                        }
                        break;
                        
                    case "7":
                        Ejercicio7 eje7 = new Ejercicio7();
                        eje7.suma();
                        break;
                        
                    case "8":
                        Ejercicio8 eje8 = new Ejercicio8();
                        eje8.precio();
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
                    
                    case "13":
                        Ejercicio13 eje13 = new Ejercicio13();
                        eje13.multiplicar();
                        break;
                    
                    case "14":
                        Scanner sc14 = new Scanner(System.in);
                        System.out.println("Introduce el valor A de la division");
                        int numeroA = sc14.nextInt();
                        System.out.println("Introduce el valor B de la division");
                        int numeroB = sc14.nextInt();
                        Ejercicio14 eje14 = new Ejercicio14(numeroA,numeroB);
                        eje14.division();
                        break;
                        
                        
                        
                    case "15":
                        Scanner sc15 = new Scanner(System.in);
                        System.out.println("Introduce un número");
                        String numeroIngresado15 = sc15.nextLine();
                        Ejercicio15 eje15 = new Ejercicio15(numeroIngresado15);
                        eje15.palindromo();
                        break;
                        
                    case "16":
                        float promedio=0, suma=0;
                        int contM=0,  contF=0,k=0,i=0;
                        Scanner sc16 = new Scanner(System.in);
                        System.out.println("Ingrese el numero de estudiantes ");
                        int tamano= sc16.nextInt();
                        String salto16=sc16.nextLine();
                        Ejercicio16 arreglo[]= new Ejercicio16[tamano];
                        if(tamano>=6){
                            for( i=0;i<tamano;i++){
                                System.out.println("Ingrese Sexo del estudiante (M o F ");
                                String sexo= sc16.nextLine();
                                if(!"F".equals(sexo)){
                                    contM=contM+1;
                                }else{
                                    contF=contF+1;
                                }
                                System.out.println("CONTADOR: "+contF);
                                System.out.println("Ingrese Puntaje del estudiante: ");
                                float puntaje  = sc16.nextFloat();
                                String salto161=sc16.nextLine();
                                arreglo[i] = new Ejercicio16(sexo,puntaje);
                                
                            } 
                        }else{
                            System.out.println("Debe ser un numero mayor a 5");
                        }
                        Arrays.sort(arreglo);
                        for(i=0;i<tamano;i++){
                            
                            if ("F".equals(arreglo[i].getSexo())){
                                suma=suma+arreglo[i].getPuntaje();
                                System.out.println("Arreglo ordenaro: "+arreglo[i].getPuntaje());
                            }
                        }
                        promedio=suma/contF;
                        System.out.println("Promedio mujeres :"+promedio);
                        System.out.println("El sexo con mayor puntaje es: "+arreglo[0].getSexo()+
                                " con "+arreglo[0].getPuntaje()+" puntos.");
                        while("M".equals(arreglo[k].getSexo())){
                            k=k+1;
                        }
                        System.out.println("Mejor puntaje de sexo Femenino:"+arreglo[k].getPuntaje());
                        int contp=0;
                        for(i=0;i<tamano;i++){
                            if(arreglo[i].getPuntaje()<500)
                                contp++;
                        }
                        int porcentajeInferior=contp*100/tamano;
                        System.out.println("Un "+porcentajeInferior+"% tiene inferior a 500 puntos");
                        break;
                        
                    case "17":
                        Ejercicio17 eje17 = new Ejercicio17();
                        eje17.tablas();
                        break;
                        
                    case "18":
                        int numfib=0;
                        Scanner sc18 = new Scanner(System.in);
                        System.out.println("Ingrese un numero ");
                        int numero = sc18.nextInt();
                        Ejercicio18 eje18 = new Ejercicio18(numero);
                        System.out.println("El resultado de la sucesion A es: ");
                        eje18.suceba();
                        System.out.println("El resultado de la sucesion B es: ");
                        eje18.sucecb();
                        break;
                        
                    case "19":
                        System.out.println("Ejercicio 19");
                        Ejercicio19 eje19 = new Ejercicio19();
                        eje19.porcentaje();
                        eje19.aumento();
                        eje19.cantidad();
                        eje19.promedio();
                        break;
                        
                    case "20":
                        System.out.println("Ejercicio 20");
                        Ejercicio20 eje20 = new Ejercicio20();
                        eje20.multiplicar();
                        break;

                        
                    case "21":
                        Scanner sc21 = new Scanner (System.in);
                        System.out.println("Introduzca un número");
                        int numeroIngresado21 = sc21.nextInt();
                        Ejercicio21 eje21= new Ejercicio21();
                        System.out.println("El resultado del factorial de "+numeroIngresado21+" es "+
                                eje21.factorial(numeroIngresado21));
                        break;
                        
                    case "22":
                        Scanner sc22 = new Scanner (System.in);
                        System.out.println("Introduzca N");
                        int numeroIngresadoA = sc22.nextInt();
                        System.out.println("Introduzca K");
                        int numeroIngresadoB = sc22.nextInt();
                        Ejercicio22 eje22= new Ejercicio22();
                        eje22.combinatoria(numeroIngresadoA,numeroIngresadoB);
                        break;
                        
                    case "23":
                        Scanner sc23 = new Scanner (System.in);
                        Ejercicio23 eje23 = new Ejercicio23();
                        System.out.println("Ingrese el valor de x:");
                        int x= sc23.nextInt();
                        String salto23=sc23.nextLine();
                        eje23.evaluar(x);
                        break;
                        
                    case "24":
                        int contador24=0;
                        Scanner sc24 = new Scanner(System.in);
                        System.out.println("Ingrese el numero de obreros ");
                        int N24= sc24.nextInt();
                        String salto24=sc24.nextLine();
                        Ejercicio24 arreglo24[]= new Ejercicio24[N24];
                        for(int i2=0;i2<N24;i2++){
                            contador24=contador24+1;
                            System.out.println("Ingrese Codigo del obrero "+contador24+" :");
                            int codTrabajador= sc24.nextInt();
                            String salto244=sc24.nextLine();
                            System.out.println("Ingrese horas de trabajo del obrero "+contador24+" :");
                            int horasTrabajo= sc24.nextInt();
                            String salto66=sc24.nextLine();
                            System.out.println("Ingrese horas extra del trabajador "+contador24+" :");
                            int horasExtra= sc24.nextInt();
                            String salto2441=sc24.nextLine();
                            
                            arreglo24[i2] = new Ejercicio24(codTrabajador,horasTrabajo,horasExtra);
                        } 
                        
                        for(int i2=0; i2<N24;i2++){
                            arreglo24[i2].mostrar();
                        }
                        System.out.println("--------------------------------------------");
                        System.out.println("TRABAJADOR CON MAYOR SUELDO");
                        Arrays.sort(arreglo24);
                        arreglo24[0].mostrar();
                        break;
                     
                    case "25":
                        Ejercicio25 eje25 = new Ejercicio25();
                        eje25.domingopas();
                        break;
                        
                        
                    case "26":
                       Scanner sc26 = new Scanner(System.in);
                        System.out.println("Ingrese el numero de alumnos ");
                        
                        int n26= sc26.nextInt();
                        String salto26=sc26.nextLine();
                        Ejercicio26 eje26[]= new Ejercicio26[n26];
                        for(int i26=0;i26<n26;i26++)
                            eje26[i26]= new Ejercicio26();
                        for(int i26=0;i26<n26;i26++){
                            int j=i26+1;
                            System.out.println("Alumno: "+j);
                            eje26[i26].menornota();
                            System.out.println("El promedio es "+eje26[i26].promedio());
                        }
        
                        float menor26=eje26[0].promedio();
                        int ban26=0;
                        for (int i26=0;i26<n26;i26++){
                            if(menor26>eje26[i26].promedio()){
                                menor26=eje26[i26].promedio();
                                ban26=i26+1;
                            }
                        }
                        System.out.println("El menor promedio es "+menor26+" del alumno "+ban26);
                        int cont26=0;
                        for(int i26=0;i26<n26;i26++){
                            if(eje26[i26].cantAsig>4)
                                cont26++;
                        }
                        int porcentaje26=cont26*100/n26;
                        System.out.println("Un "+porcentaje26+"% tiene más de 4 asignaturas");
                        break;
                        
                    case "27":
                        Scanner sc27 = new Scanner(System.in);
                        System.out.println("INGRESE EL TIPO DE ANIMAL");
                        String animal = sc27.nextLine();
                        Ejercicio27 eje27 = new Ejercicio27(animal);
                        eje27.animales();
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
                        
                    case "29":
                        System.out.println("Ejercicio 29");
                        Ejercicio29 eje29 = new Ejercicio29();
                        System.out.println("El iva es: "+eje29.iva());
                        System.out.println("El precio + iva es "+eje29.total());
                        eje29.pago();
                        break;
                           
                    case "30":
                        Scanner sc30 = new Scanner(System.in);
                        System.out.println("Introduce un número");
                        String numeroIngresado30 = sc30.nextLine();
                        Ejercicio30 eje30 = new Ejercicio30(numeroIngresado30);
                        eje30.isTio();
                        break;
                        
                    case "31":
                        Scanner sc31 = new Scanner(System.in);
                        System.out.println("Ingrese un numero mayor o igual a 15");
                        int numeroIngresado31 = sc31.nextInt();
                        Ejercicio31 eje31 = new Ejercicio31(numeroIngresado31);
                        System.out.println("-----------------o--------------");
                        eje31.Primo();
                        break;
                        
                    case "32":
                        Ejercicio32 eje32 = new Ejercicio32();
                        System.out.println("Valor de A= "+eje32.a());
                        System.out.println("Valor de B= "+eje32.b());
                        break;
                        
                    case "33":
                        
                        Scanner sc33 = new Scanner(System.in);
                        System.out.println("Ingrese el valor de N");
                        int ingresoN33=sc33.nextInt();
                        String salto=sc33.nextLine();
                        System.out.println("Ingrese el valor de X");
                        int ingresoX33=sc33.nextInt();
                        salto=sc33.nextLine();
                        Ejercicio33 eje33 = new Ejercicio33(ingresoN33,ingresoX33);
                        eje33.serie();
                        break;
                        
                        
                    case "34":
                        Scanner sc34 = new Scanner(System.in);
                        System.out.println("Ingrese el valor de N");
                        int ingresoN=sc34.nextInt();
                        salto=sc34.nextLine();
                        System.out.println("Ingrese el valor de X");
                        int ingresoX=sc34.nextInt();
                        salto=sc34.nextLine();
                        Ejercicio34 eje34 = new Ejercicio34(ingresoN,ingresoX);
                        eje34.serie();
                        break;

                }
    }
}
    
