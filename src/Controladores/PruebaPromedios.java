/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import TablasComparacion.TablaDistribucionNormal;
import Vista.PruebaMediasVista;

/**
 *
 * @author usuario
 */
public class PruebaPromedios {

    private double promedio;

    public PruebaPromedios() {
    }

    public void controlPrueba(double[] resultados) {
        hallarPromedio(resultados);
        if (realizarPrueba(resultados.length)) {
            PruebaMediasVista.jRadioButtonAceptada.setSelected(true);
            PruebaMediasVista.jRadioButtonRechazada.setSelected(false);
        } else {
            PruebaMediasVista.jRadioButtonRechazada.setSelected(true);
            PruebaMediasVista.jRadioButtonAceptada.setSelected(false);
        }
    }

    private void hallarPromedio(double[] resultados) {
        for (int i = 0; i < resultados.length; i++) {
            promedio += resultados[i];
        }
        promedio = promedio / resultados.length;
    }

    private boolean realizarPrueba(int n) {
        TablaDistribucionNormal.cargarTabla();
        double a = Double.parseDouble(PruebaMediasVista.jTextFieldAceptacion.getText()) / 100;
        a = (a / 2);
        double Z = TablaDistribucionNormal.retornarValor(a);
        double aux = 12 * n;
        double raiz = Math.sqrt(aux);
        double derecha = 1 / raiz;
        double limiteInferior = calcularLimite(1, Z, derecha);
        double limiteSuperior = calcularLimite(2, Z, derecha);
        if (limiteInferior < promedio && promedio < limiteSuperior) {
            return true;
        } else {
            return false;
        }
    }

    private double calcularLimite(int operacion, double Z, double raiz) {
        double resultado = 0.0;
        switch (operacion) {
            case 1:
                resultado = (0.5) - (Z * raiz);
                break;
            case 2:
                resultado = (0.5) + (Z * raiz);
                break;
        }
        return resultado;
    }
}
