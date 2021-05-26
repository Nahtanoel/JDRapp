package view;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class View extends JFrame {
    private MenuView menu;
    private MainView principal;

    public View(){
        initialiseComponents();
        setTitle("Programme");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
    public void initialiseComponents(){
        ArrayList<ModuleFrame> modules = new ArrayList<ModuleFrame>();
        modules.add(new CompteurFrame());
        principal = new MainView(modules);
        menu = new MenuView();
        add(principal);
        pack();
        //add(menu);
        //menu.setVisible(false);
        principal.setVisible(true);
    }

}
