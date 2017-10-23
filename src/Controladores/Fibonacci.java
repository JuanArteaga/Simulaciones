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
public class Fibonacci {

    private int[] serieFibonacci;
    private int valorM;
    private int operacionRealizar;
    private int limite;
    private double[] resultados;

    public Fibonacci(int limite, int valorM, int operacion) {
        this.limite = limite;
        serieFibonacci = new int[limite + 2];
        resultados = new double[limite];
        this.valorM = valorM;
        this.operacionRealizar = operacion;
    }

    public double[] getResultados() {
        return resultados;
    }

    public void setResultados(double[] resultados) {
        this.resultados = resultados;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int[] getSerieFibonacci() {
        return serieFibonacci;
    }

    public void setSerieFibonacci(int[] serieFibonacci) {
        this.serieFibonacci = serieFibonacci;
    }

    public int getValorM() {
        return valorM;
    }

    public void setValorM(int valorM) {
        this.valorM = valorM;
    }

    public int getOperacionRealizar() {
        return operacionRealizar;
    }

    public void setOperacionRealizar(int operacionRealizar) {
        this.operacionRealizar = operacionRealizar;
    }

    public void Control(int numero1, int numero2) {
        inicializarTerminos(numero1, numero2);
        serieFibonacci();
    }

    private void inicializarTerminos(int numero1, int numero2) {
        serieFibonacci[0] = numero1;
        serieFibonacci[1] = numero2;
        for (int i = 2; i < serieFibonacci.length; i++) {
            serieFibonacci[i] = 0;
            resultados[i - 2] = 0;
        }
    }

    private void serieFibonacci() {
        int contador = 0, auxiliar = 2;
        while (contador < limite) {
            switch (operacionRealizar) {
                case 1:
                    serieFibonacci[auxiliar] = (serieFibonacci[contador] + serieFibonacci[contador + 1]) % valorM;
                    resultados[contador] = hallarResultado(serieFibonacci[auxiliar], valorM);
                    break;
                case 2:
                    serieFibonacci[auxiliar] = (serieFibonacci[contador] - serieFibonacci[contador + 1]) % valorM;
                    resultados[contador] = hallarResultado(serieFibonacci[auxiliar], valorM);
                    break;
                case 3:
                    serieFibonacci[auxiliar] = (serieFibonacci[contador] * serieFibonacci[contador + 1]) % valorM;
                    resultados[contador] = hallarResultado(serieFibonacci[auxiliar], valorM);
                    break;
            }
            contador++;
            auxiliar++;
        }
    }

    private double hallarResultado(double valor, double mod) {
        return valor / mod;
    }

}
