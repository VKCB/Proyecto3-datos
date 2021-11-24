/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static Forms.Mapa.PintarRutas;
import java.awt.Color;
import java.io.IOException;
import static Forms.Mapa.LabelMapa;

/**
 *
 * @author Allan
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

    public void dijkstra() throws IOException {
        for (int i = 0; i < numVertices; i++) // creación del vector nodo del tamaño del numero de nodos pintados 
        {
            nodo[i] = new Vertice();
        }
        LabelMapa.paint(LabelMapa.getGraphics());
        PintarRutas(numVertices, datosGraficos);
        Dibujos.seleccionNodo(LabelMapa.getGraphics(),
                datosGraficos.getCoordeX(Origen),
                datosGraficos.getCoordeY(Origen), Color.GREEN); //  se pinta de color el nodo de Origen

        nodo[Origen].setVisitado(true); // un objeto de tipo Vertice
        nodo[Origen].setNombre(Origen); // un objeto de tipo Vertice

        do {
            subtotalAcomulado = 0;
            auxiliarAcumulado = 2000000000; // lo igualamos a esta cifra ya que el acomulado de los nodos, a la que nunca sera mayor 
            nodo[Origen].setEtiqueta(true);
            
            //se guardan
            for (int j = 0; j < numVertices; j++) {
                if (datosGraficos.getmAdyacencia(j, Origen) == 1) { //si el nodo iterado tiene conexión con el origen escogido
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
            for (int i = 0; i < numVertices; i++) { // buscamos cual de los nodos visitado tiene el acomulado menor par escogerlo como camino
                if (nodo[i].isVisitado() == true && nodo[i].isEtiqueta() == false) {
                    if (nodo[i].getAcumulado() <= auxiliarAcumulado) {
                        
                        Origen = nodo[i].getNombre();
                        System.out.println("el origen es: "+Origen+" y su acumulado es: "+nodo[i].getAcumulado());
                        auxiliarAcumulado = nodo[i].getAcumulado();
                    }
                }
            }
            System.out.println("------------------------------------------");
            subNumVertices++;
        } while (subNumVertices < numVertices + 1);

        Nodoauxiliar = nodo[destino];

        //Pintando caminos recorridos
        while (Nodoauxiliar.getPredecesor() != null) {
            Dibujos.pinta_Camino(LabelMapa.getGraphics(),
                    datosGraficos.getCoordeX(Nodoauxiliar.getNombre()),
                    datosGraficos.getCoordeY(Nodoauxiliar.getNombre()),
                    datosGraficos.getCoordeX(Nodoauxiliar.getPredecesor().getNombre()),
                    datosGraficos.getCoordeY(Nodoauxiliar.getPredecesor().getNombre()), Color.BLUE);

            Dibujos.seleccionNodo(LabelMapa.getGraphics(),
                    datosGraficos.getCoordeX(Nodoauxiliar.getNombre()),
                    datosGraficos.getCoordeY(Nodoauxiliar.getNombre()), Color.BLUE);
            Nodoauxiliar = Nodoauxiliar.getPredecesor();
        }//fin de while Recorriendo caminos

        Dibujos.seleccionNodo(LabelMapa.getGraphics(),
                datosGraficos.getCoordeX(destino),
                datosGraficos.getCoordeY(destino),Color.RED);//Pintando Nodo del destino

    }

}
