/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;
import Clases.AlgoritmoDijkstra;
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
    
    DatosGraficos datosGraficos = new DatosGraficos();

    /**
     * Creates new form Mapa
     */
    public Mapa() {
        initComponents();
        cbxDestino.setEnabled(false);
        cbxSalida.setEnabled(false);
        TrzarRuta.setEnabled(false);
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
        cbxSalida = new javax.swing.JComboBox<>();
        cbxDestino = new javax.swing.JComboBox<>();
        TrzarRuta = new javax.swing.JButton();

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

        cbxSalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turrialba", "Juan Viñas", "Cervantes", "Tucurrique", "Cachi", "Birrisito", "Paraiso", "Orosi", "Oreamuno", "Cartago", "Pitahaya", "El Tejar", "Tres Rios", "Tierra Blanca", "La Fundacion" }));
        cbxSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSalidaActionPerformed(evt);
            }
        });

        cbxDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turrialba", "Juan Viñas", "Cervantes", "Tucurrique", "Cachi", "Birrisito", "Paraiso", "Orosi", "Oreamuno", "Cartago", "Pitahaya", "El Tejar", "Tres Rios", "Tierra Blanca", "La Fundacion" }));
        cbxDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDestinoActionPerformed(evt);
            }
        });

        TrzarRuta.setText("Ir");
        TrzarRuta.setActionCommand("btnBuscarRuta");
        TrzarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrzarRutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxSalida, 0, 233, Short.MAX_VALUE)
                                    .addComponent(cbxDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(TrzarRuta)
                                .addGap(28, 28, 28))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelMapa, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(cbxSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(cbxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(TrzarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        cbxSalida.setEnabled(true);
       
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
            {0, 0, 0, 0, 0, 0, 0, 0, 0,  1,  0,  1,  0,  0,  0}, // 11
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
            {0, 0, 0, 0, 0, 0, 0, 0, 0,  2.8,  0,  3.3,  0,  0,  0},          // 11
            {0, 0, 0, 0, 0, 0, 0, 20.1, 0,  0,  3.3,  0,  13.4,  0,  1.5},    // 12
            {0, 0, 0, 0, 0, 0, 0, 0, 13.9,  13.1,  0,  13.4,  0,  16.6,  0},  // 13
            {0, 0, 17.1, 0, 0, 17.7, 0, 0, 7.7,  0,  0,  0,  16.6,  0,  0},   // 14
            {0, 0, 0, 0, 0, 0, 0, 0, 0,  0,  0,  1.5,  0,  0,  0},};          // 15

        int coordenadasX[] = {890, 710, 570, 800, 570, 480, 400, 470, 320, 235, 280,  200,  60,  350,  190};
        int coordenadasY[] = {95,  135, 170, 300, 370, 260, 280, 480, 215, 240, 290,  280,  135,  85,  335};
             String nom[] =  {"Turrialba", "Juan Viñas", "Cervantes", "Tucurrique", "Cachí", "Birrisito", "Paraiso", "Orosi", "Oreamuno", "Cartago", "Pitahaya", "Tejar", "Tres Ríos", "Tierra Blanca", "La Fundacion"};
      
        for (int j = 0; j < 15; j++) {
            datosGraficos.setCoordeX(j, coordenadasX[j]);
            datosGraficos.setCoordeY(j, coordenadasY[j]);
            datosGraficos.setNombre(j, nom[j]);

        }
        for (int j = 0; j < 15; j++) {
            for (int k = 0; k < 15; k++) {
                datosGraficos.setmAdyacencia(j, k, MatrizAdyacencia[j][k]);
                datosGraficos.setmDistancias(j, k, distancias[j][k]);
            }
        }
        NumVertices = 15;
        try { 
            PintarRutas(NumVertices, datosGraficos);
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
     * odigo par atrazar la ruta seleccionada, cone l boton btnbuscar
     * @param evt 
     */
    private void TrzarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrzarRutaActionPerformed

        int origen = 0, destino = 0;
        String nombreOrigen, nombreDestino;
        nombreOrigen = (String) cbxSalida.getSelectedItem();
        nombreDestino = (String) cbxDestino.getSelectedItem();
        
        
        if ("Turrialba".equals(nombreOrigen)) {
            origen = 0;
        }
        if ("Juan Viñas".equals(nombreOrigen)) {
            origen = 1;
        }
        if ("Cervantes".equals(nombreOrigen)) {
            origen = 2;
        }
        if ("Tucurrique".equals(nombreOrigen)) {
            origen = 3;
        }
        if ("Cachi".equals(nombreOrigen)) {
            origen = 4;
        }
        if ("Birrisito".equals(nombreOrigen)) {
            origen = 5;
        }
        if ("Paraiso".equals(nombreOrigen)) {
            origen = 6;
        }
        if ("Orosi".equals(nombreOrigen)) {
            origen = 7;
        }
        if ("Oreamuno".equals(nombreOrigen)) {
            origen = 8;
        }
        if ("Cartago".equals(nombreOrigen)) {
            origen = 9;
        }
        if ("Pitahaya".equals(nombreOrigen)) {
            origen = 10;
        }
        if ("El Tejar".equals(nombreOrigen)) {
            origen = 11;
        }
        if ("Tres Rios".equals(nombreOrigen)) {
            origen = 12;
        }
        if ("Tierra Blanca".equals(nombreOrigen)) {
            origen = 13;
        }
        if ("La Fundacion".equals(nombreOrigen)) {
            origen = 14;
        }
 
        /*************************************/
        
        
        if ("Turrialba".equals(nombreDestino)) {
            destino = 0;
        }
        if ("Juan Viñas".equals(nombreDestino)) {
            destino = 1;
        }
        if ("Cervantes".equals(nombreDestino)) {
            destino = 2;
        }
        if ("Tucurrique".equals(nombreDestino)) {
            destino = 3;
        }
        if ("Cachi".equals(nombreDestino)) {
            destino = 4;
        }
        if ("Birrisito".equals(nombreDestino)) {
            destino = 5;
        }
        if ("Paraiso".equals(nombreDestino)) {
            destino = 6;
        }
        if ("Orosi".equals(nombreDestino)) {
            destino = 7;
        }
        if ("Oreamuno".equals(nombreDestino)) {
            destino = 8;
        }
        if ("Cartago".equals(nombreDestino)) {
            destino = 9;
        }
        if ("Pitahaya".equals(nombreDestino)) {
            destino = 10;
        }
        if ("El Tejar".equals(nombreDestino)) {
            destino = 11;
        }
        if ("Tres Rios".equals(nombreDestino)) {
            destino = 12;
        }
        if ("Tierra Blanca".equals(nombreDestino)) {
            destino = 13;
        }
        if ("La Fundacion".equals(nombreDestino)) {
            destino = 14;
        }
        
        if (origen == destino) {
            Font fuente = new Font("Arial", Font.BOLD, 18);
            //txtKMAcumulados.setFont(fuente);
            JOptionPane.showMessageDialog(null, "Estás en:" + nombreOrigen+"!");
            //txtKMAcumulados.setText("Intenta de nuevo!!");
            //txtKMAcumulados.setEnabled(false);
            //txtKMAcumulados.setForeground(Color.RED);

        } else {
            AlgoritmoDijkstra Dijkstra = new AlgoritmoDijkstra(datosGraficos, NumVertices, origen, destino);
            try {
                Dijkstra.dijkstra();
            } catch (IOException ex) {
                Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
            }

            Font fuente = new Font("Arial", Font.BOLD, 18);
            //txtKMAcumulados.setFont(fuente);
            //txtKMAcumulados.setText("No hay ningun error :)");
            //txtKMAcumulados.setForeground(Color.BLUE);
            //txtKMAcumulados.setEnabled(false);
            
            //kmRecorridos.setText(Dijkstra.getAcumulado() + " KM");
        }
        
    }//GEN-LAST:event_TrzarRutaActionPerformed

    private void cbxSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSalidaActionPerformed
        cbxDestino.setEnabled(true);
    }//GEN-LAST:event_cbxSalidaActionPerformed

    private void cbxDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDestinoActionPerformed
        TrzarRuta.setEnabled(true);
    }//GEN-LAST:event_cbxDestinoActionPerformed
    
    
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
    private javax.swing.JButton TrzarRuta;
    private javax.swing.JComboBox<String> cbxDestino;
    private javax.swing.JComboBox<String> cbxSalida;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}