package backend;
import frontend.Ventas;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
public class Conect 
{
    public static float totalmessage;
    protected static Connection con;
    protected static PreparedStatement sentenciaPre;
    protected static ResultSet datos;
    protected static Statement sentencia;
    public static void conectar() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        String url ="jdbc:Mysql://localhost/inventario";
        con = DriverManager.getConnection(url,"root","12345");
        sentencia=con.createStatement();
    }
    public static ArrayList<Producto> findAll() throws SQLException
    {
        sentenciaPre = con.prepareStatement("select * from producto");
        datos = sentenciaPre.executeQuery();
        ArrayList<Producto> productos = new ArrayList<>();
        while(datos.next())
        {
            Producto p = new Producto();
            p.setId(datos.getInt("id"));
            p.setNombre(datos.getString("nombre"));
            p.setCategoria(datos.getString("categoria"));
            p.setProveedor(datos.getString("proveedor"));
            p.setCosto(datos.getFloat("costo"));
            p.setPrecio(datos.getFloat("precio"));
        //  p.setDescripcion(datos.getString("descripcion"));
            p.setUnidades(datos.getInt("Cantidad"));
            productos.add(p);
        }
        return productos;
    }
    public static boolean valideUser(User user) throws SQLException
    {
        boolean b = false;
        sentenciaPre = con.prepareStatement("select * from user");
        datos = sentenciaPre.executeQuery();
        while(datos.next())
        {
            if(datos.getString("name").equalsIgnoreCase(user.getName()) && 
                    datos.getString("pass").equals(user.getPass()))
            {
                b = true;
                break;
            }
        }
        return b;
    }
       public static void AgregarVenta(List<Producto> p) throws SQLException{
    
       List <Producto> pr = new ArrayList<>();
       pr.addAll(p);
       float total ;
       totalmessage = 0;
       for(Producto pro: pr){
           total = pro.getCantidad() * pro.getPrecio();
           totalmessage += total ;
             sentenciaPre = con.prepareStatement("insert into venta()values(?,?,?,?,?,?,?)");
             
             
             sentenciaPre.setString(1, pro.getNombre());
             sentenciaPre.setInt(2, pro.getCantidad());
             sentenciaPre.setFloat(3, total);
             sentenciaPre.setString(4, pro.getCliente());
             sentenciaPre.setFloat(5, pro.getPrecio());
             sentenciaPre.setString(6, pro.getCategoria());
             sentenciaPre.setDate(7, new java.sql.Date(pro.getDate().getTime()));
             sentenciaPre.executeUpdate();
             total = 0;
       }
    }
    
    public static float totalpagar(){
       
       return totalmessage;
    }
    
 /*   public static List<Producto> VerRVentas() throws SQLException{
    
            return p;
       }*/
    public static void newProducto(Producto p) throws SQLException
    {
        
        String values=String.format("\'%s\',\'%s\',\'%s\',%s,%s,%s,\'%s\'",p.getNombre(),p.getCategoria(),
                p.getProveedor(),p.getCosto(),p.getPrecio(),p.getUnidades(),p.getDescripcion());
        
        sentencia.executeUpdate("insert into producto (nombre,categoria,proveedor,costo,precio,Cantidad,descripcion) values("+values +");");
        
    }
    public static void deleProducto(Producto p) throws SQLException
    {
        sentencia.executeUpdate(String.format("delete from producto where nombre =\'%s\'",p.getNombre()));
    }
    public static void updateProducto(Producto p1,Producto p2) throws SQLException
    {
        String values =String.format("nombre=\'%s\',categoria=\'%s\',proveedor=\'%s\',costo=%s,precio=%s,Cantidad=%s,descripcion=\'%s\'"
                ,p1.getNombre(),p1.getCategoria(),p1.getProveedor(),p1.getCosto(),p1.getPrecio(),p1.getUnidades(),p1.getDescripcion());
        sentencia.executeUpdate("update producto set "+values+"where id=\'"+p2.getId()+"\'");
    }
    
}
