/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaordenamiento3cm1;

import algoritmos.Burbuja;
import algoritmos.BurbujaOptimizado;
import java.util.ArrayList;

/**
 *
 * @author Roberto Cruz Leija
 */
public class AAOrdenamiento3CM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //double [] datos = new double[]{6,5,3,1,8,7,2,4};
        double [] datos =herramientas.Datos.generarDatosAleatorios(1000, 500);
        double [] d1 =herramientas.Datos.generarDatosAleatorios(2000, 500);
        double [] d2 =herramientas.Datos.generarDatosAleatorios(3000, 500);
        double [] d3 =herramientas.Datos.generarDatosAleatorios(4000, 500);
        double [] d4 =herramientas.Datos.generarDatosAleatorios(5000, 500);
        double [] d5 =herramientas.Datos.generarDatosAleatorios(6000, 500);
        
        //double [] datos2 = new double[]{8,7,6,5,4,3,2,1};
        double [] datos3 = datos.clone();
        double [] d11 = d1.clone();
        double [] d22 = d2.clone();
        double [] d33 = d3.clone();
        double [] d44 = d4.clone();
        double [] d55 = d5.clone();
        
        Burbuja b1 = new Burbuja();
        Burbuja b2 = new Burbuja();
        Burbuja b3 = new Burbuja();
        Burbuja b4 = new Burbuja();
        Burbuja b5 = new Burbuja();
        Burbuja b6 = new Burbuja();
        
        b1.ordenar(datos);
        b2.ordenar(d1);
        b3.ordenar(d2);
        b4.ordenar(d3);
        b5.ordenar(d4);
        b6.ordenar(d5);
        System.out.println();
        
        BurbujaOptimizado bo1 = new BurbujaOptimizado();
        BurbujaOptimizado bo2 = new BurbujaOptimizado();
        BurbujaOptimizado bo3 = new BurbujaOptimizado();
        BurbujaOptimizado bo4 = new BurbujaOptimizado();
        BurbujaOptimizado bo5 = new BurbujaOptimizado();
        BurbujaOptimizado bo6 = new BurbujaOptimizado();
        
        bo1.ordenar(datos3);
        bo2.ordenar(d11);
        bo3.ordenar(d22);
        bo4.ordenar(d33);
        bo5.ordenar(d44);
        bo6.ordenar(d55);
        System.out.println();
       
        Grafica grafica1 = new Grafica("Comporaciones","No.Comp", "Tiempo");
        //Burbuja
        ArrayList<Vector> datosS1 = new ArrayList<>();
        //Optimizado
        ArrayList<Vector> datosS2 = new ArrayList<>();

//        datosS1.add(new Vector(b1.getTiempo_total(), b1.getComparaciones()));
//        datosS1.add(new Vector(b2.getTiempo_total(), b2.getComparaciones()));
//        datosS1.add(new Vector(b3.getTiempo_total(), b3.getComparaciones()));
//        datosS1.add(new Vector(b4.getTiempo_total(), b4.getComparaciones()));
//        datosS1.add(new Vector(b5.getTiempo_total(), b5.getComparaciones()));
//        datosS1.add(new Vector(b6.getTiempo_total(), b6.getComparaciones()));
//        
//        
//        datosS2.add(new Vector(bo1.getTiempo_total(), bo1.getComparaciones()));
//        datosS2.add(new Vector(bo2.getTiempo_total(), bo2.getComparaciones()));
//        datosS2.add(new Vector(bo3.getTiempo_total(), bo3.getComparaciones()));
//        datosS2.add(new Vector(bo4.getTiempo_total(), bo4.getComparaciones()));
//        datosS2.add(new Vector(bo5.getTiempo_total(), bo5.getComparaciones()));
//        datosS2.add(new Vector(bo6.getTiempo_total(), bo6.getComparaciones()));

        datosS1.add(new Vector(b1.getComparaciones(),b1.getTiempo_total()));
        datosS1.add(new Vector(b2.getComparaciones(),b2.getTiempo_total()));
        datosS1.add(new Vector(b3.getComparaciones(),b3.getTiempo_total()));
        datosS1.add(new Vector(b4.getComparaciones(),b4.getTiempo_total()));
        datosS1.add(new Vector(b5.getComparaciones(),b5.getTiempo_total()));
        datosS1.add(new Vector(b6.getComparaciones(),b6.getTiempo_total()));

        datosS2.add(new Vector(bo1.getComparaciones(),bo1.getTiempo_total()));
        datosS2.add(new Vector(bo2.getComparaciones(),bo2.getTiempo_total()));
        datosS2.add(new Vector(bo3.getComparaciones(),bo3.getTiempo_total()));
        datosS2.add(new Vector(bo4.getComparaciones(),bo4.getTiempo_total()));
        datosS2.add(new Vector(bo5.getComparaciones(),bo5.getTiempo_total()));
        datosS2.add(new Vector(bo6.getComparaciones(),bo6.getTiempo_total()));
        
        grafica1.crearSerie("Algoritmo1", datosS1);
        grafica1.crearSerie("Algoritmo2", datosS2);
        
        
        grafica1.mostrarGrafica();
    }
   
}
