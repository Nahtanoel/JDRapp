package view;
import javax.swing.*;
import java.awt.*;
public class MenuView extends JToolBar {
    /**
     * This buttons open the mode edition
     */
    private JButton modeEdition;
    /**
     * The button loads up a document
     */
    private JButton charger;
    /**
     * The button saves a document
     */
    private JButton enregistrer;
    /**
     * The button opens a parameters window as 
     */
    private JButton parametres;

    /**
     * The button will return to the main view
     */
    private JButton retour;


    /**
     * This constructor calls the initialisecomponents() method
     */
    public MenuView(){
        this.initialiseComponents();
    }
    /**
     * Initialise the attributs and 
     */
    public void initialiseComponents(){
        modeEdition = new JButton(" Mode Edition ");
        charger = new JButton(" Charger ");
        enregistrer = new JButton(" Enregistrer ");
        parametres = new JButton(" Parametres ");




        ImageIcon retourIcon = new ImageIcon("../../data/image/fleche.png");
        retour = new JButton(retourIcon);

        setLayout(new GridLayout(5,1,0,20));
        add(retour);
        add(modeEdition);
        add(charger);
        add(enregistrer);
        add(parametres);
    }
}
