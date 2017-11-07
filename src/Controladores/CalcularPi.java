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
public class CalcularPi {

    private InputStream imagen;
    private int cantidadPuntos;
    private ImageInputStream imagenInput;
    private BufferedImage imagenL;
    private int puntosBlanco;
    private int puntosNegro;
    private double PiEstimado;

    public CalcularPi(InputStream imagen, int puntos) {
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

    public double getPiEstimado() {
        return PiEstimado;
    }

    public void setPiEstimado(double PiEstimado) {
        this.PiEstimado = PiEstimado;
    }

    public void Control() {
        try {
            imagenInput = ImageIO.createImageInputStream(imagen);
            imagenL = ImageIO.read(imagenInput);
            int X = imagenL.getWidth() - 1;
            int Y = imagenL.getHeight() - 1;
            int aux = cantidadPuntos;
            while (aux > 0) {
                aux = aux - 1;
                int valorX = (int) (Math.random() * X + 1);
                int valorY = (int) (Math.random() * Y + 1);
                analizarImagen(valorX, valorY);
            }
            calcularPiEstimado(puntosNegro, cantidadPuntos);
        } catch (IOException ex) {
            Logger.getLogger(AreaImagen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void analizarImagen(int x, int y) {
        int rojo, verde, azul;
        int pixel = imagenL.getRGB(x, y);
        Color color = new Color(pixel);
        rojo = color.getRed();
        azul = color.getBlue();
        verde = color.getGreen();
        if (rojo == 0 && azul == 0 && verde == 0) {
            puntosNegro++;
        } else {
            puntosBlanco++;
        }
    }

    private void calcularPiEstimado(double x, double n) {
        PiEstimado = x / n;
        PiEstimado = PiEstimado * 4;
    }
}
