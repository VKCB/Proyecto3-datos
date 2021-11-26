
package Clases;

/**
 *Clase donde se obtienen los datos de la parte grafica.
 * @author Allan Prieto, Allan Chen, Valerin Calderon, Daniel Rayo, Ludwin Ramos
 * @since 25/11/2021
 * @version 1.0
 */
public class DatosGraficos {

    private final double MatrizDistancias[][] = new double[15][15]; // matriz de costos
    private final int MatrizAdyacencia[][] = new int[15][15]; // matriz de conexiones directas
    private final int coordenadasX[] = new int[15];
    private final int coordenadasY[] = new int[15];
    private final String nombre[] = new String[15]; // lista de nombres de los lugares del mapa
    //private int enArbol[];

    // constructor vacío
    public DatosGraficos() {
    }
    /**
     * metodo que retorna el costo que existe entre un nodo y otro (con conexión directa).
     * @param i número de fila
     * @param j número de columna
     * @return 
     */
    public double getmDistancias(int i, int j) {
        return MatrizDistancias[i][j];
    }
    
    /**
     * metodo que retorna si hay o no conexión directa entre dos nodos, por medio de unos y ceros.
     * @param i número de fila
     * @param j número de columna
     * @return retorna un "1" si existe conexión directa y un "0" si no hay conexión entre dos nodos.
     */
    public int getmAdyacencia(int i, int j) {
        return MatrizAdyacencia[i][j];
    }
    /**
     * método que retorna la coordenada "X" de un vértice.
     * @param i indica el índice donde se encuentra la coordenada en la lista.
     * @return retorna la coordenada "X" de un vértice.
     */
    public int getCoordeX(int i) {
        return coordenadasX[i];
    }
    
    /**
     * método que retorna la coordenada "Y" de un vértice.
     * @param i indica el índice donde se encuentra la coordenada en la lista.
     * @return retorna la coordenada "Y" de un vértice.
     */
    public int getCoordeY(int i) {
        return coordenadasY[i];
    }
    
    /**
     *  método que retorna el nombre del vértice o lugar del mapa
     * @param i indica el índice donde se encuentra el nombre del lugar en la lista.
     * @return retorna el nombre del vértice o lugar.
     */
    public String getNombre(int i) {
        return nombre[i];
    }
    
    /**
     * método para insertar en la matriz de los costos el peso que existe entre un vertice y otro.
     * @param i número de fila
     * @param j número de columna
     * @param costo peso que existe entre un vertice y otro.
     */
    public void setmDistancias(int i, int j, double costo) {
        this.MatrizDistancias[i][j] = costo;
    }
    
    /**
     * método para insertar en la matriz de conxiones si existe la conexión directa entre un vertice y otro.
     * @param i número de fila
     * @param j número de columna
     * @param conexion conexión directa entre un vertice y otro que se envía de la clase "Mapa".
     */
    public void setmAdyacencia(int i, int j, int conexion) {
        this.MatrizAdyacencia[i][j] = conexion;
    }
    
    /**
     * método que inserta la coordenada "X" de un vértice.
     * @param i indica el índice donde se encuentra la coordenada en la lista.
     * @param coordeX coordenada "X" de un vértice.
     */
    public void setCoordeX(int i, int coordeX) {
        this.coordenadasX[i] = coordeX;
    }
    
    /**
     * método que inserta la coordenada "Y" de un vértice.
     * @param i indica el índice donde se encuentra la coordenada en la lista.
     * @param coordeY coordenada "Y" de un vértice.
     */
    public void setCoordeY(int i, int coordeY) {
        this.coordenadasY[i] = coordeY;
    }
    
    /**
     * método que inserta el nombre de un vértice o lugar del mapa.
     * @param i indica el índice donde se encuentra el nombre del lugar en la lista.
     * @param nombre nombre del vértice o lugar del mapa.
     */
    public void setNombre(int i, String nombre) {
        this.nombre[i] = nombre;
    }
}
