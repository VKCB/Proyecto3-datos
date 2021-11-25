/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Allan
 */
public class Vertice {

    private int nombre;
    private boolean visitado;
    private boolean etiqueta;
    private double acumulado; // lleva el acomulado de cada nodo
    private Vertice Predecesor;

    public Vertice() {
        this.nombre = -1;
        this.visitado = false;
        this.etiqueta = false; // la etiqueta de un vertice es verdadera cuando es el lugar de origen, utilizada para diferenciar el origen de los demás vertices
        this.Predecesor = null;
        this.acumulado = 0;

    }

    public int getNombre() {
        return nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public boolean isEtiqueta() {
        return etiqueta;
    }

    public double getAcumulado() {
        return acumulado;
    }

    public Vertice getPredecesor() {
        return Predecesor;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public void setEtiqueta(boolean etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setAcumulado(double acomulado) {
        this.acumulado = acomulado;
    }

    public void setPredecesor(Vertice Predecesor) {
        this.Predecesor = Predecesor;
    }

}
