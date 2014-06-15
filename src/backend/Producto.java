package backend;

import java.util.Date;

public class Producto 
{
    private int id;
    private String nombre;
    private String descripcion;
    private String proveedor;
    private String categoria;
    private float costo;
    private float precio;
    private int cantidad;
    private int unidades;
    private Date date;
    private String client;
    
    
    public Producto(){}

    public Producto(int id, String descripcion, String proveedor, String categoria, float costo, float precio, int cantidad, int unidades, Date date, String client) {
        this.id = id;
        this.descripcion = descripcion;
        this.proveedor = proveedor;
        this.categoria = categoria;
        this.costo = costo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.unidades = unidades;
        this.date = date;
        this.client = client;
    }
   
    
    public int getId() {
        return id;
    }
    
     public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getCliente() {
        
        return client;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getCosto() {
        return costo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    public void setCliente(String client) {
        this.client = client;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    public void setDate(Date date){
      
        this.date = date;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
     
    @Override
     public String toString()
     {
         String s = String.format(" nombre: %-30s\n proveedor : %-30s \n descripcion: %-30s\n",nombre,descripcion);
         return s;
     }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    public Date getDate(){
    
         return this.date;
    }
}