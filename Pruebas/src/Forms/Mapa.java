/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;
import Clases.DatosGraficos;
import Clases.Dibujos;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Allan
 */
public class Mapa extends javax.swing.JFrame {
    
    private int NumVertices = 0;//Numero de nodos o vertices (lugares) 
    
    DatosGraficos datosGráficos = new DatosGraficos();

    /**
     * Creates new form Mapa
     */
    public Mapa() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        LabelMapa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jButton1.setText("Mapa");
        jButton1.setActionCommand("btnVerCaminos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        LabelMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mapaCartago.jpg"))); // NOI18N
        LabelMapa.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelMapa, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LabelMapa.paint(LabelMapa.getGraphics());
       
        int MatrizAdyacencia[][] = {
            {0, 1, 0, 1, 0, 0, 0, 0, 0,  0,  0,  0,  0,  0,  0}, // 1
            {1, 0, 1, 0, 0, 0, 0, 0, 0,  0,  0,  0,  0,  0,  0}, // 2
            {0, 1, 0, 0, 0, 1, 0, 0, 0,  0,  0,  0,  0,  1,  0}, // 3
            {1, 0, 0, 0, 1, 1, 0, 0, 0,  0,  0,  0,  0,  0,  0}, // 4
            {0, 0, 0, 1, 0, 1, 1, 1, 0,  0,  0,  0,  0,  0,  0}, // 5
            {0, 0, 1, 1, 1, 0, 1, 0, 0,  0,  0,  0,  0,  1,  0}, // 6
            {0, 0, 0, 0, 1, 1, 0, 1, 1,  1,  0,  0,  0,  0,  0}, // 7
            {0, 0, 0, 0, 1, 0, 1, 0, 0,  0,  0,  1,  0,  0,  0}, // 8
            {0, 0, 0, 0, 0, 0, 1, 0, 0,  1,  0,  0,  1,  1,  0}, // 9
            {0, 0, 0, 0, 0, 0, 1, 0, 1,  0,  1,  0,  1,  0,  0}, // 10
            {0, 0, 0, 0, 0, 0, 0, 0, 0,  1,  1,  0,  0,  0,  0}, // 11
            {0, 0, 0, 0, 0, 0, 0, 1, 0,  0,  1,  0,  1,  0,  1}, // 12
            {0, 0, 0, 0, 0, 0, 0, 0, 1,  1,  0,  1,  0,  1,  0}, // 13
            {0, 0, 1, 0, 0, 1, 0, 0, 1,  0,  0,  0,  1,  0,  0}, // 14
            {0, 0, 0, 0, 0, 0, 0, 0, 0,  0,  0,  1,  0,  0,  0}  // 15
        };

        double distancias[][] = {
            {0, 11.8, 0, 24.7, 0, 0, 0, 0, 0,  0,  0,  0,  0,  0,  0},        // 1
            {11.8, 0, 12.1, 0, 0, 0, 0, 0, 0,  0,  0,  0,  0,  0,  0},        // 2
            {0, 12.1, 0, 0, 0, 7.7, 0, 0, 0,  0,  0,  0,  0,  17.1,  0},      // 3
            {24.7, 0, 0, 0, 17.5, 23.9, 0, 0, 0,  0,  0,  0,  0,  0,  0},     // 4
            {0, 0, 0, 17.5, 0, 10.4, 11.2, 11.4, 0,  0,  0,  0,  0,  0,  0},  // 5
            {0, 0, 7.7, 23.9, 10.4, 0, 4.7, 0, 0,  0,  0,  0,  0,  17.7,  0}, // 6
            {0, 0, 0, 0, 11.2, 4.7, 0, 9.5, 6.2,  6.6,  0,  0,  0,  0,  0},   // 7
            {0, 0, 0, 0, 11.4, 0, 9.5, 0, 0,  0,  0,  20.1,  0,  0,  0},      // 8
            {0, 0, 0, 0, 0, 0, 6.2, 0, 0,  1.9,  0,  0,  13.9,  7.7,  0},     // 9
            {0, 0, 0, 0, 0, 0, 6.6, 0, 1.9,  0,  2.8,  0,  13.1,  0,  0},     // 10
            {0, 0, 0, 0, 0, 0, 0, 0, 0,  2.8,  3.3,  0,  0,  0,  0},          // 11
            {0, 0, 0, 0, 0, 0, 0, 20.1, 0,  0,  3.3,  0,  13.4,  0,  1.5},    // 12
            {0, 0, 0, 0, 0, 0, 0, 0, 13.9,  13.1,  0,  13.4,  0,  16.6,  0},  // 13
            {0, 0, 17.1, 0, 0, 17.7, 0, 0, 7.7,  0,  0,  0,  16.6,  0,  0},   // 14
            {0, 0, 0, 0, 0, 0, 0, 0, 0,  0,  0,  1.5,  0,  0,  0},};          // 15

        int coordenadasX[] = {890, 710, 570, 800, 570, 480, 400, 470, 320, 235, 280,  200,  60,  350,  190};
        int coordenadasY[] = {95,  135, 170, 300, 370, 260, 280, 480, 215, 240, 290,  280,  135,  85,  335};
             String nom[] =  {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
      
        for (int j = 0; j < 15; j++) {
            datosGráficos.setCoordeX(j, coordenadasX[j]);
            datosGráficos.setCoordeY(j, coordenadasY[j]);
            datosGráficos.setNombre(j, nom[j]);

        }
        for (int j = 0; j < 15; j++) {
            for (int k = 0; k < 15; k++) {
                datosGráficos.setmAdyacencia(j, k, MatrizAdyacencia[j][k]);
                datosGráficos.setmDistancias(j, k, distancias[j][k]);
            }
        }
        NumVertices = 15;
        try { 
            PintarRutas(NumVertices, datosGráficos);
        } catch (IOException ex) {
            Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // Dibuja lineas que representan las rutas posibles que el usuario puede escoger
    public static void PintarRutas(int numVertices, DatosGraficos arboles) throws IOException {// pinta todas las rutas en el mapa a escoger
        for (int j = 0; j < numVertices; j++) {
            for (int k = 0; k < numVertices; k++) {
                if (arboles.getmAdyacencia(j, k) == 1) { //se pinta las líneas
                    Dibujos.pinta_Rutas(LabelMapa.getGraphics(), arboles.getCoordeX(j), arboles.getCoordeY(j), arboles.getCoordeX(k), arboles.getCoordeY(k), arboles.getmDistancias(j, k));
                }
            }
        }
        for (int j = 0; j < numVertices; j++) { // se pintan los simbolos de ubicación en cada lugar
            Dibujos.pinta_localizador(LabelMapa.getGraphics(), arboles.getCoordeX(j), arboles.getCoordeY(j), arboles.getNombre(j));
            
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mapa().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel LabelMapa;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}