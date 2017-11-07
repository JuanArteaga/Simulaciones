/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controladores.CalcularPi;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class CalcularPiVista extends javax.swing.JFrame {
    
    private final String rutaImagen = "src\\Imagen\\Circulo.png";
    
    public CalcularPiVista() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("SIMULACIONES - NRC: 8092 \\ Calculo de Pi");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image image = tk.createImage(rutaImagen);
        jLabelRuta.setIcon(new ImageIcon(image.getScaledInstance(jLabelRuta.getWidth(), jLabelRuta.getHeight(), Image.SCALE_AREA_AVERAGING)));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelResultadoOp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelTotalPuntos = new javax.swing.JLabel();
        jLabelPuntosNegro = new javax.swing.JLabel();
        jLabelPuntosBlanco = new javax.swing.JLabel();
        jLabelPi = new javax.swing.JLabel();
        jLabelPiEstimado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelResultado = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelResultadoOp = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelRuta = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNumeros = new javax.swing.JTextField();
        jButtonCalcularPi = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuInicio = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemGeneradorBasico = new javax.swing.JMenuItem();
        jMenuItemMidSquare = new javax.swing.JMenuItem();
        jMenuItemLineales = new javax.swing.JMenuItem();
        jMenuItemFibonacci = new javax.swing.JMenuItem();
        jMenuItemWichmannHill = new javax.swing.JMenuItem();
        jMenuItemLEcuyer = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemArea = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemVarianza = new javax.swing.JMenuItem();
        jMenuItemChiCuadrado = new javax.swing.JMenuItem();
        jMenuItemKolmogorov = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItemCalcularPi1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelResultadoOp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanelResultadoOp.setPreferredSize(new java.awt.Dimension(250, 250));

        jLabel1.setText("Pi");

        jLabel3.setText("Total Puntos");

        jLabel4.setText("Puntos en Negro");

        jLabel5.setText("Puntos en Blanco");

        jLabel6.setText("Pi Estimado");

        jLabelTotalPuntos.setText("0");

        jLabelPuntosNegro.setText("0");

        jLabelPuntosBlanco.setText("0");

        jLabelPi.setText("0");

        jLabelPiEstimado.setText("0");

        jLabel2.setText("Resultado");

        javax.swing.GroupLayout jPanelResultadoLayout = new javax.swing.GroupLayout(jPanelResultado);
        jPanelResultado.setLayout(jPanelResultadoLayout);
        jPanelResultadoLayout.setHorizontalGroup(
            jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanelResultadoLayout.setVerticalGroup(
            jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jLabel8.setText("Radio");

        jLabel9.setText("1 cm");

        jLabel10.setText("Valor Pi - Pi Estimado");

        jLabelResultadoOp.setText("0");

        javax.swing.GroupLayout jPanelResultadoOpLayout = new javax.swing.GroupLayout(jPanelResultadoOp);
        jPanelResultadoOp.setLayout(jPanelResultadoOpLayout);
        jPanelResultadoOpLayout.setHorizontalGroup(
            jPanelResultadoOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultadoOpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelResultadoOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(jPanelResultadoOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTotalPuntos)
                    .addComponent(jLabelPuntosNegro)
                    .addComponent(jLabelPuntosBlanco)
                    .addComponent(jLabelPi)
                    .addComponent(jPanelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(jPanelResultadoOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelResultadoOp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPiEstimado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        jPanelResultadoOpLayout.setVerticalGroup(
            jPanelResultadoOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultadoOpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelResultadoOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(19, 19, 19)
                .addGroup(jPanelResultadoOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelTotalPuntos))
                .addGap(18, 18, 18)
                .addGroup(jPanelResultadoOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelPuntosNegro))
                .addGap(18, 18, 18)
                .addGroup(jPanelResultadoOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelPuntosBlanco))
                .addGap(18, 18, 18)
                .addGroup(jPanelResultadoOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelPi))
                .addGap(18, 18, 18)
                .addGroup(jPanelResultadoOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabelPiEstimado))
                .addGap(18, 18, 18)
                .addGroup(jPanelResultadoOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabelResultadoOp))
                .addGap(15, 15, 15)
                .addGroup(jPanelResultadoOpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "1/4 Circulo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 250));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRuta, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRuta, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setText("# Puntos Aleatorios");

        jButtonCalcularPi.setText("Calcular");
        jButtonCalcularPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularPiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonCalcularPi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButtonCalcularPi)
                .addContainerGap())
        );

        jMenu2.setText("Inicio");

        jMenuInicio.setText("Volver a Inicio");
        jMenuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInicioActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuInicio);

        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuSalir);

        jMenuBar1.add(jMenu2);

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

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Area Imagen");

        jMenuItemArea.setText("Area de una Imagen");
        jMenuItemArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAreaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemArea);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Pruebas");

        jMenuItem1.setText("Promedios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItemVarianza.setText("Varianza");
        jMenuItemVarianza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVarianzaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemVarianza);

        jMenuItemChiCuadrado.setText("Chi  Cuadrado");
        jMenuItemChiCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemChiCuadradoActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemChiCuadrado);

        jMenuItemKolmogorov.setText("Kolmogorov Smirnov");
        jMenuItemKolmogorov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemKolmogorovActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemKolmogorov);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Calcular PI");

        jMenuItemCalcularPi1.setText("Calcular Pi");
        jMenuItemCalcularPi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCalcularPi1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemCalcularPi1);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelResultadoOp, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelResultadoOp, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInicioActionPerformed
        this.setVisible(false);
        SimulacionesInicio SI = new SimulacionesInicio();
        SI.setVisible(true);
    }//GEN-LAST:event_jMenuInicioActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jMenuItemGeneradorBasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGeneradorBasicoActionPerformed
        GeneradorBasicoVista GBV = new GeneradorBasicoVista();
        this.setVisible(false);
        GBV.setVisible(true);
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
        PruebaVarianzaVista PV = new PruebaVarianzaVista();
        this.setVisible(false);
        PV.setVisible(true);
    }//GEN-LAST:event_jMenuItemVarianzaActionPerformed

    private void jMenuItemChiCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemChiCuadradoActionPerformed
        PruebaChiCuadradoVista PCCV = new PruebaChiCuadradoVista();
        this.setVisible(false);
        PCCV.setVisible(true);
    }//GEN-LAST:event_jMenuItemChiCuadradoActionPerformed

    private void jMenuItemKolmogorovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemKolmogorovActionPerformed
        PruebaKolmogorovSmirnovVista PKSV = new PruebaKolmogorovSmirnovVista();
        this.setVisible(false);
        PKSV.setVisible(true);
    }//GEN-LAST:event_jMenuItemKolmogorovActionPerformed

    private void jButtonCalcularPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularPiActionPerformed
        if (jTextFieldNumeros.getText().compareToIgnoreCase("") != 0) {
            try {
                DecimalFormat format = new DecimalFormat("#.##########");
                InputStream imagen = new FileInputStream(rutaImagen);
                CalcularPi CP = new CalcularPi(imagen, Integer.parseInt(jTextFieldNumeros.getText()));
                CP.Control();
                jLabelTotalPuntos.setText(jTextFieldNumeros.getText());
                jLabelPuntosBlanco.setText(Integer.toString(CP.getPuntosBlanco()));
                jLabelPuntosNegro.setText(Integer.toString(CP.getPuntosNegro()));
                jLabelPi.setText(format.format(Math.PI));
                double PiEstimado = CP.getPiEstimado();
                jLabelPiEstimado.setText(format.format(PiEstimado));
                double resultado = Math.abs(Math.PI - PiEstimado);
                jLabelResultadoOp.setText(format.format(resultado));
                if (resultado <= 0.1) {
                    jPanelResultado.setBackground(Color.GREEN);
                } else {
                    jPanelResultado.setBackground(Color.RED);
                }
            } catch (Exception e) {
                String mensaje = e.getMessage();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor ingrese el número de puntos a generar");
        }
    }//GEN-LAST:event_jButtonCalcularPiActionPerformed

    private void jMenuItemCalcularPi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCalcularPi1ActionPerformed
        JOptionPane.showMessageDialog(this, "Usted ya se encuentra en esta ventana");
    }//GEN-LAST:event_jMenuItemCalcularPi1ActionPerformed

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
            java.util.logging.Logger.getLogger(CalcularPiVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcularPiVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcularPiVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcularPiVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcularPiVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcularPi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPi;
    private javax.swing.JLabel jLabelPiEstimado;
    private javax.swing.JLabel jLabelPuntosBlanco;
    private javax.swing.JLabel jLabelPuntosNegro;
    private javax.swing.JLabel jLabelResultadoOp;
    private javax.swing.JLabel jLabelRuta;
    private javax.swing.JLabel jLabelTotalPuntos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuInicio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemArea;
    private javax.swing.JMenuItem jMenuItemCalcularPi;
    private javax.swing.JMenuItem jMenuItemCalcularPi1;
    private javax.swing.JMenuItem jMenuItemChiCuadrado;
    private javax.swing.JMenuItem jMenuItemFibonacci;
    private javax.swing.JMenuItem jMenuItemGeneradorBasico;
    private javax.swing.JMenuItem jMenuItemKolmogorov;
    private javax.swing.JMenuItem jMenuItemLEcuyer;
    private javax.swing.JMenuItem jMenuItemLineales;
    private javax.swing.JMenuItem jMenuItemMidSquare;
    private javax.swing.JMenuItem jMenuItemVarianza;
    private javax.swing.JMenuItem jMenuItemWichmannHill;
    private javax.swing.JMenuItem jMenuSalir;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelResultado;
    private javax.swing.JPanel jPanelResultadoOp;
    private javax.swing.JTextField jTextFieldNumeros;
    // End of variables declaration//GEN-END:variables
}
