package backend;
import java.sql.*;
import java.util.ArrayList;
public class Conect 
{
    protected Connection con;
    protected PreparedStatement sentenciaPre;
    protected ResultSet datos;
    protected Statement sentencia;
    public void conectar() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        String url ="jdbc:Mysql://localhost/inventario";
        con = DriverManager.getConnection(url,"root","12345");        
    }
    public ArrayList<Producto> findAll() throws SQLException
    {
        sentenciaPre = con.prepareStatement("select * from productos");
        datos = sentenciaPre.executeQuery();
    }
}
