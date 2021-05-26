package view;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class MainView extends JPanel {
    
    private JButton d4;
    private JButton d6;
    private JButton d10;
    private JButton d20;
    private JButton menu;

    private JLabel resultat;

    private ArrayList<ModuleFrame> modules;


    public MainView(ArrayList<ModuleFrame> modules){
        this.initialiseComponents();
        this.modules = modules;
    }
    public void initialiseComponents(){
        d4= new JButton("4");
        d6= new JButton("6");
        d10= new JButton("10");
        d20= new JButton("20");
        resultat = new JLabel(" resultat = ");

        ImageIcon menuIcon = new ImageIcon("../data/image/menu.png");
        menu = new JButton("menu",menuIcon);
        JPanel haut = new JPanel();
        haut.setLayout(new BorderLayout());
        haut.add(menu,BorderLayout.WEST);
        
        JPanel d = new JPanel();
        JPanel des = new JPanel();
        JPanel resul = new JPanel();
        JPanel module = new JPanel();
        des.setLayout(new GridLayout(1,4,10,0));
        des.add(d4);
        des.add(d6);
        des.add(d10);
        des.add(d20);
        resul.add(resultat);
        d.setLayout(new GridLayout(2,1,0,5));
        d.add(des);
        d.add(resul);

        module.setLayout(new GridLayout(2,5,0,5));
        //for (ModuleFrame moduleFrame : modules) {
        //    module.add(moduleFrame);
        //}

        this.setLayout(new BorderLayout());
        this.add(haut,BorderLayout.NORTH);
        this.add(d,BorderLayout.CENTER);
        this.add(module,BorderLayout.SOUTH);
        System.out.println("e");


    }
}
