/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Allan
 */
public class PintarDibujos {
    
    public PintarDibujos() {

    }

    public static void pinta_Circulo(Graphics g, int x, int y, String n){
        //g.drawOval(x, y-10, 20, 20);
        Toolkit t = Toolkit.getDefaultToolkit ();
        Image imagen = t.getImage ("R:\\TEC - II 2021\\Algoritmos y estructura de datos I\\Proyectos\\Proyecto 3\\Proyecto3-datos\\Pruebas\\src\\img\\localizacion.png");
        //((Graphics2D) g).setColor(Color.RED);
        //((Graphics2D) g).setStroke(new BasicStroke(3));//leda el grosor al circulo      
        //((Graphics2D) g).drawImage(imagen, x, y,15, 15, null);
        //((Graphics2D) g).fillOval(x, y, 10, 10);
        //((Graphics2D) g).setColor(Color.RED);
        //((Graphics2D) g).drawOval(x, y, 15, 15);
        ((Graphics2D) g).drawImage(imagen, x, y, 22, 22, null);
        //((Graphics2D) g).setColor(Color.RED);
        //((Graphics2D) g).drawImage(iconeNave, x, y, null);

        ((Graphics2D) g).setColor(Color.RED);
        Font fuente = new Font("Monospaced", Font.BOLD, 19);
        g.setFont(fuente);
        ((Graphics2D) g).drawString(n, x, y);

    }

    public static void pinta_Linea(Graphics g, int x1, int y1, int x2, int y2, double tam) {
        int xAux = 0;
        int yAux = 0;
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(1);
        ((Graphics2D) g).setStroke(stroke);
        ((Graphics2D) g).drawLine(x1 + 10, y1 + 10, x2 + 10, y2 + 10);
        if (x1 <= x2) {
            xAux = ((x2 - x1) / 2) + x1;
        }
        if (x1 > x2) {
            xAux = ((x1 - x2) / 2) + x2;
        }
        if (y1 < y2) {
            yAux = ((y2 - y1) / 2) + y1;
        }
        if (y1 >= y2) {
            yAux = ((y1 - y2) / 2) + y2;
        }
        ((Graphics2D)g).setColor(Color.RED);//PINTANDO TEXTO DE VERTICES(TAMANIO)
        Font fuente = new Font("Monospaced", Font.PLAIN, 11);
        g.setFont(fuente);
        ((Graphics2D) g).drawString(String.valueOf(tam), xAux, yAux);
    }

    public static void pinta_Camino(Graphics g, int x1, int y1, int x2, int y2, Color color) {
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(3);
        ((Graphics2D) g).setStroke(stroke);
        g.setColor(color);
        g.drawLine(x1 + 10, y1 + 10, x2 + 10, y2 + 10);
        
    }
//Pintando nodos que son recorridos
    public static void seleccionNodo(Graphics g, int x, int y, String n, Color co) {
        
        ((Graphics2D) g).setColor(co);
        ((Graphics2D) g).setStroke(new BasicStroke(3));//leda el grosor del contorno al circulo        
        ((Graphics2D) g).fillOval(x, y, 15, 15);//tamanio del circulo
        ((Graphics2D) g).setColor(Color.GREEN);
        ((Graphics2D) g).drawOval(x, y, 15, 15);

    }
    
}
