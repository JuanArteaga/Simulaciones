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
public class MidSquare {

    private String semilla;
    private int limite;
    private String[] resultados;
    private String[] semillas;

    public MidSquare(int limite) {
        this.limite = limite;
        resultados = new String[limite];
        semillas = new String[limite + 1];
    }

    public String[] getSemillas() {
        return semillas;
    }

    public void setSemillas(String[] semillas) {
        this.semillas = semillas;
    }

    public String getSemilla() {
        return semilla;
    }

    public void setSemilla(String semilla) {
        this.semilla = semilla;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public String[] getResultados() {
        return resultados;
    }

    public void setResultados(String[] resultados) {
        this.resultados = resultados;
    }

    public void control() {
        inicializarVector();
        semillas[0] = semilla;
        generarNumeros();
    }

    private void inicializarVector() {
        for (int i = 0; i < resultados.length; i++) {
            resultados[i] = "";
            semillas[i] = "";
        }
    }

    private void generarNumeros() {
        int contador = 0, n = 1;
        long valor, aux;
        String resultado;
        while (contador < limite) {
            aux = Long.parseLong(semillas[contador]);
            valor = (aux * aux);
            resultado = Long.toString(valor);
            if (resultado.length() % 2 != 0) {
                resultado = "0" + resultado;
                semillas[n] = encontrarMitad(resultado);
            } else {
                semillas[n] = encontrarMitad(resultado);
            }
            resultados[contador] = "0," + semillas[n];
            contador++;
            n++;
        }
    }

    private String encontrarMitad(String valor) {
        int i = (valor.length() / 4);
        return valor.substring(i, valor.length() - i);
    }

}
