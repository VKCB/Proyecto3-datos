
package Clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *Clase que dibuja las lineas y los nodos que forman el camino del mapa
 * @author Allan Prieto, Allan Chen, Valerin Calderon, Daniel Rayo, Ludwin Ramos
 * @since 25/11/2021
 * @version 1.0
 */
public class Dibujos {
    
    //cosntructor vacío
    public Dibujos() {

    }

    /**
     * Pinta los iconos de localización en cada vertice o lugar en el mapa
     * @param g contexto gráfico del componente.
     * @param coordenadaXVertice coordenada "X" en el mapa del vertice recibido.
     * @param coordenadaYVertice coordenada "Y" en el mapa del vertice recibido.
     * @param nombreVertice nombre del vértice o lugar.
     * @throws IOException 
     */
    public static void pinta_localizador(Graphics g, int coordenadaXVertice, int coordenadaYVertice, String nombreVertice) throws IOException {
        try {
            // se carga la imagen que contiene el icono de localización.
            File archImg = new File("marcador-de-ubicacion.png");
            Image imagen2 = ImageIO.read(archImg);

            //Se pinta la la imagen que contiene el icono de localización en cada vértice.
            ((Graphics2D) g).drawImage(imagen2, coordenadaXVertice, coordenadaYVertice, 22, 22, null);

            //Se pinta el nombre del vertice o lugar en el mapa
            ((Graphics2D) g).setColor(Color.BLACK);
            Font fuente = new Font("Monospaced", Font.BOLD, 19);
            g.setFont(fuente);
            ((Graphics2D) g).drawString(nombreVertice, coordenadaXVertice, coordenadaYVertice);
        } catch (IOException ex) {

        }
    }

    /**
     * Metodo que pinta las rutas y los costos de las rutas en el Mapa.
     * @param g contexto gráfico del componente.
     * @param coordXPuntoPartida coordenada "X" del punto de origen o de partida.
     * @param coordYPuntoPartida coordenada "Y" del punto de origen o de partida.
     * @param coordXDestino coordenada "X" del punto de destino.
     * @param coordYDestino coordenada "Y" del punto de destino.
     * @param costo costo de la ruta
     */
    public static void pinta_Rutas(Graphics g, int coordXPuntoPartida, int coordYPuntoPartida, int coordXDestino, int coordYDestino, double costo) {
        int xAux = 0; // coordenada "X" donde se pintará el costo de la ruta en el mapa.
        int yAux = 0; // coordenada "Y" donde se pintará el costo de la ruta en el mapa.
        
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(1); // se establece el grosor de la linea
        ((Graphics2D) g).setStroke(stroke);
        // se dibuja una linea de un vertice a otro, para representar la conexión o camino que existe entre ellos.
        ((Graphics2D) g).drawLine(coordXPuntoPartida + 10, coordYPuntoPartida + 10, coordXDestino + 10, coordYDestino + 10);
        
        // se calcula cual es la coordenada que está a la mitad de la ruta de un nodo a otro, 
        //  para pintar el coste de la ruta en esa posición.
        if (coordXPuntoPartida <= coordXDestino) {
            xAux = ((coordXDestino - coordXPuntoPartida) / 2) + coordXPuntoPartida+2;
        }
        if (coordXPuntoPartida > coordXDestino) {
            xAux = ((coordXPuntoPartida - coordXDestino) / 2) + coordXDestino + 2;
        }
        if (coordYPuntoPartida < coordYDestino) {
            yAux = ((coordYDestino - coordYPuntoPartida) / 2) + coordYPuntoPartida;
        }
        if (coordYPuntoPartida >= coordYDestino) {
            yAux = ((coordYPuntoPartida - coordYDestino) / 2) + coordYDestino;
        }
        
        // se pinta el costo de la arista o ruta en el mapa.
        ((Graphics2D) g).setColor(Color.RED);
        Font fuente = new Font("Monospaced", Font.PLAIN, 11);
        g.setFont(fuente);
        ((Graphics2D) g).drawString(String.valueOf(costo), xAux, yAux);
    }

    /**
     * Método que pinta la mejor ruta de un punto de partida hasta un destino en el mapa.
     * @param g contexto gráfico del componente.
     * @param coordXVertice coordenada "X" de un vertice que se encuentra en la mejor ruta.
     * @param coordYVertice coordenada "Y" de un vertice que se encuentra en la mejor ruta.
     * @param coordXPredecesor coordenada "X" del predecesor de un vértice que se encuentra en la mejor ruta.
     * @param coordYPredecesor coordenada "Y" del predecesor de un vértice que se encuentra en la mejor ruta.
     * @param color color de la linea que será la mejor ruta.
     */
    public static void pinta_Camino(Graphics g, int coordXVertice, int coordYVertice, int coordXPredecesor, int coordYPredecesor, Color color) {
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(3); // se define el grosor de la linea
        ((Graphics2D) g).setStroke(stroke);
        g.setColor(color);
        g.drawLine(coordXVertice + 10, coordYVertice + 10, coordXPredecesor + 10, coordYPredecesor + 10);
    }
    
    /**
     * Metodo que pinta un circulo en cada vertice que se encuentra en la mejor ruta
     * @param g contexto gráfico del componente.
     * @param coordXOrigen coordenada "X" del punto de origen o de partida.
     * @param coordYOrigen coordenada "Y" del punto de origen o de partida.
     * @param colorfILL color del relleno del círculo
     * @param colorOval color del borde del círculo
     */
    public static void seleccionNodo(Graphics g, int coordXOrigen, int coordYOrigen, Color colorfILL,Color colorOval) {

        ((Graphics2D) g).setColor(colorfILL);
        ((Graphics2D) g).setStroke(new BasicStroke(3));// da el grosor del contorno al circulo        
        ((Graphics2D) g).fillOval(coordXOrigen, coordYOrigen, 17, 17);//tamaño del circulo
        ((Graphics2D) g).setColor(colorOval);
        ((Graphics2D) g).drawOval(coordXOrigen, coordYOrigen, 17, 17);

    }

}
