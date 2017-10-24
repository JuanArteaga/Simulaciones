/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablasComparacion;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class TablaKolmogorovSmirnov {

    public static Map<Double, Double> tabla = new HashMap<Double, Double>();

    public static void cargarTabla(){
        tabla.put(1.20, 0.900);
        tabla.put(1.15, 0.925);
        tabla.put(1.10, 0.950);
        tabla.put(1.005, 0.875);
        tabla.put(1.001, 0.995);
        tabla.put(2.20, 0.684);
        tabla.put(2.15, 0.726);
        tabla.put(2.10, 0.776);
        tabla.put(2.005, 0.842);
        tabla.put(2.001, 0.929);
        tabla.put(3.20, 0.565);
        tabla.put(3.15, 0.597);
        tabla.put(3.10, 0.642);
        tabla.put(3.005, 0.708);
        tabla.put(3.001, 0.828);
        tabla.put(4.20, 0.494);
        tabla.put(4.15, 0.525);
        tabla.put(4.10, 0.564);
        tabla.put(4.005, 0.624);
        tabla.put(4.001, 0.733);
        tabla.put(5.20, 0.446);
        tabla.put(5.15, 0.474);
        tabla.put(5.10, 0.510);
        tabla.put(5.005, 0.565);
        tabla.put(5.001, 0.669);
        tabla.put(6.20, 0.410);
        tabla.put(6.15, 0.436);
        tabla.put(6.10, 0.470);
        tabla.put(6.005, 0.521);
        tabla.put(6.001, 0.618);        
        tabla.put(7.20, 0.381);
        tabla.put(7.15, 0.405);
        tabla.put(7.10, 0.438);
        tabla.put(7.005, 0.486);
        tabla.put(7.001, 0.577);
        tabla.put(8.20, 0.358);
        tabla.put(8.15, 0.381);
        tabla.put(8.10, 0.411);
        tabla.put(8.005, 0.457);
        tabla.put(8.001, 0.543);
        tabla.put(9.20, 0.339);
        tabla.put(9.15, 0.360);
        tabla.put(9.10, 0.388);
        tabla.put(9.005, 0.432);
        tabla.put(9.001, 0.514);
        tabla.put(10.20, 0.322);
        tabla.put(10.15, 0.342);
        tabla.put(10.10, 0.368);
        tabla.put(10.005, 0.410);
        tabla.put(10.001, 0.490);
        tabla.put(11.20, 0.307);
        tabla.put(11.15, 0.326);
        tabla.put(11.10, 0.352);
        tabla.put(11.005, 0.391);
        tabla.put(11.001, 0.468);        
        tabla.put(12.20, 0.295);
        tabla.put(12.15, 0.313);
        tabla.put(12.10, 0.338);
        tabla.put(12.005, 0.375);
        tabla.put(12.001, 0.450);        
        tabla.put(13.20, 0.284);
        tabla.put(13.15, 0.302);
        tabla.put(13.10, 0.325);
        tabla.put(13.005, 0.361);
        tabla.put(13.001, 0.433);        
        tabla.put(14.20, 0.274);
        tabla.put(14.15, 0.292);
        tabla.put(14.10, 0.314);
        tabla.put(14.005, 0.349);
        tabla.put(14.001, 0.418);        
        tabla.put(15.20, 0.266);
        tabla.put(15.15, 0.283);
        tabla.put(15.10, 0.304);
        tabla.put(15.005, 0.338);
        tabla.put(15.001, 0.404);        
        tabla.put(16.20, 0.258);
        tabla.put(16.15, 0.274);
        tabla.put(16.10, 0.295);
        tabla.put(16.005, 0.328);
        tabla.put(16.001, 0.392);        
        tabla.put(17.20, 0.250);
        tabla.put(17.15, 0.266);
        tabla.put(17.10, 0.286);
        tabla.put(17.005, 0.318);
        tabla.put(17.001, 0.381);
        tabla.put(18.20, 0.244);
        tabla.put(18.15, 0.259);
        tabla.put(18.10, 0.278);
        tabla.put(18.005, 0.309);
        tabla.put(18.001, 0.371);
        tabla.put(19.20, 0.237);
        tabla.put(19.15, 0.352);
        tabla.put(19.10, 0.272);
        tabla.put(19.005, 0.301);
        tabla.put(19.001, 0.363);
        tabla.put(20.20, 0.231);
        tabla.put(20.15, 0.246);
        tabla.put(20.10, 0.264);
        tabla.put(20.005, 0.294);
        tabla.put(20.001, 0.356);
    }
    
    public static double retornarValor(double valor) {
        return tabla.get(valor);
    }
}
