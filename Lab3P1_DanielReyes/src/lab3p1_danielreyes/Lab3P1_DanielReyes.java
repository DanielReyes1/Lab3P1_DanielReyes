
package lab3p1_danielreyes;

import java.util.Scanner;
        
public class Lab3P1_DanielReyes {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int resp;
        do{
        System.out.println("-------Menu-------");
        System.out.println("1- Diptongo");
        System.out.println("2- Sumatoria PI");
        System.out.println("3- Time clock");
        System.out.println("4- Salir del sistema");
        System.out.println("Ingrese una opcion: ");
        resp = leer.nextInt();
        
        switch (resp){
            case 1 : {
                System.out.println("Ha seleccionado la opcion Diptongo");
                String palabra;
                        System.out.println("Ingrese una palabra: ");
                        palabra = leer.next().toLowerCase();
                        
                        int diptongo= 0, vocal = 0;
                        for (int i = 0; i < palabra.length(); i++){
                            vocal = 0;
                            char letra = palabra.charAt(i);
                            switch (letra){
                                case 'a':
                                case 'e':
                                case 'i':
                                case 'o':
                                case 'u':
                                    vocal++;
                                    break;
                            }// fin swicth 1
                                    if (vocal == 1 ){
                                        if(i + 1 < palabra.length()){
                                        for (int h = i + 1; h <= i + 1; h++){
                                            char letra2 = palabra.charAt(h);
                                            switch (letra2){
                                                case 'a':
                                                case 'e':
                                                case 'i':
                                                case 'o':
                                                case 'u':
                                                        vocal++;
                                                        break;
                                            }// fin switch 2
                                            }//fin for 2
                                        }// fin if dentro del if
                                    }// fin if
                                  
                            
                            if (vocal == 2){
                                    diptongo++;
                                    
                                    
                        }// if vocal 2
                            }// fin for
  
                        if (diptongo > 0){
                            System.out.println("Resultado: La palabra es un diptongo");
                        }// if
                        else {
                            System.out.println("Resultado: La palabra no es un diptongo");
                        }// else
                        }// caso 1
                break;
            case 2 :
                int limite;
                double suma, numerador, denominador, acumulador = 0;
                System.out.println("Ha seleccionado la opcion Sumatoria PI");
                System.out.println("Ingrese un numero limite: ");
                limite = leer.nextInt();
                
                if (limite > 0){
                    for (int i = 0; i<limite; i++ ){
                        numerador = Math.pow(-1, i);
                        denominador= (2 * i) + 1;
                        suma = numerador / denominador;
                        acumulador = acumulador + suma;
                    }// fin for
                    acumulador = acumulador * 4;
                    System.out.println("Resultado: "+ acumulador);
                }// fin if
                else {
                    System.out.println(" Debe ingresar un numero mayor que 0");
                }// fin else
                break;
            case 3 :{
                int filas;
                System.out.println("Ha seleccionado la opcion time clock");
                System.out.println("Ingrese el numero de filas (debe ser un numero impar): ");
                filas = leer.nextInt();
                
                if (filas % 2 == 0){
                    System.out.println("Debe ingresar un numero impar");
                }// fin if 
                else{
                    
                    filas = filas + 1;
                    filas = filas / 2;
                    for(int f = 0; f < filas; f++){
                        for (int e = 0; e < f ;e++){
                            System.out.print(" ");
                            
                        }// for e
                        for ( int a = filas - f; a > 0; a--){
                            System.out.print("* ");
                        }// for  a
                        
                        System.out.println();
                    }// for f
                    for (int i = 2; i <= filas; i++){
                        for (int j = filas - i; j> 0; j--){
                            System.out.print(" ");
                        }// for j
                        
                        for( int k = 0; k < i; k++){
                            System.out.print("* ");
                        }// for k
                        
                        System.out.println();
                    }// for i
                }// fin else
                
            }//caso 3
                break;
                
            
                
            
        }// fin del switch
        }while (resp != 4);// do while
        System.out.println("Ha salido del sistema....");
    }// FIN MAIN
    
}
