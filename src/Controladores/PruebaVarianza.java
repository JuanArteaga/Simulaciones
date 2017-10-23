/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vista.PruebaVarianzaVista;
import org.apache.commons.math3.distribution.ChiSquaredDistribution;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 *
 * @author usuario
 */
public class PruebaVarianza {

    private ChiSquaredDistribution chi;
    private DescriptiveStatistics estadistica;

    public PruebaVarianza() {

    }

    public void controlVarianza(double[] resultados) {
        chi = new ChiSquaredDistribution(resultados.length - 1);
        estadistica = new DescriptiveStatistics();
        cargarVarianza(resultados);
        double varianza = estadistica.getVariance();
        double limiteInferior = calcularLimite(1, Double.parseDouble(PruebaVarianzaVista.jTextFieldAceptacion.getText()), resultados.length - 1);
        double limiteSuperior = calcularLimite(2, Double.parseDouble(PruebaVarianzaVista.jTextFieldAceptacion.getText()), resultados.length - 1);
        if (limiteInferior < varianza && varianza < limiteSuperior) {
            PruebaVarianzaVista.jRadioButtonAceptada.setSelected(true);
            PruebaVarianzaVista.jRadioButtonRechazada.setSelected(false);
        } else {
            PruebaVarianzaVista.jRadioButtonAceptada.setSelected(false);
            PruebaVarianzaVista.jRadioButtonRechazada.setSelected(true);
        }
    }

    private void cargarVarianza(double[] resultados) {
        for (int i = 0; i < resultados.length; i++) {
            estadistica.addValue(resultados[i]);
        }
    }

    private double calcularLimite(int operacion, double alfa, double grados) {
        double resultado = 0.0;
        double a = alfa / 100;
        switch (operacion) {
            case 1:
                resultado = chi.inverseCumulativeProbability(a / 2) / (12 * grados);
                break;
            case 2:
                resultado = chi.inverseCumulativeProbability(1 - a / 2) / (12 * grados);
                break;
        }
        return resultado;
    }

}
