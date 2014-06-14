package backend;
import java.sql.*;
import java.util.ArrayList;
public class Conect 
{
    protected static Connection con;
    protected static PreparedStatement sentenciaPre;
    protected static ResultSet datos;
    protected static Statement sentencia;
    public static void conectar() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        String url ="jdbc:Mysql://localhost/inventario";
        con = DriverManager.getConnection(url,"root","12345");        
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
            p.setDescripcion(datos.getString("descripcion"));
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
    public static void newProducto(Producto p) throws SQLException
    {
        String values=String.format("'%s','%s','%s','%s','%s','%s','%s'",p.getNombre(),p.getCategoria(),
                p.getProveedor(),p.getCosto(),p.getPrecio(),p.getUnidades(),p.getDescripcion());
        con.prepareStatement("insert into producto (nombre,categoria,proveedor,costo,precio,Cantidad)"+
                ",descripcion) values("+values +")");
    }
}
