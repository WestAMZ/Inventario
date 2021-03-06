/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frontend;

import backend.Conect;
import backend.Producto;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author PC_Alberto
 */
public class Ventas extends javax.swing.JDialog {

    private boolean  c = false;
    private int id;
    private  List <Producto> p;
    private  List <Producto> p2 = new ArrayList<>();
    private DefaultTableModel modelo;
    String [] cabecera = {"Id","Nombre","Descripcion","Cliente","Fecha","Precio","Cantidad"};
    String [][] Datos = {}; 
     
    public Ventas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jdch = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        Realizar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        cliente = new javax.swing.JTextField();
        producto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        cant = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setLayout(new java.awt.GridLayout(0, 1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 102));

        jLabel6.setFont(jLabel6.getFont().deriveFont((jLabel6.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD, jLabel6.getFont().getSize()+7));
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Formato de Venta ");
        jPanel6.add(jLabel6);

        jPanel3.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Fecha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 58, 0, 0);
        jPanel7.add(jLabel1, gridBagConstraints);

        jdch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jdchKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 169;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 35, 7, 135);
        jPanel7.add(jdch, gridBagConstraints);
        Date fecha = new Date();
        jdch.setDateFormatString("dd/MM/yyyy");
        jdch.setDate(fecha);

        jPanel3.add(jPanel7);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));

        Realizar.setText("Realizar Venta");
        Realizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarActionPerformed(evt);
            }
        });
        jPanel4.add(Realizar);

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton2KeyReleased(evt);
            }
        });
        jPanel4.add(jButton2);

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel7.setText("Codigo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 31, 0, 0);
        jPanel2.add(jLabel7, gridBagConstraints);

        jLabel8.setText("Cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 0, 0);
        jPanel2.add(jLabel8, gridBagConstraints);

        jLabel9.setText("Descripcion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 31, 0, 0);
        jPanel2.add(jLabel9, gridBagConstraints);

        jLabel10.setText("Nombre del Producto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 31, 0, 0);
        jPanel2.add(jLabel10, gridBagConstraints);

        cod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 64;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 8, 0, 0);
        jPanel2.add(cod, gridBagConstraints);

        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                clienteKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 206;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        jPanel2.add(cliente, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 139;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 4, 0, 0);
        jPanel2.add(producto, gridBagConstraints);

        jLabel3.setText("Precio X Und  C$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 0, 0);
        jPanel2.add(jLabel3, gridBagConstraints);

        jLabel2.setText("Cantidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 5, 0, 0);
        jPanel2.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 23;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 64;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 4, 0, 0);
        jPanel2.add(precio, gridBagConstraints);

        desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 223;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 0);
        jPanel2.add(desc, gridBagConstraints);

        cant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 23;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 64;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 4, 0, 0);
        jPanel2.add(cant, gridBagConstraints);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jtabla.setBackground(new java.awt.Color(240, 240, 240));
        jtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Descripcion", "Cliente", "Fecha", "Precio", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(jtabla);
        modelo = new DefaultTableModel(Datos,cabecera);
        jtabla.setModel(modelo);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        setBounds(400, 200, 661, 413);
    }// </editor-fold>//GEN-END:initComponents

    private void descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descActionPerformed

    private void codKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codKeyReleased
        // TODO add your handling code here    
    }//GEN-LAST:event_codKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         
       Agregar();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteActionPerformed

    private void RealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarActionPerformed
      
         if(jtabla.getRowCount() != 0){
        try {      
               Conect.AgregarVenta(p2);
              
               Pago pg = new Pago();
               pg.asignar();
               pg.setVisible(true);
               
               p2.clear();
              modelo = new DefaultTableModel(Datos,cabecera);
              jtabla.setModel(modelo);
              cliente.setText("");
              
        } 
        catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
      else{
             Message.error(this, "No ha agregado productos a la descripcion de venta");
      }
        
    }//GEN-LAST:event_RealizarActionPerformed

    private void clienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clienteKeyReleased
           
        if(evt.getKeyCode() == KeyEvent.VK_F1){
             cant.requestFocusInWindow();
        }
    }//GEN-LAST:event_clienteKeyReleased

    private void cantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           jButton2.requestFocusInWindow();
        }
    }//GEN-LAST:event_cantKeyReleased

    private void jButton2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
          Agregar();
          cod.requestFocusInWindow();
        }
    }//GEN-LAST:event_jButton2KeyReleased

    private void jdchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdchKeyReleased
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_jdchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
              if(jtabla.getRowCount() != 0){
                  
                   int row = jtabla.getSelectedRow();
                   int newid = (int)jtabla.getValueAt(row, 0);                 
                   
                  for(Iterator < Producto> i = p2.iterator(); i.hasNext();)
		   {
		      if(i.next().getId() == newid)
		        {
		          i.remove();
			}
			 
		    }
                   
                   DefaultTableModel dtm = (DefaultTableModel) jtabla.getModel();
                   dtm.removeRow(row); 
                   cod.requestFocusInWindow();
               }
              else{
              
                     Message.error(this, "No hay nada que Eliminar");
              }
           
             
    }//GEN-LAST:event_jButton1ActionPerformed

    private void codKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codKeyPressed
        // TODO add your handling code here:   
        
               
          if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
          id = Integer.parseInt(cod.getText());
            try {
                  p = Conect.findAll();
                 
                   for(Producto p1: p){
                       if(p1.getId() == id){
                       
                            producto.setText(p1.getNombre());
                            desc.setText(p1.getCategoria());
                            precio.setText(String.valueOf(p1.getPrecio()));
                            c = true;               
                       }
                       
                   }
                   
                    if(c == false){
                   
                       Message.error(this, "No tenemos productos con este codigo");
                   }
                    else
                        cliente.requestFocusInWindow();
          
                
                } 
            catch (SQLException ex) {
                Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                  
        }
    }//GEN-LAST:event_codKeyPressed

    private void codKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codKeyTyped

    }//GEN-LAST:event_codKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Realizar;
    private javax.swing.JTextField cant;
    private javax.swing.JTextField cliente;
    private javax.swing.JTextField cod;
    private javax.swing.JTextField desc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdch;
    private javax.swing.JTable jtabla;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField producto;
    // End of variables declaration//GEN-END:variables

    public void Table(){
     
       int c = p2.size();
      
      for(int a = 0; a < c; a++){
      
         Producto emp = p2.get(a);
         if(id == emp.getId() ){
        
         Object[] newRow = {emp.getId()  ,emp.getNombre() ,emp.getCategoria(), emp.getCliente(),
                            emp.getDate(),emp.getPrecio() ,emp.getCantidad()};
         modelo.addRow(newRow);   
         }
      }
   }
    
    public void Agregar(){
    
      if(!cod.getText().equals("")){
           
        
        for(int a = 0; a < p.size(); a++){
            
                Producto pr = p.get(a);
               if(pr.getId() == id){
          
                 pr.setDate(jdch.getDate());
                 pr.setCantidad(Integer.parseInt(cant.getText()));
                 pr.setCliente(cliente.getText());
                 p2.add(pr);
                 
               }
            }
        
         Table();
         producto.setText("");
         desc.setText("");
         precio.setText("");
         cant.setText("");
         cod.setText("");
         
         Date fecha = new Date();
         jdch.setDateFormatString("dd/MM/yyyy");
         jdch.setDate(fecha);
        
      }
       else{
            JOptionPane.showMessageDialog(this, "Debe Llenar los Campos Vacios","Message",JOptionPane.INFORMATION_MESSAGE);
       
       }
    }
   
}
