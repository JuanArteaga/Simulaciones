/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controladores.GeneradorBasico;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class GeneradorBasicoVista extends javax.swing.JFrame {

    /**
     * Creates new form GeneradorBasicoVista
     */
    public GeneradorBasicoVista() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("SIMULACIONES - NRC: 8092 \\ Generador Básico");
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
        jLabel1 = new javax.swing.JLabel();
        jTextFieldSemilla = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldLimite = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldFuncionTransicion = new javax.swing.JTextField();
        jTextFieldFuncionSalida = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonEvaluar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResultados = new javax.swing.JTable();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entrada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel1.setText("Semilla");

        jLabel2.setText("Limite");

        jLabel3.setText("Función de transición");

        jLabel4.setText("Función de Salida");

        jButtonEvaluar.setText("Evaluar");
        jButtonEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEvaluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldFuncionSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSemilla, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldLimite, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFuncionTransicion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButtonEvaluar)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldSemilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFuncionTransicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFuncionSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jButtonEvaluar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTableResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Semilla", "Valor Aleatorio"
            }
        ));
        jScrollPane1.setViewportView(jTableResultados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEvaluarActionPerformed
        limpiarTabla();
        if (revisarCampos()) {
            int semilla = Integer.parseInt(jTextFieldSemilla.getText());
            int limite = Integer.parseInt(jTextFieldLimite.getText());
            String funcionTransicion = jTextFieldFuncionTransicion.getText();
            String funcionSalida = jTextFieldFuncionSalida.getText();
            GeneradorBasico GB = new GeneradorBasico(limite);
            GB.setEcuacionTransicion(funcionTransicion);
            GB.setEcuacionSalida(funcionSalida);
            GB.controlGeneradorBasico(semilla);
            DefaultTableModel modelo = (DefaultTableModel) jTableResultados.getModel();
            Object[] valores = new Object[modelo.getColumnCount()];
            DecimalFormat format = new DecimalFormat("#,###.####");
            for (int i = 0; i < GB.getSemillas().length - 1; i++) {
                try {
                    valores[0] = format.format(GB.getSemillas()[i]);
                    valores[1] = format.format(GB.getFuncionSalida()[i]);
                } catch (Exception e) {
                    valores[1] = 0;
                }
                modelo.addRow(valores);
            }
        }
    }//GEN-LAST:event_jButtonEvaluarActionPerformed

    private void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTableResultados.getModel();
        modelo.setRowCount(0);
    }


    private void jMenuItemGeneradorBasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGeneradorBasicoActionPerformed
        JOptionPane.showMessageDialog(null, "Usted ya se encuentra en esta ventana");
    }//GEN-LAST:event_jMenuItemGeneradorBasicoActionPerformed

    private void jMenuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInicioActionPerformed
        this.setVisible(false);
        SimulacionesInicio SI = new SimulacionesInicio();
        SI.setVisible(true);
    }//GEN-LAST:event_jMenuInicioActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirActionPerformed

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

    private void jMenuItemAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAreaActionPerformed
        AreaImagenVista AIV = new AreaImagenVista();
        this.setVisible(false);
        AIV.setVisible(true);
    }//GEN-LAST:event_jMenuItemAreaActionPerformed

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
        GeneradorLEcuyerVista GLE=new GeneradorLEcuyerVista();
        this.setVisible(false);
        GLE.setVisible(true);
    }//GEN-LAST:event_jMenuItemLEcuyerActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        PruebaMediasVista PMV=new PruebaMediasVista();
        this.setVisible(false);
        PMV.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemVarianzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVarianzaActionPerformed
        PruebaVarianzaVista PV=new PruebaVarianzaVista();
        this.setVisible(false);
        PV.setVisible(true);
    }//GEN-LAST:event_jMenuItemVarianzaActionPerformed

    private void jMenuItemChiCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemChiCuadradoActionPerformed
        PruebaChiCuadradoVista PCCV=new PruebaChiCuadradoVista();
        this.setVisible(false);
        PCCV.setVisible(true);
    }//GEN-LAST:event_jMenuItemChiCuadradoActionPerformed

    private boolean revisarCampos() {
        String cadena = "Por favor ingrese un dato en los siguientes campos:\n\n";
        int contador = 1;
        boolean check = true;
        if (jTextFieldSemilla.getText().trim().compareToIgnoreCase("") == 0) {
            cadena = cadena + contador + ". Semilla\n";
            contador++;
            check = false;
        }
        if (jTextFieldLimite.getText().trim().compareToIgnoreCase("") == 0) {
            cadena = cadena + contador + ". Limite\n";
            contador++;
            check = false;
        }
        if (jTextFieldFuncionTransicion.getText().trim().compareToIgnoreCase("") == 0) {
            cadena = cadena + contador + ". Función de Transicion\n";
            contador++;
            check = false;
        }
        if (jTextFieldFuncionSalida.getText().trim().compareToIgnoreCase("") == 0) {
            cadena = cadena + contador + ". Función de Salida\n";
            contador++;
            check = false;
        }
        if (cadena.compareToIgnoreCase("Por favor ingrese un dato en los siguientes campos:\n\n") != 0) {
            JOptionPane.showMessageDialog(null, cadena);
        }
        return check;
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
            java.util.logging.Logger.getLogger(GeneradorBasicoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneradorBasicoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneradorBasicoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneradorBasicoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneradorBasicoVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEvaluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuInicio;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableResultados;
    private javax.swing.JTextField jTextFieldFuncionSalida;
    private javax.swing.JTextField jTextFieldFuncionTransicion;
    private javax.swing.JTextField jTextFieldLimite;
    private javax.swing.JTextField jTextFieldSemilla;
    // End of variables declaration//GEN-END:variables
}
