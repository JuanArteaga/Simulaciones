/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

/**
 *
 * @author Juan Arteaga
 */
public class GeneradorBasico {

    private double[] funcionEstado;
    private double[] funcionSalida;
    private double[] semillas;
    private int limiteGenerador;
    private String ecuacionTransicion;
    private String ecuacionSalida;

    public GeneradorBasico(int limite) {
        funcionEstado = new double[limite];
        funcionSalida = new double[limite];
        limiteGenerador = limite;
        semillas = new double[limite + 1];
    }

    public double[] getSemillas() {
        return semillas;
    }

    public void setSemillas(double[] semillas) {
        this.semillas = semillas;
    }

    public String getEcuacionTransicion() {
        return ecuacionTransicion;
    }

    public void setEcuacionTransicion(String ecuacionTransicion) {
        this.ecuacionTransicion = ecuacionTransicion;
    }

    public String getEcuacionSalida() {
        return ecuacionSalida;
    }

    public void setEcuacionSalida(String ecuacionSalida) {
        this.ecuacionSalida = ecuacionSalida;
    }

    public int getLimiteGenerador() {
        return limiteGenerador;
    }

    public void setLimiteGenerador(int limiteGenerador) {
        this.limiteGenerador = limiteGenerador;
    }

    public double[] getFuncionEstado() {
        return funcionEstado;
    }

    public void setFuncionEstado(double[] funcionEstado) {
        this.funcionEstado = funcionEstado;
    }

    public double[] getFuncionSalida() {
        return funcionSalida;
    }

    public void setFuncionSalida(double[] funcionSalida) {
        this.funcionSalida = funcionSalida;
    }

    public void controlGeneradorBasico(int semilla) {
        inicialiizarFunciones();
        semillas[0] = semilla;
        generadorBasico();
    }

    private void inicialiizarFunciones() {
        for (int i = 0; i < funcionEstado.length && i < funcionSalida.length; i++) {
            funcionEstado[i] = 0;
            funcionSalida[i] = 0;
            semillas[i] = 0;
        }
    }

    private void generadorBasico() {
        int n = 0;
        int contador = 0;
        while (n < limiteGenerador) {
            n++;
            funcionEstado[contador] = evaluarFunción(ecuacionTransicion, semillas[n - 1]);
            semillas[n] = funcionEstado[contador];
            funcionSalida[contador] = evaluarFunción(ecuacionSalida, semillas[n]);
            contador++;
        }
    }

    private Double evaluarFunción(String funcion, double semilla) {
        Expression e = new ExpressionBuilder(funcion).variable("x")
                .build().setVariable("x", semilla);
        double pivote = e.evaluate();
        return pivote;
    }
}
