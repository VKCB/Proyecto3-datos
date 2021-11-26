package Clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Leer la matriz desde el txt
 *
 * @author Allan Prieto, Allan Chen, Valerin Calderon, Daniel Rayo, Ludwin Ramos
 */
public class LeeMatriz {

    int[][] matriz;// matriz para almacenar los datos del txt
    int longitud;// longitud del array
    String linea;// para recorrer las lineas 
    BufferedReader br;// para la recoleccion de los datos del txt
    int fila;

    public LeeMatriz(String Path) throws IOException {// contructor, se envia el Path del txt para obter los datos
        br = new BufferedReader(new FileReader(Path));// se inicaliza la comunicacion con el archivo txt
        longitud = 15;// se de la longitud de la matriz 
        matriz = new int[longitud][longitud];// se inicializa la matriz
        linea = br.readLine();// se lee la primera linea
        fila = 0;//
    }

    public void set_matriz() throws IOException {
        while (linea != null) { // si el txt no esta vacio se recorre el txt
            String[] enteros = linea.split(" ");
            for (int i = 0; i < enteros.length; i++) {
                matriz[fila][i] = Integer.parseInt(enteros[i]);// se transforman los datos del txt a enteros
            }
            fila++; //Incrementamos fila para la próxima línea de enteros
            linea = br.readLine(); //Leemos siguiente línea
        }
        br.close();// cerramos el archivo para no gastar recursos

    }

    public int[][] get_matriz() { // se obtiene la matriz resultado
        return matriz;// retorna la respuesta

    }

    public void matriz(int[][] matriz) {// metodo para imprimir la matriz resultante

        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }
    }

}
