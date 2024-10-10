/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jesusmachta
 */
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class GraphManager {
    private XYSeries computadorasApple;
    private XYSeries computadorasDell;
    private JPanel grafico;
    private Compañia apple;
    private Compañia dell;
    private int counter = 1;

    public GraphManager(JPanel grafico, Compañia apple, Compañia dell) {
        computadorasApple = new XYSeries("Apple");
        computadorasDell = new XYSeries("Dell");
        this.grafico = grafico;
        this.apple = apple;
        this.dell = dell;

        JFreeChart lineChart = ChartFactory.createXYLineChart("Utilidades vs Tiempo", "Dias", "Utilidad", getDataset(), PlotOrientation.VERTICAL, true, true, false);
        ChartPanel chartpanel = new ChartPanel(lineChart);
        
        XYPlot plot = lineChart.getXYPlot();

        // Crear un renderizador de series personalizado (LineAndShapeRenderer para gráficos de líneas)
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.BLACK);  // Serie 0 (Apple) en negro
        renderer.setSeriesPaint(1, Color.BLUE);    // Serie 1 (Dell) en azul
        renderer.setSeriesShapesVisible(0, true);  // Mostrar puntos para la serie 0
        renderer.setSeriesShapesVisible(1, true);  // Mostrar puntos para la serie 1
        renderer.setSeriesLinesVisible(0, true);    // Mostrar líneas para la serie 0
        renderer.setSeriesLinesVisible(1, true);    // Mostrar líneas para la serie 1
        renderer.setSeriesStroke(0, new BasicStroke(3.0f)); // Grosor de la línea para la serie 0
        renderer.setSeriesStroke(1, new BasicStroke(3.0f)); // Grosor de la línea para la serie 1

        plot.setRenderer(renderer);

        chartpanel.setPreferredSize(new java.awt.Dimension(700, 500));
        grafico.setLayout(new BorderLayout());
        grafico.add(chartpanel, BorderLayout.CENTER);
        grafico.validate();
    }

    private XYSeriesCollection getDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(computadorasApple);
        dataset.addSeries(computadorasDell);
        return dataset;
    }

    // Método para actualizar las utilidades y el tiempo en el gráfico
    public void actualizarGrafico() {
        computadorasApple.add(counter, apple.getUtilidades());
        computadorasDell.add(counter, dell.getUtilidades());
        counter ++;
    }
    
}
