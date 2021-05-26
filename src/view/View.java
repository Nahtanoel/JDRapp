package view;
import javax.swing.*;
import controler.*;

import java.awt.*;
import java.util.ArrayList;
public class View extends JFrame {
    private MenuView menu;
    private MainView principal;
    private actionListener al;

    public View(actionListener al){
        this.al=al;
        initialiseComponents();
        setTitle("Programme");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
    public void initialiseComponents(){

        ArrayList<ModuleFrame> modules = new ArrayList<ModuleFrame>();
        modules.add(new CompteurFrame("PV",al,1));
        principal = new MainView(modules,al);
        menu = new MenuView();
        add(principal);
        //add(menu);
        //menu.setVisible(false);
        principal.setVisible(true);
    }

    public void changeResultatText(String text){
        this.principal.setResultatText(text);
    }
    public void afficheMenu(){
        this.principal.setVisible(false);

        this.menu.setVisible(true);
        this.repaint();
    }
    public void augementer(){
    }
    public void decrease(){

    }
}
