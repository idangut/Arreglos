/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos_java;
import java.util.Scanner;

/**
 *
 * @author Julian Garcia
 */
public class Arreglos_java {

    public static void main(String[] args) {
       
        int infinito=1;
        char opcion;
        Vector primero=new Vector();
        Matriz segundo=new Matriz();
        Scanner teclado=new Scanner(System.in);
        
        do{
            System.out.println("ARREGLOS \n");
            System.out.println("A.vector");
            System.out.println("B.matriz");
            System.out.println("C.salir");
            System.out.print("opcion: ");
            opcion=teclado.next().charAt(0);
            switch(opcion){
                case 'A':case 'a':
                    primero.asignar();// asigna el tamaño del vector
                    primero.llenar();// asigna los valores del vector
                    primero.imprimir();//muestra el vector lleno
                    System.out.println("como lo quieres organizar");
                    System.out.println("A.ascendente");
                    System.out.println("B.descendente");
                    opcion=teclado.next().charAt(0);
                    if(opcion=='A'||opcion=='a'){
                        primero.ascendente();
                        primero.imprimir();
                    }
                    if(opcion=='B'||opcion=='b'){
                        primero.descendente();
                        primero.imprimir();
                    }
                break;
                case 'B':case 'b':
                    segundo.asignar();
                    segundo.llenar();
                    segundo.imprimir();
                    System.out.println("como la quieres organizar");
                    System.out.println("A.ascendente");
                    System.out.println("B.descendente");
                    opcion=teclado.next().charAt(0);
                    if(opcion=='A'||opcion=='a'){
                        segundo.ascendente();
                        segundo.imprimir();
                    }
                    if(opcion=='B'||opcion=='b'){
                        segundo.descendente();
                        segundo.imprimir();
                    }
                break;
                case 'C':case 'c':
                    System.out.println("fin del programa...");
                    System.exit(0);
                break; 
                default:
                break;    
            }
        }while(infinito==1);
        
    }
    
}
