package view;
import javax.swing.*;

import model.liste;

import java.awt.*;
import java.util.HashMap;
public class ListeFrame extends ModuleFrame {
    private JLabel nom;
    private JPanel frame;
    private JPanel Liste;
    private liste laListe;
    private int nbElement;


    public ListeFrame(String nom){
        this.nom = new JLabel(nom);
        this.frame = new JPanel();
        this.laListe = new liste(nom);
        this.nbElement = 0;
        Liste = new JPanel();
        Liste.setLayout(new GridLayout(laListe.getElements().size(),1));

        
        for (String e : laListe.getElements().keySet()) {
            if(laListe.getElements().get(e)){
                
                Liste.add(new JCheckBox(e, null, true));
            }else{
                Liste.add(new JCheckBox(e));
            }
        }

        frame.setLayout(new BorderLayout());
        frame.add(this.nom,BorderLayout.NORTH);
        frame.add(this.Liste,BorderLayout.CENTER);
        this.add(frame);


    }
}
