
package Clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author lujor
 */
public class pruebaMatrix {
    
    int[][] matriz;// matriz para almacenar los datos del txt
    int longitud;// longitud del array
    String linea;// para recorrer las lineas 
    BufferedReader br;// para la recoleccion de los datos del txt
    int fila;
    public void LeeMatriz() throws IOException{ // contructor, se envia el Path del txt para obter los datos
        br=new BufferedReader(new FileReader("Prueba.txt"));// se inicaliza la comunicacion con el archivo txt
        longitud=15;// se de la longitud de la matriz 
        matriz = new int[longitud][longitud];// se inicializa la matriz
        linea = br.readLine();// se lee la primera linea
        while(linea != null) {
               //Hacer lo que sea con la línea leída
               System.out.println(linea);
               //Leer la siguiente línea
               linea = br.readLine();
        }
    }
    public static void main(String args[]) throws IOException{
        pruebaMatrix m = new pruebaMatrix();
        m.LeeMatriz();
    }
}
