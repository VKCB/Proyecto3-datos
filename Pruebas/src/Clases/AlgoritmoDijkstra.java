
package Clases;

import static VENTANAS.Mapa.PintarRutas;
import java.awt.Color;
import java.io.IOException;
import static VENTANAS.Mapa.LabelMapa;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *Clase del algoritmo de Dijkstra, para localizar las rutas minimas y dibujar la ruta
 * @author Allan Prieto, Allan Chen, Valerin Calderon, Daniel Rayo, Ludwin Ramos
 */
public class AlgoritmoDijkstra {

    private final DatosGraficos datosGraficos;
    private int subNumVertices;
    private Vertice Nodoauxiliar = null;
    private double auxiliarAcumulado; // es un acumulado auxiliar
    private double subtotalAcomulado;
    private final Vertice nodo[];
    private final int numVertices;
    private int Origen;
    private final int destino;

    public AlgoritmoDijkstra(DatosGraficos datosGraficos, int numVertices, int origen, int destino) {
        this.datosGraficos = datosGraficos;
        this.numVertices = numVertices;
        this.nodo = new Vertice[numVertices];
        this.Origen = origen;
        this.destino = destino;

    }

    public double getAcumulado() {
        return nodo[destino].getAcumulado();
    }

    public int getNombre() {
        return nodo[destino].getNombre();
    }

    /**
     * Algoritmo de dijkstra
     * @throws IOException 
     */
    public void dijkstra() throws IOException {
        
        // creación del vector nodo del tamaño del numero de nodos pintados 
        for (int i = 0; i < numVertices; i++) 
        {
            nodo[i] = new Vertice();
        }
        //Color color = new Color(138,90,26);
        Color color = new Color(64,0,128);
        //Datos de la imagen de salida
        File archImg1 = new File("ubicacion.png");
        Image imagen1 = ImageIO.read(archImg1);
        LabelMapa.paint(LabelMapa.getGraphics());
        PintarRutas(numVertices, datosGraficos);
        //  se pinta de color el nodo de Origen
        Dibujos.seleccionNodo(LabelMapa.getGraphics(),
                datosGraficos.getCoordeX(Origen),
                datosGraficos.getCoordeY(Origen), Color.YELLOW,color); 
        //Pintamos la imagen en el mapa, del nodo inicia o origen
        ((Graphics2D) LabelMapa.getGraphics()).drawImage(imagen1, datosGraficos.getCoordeX(Origen), datosGraficos.getCoordeY(Origen), 65, 65, null);

         // un objeto de tipo Vertice
        nodo[Origen].setVisitado(true);
        // un objeto de tipo Vertice
        nodo[Origen].setNombre(Origen); 

        do {
            // lo igualamos a esta cifra ya que el acomulado de los nodos, a la que nunca sera mayor 
            subtotalAcomulado = 0;
            auxiliarAcumulado = 2000000000; 
            nodo[Origen].setEtiqueta(true);
            
            //se guardan
            for (int j = 0; j < numVertices; j++) {
                //si el nodo iterado tiene conexión con el origen escogido
                if (datosGraficos.getmAdyacencia(j, Origen) == 1) { 
                    subtotalAcomulado = nodo[Origen].getAcumulado() + datosGraficos.getmDistancias(j, Origen);

                    if (subtotalAcomulado <= nodo[j].getAcumulado() && nodo[j].isVisitado() == true && nodo[j].isEtiqueta() == false) {
                        nodo[j].setAcumulado(subtotalAcomulado);
                        nodo[j].setVisitado(true);
                        nodo[j].setNombre(j);
                        nodo[j].setPredecesor(nodo[Origen]);
                    } else if (nodo[j].isVisitado() == false) {
                        System.out.println(j);
                        nodo[j].setAcumulado(subtotalAcomulado);
                        nodo[j].setVisitado(true);
                        nodo[j].setNombre(j);
                        nodo[j].setPredecesor(nodo[Origen]);
                    }
                }
            }

            //Encontrando Camino mas corto
            // buscamos cual de los nodos visitado tiene el acomulado menor par escogerlo como camino
            for (int i = 0; i < numVertices; i++) { 
                if (nodo[i].isVisitado() == true && nodo[i].isEtiqueta() == false) {
                    if (nodo[i].getAcumulado() <= auxiliarAcumulado) {
                        Origen = nodo[i].getNombre();
                        auxiliarAcumulado = nodo[i].getAcumulado();
                    }
                }
            }
            System.out.println("------------------------------------------");
            subNumVertices++;
        } while (subNumVertices < numVertices + 1);

        Nodoauxiliar = nodo[destino];
        color = new Color(64,0,128);
        //Unicacion de la imagen de llagada
        File archImg3 = new File("destino.png");
        Image imagen3 = ImageIO.read(archImg3);
        //Pintando caminos recorridos
        while (Nodoauxiliar.getPredecesor() != null) {
            Dibujos.pinta_Camino(LabelMapa.getGraphics(),
                    datosGraficos.getCoordeX(Nodoauxiliar.getNombre()),
                    datosGraficos.getCoordeY(Nodoauxiliar.getNombre()),
                    datosGraficos.getCoordeX(Nodoauxiliar.getPredecesor().getNombre()),
                    datosGraficos.getCoordeY(Nodoauxiliar.getPredecesor().getNombre()), Color.BLUE);

            Dibujos.seleccionNodo(LabelMapa.getGraphics(),
                    datosGraficos.getCoordeX(Nodoauxiliar.getNombre()),
                    datosGraficos.getCoordeY(Nodoauxiliar.getNombre()), Color.YELLOW,color);
            Nodoauxiliar = Nodoauxiliar.getPredecesor();
        }//fin de while Recorriendo caminos
        
        //Pintamos la imagen en el mapa, del nodo final o destino
        ((Graphics2D) LabelMapa.getGraphics()).drawImage(imagen3, datosGraficos.getCoordeX(destino), datosGraficos.getCoordeY(destino), 65, 65, null);
        

    }

}
