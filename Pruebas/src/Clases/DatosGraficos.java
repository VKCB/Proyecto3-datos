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
public class DatosGraficos {

    private final double MatrizDistancias[][] = new double[15][15];
    private final int MatrizAdyacencia[][] = new int[15][15];
    private final int coordenadaX[] = new int[15];
    private final int coordenadaY[] = new int[15];
    private final String nombre[] = new String[15];
    private int enArbol[];

    /**
     *
     * @author Jose H Elel
     */
    public DatosGraficos() {

    }

    public double getmDistancias(int i, int j) {
        return MatrizDistancias[i][j];
    }

    public int getmAdyacencia(int i, int j) {
        return MatrizAdyacencia[i][j];
    }

    public int getCoordeX(int i) {
        return coordenadaX[i];
    }

    public int getCoordeY(int i) {
        return coordenadaY[i];
    }

    public String getNombre(int i) {
        return nombre[i];
    }

    public int getEnArbol(int i) {
        return enArbol[i];
    }

    public void setmDistancias(int i, int j, double mCoeficiente) {
        this.MatrizDistancias[i][j] = mCoeficiente;
    }

    public void setmAdyacencia(int i, int j, int mAdyacencia) {
        this.MatrizAdyacencia[i][j] = mAdyacencia;
    }

    public void setCoordeX(int i, int cordeX) {
        this.coordenadaX[i] = cordeX;
    }

    public void setCoordeY(int i, int cordeY) {
        this.coordenadaY[i] = cordeY;
    }

    public void setNombre(int i, String nombre) {
        this.nombre[i] = nombre;
    }

    public void setEnArbol(int i, int enArbol) {
        this.enArbol[i] = enArbol;
    }

    public void crearEnArbol(int i) {
        enArbol = new int[i];
    }

}
