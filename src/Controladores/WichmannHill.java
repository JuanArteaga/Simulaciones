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
public class WichmannHill {

    private int semillaX;
    private int semillaY;
    private int semillaZ;
    private int limite;
    private double[] semillasX;
    private double[] semillasY;
    private double[] semillasZ;
    private double[] resultados;

    public WichmannHill(int X, int Y, int Z, int limite) {
        this.semillaX = X;
        this.semillaY = Y;
        this.semillaZ = Z;
        semillasX = new double[limite + 1];
        semillasY = new double[limite + 1];
        semillasZ = new double[limite + 1];
        resultados = new double[limite];
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

    public int getSemillaZ() {
        return semillaZ;
    }

    public void setSemillaZ(int semillaZ) {
        this.semillaZ = semillaZ;
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
        inicializarVector();
        semillasX[0] = semillaX;
        semillasY[0] = semillaY;
        semillasZ[0] = semillaZ;
        int semillas = 1;
        double resultado;
        int i = 0;
        while (i < limite) {
            semillasX[semillas] = generarNumeros("171", "30269", semillas);
            resultado = semillasX[semillas] / 30269;
            semillasY[semillas] = generarNumeros("172", "30307", semillas);
            resultado = resultado + (semillasY[semillas] / 30307);
            semillasZ[semillas] = generarNumeros("170", "30323", semillas);
            resultado = resultado + (semillasZ[semillas] / 30323);
            resultados[i] = resultado % 1;
            semillas++;
            i++;
        }
    }

    private void inicializarVector() {
        for (int i = 0; i < resultados.length; i++) {
            resultados[i] = 0.0;
            semillasX[i] = 0.0;
            semillasY[i] = 0.0;
            semillasZ[i] = 0.0;
        }
    }

    private double generarNumeros(String multi, String mod, double semilla) {
        double resultado = 0.0;
        switch (multi) {
            case "170":
                resultado = semilla * 170;
                break;
            case "171":
                resultado = semilla * 171;
                break;
            case "172":
                resultado = semilla * 172;
                break;
        }
        switch (mod) {
            case "30269":
                resultado = resultado % 30269;
                break;
            case "30307":
                resultado = resultado % 30307;
                break;
            case "30323":
                resultado = resultado % 30323;
                break;
        }
        return resultado;
    }
}
