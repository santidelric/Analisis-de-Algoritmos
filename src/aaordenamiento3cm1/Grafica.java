package aaordenamiento3cm1;

import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 */
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Grafica {
    
    private String tituloGrafica;
    private String tituloEjeX,tituloEjeY;
    private JFreeChart grafica;
    private XYSeriesCollection coleccionSeries;

    public Grafica(String titulo,String tituloX,String tituloY) {
        this.tituloGrafica = titulo;
        this.tituloEjeX = tituloX;
        this.tituloEjeY = tituloY;
        
        this.coleccionSeries = new XYSeriesCollection();
    }
    
    public void crearSerie(String nombreSerie,ArrayList<Vector> datos){
        // creando serie
        XYSeries serie = new XYSeries(nombreSerie);
        // agregar datos a la serie recorriendo el arreglo
        for (Vector vector: datos){
        serie.add(vector.getX(),vector.getY());
        
        }
        this.coleccionSeries.addSeries(serie);
        
    }
    
    public void mostrarGrafica(){
    
        this.grafica = ChartFactory.createXYLineChart(this.tituloGrafica, tituloEjeX, tituloEjeY,
                    coleccionSeries);
        // crear un panel con la grafica
        ChartFrame panel = new ChartFrame(null, grafica);
        panel.pack();
        panel.setVisible(true);
        
    }
    
    
    
    
}