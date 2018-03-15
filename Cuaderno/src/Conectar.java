import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conectar
{
    Connection conectar=null;
    public Connection conexion()
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           conectar=DriverManager.getConnection("jdbc:mysql://localhost/cuaderno","root","Mnaranjaoscar666");
           
            
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"no se pudo conectar con la base de datos");
            JOptionPane.showMessageDialog(null, e);
        }
        return conectar;
    }
    
    public void pruebaConexion()
    {
        Connection cn= conexion();
        if(cn==null)
        {
            JOptionPane.showMessageDialog(null,"No conectado");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "conectado exitosamente");
        }
    }
}