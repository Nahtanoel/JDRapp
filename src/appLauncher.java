import controler.*;
import view.*;
import javax.swing.*;
import java.awt.*;
public class appLauncher {
    public static void main(String[] args) {

        System.out.println("coucou maxime :3 test");

        System.out.println("debut");
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                controler test = new controler();
            }
        });
        
        
        
    }
}
