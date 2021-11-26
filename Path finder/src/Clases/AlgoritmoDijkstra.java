
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
 *Clase encargada de calcular la mejor ruta o las rutas mínimas y dibujar dicha ruta.
 * @author Allan Prieto, Allan Chen, Valerin Calderon, Daniel Rayo, Ludwin Ramos
 * @since 25/11/2021
 * @version 1.0
 */
public class AlgoritmoDijkstra {

    private final DatosGraficos datosGraficos;
    private int subNumVertices;
    private Vertice Nodoauxiliar = null;
    private double auxiliarAcumulado; // es un acumulado auxiliar
    private double subtotalAcomulado;
    private final Vertice nodos[];
    private final int numVertices;
    private int Origen;
    private final int destino;
    
    /**
     * Constructor que inicializa los atributos de la clase "AlgoritmoDijkstra"
     * @param datosGraficos objeto o instancia de la clase "DatosGraficos", enviada de la clase "Mapa".
     * @param numVertices es el número de vertices o lugares que posee el mapa.
     * @param origen número que actua como identificador del punto de partida, que se asigna en la clase "Mapa".
     * @param destino número que actua como identificador del punto de destino, que se asigna en la clase "Mapa".
     */
    public AlgoritmoDijkstra(DatosGraficos datosGraficos, int numVertices, int origen, int destino) {
        this.datosGraficos = datosGraficos;
        this.numVertices = numVertices;
        this.nodos = new Vertice[numVertices];
        this.Origen = origen;
        this.destino = destino;

    }
    /**}
     * método utilizado para obtener el costo de la ruta desde el punto de origen o partida, hasta el vertice eljido como 
     *  destino.
     * @return retorna el costo de la ruta, desde el punto de origen o partida, hasta el vertice eljido como destino.
     */
    public double getAcumulado() {
        return nodos[destino].getAcumulado();
    }
    
    /**
     * método utilizado para obtener el identificador (número) del vértice o lugar de destino.
     * @return retorna el identificador (número) del vértice o lugar de destino.
     */
    public int getNombre() {
        return nodos[destino].getNombre();
    }

    /**
     * método utilizado para calcular y dibujar la ruta con menor costo.
     * @throws IOException, utilizada para indicar si el archivo buscado no fue encontrado.
     */
    public void dijkstra() throws IOException {
        
        // creación del vector nodo del tamaño del numero de nodos pintados 
        // se crean instancias de la clase "Vertice", donde cada instancia almacenará la información de cada vértice.
        for (int i = 0; i < numVertices; i++) 
        {
            nodos[i] = new Vertice();
        }
        Color color = new Color(64,0,128);
        
        // se carga la imagen que indicará el punto de origen o de partida en el mapa.
        File archImg1 = new File("ubicacion.png");
        Image imagen1 = ImageIO.read(archImg1);
        LabelMapa.paint(LabelMapa.getGraphics());
        PintarRutas(numVertices, datosGraficos); // se pinta otra vez todas las rutas del mapa, ya que sino, solo la cálculada se visualizaría.
        
        //  se dibuja y se pinta de color un círculo en el nodo de Origen
        Dibujos.seleccionNodo(LabelMapa.getGraphics(),
                datosGraficos.getCoordeX(Origen),
                datosGraficos.getCoordeY(Origen), Color.YELLOW,color); 
        
        // se pinta la imagen en el mapa que indica el punto de partida u origen.
        ((Graphics2D) LabelMapa.getGraphics()).drawImage(imagen1, datosGraficos.getCoordeX(Origen), datosGraficos.getCoordeY(Origen), 65, 65, null);

        nodos[Origen].setVisitado(true); // se coloca como visitado el punto de origen 
        nodos[Origen].setNombre(Origen); // se coloca en la instancia  de la clase "Vertice" del punto de origen, su identificador (un número)

        do {
            
            // Variables que serán utilizadas almacenar de forma temporal el costo de la ruta hasta terminar el cálculo.
            subtotalAcomulado = 0;
            auxiliarAcumulado = 1000; // se iguala a este valor ya que los costos nunca serán mayor a esta cifra.
            nodos[Origen].setEtiqueta(true); // el vertice de origen es el único que será true, y con eso se identifica.
            
            //se cálcula el costo que hay desde el vertice origen, hasta cada vertice que existe en el mapa.
            for (int j = 0; j < numVertices; j++) {
                //si el nodo iterado tiene conexión directa con el nodo que es origen en esa iteración .
                if (datosGraficos.getmAdyacencia(j, Origen) == 1) { 
                    subtotalAcomulado = nodos[Origen].getAcumulado() + datosGraficos.getmDistancias(j, Origen);
                    
                    // se verifica si una segunda, tercera (etc) ruta tiene menor costo que una ruta anterior ya escogida como la mejor ruta.
                    if (subtotalAcomulado <= nodos[j].getAcumulado() && nodos[j].isVisitado() == true && nodos[j].isEtiqueta() == false) {
                        
                        nodos[j].setAcumulado(subtotalAcomulado); // se actualiza el costo la mejor ruta
                        nodos[j].setVisitado(true);
                        nodos[j].setNombre(j);
                        nodos[j].setPredecesor(nodos[Origen]);
                    } else if (nodos[j].isVisitado() == false) {
                        
                        nodos[j].setAcumulado(subtotalAcomulado); // se almacena el costo del origen hasta el nodo iterado
                        nodos[j].setVisitado(true);
                        nodos[j].setNombre(j);
                        nodos[j].setPredecesor(nodos[Origen]); // se guarda un nodo predecesor del nodo iterado 
                        //(el predecesor del nodo iterado está más cerca del punto de partida original)
                    }
                }
            }

            //Encontrando Camino más corto.s
            // se busca cual de los nodos visitados tiene el acomulado menor (costo menor) para ser escogido como el mejor
            //  camino.
            for (int i = 0; i < numVertices; i++) { 
                if (nodos[i].isVisitado() == true && nodos[i].isEtiqueta() == false) {
                    if (nodos[i].getAcumulado() <= auxiliarAcumulado) {
                        // se actualiza el "origen" al nodo que posee el menor costo desde el punto de partida original hasta él.
                        Origen = nodos[i].getNombre(); 
                        auxiliarAcumulado = nodos[i].getAcumulado(); //se almacena el menor costo para ser comparado con los demás. 
                    }
                }
            }
            subNumVertices++;
        } while (subNumVertices < numVertices + 1);
        Nodoauxiliar = nodos[destino];
        
        // se carga la imagen que indicará el punto de destino en el mapa.
        File archImg3 = new File("destino.png");
        Image imagen3 = ImageIO.read(archImg3);
        
        // se pinta o se resalta la mejor ruta en el mapa.
        // se pinta la ruta comenzado desde el destino hasta el punto de partida (quien tiene su predecesor en nulo).
        while (Nodoauxiliar.getPredecesor() != null) {
            Dibujos.pinta_Camino(LabelMapa.getGraphics(),
                    datosGraficos.getCoordeX(Nodoauxiliar.getNombre()),
                    datosGraficos.getCoordeY(Nodoauxiliar.getNombre()),
                    datosGraficos.getCoordeX(Nodoauxiliar.getPredecesor().getNombre()),
                    datosGraficos.getCoordeY(Nodoauxiliar.getPredecesor().getNombre()), Color.BLUE);
            // se pinta con un circulo cada vertice que se encuentra en la mejor ruta.
            Dibujos.seleccionNodo(LabelMapa.getGraphics(),
                    datosGraficos.getCoordeX(Nodoauxiliar.getNombre()),
                    datosGraficos.getCoordeY(Nodoauxiliar.getNombre()), Color.YELLOW,color);
            Nodoauxiliar = Nodoauxiliar.getPredecesor();
        }//fin de while Recorriendo caminos
        
        // se pinta la imagen en el mapa que indica el punto de destino.
        ((Graphics2D) LabelMapa.getGraphics()).drawImage(imagen3, datosGraficos.getCoordeX(destino), datosGraficos.getCoordeY(destino), 65, 65, null);
    }

}
