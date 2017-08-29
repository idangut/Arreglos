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
public class Matriz implements interfaceArreglos {
    
    private int[][]matriz;
    
    public void asignar(){
        int tamanio_fila;
        int tamanio_columna;
        boolean error=false;
        Scanner teclado=new Scanner(System.in);
        do{
            System.out.print("digita el tamanio de las filas: ");
            tamanio_fila=teclado.nextInt();
            System.out.print("digita el tamanio de las columnas (igual al tamanio de las filas): ");
            tamanio_columna=teclado.nextInt();
            if((tamanio_fila<0||tamanio_columna<0)||(tamanio_fila!=tamanio_columna)){
                System.out.println("digitos no validos intentalo de nuevo");
                error=true;
            }
            else
             error=false;
        }while(error==true);
        matriz=new int[tamanio_fila][tamanio_columna];System.out.println("el tamanio fue asignado");
    }
    
    public void llenar(){
        int numero=0;
        Scanner teclado=new Scanner(System.in);
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.println("digite el numero de la posicion ["+i+"]"+"["+j+"]");
                numero=teclado.nextInt();
                matriz[i][j]=numero;
            }
        }
    }
    
    public void imprimir(){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+",");
            }
            System.out.println();
        }
    } 
    
    public void ascendente(){
        int aux=0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                for(int k=0;k<matriz.length;k++){
                    for(int l=0;l<matriz.length;l++){
                        if(matriz[i][j]<matriz[k][l]){
                            aux=matriz[i][j];
                            matriz[i][j]=matriz[k][l];
                            matriz[k][l]=aux;
                        }
                    }
                }
            }
    
        }
        System.out.println("matriz organizada ascendentemente"); 
    }
    
    public void descendente(){
        int aux=0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                for(int k=0;k<matriz.length;k++){
                    for(int l=0;l<matriz.length;l++){
                        if(matriz[i][j]>matriz[k][l]){
                            aux=matriz[i][j];
                            matriz[i][j]=matriz[k][l];
                            matriz[k][l]=aux;
                        }
                    }
                }
            }
        }   
        System.out.println("matriz organizada descendentemente");
        
    }
    
}
