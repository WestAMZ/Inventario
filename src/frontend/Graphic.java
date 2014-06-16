/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frontend;

import backend.Conect;
import backend.Producto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
    
    public static List<Producto> p ;
    public static List<Producto> p1 = new ArrayList<>() ;
    public static Producto [] arreglo;
    public static int mode;
    
    public static List<Producto>  getTotalVenta() throws SQLException{
      
        p = Conect.VerRVentas();
        for(Producto pro: p){
            boolean b=false;           
            for(int a = 0; a < p1.size(); a++){
                
                 if(pro.getId() == p1.get(a).getId()){
                 
                     p1.get(a).setCantidad(p1.get(a).getCantidad()+ pro.getCantidad());
                     p1.get(a).setCosto(p1.get(a).getCosto()+ pro.getCosto());
                     b=true;
                 }      
            }
            if(!b)
            {
                p1.add(pro);
            }
           
        }
        
       /* for(Producto r: p1){
                
                  System.out.println("\n===============================");
                  System.out.println("\n"+r.getId());
                  System.out.println("\n"+r.getNombre());
                  System.out.println("\n"+r.getCategoria());
                  System.out.println("\n"+r.getCantidad());
                  System.out.println("\n"+r.getCosto());         
                  System.out.println("\n===============================");     
              }*/
        
        return p1;
    }
    
    public static void Ordenar(List<Producto> p){
         Producto [] pr = new Producto[p.size()];
         int c = 0;
        for(Producto pro: p){
            pr[c] = new Producto();
            pr [c] = pro;
            c++;
        }
      
       
       for(int a = 0; a < pr.length; a++){
           
          for(int b = 0; b < pr.length; b++){
             if(pr [a].getCantidad() > pr[b].getCantidad()){
                  
                 Producto aux = pr[a];
                 pr[a] = pr[b];
                 pr[b] = aux;
             }
         }
       }
       
       /*
           for(Producto r: pr){
                
                  System.out.println(pr.length+"\n===============================");
                  System.out.println("\n"+r.getId());
                  System.out.println("\n"+r.getNombre());
                  System.out.println("\n"+r.getCategoria());
                  System.out.println("\n"+r.getCantidad());
                  System.out.println("\n"+r.getCosto());         
                  System.out.println("\n===============================");     
              }*/
       
        arreglo = pr;
    }
     
    public static JFreeChart data() {
       JFreeChart chart = null;
       
        try{
        Ordenar(getTotalVenta());
        }
        catch(SQLException e){}
       DefaultPieDataset data = new DefaultPieDataset();
     
       if(mode == 1){
        int c = 1;
        for(Producto p: arreglo){ 
            
            if(c == 11)
                break;
               data.setValue(p.getNombre(), p.getCantidad());
            c ++;
        }
        
         chart = ChartFactory.createPieChart(
                           "Top 10",
                           data,
                           true, 
                           true, 
                           false);
       }
       if(mode == 2){
           
        for(int d = arreglo.length-1; d >=0; d--){ 
            
            Producto p = arreglo[d];
            
            if(d == (arreglo.length - 11))
                break;
               data.setValue(p.getNombre(), p.getCantidad());
        }
        
         chart = ChartFactory.createPieChart(
                           "Top 10",
                           data,
                           true, 
                           true, 
                           false);
       }
       
      return chart;
    }
    
    
        public static JPanel crearPanel(int op){
            
            
             mode = op;
            JFreeChart chart = data();
            
             return new ChartPanel(chart);
           }   
}
