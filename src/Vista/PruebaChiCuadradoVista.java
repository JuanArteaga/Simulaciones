/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Paneles.*;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class PruebaChiCuadradoVista extends javax.swing.JFrame {

    /**
     * Creates new form PruebaChiCuadradoVista
     */
    public int prueba = 3;

    public PruebaChiCuadradoVista() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("SIMULACIONES - NRC: 8092 \\ Prueba Chi Cuadrado");
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
        jComboBoxGenerador = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAceptacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxGrupos = new javax.swing.JComboBox<>();
        jDesktopPaneGeneradores = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonAceptada = new javax.swing.JRadioButton();
        jRadioButtonRechazada = new javax.swing.JRadioButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuInicio1 = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemGeneradorBasico = new javax.swing.JMenuItem();
        jMenuItemMidSquare = new javax.swing.JMenuItem();
        jMenuItemLineales = new javax.swing.JMenuItem();
        jMenuItemFibonacci = new javax.swing.JMenuItem();
        jMenuItemWichmannHill = new javax.swing.JMenuItem();
        jMenuItemLEcuyer = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemArea = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemVarianza = new javax.swing.JMenuItem();
        jMenuItemChiCuadrado = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrada"));

        jComboBoxGenerador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Generador Basico", "Congruencial Lineal", "Fibonacci","LEcuyer","MidSquare","Winchmann Hill"}));
        jComboBoxGenerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGeneradorActionPerformed(evt);
            }
        });

        jLabel1.setText("Generador a Probar");

        jLabel2.setText("Grado de aceptación");

        jLabel3.setText("%");

        jLabel5.setText("Grupos");

        jComboBoxGrupos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"}));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxGenerador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldAceptacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxGenerador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldAceptacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jDesktopPaneGeneradores.setBackground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout jDesktopPaneGeneradoresLayout = new javax.swing.GroupLayout(jDesktopPaneGeneradores);
        jDesktopPaneGeneradores.setLayout(jDesktopPaneGeneradoresLayout);
        jDesktopPaneGeneradoresLayout.setHorizontalGroup(
            jDesktopPaneGeneradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPaneGeneradoresLayout.setVerticalGroup(
            jDesktopPaneGeneradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado Prueba"));

        jLabel4.setText("Hipótesis Nula");

        jRadioButtonAceptada.setText("Aceptada");
        jRadioButtonAceptada.setEnabled(false);

        jRadioButtonRechazada.setText("Rechazada");
        jRadioButtonRechazada.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addComponent(jRadioButtonAceptada)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonRechazada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButtonAceptada)
                    .addComponent(jRadioButtonRechazada))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jMenu3.setText("Inicio");

        jMenuInicio1.setText("Volver a Inicio");
        jMenuInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInicio1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuInicio1);

        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuSalir);

        jMenuBar2.add(jMenu3);

        jMenu1.setText("Generadores");

        jMenuItemGeneradorBasico.setText("Generador Básico");
        jMenuItemGeneradorBasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGeneradorBasicoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemGeneradorBasico);

        jMenuItemMidSquare.setText("MidSquare");
        jMenuItemMidSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMidSquareActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemMidSquare);

        jMenuItemLineales.setText("Congruenciales Lineales");
        jMenuItemLineales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLinealesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemLineales);

        jMenuItemFibonacci.setText("Fibonacci");
        jMenuItemFibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFibonacciActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemFibonacci);

        jMenuItemWichmannHill.setText("Wichmann y Hill");
        jMenuItemWichmannHill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemWichmannHillActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemWichmannHill);

        jMenuItemLEcuyer.setText("L'Ecuyer");
        jMenuItemLEcuyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLEcuyerActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemLEcuyer);

        jMenuBar2.add(jMenu1);

        jMenu4.setText("Area Imagen");

        jMenuItemArea.setText("Area de una Imagen");
        jMenuItemArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAreaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemArea);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Pruebas");

        jMenuItem1.setText("Promedios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuItemVarianza.setText("Varianza");
        jMenuItemVarianza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVarianzaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemVarianza);

        jMenuItemChiCuadrado.setText("Chi Cuadrado");
        jMenuItemChiCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemChiCuadradoActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemChiCuadrado);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPaneGeneradores, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDesktopPaneGeneradores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInicio1ActionPerformed
        SimulacionesInicio SI = new SimulacionesInicio();
        this.setVisible(false);
        SI.setVisible(true);
    }//GEN-LAST:event_jMenuInicio1ActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jMenuItemGeneradorBasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGeneradorBasicoActionPerformed
        GeneradorBasicoVista GBV = new GeneradorBasicoVista();
        GBV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemGeneradorBasicoActionPerformed

    private void jMenuItemMidSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMidSquareActionPerformed
        MidSquareVista MS = new MidSquareVista();
        this.setVisible(false);
        MS.setVisible(true);
    }//GEN-LAST:event_jMenuItemMidSquareActionPerformed

    private void jMenuItemLinealesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLinealesActionPerformed
        CongruencialesLinealesVista CLV = new CongruencialesLinealesVista();
        this.setVisible(false);
        CLV.setVisible(true);
    }//GEN-LAST:event_jMenuItemLinealesActionPerformed

    private void jMenuItemFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFibonacciActionPerformed
        GeneradorFibonacci GF = new GeneradorFibonacci();
        this.setVisible(false);
        GF.setVisible(true);
    }//GEN-LAST:event_jMenuItemFibonacciActionPerformed

    private void jMenuItemWichmannHillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemWichmannHillActionPerformed
        WichmannHillVista WHV = new WichmannHillVista();
        this.setVisible(false);
        WHV.setVisible(true);
    }//GEN-LAST:event_jMenuItemWichmannHillActionPerformed

    private void jMenuItemLEcuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLEcuyerActionPerformed
        GeneradorLEcuyerVista GLE = new GeneradorLEcuyerVista();
        this.setVisible(false);
        GLE.setVisible(true);
    }//GEN-LAST:event_jMenuItemLEcuyerActionPerformed

    private void jMenuItemAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAreaActionPerformed
        AreaImagenVista AIV = new AreaImagenVista();
        this.setVisible(false);
        AIV.setVisible(true);
    }//GEN-LAST:event_jMenuItemAreaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        PruebaMediasVista PMV = new PruebaMediasVista();
        this.setVisible(false);
        PMV.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemVarianzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVarianzaActionPerformed
        PruebaVarianzaVista PVV = new PruebaVarianzaVista();
        this.setVisible(false);
        PVV.setVisible(true);
    }//GEN-LAST:event_jMenuItemVarianzaActionPerformed

    private void jComboBoxGeneradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGeneradorActionPerformed
        if (jTextFieldAceptacion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor de aceptacion");
        } else if (jComboBoxGrupos.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Escoja un número de grupos");            
        } else {
            switch (jComboBoxGenerador.getSelectedIndex()) {
                case 1:
                    this.jDesktopPaneGeneradores.removeAll();
                    this.jDesktopPaneGeneradores.repaint();
                    PanelGeneradorBasico PGB = new PanelGeneradorBasico(prueba);
                    this.jDesktopPaneGeneradores.add(PGB);
                    PGB.show();
                    break;
                case 2:
                    this.jDesktopPaneGeneradores.removeAll();
                    this.jDesktopPaneGeneradores.repaint();
                    PanelGeneradorCongruencialLineal PGCL = new PanelGeneradorCongruencialLineal(prueba);
                    this.jDesktopPaneGeneradores.add(PGCL);
                    PGCL.show();
                    break;
                case 3:
                    this.jDesktopPaneGeneradores.removeAll();
                    this.jDesktopPaneGeneradores.repaint();
                    PanelGeneradorFibonacci PGF = new PanelGeneradorFibonacci(prueba);
                    this.jDesktopPaneGeneradores.add(PGF);
                    PGF.show();
                    break;
                case 4:
                    this.jDesktopPaneGeneradores.removeAll();
                    this.jDesktopPaneGeneradores.repaint();
                    PanelGeneradorLEcuyer PGL = new PanelGeneradorLEcuyer(prueba);
                    this.jDesktopPaneGeneradores.add(PGL);
                    PGL.show();
                    break;
                case 5:
                    this.jDesktopPaneGeneradores.removeAll();
                    this.jDesktopPaneGeneradores.repaint();
                    PanelGeneradorMidSquare PGMS = new PanelGeneradorMidSquare(prueba);
                    this.jDesktopPaneGeneradores.add(PGMS);
                    PGMS.show();
                    break;
                case 6:
                    this.jDesktopPaneGeneradores.removeAll();
                    this.jDesktopPaneGeneradores.repaint();
                    PanelGeneradorWichmannHill PGWH = new PanelGeneradorWichmannHill(prueba);
                    this.jDesktopPaneGeneradores.add(PGWH);
                    PGWH.show();
                    break;
            }
        }
    }//GEN-LAST:event_jComboBoxGeneradorActionPerformed

    private void jMenuItemChiCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemChiCuadradoActionPerformed
        JOptionPane.showMessageDialog(null, "Usted ya se encuentra en esta ventana");
    }//GEN-LAST:event_jMenuItemChiCuadradoActionPerformed

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
            java.util.logging.Logger.getLogger(PruebaChiCuadradoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PruebaChiCuadradoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PruebaChiCuadradoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PruebaChiCuadradoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PruebaChiCuadradoVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxGenerador;
    public static javax.swing.JComboBox<String> jComboBoxGrupos;
    private javax.swing.JDesktopPane jDesktopPaneGeneradores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuInicio;
    private javax.swing.JMenuItem jMenuInicio1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemArea;
    private javax.swing.JMenuItem jMenuItemChiCuadrado;
    private javax.swing.JMenuItem jMenuItemFibonacci;
    private javax.swing.JMenuItem jMenuItemGeneradorBasico;
    private javax.swing.JMenuItem jMenuItemLEcuyer;
    private javax.swing.JMenuItem jMenuItemLineales;
    private javax.swing.JMenuItem jMenuItemMidSquare;
    private javax.swing.JMenuItem jMenuItemVarianza;
    private javax.swing.JMenuItem jMenuItemWichmannHill;
    private javax.swing.JMenuItem jMenuSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JRadioButton jRadioButtonAceptada;
    public static javax.swing.JRadioButton jRadioButtonRechazada;
    public static javax.swing.JTextField jTextFieldAceptacion;
    // End of variables declaration//GEN-END:variables
}
