//Programa desarrollado por Brayan
package com.mycompany.ejemplouno;
import java.util.Scanner;

public class EjemploUno {

  
    public static void main(String[] args) {
       
       
       
       int apuntador= 0;
       Scanner entrada = new Scanner(System.in);

       System.out.println("Programa que recibe texto y lo imprime alreves");
       //recibe texto 
       System.out.println("Introduce texto: ");
       String texto = entrada.nextLine();
       char[] aCaracteres = texto.toCharArray();//transforma texto y lo convierte en arreglo de caracteres
       char dato = 'a';
       
       
       for(int i = 0;i<aCaracteres.length;i++){//imprime el arreglo de caracteres
          System.out.print(aCaracteres[i]); 
       }
       
       int longitud = aCaracteres.length;//obtienen la cantidad de posiciones
       int posiciones = longitud-1;//obtiene los espacios que tiene el arreglo
       char[] invertido = new char[longitud];
       System.out.print("\n");
       System.out.println("ya realizó este proceso");
       System.out.println(posiciones);
       System.out.println(longitud);
        do{
        dato = aCaracteres[posiciones];//toma el valor del arreglo y lo guarda en una variable tipo char
        posiciones=posiciones-1;//inicia del final del arreglo y lo recorre de atras hacia adelante
        invertido[apuntador] = dato; //guarda el dato en un nuevo arreglo tipo char
        System.out.print(invertido[apuntador]);//imprime arreglo nuevo con valores 
        apuntador++;//incrementa el apuntador del arreglo nuevo
       }while(posiciones >= 0);//lo hace hasta que posicioes sea mayor o igual a 0
       System.out.println("");

       }
       
       
        
        
    }
    

