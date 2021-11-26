/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VENTANAS;

import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *Clase que contiene las pantallas de la informacion de cada lugar
 * y la pantalla principal
 * @author Allan Prieto, Allan Chen, Valerin Calderon, Daniel Rayo, Ludwin Ramos
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz2
     */
    public Interfaz() {
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

        VentanaInicial = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainForm");
        setName("MainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1255, 677));
        setResizable(false);
        setSize(new java.awt.Dimension(840, 430));

        VentanaInicial.setBackground(new java.awt.Color(255, 102, 255));
        VentanaInicial.setPreferredSize(new java.awt.Dimension(1240, 630));
        VentanaInicial.setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        VentanaInicial.add(jButton1);
        jButton1.setBounds(0, 40, 200, 40);

        jButton16.setBackground(new java.awt.Color(0, 0, 0));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton16.setForeground(new java.awt.Color(204, 204, 204));
        jButton16.setText("Informacion");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        VentanaInicial.add(jButton16);
        jButton16.setBounds(0, 0, 100, 40);

        jButton17.setBackground(new java.awt.Color(0, 0, 0));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton17.setForeground(new java.awt.Color(204, 204, 204));
        jButton17.setText("Salir");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        VentanaInicial.add(jButton17);
        jButton17.setBounds(100, 0, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Fondo (2).jpg"))); // NOI18N
        VentanaInicial.add(jLabel1);
        jLabel1.setBounds(-10, 0, 1250, 630);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1240, 630));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(30, 60, 110, 30);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Birrisito");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(180, 300, 160, 40);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cachì");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(180, 340, 160, 40);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Cartago");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(180, 380, 160, 40);

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Cervantes");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(340, 300, 160, 40);

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Fundaciòn");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(340, 340, 160, 40);

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Juan Viñas");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(340, 380, 160, 40);

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Oreamuno");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(500, 300, 160, 40);

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Orosi");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(500, 340, 160, 40);

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Paraìso");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(500, 380, 160, 40);

        jButton12.setBackground(new java.awt.Color(0, 0, 0));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Pitahaya");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(660, 300, 160, 40);

        jButton13.setBackground(new java.awt.Color(0, 0, 0));
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Tejar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(660, 340, 160, 40);

        jButton14.setBackground(new java.awt.Color(0, 0, 0));
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Tierra Blanca");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);
        jButton14.setBounds(660, 380, 160, 40);

        jButton15.setBackground(new java.awt.Color(0, 0, 0));
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Tres Rios");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);
        jButton15.setBounds(820, 300, 160, 40);

        jButton18.setBackground(new java.awt.Color(0, 0, 0));
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Tucurrique");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);
        jButton18.setBounds(820, 340, 160, 40);

        jButton19.setBackground(new java.awt.Color(0, 0, 0));
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Turrialba");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);
        jButton19.setBounds(820, 380, 160, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO (2) (1).png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(890, 500, 270, 110);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Inf (3).png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 70, 960, 560);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1240, 630));
        jPanel3.setLayout(null);

        jButton21.setBackground(new java.awt.Color(0, 0, 0));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton21.setForeground(new java.awt.Color(204, 204, 204));
        jButton21.setText("Regresar");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton21);
        jButton21.setBounds(1070, 550, 130, 50);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO (2) (1).png"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 20, 1230, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(VentanaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 1240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VentanaInicial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentanaInicial.setVisible(true);
        jPanel1.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
       jPanel1.setVisible(true);
       VentanaInicial.setVisible(false);
    }//GEN-LAST:event_jButton16ActionPerformed
    // Funcion al boton de Tucurrique
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
    ImageIcon img = new ImageIcon("Tucurrique.png");
    jLabel4.setIcon(img);
    jPanel1.setVisible(false);
    jPanel3.setVisible(true);
    }//GEN-LAST:event_jButton18ActionPerformed
    // Funcion al boton de Juan Viñas
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    ImageIcon img = new ImageIcon("Juan Viñas.png");
    jLabel4.setIcon(img);
    jPanel1.setVisible(false);
    jPanel3.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
     jPanel3.setVisible(false);
     jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton21ActionPerformed
    // Funcion al boton de Cachi
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    ImageIcon img = new ImageIcon("Cachi (1).png");
    jLabel4.setIcon(img);
    jPanel1.setVisible(false);
    jPanel3.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
    // Funcion al boton de Birrisito
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    ImageIcon img = new ImageIcon("Birrisito (1).png");
    jLabel4.setIcon(img);
    jPanel1.setVisible(false);
    jPanel3.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    // Funcion al boton de Turrialba
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
    ImageIcon img = new ImageIcon("Turrialba.png");
    jLabel4.setIcon(img);
    jPanel1.setVisible(false);
    jPanel3.setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed
    // Funcion al boton de Paraiso
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    ImageIcon img = new ImageIcon("Paraiso (1).png");
    jLabel4.setIcon(img);
    jPanel1.setVisible(false);
    jPanel3.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed
    // Funcion al boton de Orosi
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
    ImageIcon img = new ImageIcon("Orosi (1).png");
    jLabel4.setIcon(img);
    jPanel1.setVisible(false);
    jPanel3.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed
    // Funcion al boton de Cartago
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    ImageIcon img = new ImageIcon("CartagoC (1).png");
    jLabel4.setIcon(img);
    jPanel1.setVisible(false);
    jPanel3.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed
    // Funcion al boton de Cervantes
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    ImageIcon img = new ImageIcon("Cervantes (1).png");
    jLabel4.setIcon(img);
    jPanel1.setVisible(false);
    jPanel3.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed
    // Funcion al boton de Fundacion
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    ImageIcon img = new ImageIcon("Fundacion (1).png");
    jLabel4.setIcon(img);
    jPanel1.setVisible(false);
    jPanel3.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed
    //Funcion al boton de Oreamuno
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    ImageIcon img = new ImageIcon("Oreamuno (1).png");
    jLabel4.setIcon(img);
    jPanel1.setVisible(false);
    jPanel3.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed
    //Funcion al boton de Pitahaya
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
    ImageIcon img = new ImageIcon("Pitahaya (1).png");
    jLabel4.setIcon(img);
    jPanel1.setVisible(false);
    jPanel3.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed
    //Funcion al boton de Tejar
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
    ImageIcon img = new ImageIcon("Tejar (1).png");
    jLabel4.setIcon(img);
    jPanel1.setVisible(false);
    jPanel3.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed
    //Funcion al boton de Tierra blanca
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
    ImageIcon img = new ImageIcon("Tierra Blanca (1).png");
    jLabel4.setIcon(img);
    jPanel1.setVisible(false);
    jPanel3.setVisible(true); 
    }//GEN-LAST:event_jButton14ActionPerformed
    //Funcion al boton de Tres Rios
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
    ImageIcon img = new ImageIcon("Tres Rios (1).png");
    jLabel4.setIcon(img);
    jPanel1.setVisible(false);
    jPanel3.setVisible(true); 
    }//GEN-LAST:event_jButton15ActionPerformed
    // Boton Salir
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
     System.exit(0); // Salirse del programa desde el botòn 
    }//GEN-LAST:event_jButton17ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Mapa a = new Mapa();  
      a.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * clase principal de interfaz
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel VentanaInicial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
