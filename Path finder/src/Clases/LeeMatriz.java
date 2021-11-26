package Clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase que se encarga de leer matrices de archivos txt
 * @author Allan Prieto, Allan Chen, Valerin Calderon, Daniel Rayo, Ludwin Ramos
 * @since 25/11/2021
 * @version 1.0
 */
public class LeeMatriz {

    int[][] matrizAdyacencia;// matriz para almacenar las conexiones del txt
    double[][] matrizCostos;// matriz para almacenar los pesos del txt
    int longitud;// longitud del array
    String linea;// para recorrer las lineas 
    BufferedReader br;// para la recoleccion de los datos del txt
    int fila;
    
    /**
     * Método que inicializa las variables a utilizar
     * @param Path ruta del archivo txt
     * @throws IOException 
     */
    public LeeMatriz(String Path) throws IOException {// contructor, se envia el Path del txt para obter los datos
        br = new BufferedReader(new FileReader(Path));// se inicaliza la comunicacion con el archivo txt
        longitud = 15;// se de la longitud de la matriz 
        matrizAdyacencia = new int[longitud][longitud];// se inicializa la matriz
        matrizCostos = new double[longitud][longitud];// se inicializa la matriz
        linea = br.readLine();// se lee la primera linea
        fila = 0;//
    }
    
    /**
     * Método para leer la matriz de conexiones desde un archivo txt
     * @return matriz de conexiones.
     * @throws IOException 
     */
    public int[][] get_matrizAdyacencia() throws IOException {
        while (linea != null) { // si el txt no esta vacio se recorre el txt
            String[] enteros = linea.split(",");
            for (int i = 0; i < enteros.length; i++) {
                matrizAdyacencia[fila][i] = Integer.parseInt(enteros[i]);// se transforman los datos del txt a enteros
            }
            fila++; //Incrementamos fila para la próxima línea de enteros
            linea = br.readLine(); //Leemos siguiente línea
        }
        br.close();// cerramos el archivo para no gastar recursos
        return matrizAdyacencia;
    }
    /**
     * Método para leer la matriz de pesos desde un archivo txt
     * @return matriz de pesos
     * @throws IOException 
     */
    public double[][] get_matrizCostos() throws IOException {
        while (linea != null) { // si el txt no esta vacio se recorre el txt
            String[] enteros = linea.split(",");
            for (int i = 0; i < enteros.length; i++) {
                matrizCostos[fila][i] = Double.valueOf(enteros[i]);// se transforman los datos del txt a doubles
            }
            fila++; //Incrementamos fila para la próxima línea de doubles
            linea = br.readLine(); //Leemos siguiente línea
        }
        br.close();// cerramos el archivo para no gastar recursos
        return matrizCostos;
    }
}
