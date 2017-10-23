/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Controladores.PruebaPromedios;
import Controladores.PruebaVarianza;
import Controladores.WichmannHill;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class PanelGeneradorWichmannHill extends javax.swing.JInternalFrame {

    /**
     * Creates new form PanelGeneradorWichmannHill2
     */
    private int prueba;

    public PanelGeneradorWichmannHill(int prueba) {
        initComponents();
        this.prueba = prueba;
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
        jTextFieldValorX = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldValorY = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldValorZ = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldLimite = new javax.swing.JTextField();
        jButtonEvaluar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Prueba Promedio - WichmannHill");

        jLabel1.setText("Valor de X");

        jLabel2.setText("Valor de Y");

        jLabel3.setText("Valor de Z");

        jLabel4.setText("Limite");

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEvaluar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldValorX))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldValorY, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldValorZ, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(39, 39, 39)
                                .addComponent(jTextFieldLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldValorZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldValorX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldValorY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEvaluar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEvaluarActionPerformed
        if (revisarCampos()) {
            switch (prueba) {
                case 1:
                    int semillaX = Integer.parseInt(jTextFieldValorX.getText());
                    int semillaY = Integer.parseInt(jTextFieldValorY.getText());
                    int semillaZ = Integer.parseInt(jTextFieldValorZ.getText());
                    int limite = Integer.parseInt(jTextFieldLimite.getText());
                    WichmannHill WH = new WichmannHill(semillaX, semillaY, semillaZ, limite);
                    WH.Control();
                    PruebaPromedios PP = new PruebaPromedios();
                    PP.controlPrueba(WH.getResultados());
                    break;
                case 2:
                    semillaX = Integer.parseInt(jTextFieldValorX.getText());
                    semillaY = Integer.parseInt(jTextFieldValorY.getText());
                    semillaZ = Integer.parseInt(jTextFieldValorZ.getText());
                    limite = Integer.parseInt(jTextFieldLimite.getText());
                    WH = new WichmannHill(semillaX, semillaY, semillaZ, limite);
                    WH.Control();
                    PruebaVarianza PV = new PruebaVarianza();
                    PV.controlVarianza(WH.getResultados());
                    break;
            }
        }
    }//GEN-LAST:event_jButtonEvaluarActionPerformed

    private boolean revisarCampos() {
        String cadena = "Por favor ingrese un dato en los siguientes campos:\n\n";
        int contador = 1;
        boolean check = true;
        if (jTextFieldValorX.getText().trim().compareToIgnoreCase("") == 0) {
            cadena = cadena + contador + ". Valor de X\n";
            contador++;
            check = false;
        }
        if (jTextFieldValorY.getText().trim().compareToIgnoreCase("") == 0) {
            cadena = cadena + contador + ". Valor de Y\n";
            contador++;
            check = false;
        }
        if (jTextFieldValorZ.getText().trim().compareToIgnoreCase("") == 0) {
            cadena = cadena + contador + ". Valor de Z\n";
            contador++;
            check = false;
        }
        if (jTextFieldLimite.getText().trim().compareToIgnoreCase("") == 0) {
            cadena = cadena + contador + ". Limite\n";
            contador++;
            check = false;
        }
        if (cadena.compareToIgnoreCase("Por favor ingrese un dato en los siguientes campos:\n\n") != 0) {
            JOptionPane.showMessageDialog(null, cadena);
        }
        return check;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEvaluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldLimite;
    private javax.swing.JTextField jTextFieldValorX;
    private javax.swing.JTextField jTextFieldValorY;
    private javax.swing.JTextField jTextFieldValorZ;
    // End of variables declaration//GEN-END:variables
}
