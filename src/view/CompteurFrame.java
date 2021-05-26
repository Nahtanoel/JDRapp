package view;
import javax.swing.*;

import controler.actionListener;
import model.compteur;

import java.awt.*;
public class CompteurFrame extends ModuleFrame {
    private compteur compt;
    private JPanel compteur;
    private JButton gauche;
    private JButton droite;
    private JLabel value;
    private JLabel nom;
    private actionListener al;

    public CompteurFrame(String nom,actionListener al){
        this.compt=new compteur(nom);
        this.compteur = new JPanel();
        this.gauche=new JButton("gauche");
        gauche.addActionListener(al);
        this.droite = new JButton("droite");
        gauche.addActionListener(al);
        this.nom=new JLabel(nom);
        this.value=new JLabel((Integer.toString(compt.getValeur())));
        
        
        this.compteur.setLayout(new BorderLayout());
        this.compteur.add(this.value,BorderLayout.CENTER);
        this.compteur.add(this.gauche,BorderLayout.WEST);
        this.compteur.add(this.droite,BorderLayout.WEST);
        this.compteur.add(this.nom,BorderLayout.NORTH);

    }

    public void setValue(int x){
        this.value.setText((Integer.toString(x)));
        this.value.repaint();
    }
}
