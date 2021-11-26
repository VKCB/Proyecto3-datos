
package Clases;

/**
 * Método que almacena y retorna información necesaria para el cálculo de la mejor ruta
 * @author Allan Prieto, Allan Chen, Valerin Calderon, Daniel Rayo, Ludwin Ramos
 * @since 25/11/2021
 * @version 1.0
 */
public class Vertice {

    private int nombre; // identificador de un vértice
    private boolean visitado; // identificador si un vértice ya fue visitado
    private boolean etiqueta;
    private double acumulado; // almacena temporalmente el costo desde un punto de origen hasta el vertice a quien le pertenece la instancia.
    private Vertice Predecesor;

    public Vertice() {
        this.nombre = 0;
        this.visitado = false;
        this.etiqueta = false; // la etiqueta de un vertice es verdadera cuando es el lugar de origen, utilizada para diferenciar el origen de los demás vertices.
        this.Predecesor = null;
        this.acumulado = 0;

    }
    /**
     *  método que retorna el identificador (un número) del vértice o lugar del mapa
     * @return retorna el identificador del vértice o lugar.
     */
    public int getNombre() {
        return nombre;
    }
    /**
     * método que retorna si un vértice ya fue visitado.
     * @return retorna true si un vértice ya fue visitado.
     */
    public boolean isVisitado() {
        return visitado;
    }
    
    /**
     * método que retorna si un vértice es el punto de partida u origen.
     * @return retorna true si un vértice es el punto de partida u origen.
     */
    public boolean isEtiqueta() {
        return etiqueta;
    }
    
    /**
     * método que retorna el costo de la ruta desde un punto de partida u origen hasta el vértice a quien le pertenece la instancia.
     * @return costo de la ruta.
     */
    public double getAcumulado() {
        return acumulado;
    }
    
    /**
     * método que retorna el predecesor de otro vértice.
     * @return retorna el predecesor de otro vértice.
     */
    public Vertice getPredecesor() {
        return Predecesor;
    }
    
    /**
     * método que inserta el identificador (un número) de un vértice o lugar del mapa.
     * @param nombre identificador del vértice o lugar del mapa.
     */
    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    /**
     * método que inserta si un vértice ya fue visitado.
     * @param visitado se recibe true si un vértice ya fue visitado.
     */
    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    
    /**
     * método que almacena true si un vértice es el punto de partida u origen.
     * @param etiqueta se recibe true si un vértice es el punto de partida u origen.
     */
    public void setEtiqueta(boolean etiqueta) {
        this.etiqueta = etiqueta;
    }
    /**
     * método que almacena el costo de la ruta desde un punto de partida u origen hasta el vértice a quien le pertenece la instancia.
     * @param acomulado costo de la ruta a almacenar.
     */
    public void setAcumulado(double acomulado) {
        this.acumulado = acomulado;
    }
    
    /**
     * método que almacena el predecesor de otro vértice.
     * @param Predecesor se recibe el predecesor de otro vértice.
     */
    public void setPredecesor(Vertice Predecesor) {
        this.Predecesor = Predecesor;
    }
}
