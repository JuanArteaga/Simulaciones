/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Controladores.MidSquare;
import Controladores.PruebaChiCuadrado;
import Controladores.PruebaKolmogorovSmirnov;
import Controladores.PruebaPromedios;
import Controladores.PruebaVarianza;
import Vista.PruebaChiCuadradoVista;
import Vista.PruebaKolmogorovSmirnovVista;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class PanelGeneradorMidSquare extends javax.swing.JInternalFrame {

    private double[] resultados;
    private int prueba;

    /**
     * Creates new form PanelGeneradorMidSquare2
     */
    public PanelGeneradorMidSquare(int prueba) {
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
        jTextFieldSemilla = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldLimite = new javax.swing.JTextField();
        jButtonEvaluar = new javax.swing.JButton();

        setClosable(true);
        setTitle("MidSquare");

        jLabel1.setText("Semilla");

        jLabel2.setText("Limite");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldSemilla, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldLimite, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(116, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEvaluar)
                .addContainerGap(15, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEvaluarActionPerformed
        if (revisarCampos()) {
            switch (prueba) {
                case 1:
                    MidSquare MSC = new MidSquare(Integer.parseInt(jTextFieldLimite.getText()));
                    if (jTextFieldSemilla.getText().length() % 2 == 0) {
                        MSC.setSemilla(jTextFieldSemilla.getText());
                        PruebaPromedios PP = new PruebaPromedios();
                        MSC.control();
                        convertirResultados(MSC.getResultados());
                        PP.controlPrueba(resultados);
                    } else {
                        JOptionPane.showMessageDialog(null, "Corriga el valor de la semilla para que sea un valor par");
                    }
                    break;
                case 2:
                    MSC = new MidSquare(Integer.parseInt(jTextFieldLimite.getText()));
                    if (jTextFieldSemilla.getText().length() % 2 == 0) {
                        MSC.setSemilla(jTextFieldSemilla.getText());
                        PruebaVarianza PV = new PruebaVarianza();
                        MSC.control();
                        convertirResultados(MSC.getResultados());
                        PV.controlVarianza(resultados);
                    } else {
                        JOptionPane.showMessageDialog(null, "Corriga el valor de la semilla para que sea un valor par");
                    }
                    break;
                case 3:
                    MSC = new MidSquare(Integer.parseInt(jTextFieldLimite.getText()));
                    if (jTextFieldSemilla.getText().length() % 2 == 0) {
                        MSC.setSemilla(jTextFieldSemilla.getText());
                        PruebaChiCuadrado PCC = new PruebaChiCuadrado(Integer.parseInt(PruebaChiCuadradoVista.jComboBoxGrupos.getSelectedItem().toString()));
                        MSC.control();
                        convertirResultados(MSC.getResultados());
                        PCC.control(resultados);
                    } else {
                        JOptionPane.showMessageDialog(null, "Corriga el valor de la semilla para que sea un valor par");
                    }
                    break;
                case 4:
                    MSC = new MidSquare(Integer.parseInt(jTextFieldLimite.getText()));
                    if (jTextFieldSemilla.getText().length() % 2 == 0) {
                        MSC.setSemilla(jTextFieldSemilla.getText());
                        PruebaKolmogorovSmirnov PKS = new PruebaKolmogorovSmirnov(Integer.parseInt(PruebaKolmogorovSmirnovVista.jComboBoxGrupos.getSelectedItem().toString()));
                        MSC.control();
                        convertirResultados(MSC.getResultados());
                        PKS.control(resultados);
                    } else {
                        JOptionPane.showMessageDialog(null, "Corriga el valor de la semilla para que sea un valor par");
                    }
                    break;
            }
        }
    }//GEN-LAST:event_jButtonEvaluarActionPerformed

    private void convertirResultados(String[] valores) {
        resultados = new double[valores.length];
        String valore;
        for (int i = 0; i < valores.length; i++) {
            valore = valores[i];
            valore = valore.replaceAll(",", ".");
            resultados[i] = Double.parseDouble(valore);
        }
    }

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
        if (cadena.compareToIgnoreCase("Por favor ingrese un dato en los siguientes campos:\n\n") != 0) {
            JOptionPane.showMessageDialog(null, cadena);
        }
        return check;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEvaluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldLimite;
    private javax.swing.JTextField jTextFieldSemilla;
    // End of variables declaration//GEN-END:variables
}
