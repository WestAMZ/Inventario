package backend;

import frontend.Inicial;
import frontend.MainWindow;
import frontend.Message;

public class Main 
{
    public static void main(String[]args)
    {
        
        Inicial.main(args);
        while(true)
        {
            if(Inicial.getBoolean())
            {
               break;
            }
        }
        MainWindow.main(args);
    }            
}
