/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos_java;
import java.util.Scanner;

/**
 *
 * @author Andres Gutierrez
 */
public class Vector implements interfaceArreglos{
    
    private int []vector;
    
    public void asignar(){
        boolean error=false;
        int tamanio=0;
        Scanner teclado=new Scanner(System.in);
        do{
           System.out.print("digite el tamanio del vector: ");
           tamanio=teclado.nextInt();
           if(tamanio<0){
               System.out.println("digito no valido intentalo de nuevo");
               error=true;
           }
           else
            error=false;
        }while(error==true);
        vector=new int[tamanio];
        System.out.println("el tamanio del vector fue asignado");
    }
    
    public void llenar(){
        int numero;
        Scanner teclado=new Scanner(System.in);
        for(int i=0;i<vector.length;i++){
            System.out.print("digite el numero de la pisicon "+i+":");
            numero=teclado.nextInt();
            vector[i]=numero;
        }
        System.out.println("datos ingresados correctamente");
    }
    
    public void imprimir(){
        for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+",");
        }
        System.out.println();
    }
    
    public void ascendente(){
        int aux=0;
        for(int i=0;i<vector.length;i++){
            for(int j=0;j<vector.length;j++){
                if(vector[i]<vector[j]){
                    aux=vector[i];
                    vector[i]=vector[j];
                    vector[j]=aux;
                }
            }
        }
        System.out.println("vector organizado ascendentemente");
    }
    
    public void descendente(){
        int aux=0;
        for(int i=0;i<vector.length;i++){
            for(int j=0;j<vector.length;j++){
                if(vector[i]>vector[j]){
                    aux=vector[i];
                    vector[i]=vector[j];
                    vector[j]=aux;
                }
            }
        }
        System.out.println("vector organizado descendentemente"); 
    }
}
