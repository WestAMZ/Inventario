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
    private int unidades;
    private int cantidad;
    private Date date;
    private String client;
    public Producto(){}

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
     
     public String toString()
     {
         String s = String.format(" nombre: %s\n proveedor : %s \n descripcion: %s\n Costo: %s Precio: %s ",nombre,proveedor,descripcion,precio,costo);
         return s;
     }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setDate(Date date){
      
        this.date = date;
    }
    public String getCliente() {
        
        return client;
    }
    public void setCliente(String client) {
        this.client = client;
    }
    public Date getDate(){
    
         return this.date;
    }
}
