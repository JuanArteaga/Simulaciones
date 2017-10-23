/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

/**
 *
 * @author usuario
 */
public class CongruencialesLineales {

    private int semilla;
    private int limite;
    private int valorA;
    private int valorB;
    private int valorM;
    private double[] semillas;
    private double[] resultados;

    public CongruencialesLineales(int semilla, int limite, int valorA, int valorB, int valorM) {
        this.semilla = semilla;
        this.limite = limite;
        this.valorA = valorA;
        this.valorB = valorB;
        this.valorM = valorM;
        resultados = new double[limite];
        semillas = new double[limite + 1];
    }

    public int getSemilla() {
        return semilla;
    }

    public void setSemilla(int semilla) {
        this.semilla = semilla;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getValorA() {
        return valorA;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

    public int getValorB() {
        return valorB;
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }

    public int getValorM() {
        return valorM;
    }

    public void setValorM(int valorM) {
        this.valorM = valorM;
    }

    public double[] getSemillas() {
        return semillas;
    }

    public void setSemillas(double[] semillas) {
        this.semillas = semillas;
    }

    public double[] getResultados() {
        return resultados;
    }

    public void setResultados(double[] resultados) {
        this.resultados = resultados;
    }

    public void Control() {
        inicializarVector();
        semillas[0] = semilla;
        generarNumeros();
    }

    private void inicializarVector() {
        for (int i = 0; i < resultados.length; i++) {
            resultados[i] = 0.0;
            semillas[i] = 0.0;
        }
    }

    private void generarNumeros() {
        int contador = 0, n = 1;
        double resultado;
        while (contador < limite) {
            resultado = valorA * semillas[contador];
            resultado = resultado + valorB;
            resultado = resultado % valorM;
            resultados[contador] = resultado / valorM;
            semillas[n] = resultado;
            contador++;
            n++;
        }
    }

}
