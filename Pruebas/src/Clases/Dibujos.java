
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
 *Clase que dibuja las lineas y los nodos que forman el camino
 * @author Allan Prieto, Allan Chen, Valerin Calderon, Daniel Rayo, Ludwin Ramos
 */
public class Dibujos {

    public Dibujos() {

    }

    /**
     * Pinta los iconos en el mapa
     * @param g
     * @param x
     * @param y
     * @param n
     * @throws IOException 
     */
    public static void pinta_localizador(Graphics g, int x, int y, String n) throws IOException {
        try {
            //Ruta de la imagen
            File archImg = new File("marcador-de-ubicacion.png");
            Image imagen2 = ImageIO.read(archImg);

            //Se pinta la imagen en cada punto
            ((Graphics2D) g).drawImage(imagen2, x, y, 22, 22, null);

            //Se crean las lineas 
            ((Graphics2D) g).setColor(Color.BLACK);
            Font fuente = new Font("Monospaced", Font.BOLD, 19);
            g.setFont(fuente);
            ((Graphics2D) g).drawString(n, x, y);
        } catch (IOException ex) {

        }
    }

    /**
     * Metodo que pinta la ruta y los nombres en el Mapa
     * @param g
     * @param coordXPuntoPartida
     * @param coordYPuntoPartida
     * @param coordXDestino
     * @param coordYDestino
     * @param distancia 
     */
    public static void pinta_Rutas(Graphics g, int coordXPuntoPartida, int coordYPuntoPartida, int coordXDestino, int coordYDestino, double distancia) {
        int xAux = 0;
        int yAux = 0;
        
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(1);
        ((Graphics2D) g).setStroke(stroke);
        ((Graphics2D) g).drawLine(coordXPuntoPartida + 10, coordYPuntoPartida + 10, coordXDestino + 10, coordYDestino + 10);
        
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
        
        //Texto de cada vertice
        ((Graphics2D) g).setColor(Color.RED);
        Font fuente = new Font("Monospaced", Font.PLAIN, 11);
        g.setFont(fuente);
        ((Graphics2D) g).drawString(String.valueOf(distancia), xAux, yAux);
    }

    /**
     * Metodo para obtener los parametros del camino y dibijarlo en el mapa
     * @param g
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param color 
     */
    public static void pinta_Camino(Graphics g, int x1, int y1, int x2, int y2, Color color) {
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(3);
        ((Graphics2D) g).setStroke(stroke);
        g.setColor(color);
        g.drawLine(x1 + 10, y1 + 10, x2 + 10, y2 + 10);

    }
    
    /**
     * Metodo que indicara cual es el nodo qeu esta selecionado, como origeb, destino, o intermedio
     * @param g
     * @param coordXOrigen
     * @param coordYOrigen
     * @param colorfILL
     * @param colorOval 
     */
    public static void seleccionNodo(Graphics g, int coordXOrigen, int coordYOrigen, Color colorfILL,Color colorOval) {

        ((Graphics2D) g).setColor(colorfILL);
        ((Graphics2D) g).setStroke(new BasicStroke(3));// da el grosor del contorno al circulo        
        ((Graphics2D) g).fillOval(coordXOrigen, coordYOrigen, 17, 17);//tamaño del circulo
        ((Graphics2D) g).setColor(colorOval);
        ((Graphics2D) g).drawOval(coordXOrigen, coordYOrigen, 17, 17);

    }

}
