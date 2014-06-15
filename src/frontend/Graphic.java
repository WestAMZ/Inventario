/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frontend;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author PC_Alberto
 */
public class Graphic {
    
    
    private static DefaultPieDataset data(){
    
       DefaultPieDataset data = new DefaultPieDataset();
       
        data.setValue("A", 109.5);
        data.setValue("B", 100.5);
        data.setValue("C", 120.9);
        data.setValue("D", 29.10);
        
      return data;
    }
    
     

    public static JFreeChart crearChart() {
        
        DefaultPieDataset data = data();
        JFreeChart chart = ChartFactory.createPieChart(
                           "Top 10",
                           data,
                           true, 
                           true, 
                           false);
        
      
       return chart;
     }
   
    
        public static JPanel crearPanel() {
             
            JFreeChart chart = crearChart();
            
             return new ChartPanel(chart);
           }
        
        
}
