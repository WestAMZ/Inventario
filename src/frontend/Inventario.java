/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Conect;
import backend.Producto;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author casa
 */
public class Inventario extends javax.swing.JInternalFrame {
 
    /**
     * Creates new form Inventario
     */
    public Inventario() {
        initComponents();
        this.loadTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Inventario Disponible");

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Categoria", "Costo", "Precio", "Unidades"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        setBounds(400, 200, 535, 120);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
  
      private DefaultTableModel modelo;
      Object[] titulos = {" Id "," Nombre ","Categoria","Costo","Precio","Unidades"};
      Object [][] datos ={};
    public void loadTable()
    {
        ArrayList<Producto> productos = null;
       modelo = new DefaultTableModel(datos,titulos);
         try
        {
            productos = Conect.findAll();
        System.out.print(productos.size());
        }catch(SQLException ex)
        {
            Message.error(this,ex.getMessage());
        }
       
        for(Producto p: productos)
        {
            
            Object[] newRow = new Object[]{p.getId(),p.getNombre(),p.getCategoria(),
                p.getCosto(),p.getPrecio(),p.getUnidades()};
            modelo.addRow(newRow);
        }
        tabla.setModel(modelo);
    }
}
