/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Controladores.CongruencialesLineales;
import Controladores.PruebaPromedios;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class PanelGeneradorCongruencialLineal extends javax.swing.JInternalFrame {

    /**
     * Creates new form PanelGeneradorCongruencialLineal2
     */
    public PanelGeneradorCongruencialLineal() {
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
        jLabel1 = new javax.swing.JLabel();
        jTextFieldSemilla = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldLimite = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldValorA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldValorB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldValorM = new javax.swing.JTextField();
        jButtonEvaluar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Prueba Promedios - Congruencial Lineal");

        jLabel1.setText("Semilla");

        jLabel2.setText("Limite");

        jLabel3.setText("Valor a");

        jLabel4.setText("Valor b");

        jLabel5.setText("Valor m");

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
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldValorM, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldSemilla, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldValorA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldLimite)
                            .addComponent(jTextFieldValorB, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldSemilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldValorB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButtonEvaluar)
                .addContainerGap())
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
            int semilla = Integer.parseInt(jTextFieldSemilla.getText());
            int limite = Integer.parseInt(jTextFieldLimite.getText());
            int valorA = Integer.parseInt(jTextFieldValorA.getText());
            int valorB = Integer.parseInt(jTextFieldValorB.getText());
            int valorM = Integer.parseInt(jTextFieldValorM.getText());
            CongruencialesLineales CL = new CongruencialesLineales(semilla, limite, valorA, valorB, valorM);
            CL.Control();
            PruebaPromedios PP = new PruebaPromedios();
            PP.controlPrueba(CL.getResultados());
        }
    }//GEN-LAST:event_jButtonEvaluarActionPerformed
    
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
        if (jTextFieldValorA.getText().trim().compareToIgnoreCase("") == 0) {
            cadena = cadena + contador + ". ValorA\n";
            contador++;
            check = false;
        }
        if (jTextFieldValorB.getText().trim().compareToIgnoreCase("") == 0) {
            cadena = cadena + contador + ". ValorB\n";
            contador++;
            check = false;
        }
        if (jTextFieldValorM.getText().trim().compareToIgnoreCase("") == 0) {
            cadena = cadena + contador + ". ValorM\n";
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldLimite;
    private javax.swing.JTextField jTextFieldSemilla;
    private javax.swing.JTextField jTextFieldValorA;
    private javax.swing.JTextField jTextFieldValorB;
    private javax.swing.JTextField jTextFieldValorM;
    // End of variables declaration//GEN-END:variables
}
