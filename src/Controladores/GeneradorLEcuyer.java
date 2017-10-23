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
public class GeneradorLEcuyer {

    private int semillaX;
    private int semillaY;
    private int limite;
    private double[] semillasX;
    private double[] semillasY;
    private double[] semillasZ;
    private double[] resultados;

    public GeneradorLEcuyer(int semillaX, int semillaY, int limite) {
        this.semillaX = semillaX;
        this.semillaY = semillaY;
        this.limite = limite;
        resultados = new double[limite];
        semillasX = new double[limite + 1];
        semillasY = new double[limite + 1];
        semillasZ = new double[limite];
    }

    public int getSemillaX() {
        return semillaX;
    }

    public void setSemillaX(int semillaX) {
        this.semillaX = semillaX;
    }

    public int getSemillaY() {
        return semillaY;
    }

    public void setSemillaY(int semillaY) {
        this.semillaY = semillaY;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public double[] getSemillasX() {
        return semillasX;
    }

    public void setSemillasX(double[] semillasX) {
        this.semillasX = semillasX;
    }

    public double[] getSemillasY() {
        return semillasY;
    }

    public void setSemillasY(double[] semillasY) {
        this.semillasY = semillasY;
    }

    public double[] getSemillasZ() {
        return semillasZ;
    }

    public void setSemillasZ(double[] semillasZ) {
        this.semillasZ = semillasZ;
    }

    public double[] getResultados() {
        return resultados;
    }

    public void setResultados(double[] resultados) {
        this.resultados = resultados;
    }

    public void Control() {
        inicializarVectores();
        semillasX[0] = semillaX;
        semillasY[0] = semillaY;
        int contador = 1;
        int i = 0;
        while (i < limite) {
            semillasX[contador] = generarSemillas("40014", "2147483563", semillasX[i]);
            semillasY[contador] = generarSemillas("40692", "2147483399", semillasY[i]);
            semillasZ[i] = generarZ(semillasX[contador], semillasY[contador]);
            resultados[i] = generarNumeros(semillasZ[i]);
            contador++;
            i++;
        }

    }

    private void inicializarVectores() {
        for (int i = 0; i < resultados.length; i++) {
            resultados[i] = 0.0;
            semillasX[i] = 0.0;
            semillasY[i] = 0.0;
            semillasZ[i] = 0.0;
        }
    }

    private double generarSemillas(String multi, String mod, double semilla) {
        double resultado = 0.0, aux = 0.0;
        double modX = 2147483563, modY = 2147483399;
        switch (multi) {
            case "40014":
                aux = semilla * 40014;
                break;
            case "40692":
                aux = semilla * 40692;
                break;
        }
        switch (mod) {
            case "2147483563":
                resultado = aux % modX;
                break;
            case "2147483399":
                resultado = aux % modY;
                break;
        }
        return resultado;
    }

    private double generarZ(double X, double Y) {
        double resultado = (X - Y);
        if (resultado < 0) {
            resultado = resultado * -1;
        }
        resultado = resultado % 2147483562;
        return resultado;
    }

    private double generarNumeros(double Z) {
        double resultado = 0.0;
        long modX = 2147483563, modZ = 2147483562;
        if (Z > 0) {
            resultado = Z / modX;
        } else if (Z == 0) {
            resultado = modZ / modX;
        }
        return resultado;
    }

}
