package backend;
public class Producto 
{
    private int id;
    private String nombre;
    private String descripcion;
    private String proveedor;
    private String categoria;
    private float costo;
    private float precio;
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
         String s = String.format(" nombre: %-30s\n proveedor : %-30s \n descripcion: %-30s\n",nombre,descripcion);
         return s;
     }
}
