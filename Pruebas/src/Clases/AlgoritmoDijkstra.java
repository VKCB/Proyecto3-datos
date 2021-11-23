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
    private final DatosGraficos arboles;
    private int subTope;
    private Vertice Nodoauxiliar = null;
    private double auxiliarAumulado; // es un acumulado auxiliar
    private double subtotalAcomulado;
    private final Vertice nodo[];
    private final int tope;
    private int Origen;
    private final int nodoFinal;

    public AlgoritmoDijkstra(DatosGraficos arboles, int tope, int permanente, int nodoFin) {
        this.arboles = arboles;
        this.tope = tope;
        this.nodo = new Vertice[tope];
        this.Origen = permanente;
        this.nodoFinal = nodoFin;

    }

    public double getAcumulado() {
        return nodo[nodoFinal].getAcumulado();
    }

    public int getNombre() {
        return nodo[nodoFinal].getNombre();
    }

    public void dijkstra() throws IOException {
        for (int i = 0; i < tope; i++) // creacion del vector nodo del tamaño del numero de nodos pintados 
        {
            nodo[i] = new Vertice();
        }
            LabelMapa.paint(LabelMapa.getGraphics());
            PintarRutas(tope, arboles);
            Dibujos.seleccionNodo(LabelMapa.getGraphics(), 
                    arboles.getCoordeX(Origen), 
                    arboles.getCoordeY(Origen), null, Color.GREEN); // pinta de color el nodo de Origen

            nodo[Origen].setVisitado(true);
            nodo[Origen].setNombre(Origen);

            do {
                subtotalAcomulado = 0;
                auxiliarAumulado = 2000000000; // lo igualamos a esta cifra ya q el acomulado de los nodos, a la que nunca sera mayor 
                nodo[Origen].setEtiqueta(true);
                for (int j = 0; j < tope; j++) {
                    if (arboles.getmAdyacencia(j, Origen) == 1) {
                        subtotalAcomulado = nodo[Origen].getAcumulado() + arboles.getmDistancias(j, Origen);
                        
                        if (subtotalAcomulado <= nodo[j].getAcumulado() && nodo[j].isVisitado() == true && nodo[j].isEtiqueta() == false) {
                            nodo[j].setAcumulado(subtotalAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[Origen]);
                        } else if (nodo[j].isVisitado() == false) {
                            nodo[j].setAcumulado(subtotalAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[Origen]);
                        }
                    }
                }
                
                //Encontrando Camino mas corto
                for (int i = 0; i < tope; i++) { // buscamos cual de los nodos visitado tiene el acomulado menor par escogerlo como camino
                    if (nodo[i].isVisitado() == true && nodo[i].isEtiqueta() == false) {
                        if (nodo[i].getAcumulado() <= auxiliarAumulado) {
                            Origen = nodo[i].getNombre();
                            auxiliarAumulado = nodo[i].getAcumulado();
                        }
                    }
                }
                subTope++;
            } while (subTope < tope + 1);

            Nodoauxiliar = nodo[nodoFinal];
            
            //Pintando caminos recorridos
            while (Nodoauxiliar.getPredecesor() != null) {
                Dibujos.pinta_Camino(LabelMapa.getGraphics(), 
                        arboles.getCoordeX(Nodoauxiliar.getNombre()),
                        arboles.getCoordeY(Nodoauxiliar.getNombre()),
                        arboles.getCoordeX(Nodoauxiliar.getPredecesor().getNombre()), 
                        arboles.getCoordeY(Nodoauxiliar.getPredecesor().getNombre()), Color.BLUE);
                
                Dibujos.seleccionNodo(LabelMapa.getGraphics(), 
                        arboles.getCoordeX(Nodoauxiliar.getNombre()), 
                        arboles.getCoordeY(Nodoauxiliar.getNombre()), null, Color.BLUE);
                Nodoauxiliar = Nodoauxiliar.getPredecesor();
            }//fin de while Recorriendo caminos
            
            Dibujos.seleccionNodo(LabelMapa.getGraphics(), 
                    arboles.getCoordeX(nodoFinal), 
                    arboles.getCoordeY(nodoFinal), null, Color.RED);//Pintando Nodo del destino
        
    }
    
}
