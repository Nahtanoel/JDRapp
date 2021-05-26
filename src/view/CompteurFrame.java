package view;
import javax.swing.*;

import controler.actionListener;
import model.compteur;

import java.awt.*;
public class CompteurFrame extends ModuleFrame {
    private JPanel compteur;
    private JButton gauche;
    private JButton droite;
    private JLabel value;
    private JLabel nom;
    private actionListener al;
    private int id;

    public CompteurFrame(String nom, actionListener al,int id){
        super();
        this.id = id;
        this.compteur = new JPanel();
        this.gauche=new JButton("gauche");
        gauche.addActionListener(al);
        this.droite = new JButton("droite");
        droite.addActionListener(al);
        this.nom=new JLabel(nom);
        this.value=new JLabel("0");
        
        this.compteur.setLayout(new BorderLayout());
        this.compteur.add(this.value,BorderLayout.CENTER);
        this.compteur.add(this.gauche,BorderLayout.WEST);
        this.compteur.add(this.droite,BorderLayout.EAST);
        this.compteur.add(this.nom,BorderLayout.NORTH);
        add(this.compteur);
    }

    public void setValue(int x){
        this.value.setText((Integer.toString(x)));
        this.value.repaint();
    }
}
