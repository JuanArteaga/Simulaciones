/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Controladores.Fibonacci;
import Controladores.PruebaChiCuadrado;
import Controladores.PruebaPromedios;
import Controladores.PruebaVarianza;
import Vista.PruebaChiCuadradoVista;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class PanelGeneradorFibonacci extends javax.swing.JInternalFrame {

    /**
     * Creates new form PanelGeneradorFibonacci2
     */
    private int prueba;

    public PanelGeneradorFibonacci(int prueba) {
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
        jTextFieldNumero1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNumero2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldLimite = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldValorM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxOperacion = new javax.swing.JComboBox<>();
        jButtonEvaluar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Fibonacci");

        jLabel1.setText("Primer Termino");

        jLabel2.setText("Segundo Termino");

        jLabel3.setText("Números a Generar");

        jLabel4.setText("Valor M");

        jLabel5.setText("Operación a Realizar");

        jComboBoxOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Suma", "Resta", "Multiplicación"}));

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
                    .addComponent(jButtonEvaluar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldNumero1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldLimite, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNumero2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jTextFieldValorM))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldValorM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEvaluar)
                .addContainerGap(18, Short.MAX_VALUE))
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
                    Fibonacci F = new Fibonacci(Integer.parseInt(jTextFieldLimite.getText()), Integer.parseInt(jTextFieldValorM.getText()), jComboBoxOperacion.getSelectedIndex());
                    F.Control(Integer.parseInt(jTextFieldNumero1.getText()), Integer.parseInt(jTextFieldNumero2.getText()));
                    PruebaPromedios PP = new PruebaPromedios();
                    PP.controlPrueba(F.getResultados());
                    break;
                case 2:
                    F = new Fibonacci(Integer.parseInt(jTextFieldLimite.getText()), Integer.parseInt(jTextFieldValorM.getText()), jComboBoxOperacion.getSelectedIndex());
                    F.Control(Integer.parseInt(jTextFieldNumero1.getText()), Integer.parseInt(jTextFieldNumero2.getText()));
                    PruebaVarianza PV = new PruebaVarianza();
                    PV.controlVarianza(F.getResultados());
                    break;
                case 3:
                    F = new Fibonacci(Integer.parseInt(jTextFieldLimite.getText()), Integer.parseInt(jTextFieldValorM.getText()), jComboBoxOperacion.getSelectedIndex());
                    F.Control(Integer.parseInt(jTextFieldNumero1.getText()), Integer.parseInt(jTextFieldNumero2.getText()));
                    PruebaChiCuadrado PCC = new PruebaChiCuadrado(Integer.parseInt(PruebaChiCuadradoVista.jComboBoxGrupos.getSelectedItem().toString()));
                    PCC.control(F.getResultados());
                    break;
            }
        }
    }//GEN-LAST:event_jButtonEvaluarActionPerformed

    private boolean revisarCampos() {
        String cadena = "Por favor ingrese un dato en los siguientes campos:\n\n";
        int contador = 1;
        boolean check = true;
        if (jTextFieldNumero1.getText().trim().compareToIgnoreCase("") == 0) {
            cadena = cadena + contador + ". Primer Termino\n";
            contador++;
            check = false;
        }
        if (jTextFieldNumero2.getText().trim().compareToIgnoreCase("") == 0) {
            cadena = cadena + contador + ". Segundo Termino\n";
            contador++;
            check = false;
        }
        if (jTextFieldLimite.getText().trim().compareToIgnoreCase("") == 0) {
            cadena = cadena + contador + ". Números a Generar\n";
            contador++;
            check = false;
        }
        if (jTextFieldValorM.getText().trim().compareToIgnoreCase("") == 0) {
            cadena = cadena + contador + ". Valor M\n";
            contador++;
            check = false;
        }
        if (jComboBoxOperacion.getSelectedIndex() == 0) {
            cadena = cadena + contador + ". Operación a Realizar\n";
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
    private javax.swing.JComboBox<String> jComboBoxOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldLimite;
    private javax.swing.JTextField jTextFieldNumero1;
    private javax.swing.JTextField jTextFieldNumero2;
    private javax.swing.JTextField jTextFieldValorM;
    // End of variables declaration//GEN-END:variables
}
