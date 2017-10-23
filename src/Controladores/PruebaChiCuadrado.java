/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vista.PruebaChiCuadradoVista;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author usuario
 */
public class PruebaChiCuadrado {

    private final double[][] intervalos;
    private final int[] frecuenciaObservada;
    private final double[] frecuenciaEsperada;
    private final int grupos;

    public PruebaChiCuadrado(int grupos) {
        intervalos = new double[2][grupos];
        frecuenciaObservada = new int[grupos];
        frecuenciaEsperada = new double[grupos];
        this.grupos = grupos;
    }

    public void control(double[] resultados) {
        inicializarMatriz();
        inicializarVector(resultados.length);
        calcularIntervalos();
        contar(resultados);
        if (calcularChiCuadrado() < revisarChiCuadrado(intervalos[0].length)) {
            PruebaChiCuadradoVista.jRadioButtonAceptada.setSelected(true);
            PruebaChiCuadradoVista.jRadioButtonRechazada.setSelected(false);
        } else {
            PruebaChiCuadradoVista.jRadioButtonRechazada.setSelected(true);
            PruebaChiCuadradoVista.jRadioButtonAceptada.setSelected(false);
        }
    }

    private void inicializarMatriz() {
        for (int i = 0; i < intervalos.length; i++) {
            for (int j = 0; j < intervalos[0].length; j++) {
                intervalos[i][j] = 0.0;
            }
        }
    }

    private void inicializarVector(double numeros) {
        for (int i = 0; i < frecuenciaObservada.length; i++) {
            frecuenciaObservada[i] = 0;
        }
        double aux = numeros / grupos;
        for (int i = 0; i < frecuenciaEsperada.length; i++) {
            frecuenciaEsperada[i] = aux;
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
                double aux = intervalos[0][j];
                double aux1 = intervalos[1][j];
                if (intervalos[0][j] < resultados[i] && resultados[i] < intervalos[1][j]) {
                    frecuenciaObservada[j] = frecuenciaObservada[j] + 1;
                    j = intervalos[0].length;
                }
            }
        }
    }

    private double calcularChiCuadrado() {
        double aux, total = 0.0;
        for (int i = 0; i < frecuenciaEsperada.length; i++) {
            aux = frecuenciaEsperada[i] - frecuenciaObservada[i];
            aux = Math.pow(aux, aux);
            aux = aux / frecuenciaEsperada[i];
            total = total+aux;
        }
        return total;
    }

    private double revisarChiCuadrado(int cantidad) {
        TablasComparacion.TablaChiCuadrado.cargarTabla();
        double alfa = Double.parseDouble(PruebaChiCuadradoVista.jTextFieldAceptacion.getText()) / 100;
        cantidad = cantidad - 1;
        String valor = "" + alfa;
        valor = valor.replace('.', 'z');
        valor = valor.replaceAll("z", "");
        valor = cantidad + "." + valor;
        return TablasComparacion.TablaChiCuadrado.retornarValor(Double.parseDouble(valor));
    }
}
