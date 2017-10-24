/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import TablasComparacion.TablaKolmogorovSmirnov;
import Vista.PruebaKolmogorovSmirnovVista;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author usuario
 */
public class PruebaKolmogorovSmirnov {

    private final double[][] intervalos;
    private final double[] frecuenciaObservada;
    private final double[] frecuenciaObservadaAcumulada;
    private final double[] frecuenciaEsperada;
    private final double[] frecuenciaEsperadaAcumulada;
    private final double[] vectorD;
    private final int grupos;

    public PruebaKolmogorovSmirnov(int grupos) {
        intervalos = new double[2][grupos];
        frecuenciaObservada = new double[grupos];
        frecuenciaObservadaAcumulada = new double[grupos];
        frecuenciaEsperada = new double[grupos];
        frecuenciaEsperadaAcumulada = new double[grupos];
        vectorD = new double[grupos];
        this.grupos = grupos;
    }

    public void control(double[] resultados) {
        inicializarMatriz();
        ordenarVector(resultados);
        calcularIntervalos();
        contar(resultados);
        frecuenciaAcumulada(resultados);
        frecuenciaEsperada(resultados);
        vectorD();
        ordenarVector(vectorD);
        if (revizarTabla(resultados.length) > vectorD[vectorD.length - 1]) {
            PruebaKolmogorovSmirnovVista.jRadioButtonAceptada.setSelected(true);
            PruebaKolmogorovSmirnovVista.jRadioButtonRechazada.setSelected(false);

        }else{
            PruebaKolmogorovSmirnovVista.jRadioButtonAceptada.setSelected(true);
            PruebaKolmogorovSmirnovVista.jRadioButtonRechazada.setSelected(false);            
        }
    }

    private void inicializarMatriz() {
        for (int i = 0; i < intervalos.length; i++) {
            for (int j = 0; j < intervalos[0].length; j++) {
                intervalos[i][j] = 0.0;
            }
        }
    }

    private void ordenarVector(double[] resultados) {
        double aux;
        for (int i = 0; i < resultados.length; i++) {
            for (int j = i + 1; j < resultados.length; j++) {
                if (resultados[i] > resultados[j]) {
                    aux = resultados[i];
                    resultados[i] = resultados[j];
                    resultados[j] = aux;
                }
            }
        }
    }

    private void calcularIntervalos() {
        double intervalo = (1.0 / grupos);
        BigDecimal aux1 = new BigDecimal(intervalo);
        BigDecimal aux = new BigDecimal(0.0);
        aux1 = aux1.setScale(4, RoundingMode.HALF_UP);
        aux = aux.setScale(4, RoundingMode.HALF_UP);
        double auxiliar = 0, auxiliar1 = aux1.doubleValue();
        String inferior = aux.toString(), superior = aux1.toString();
        for (int j = 0; j < intervalos[0].length; j++) {
            for (int i = 0; i < intervalos.length; i++) {
                intervalos[i][j] = Double.parseDouble(inferior);
                i++;
                intervalos[i][j] = Double.parseDouble(superior);
            }
            auxiliar = auxiliar + intervalo;
            aux = new BigDecimal(auxiliar);
            auxiliar1 = auxiliar1 + intervalo;
            aux1 = new BigDecimal(auxiliar1);
            aux1 = aux1.setScale(4, RoundingMode.HALF_UP);
            aux = aux.setScale(4, RoundingMode.HALF_UP);
            inferior = aux.toString();
            superior = aux1.toString();
        }
    }

    private void contar(double[] resultados) {
        for (int i = 0; i < resultados.length; i++) {
            for (int j = 0; j < intervalos[0].length; j++) {
                if (intervalos[0][j] < resultados[i] && resultados[i] < intervalos[1][j]) {
                    frecuenciaObservada[j] = frecuenciaObservada[j] + 1;
                    j = intervalos[0].length;
                }
            }
        }
    }

    private void frecuenciaAcumulada(double[] resultados) {
        for (int i = 0; i < frecuenciaObservada.length; i++) {
            int j = 0;
            if (i == 0) {
                frecuenciaObservadaAcumulada[i] = frecuenciaObservada[i];
                frecuenciaObservadaAcumulada[i] = frecuenciaObservadaAcumulada[i] / resultados.length;
            } else {
                while (j <= i) {
                    frecuenciaObservadaAcumulada[i] = frecuenciaObservadaAcumulada[i] + frecuenciaObservada[j];
                    j++;
                }
                frecuenciaObservadaAcumulada[i] = frecuenciaObservadaAcumulada[i] / resultados.length;
            }
        }
    }

    private void frecuenciaEsperada(double[] resultados) {
        for (int i = 0; i < frecuenciaEsperada.length; i++) {
            frecuenciaEsperada[i] = resultados.length / grupos;
            int j = 0;
            if (i == 0) {
                frecuenciaEsperadaAcumulada[i] = frecuenciaEsperada[i];
                frecuenciaEsperadaAcumulada[i] = frecuenciaEsperadaAcumulada[i] / resultados.length;
            } else {
                while (j < i) {
                    frecuenciaEsperadaAcumulada[i] = frecuenciaEsperadaAcumulada[i] + frecuenciaEsperada[j];
                    j++;
                }
                frecuenciaEsperadaAcumulada[i] = frecuenciaEsperadaAcumulada[i] / resultados.length;
            }
        }
    }

    private void vectorD() {
        for (int i = 0; i < vectorD.length; i++) {
            vectorD[i] = frecuenciaObservadaAcumulada[i] - frecuenciaObservadaAcumulada[i];
            if (vectorD[i] < 0) {
                vectorD[i] = vectorD[i] * -1;
            }
        }
    }

    private double revizarTabla(int cantidad) {
        TablaKolmogorovSmirnov.cargarTabla();
        double valor;
        double alfa = Double.parseDouble(PruebaKolmogorovSmirnovVista.jTextFieldAceptacion.getText()) / 100;
        if (cantidad < 20) {
            alfa = cantidad + alfa;
            valor = TablaKolmogorovSmirnov.retornarValor(alfa);
        } else {
            valor = Math.sqrt(cantidad);
            switch (Double.toString(alfa)) {
                case "0.20":
                    valor = 1.07 / valor;
                    break;
                case "0.15":
                    valor = 1.14 / valor;
                    break;
                case "0.10":
                    valor = 1.22 / valor;
                    break;
                case "0.05":
                    valor = 1.36 / valor;
                    break;
                case "0.01":
                    valor = 1.63 / valor;
                    break;
            }
        }
        return valor;
    }
}
