/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author usuario
 */
public class AreaImagen {

    private InputStream imagen;
    private int areaTotal;
    private double areaEnNegro;
    private String[][] puntosAleatorios;
    private int cantidadPuntos;
    private ImageInputStream imagenInput;
    private BufferedImage imagenL;
    private int puntosBlanco;
    private int puntosNegro;

    public AreaImagen(InputStream imagen, int puntos) {
        this.imagen = imagen;
        this.cantidadPuntos = puntos;
    }

    public int getPuntosBlanco() {
        return puntosBlanco;
    }

    public void setPuntosBlanco(int puntosBlanco) {
        this.puntosBlanco = puntosBlanco;
    }

    public int getPuntosNegro() {
        return puntosNegro;
    }

    public void setPuntosNegro(int puntosNegro) {
        this.puntosNegro = puntosNegro;
    }

    public int getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(int areaTotal) {
        this.areaTotal = areaTotal;
    }

    public double getAreaEnNegro() {
        return areaEnNegro;
    }

    public void setAreaEnNegro(double areaEnNegro) {
        this.areaEnNegro = areaEnNegro;
    }

    public String[][] getPuntosAleatorios() {
        return puntosAleatorios;
    }

    public void setPuntosAleatorios(String[][] puntosAleatorios) {
        this.puntosAleatorios = puntosAleatorios;
    }

    public int getCantidadPuntos() {
        return cantidadPuntos;
    }

    public void setCantidadPuntos(int cantidadPuntos) {
        this.cantidadPuntos = cantidadPuntos;
    }

    public InputStream getImagen() {
        return imagen;
    }

    public void setImagen(InputStream imagen) {
        this.imagen = imagen;
    }

    public void Control() {
        try {
            imagenInput = ImageIO.createImageInputStream(imagen);
            imagenL = ImageIO.read(imagenInput);
            int alto = imagenL.getHeight();
            int ancho = imagenL.getWidth();
            inicializarMatriz(alto, ancho);
            areaTotal(alto, ancho);
            generarPuntosAleatorios();
            analizarImagen();
            areaImagenNegro();
        } catch (IOException ex) {
            Logger.getLogger(AreaImagen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void inicializarMatriz(int alto, int ancho) {
        puntosAleatorios = new String[alto][ancho];
        for (int i = 0; i < puntosAleatorios.length; i++) {
            for (int j = 0; j < puntosAleatorios[0].length; j++) {
                puntosAleatorios[i][j] = "";
            }
        }
    }

    private void generarPuntosAleatorios() {
        int valorX, valorY, tamañoX = imagenL.getWidth() - 1, tamañoY = imagenL.getHeight() - 1;
        if (cantidadPuntos != areaTotal) {
            for (int i = 0; i < cantidadPuntos; i++) {
                valorX = (int) (Math.random() * tamañoX + 1);
                valorY = (int) (Math.random() * tamañoY + 1);
                if (puntosAleatorios[valorY][valorX].compareToIgnoreCase("") == 0) {
                    puntosAleatorios[valorY][valorX] = "X";
                } else {
                    i--;
                }
            }
        } else {
            for (int i = 0; i < puntosAleatorios.length; i++) {
                for (int j = 0; j < puntosAleatorios.length; j++) {
                    puntosAleatorios[i][j] = "X";
                }
            }
        }
    }

    private void analizarImagen() {
        int rojo, verde, azul;
        for (int y = 0; y < imagenL.getHeight(); y++) {
            for (int x = 0; x < imagenL.getWidth(); x++) {
                int pixel = imagenL.getRGB(x, y);
                Color color = new Color(pixel);
                rojo = color.getRed();
                azul = color.getBlue();
                verde = color.getGreen();
                if (puntosAleatorios[y][x].compareToIgnoreCase("X") == 0) {
                    if (rojo == 0 && azul == 0 && verde == 0) {
                        puntosNegro++;
                    } else {
                        puntosBlanco++;
                    }
                }
            }
        }
    }

    private void areaTotal(int alto, int ancho) {
        areaTotal = alto * ancho;
    }

    private void areaImagenNegro() {
        double auxiliar = (puntosNegro * 100) / cantidadPuntos;
        areaEnNegro = (areaTotal * auxiliar) / 100;
    }

}
