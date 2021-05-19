import controler.*;
import view.*;
import javax.swing.*;
import java.awt.*;
public class appLauncher {
    public static void main(String[] args) {
        System.out.println("debut");
        controler test = new controler();
        
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                View frame = new View();
                frame.pack();
                frame.setSize(500, 500);
                frame.setVisible(true);
            }
        });
    }
}
