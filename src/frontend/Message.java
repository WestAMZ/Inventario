package frontend;
import java.awt.Component;
import javax.swing.JOptionPane;
public class Message 
{
    public static void error(Component comp,String message)
    {
        JOptionPane.showMessageDialog(comp,message,"Error",JOptionPane.ERROR_MESSAGE);
    }  
    public static void warning(Component comp,String message)
    {
        JOptionPane.showMessageDialog(comp,message,"Warning",JOptionPane.WARNING_MESSAGE);
    }
}
