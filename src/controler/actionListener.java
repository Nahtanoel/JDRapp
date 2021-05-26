package controler;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import model.*;
import view.*;

public class actionListener implements ActionListener {
    public controler controler;


    public actionListener(controler controler){
        this.controler = controler;
    }

    public void actionPerformed(ActionEvent paramActionEvent){
        if(paramActionEvent.getActionCommand().equals("4")){
            JButton lebouton=(JButton) paramActionEvent.getSource();
            int numf=Integer.parseInt(lebouton.getText());
        
            dice D = new dice(numf);
            int numeroChoisi = D.roll();
            controler.changeResultat("resultat :"+numeroChoisi);
        }

        else if(paramActionEvent.getActionCommand().equals("6")){
            JButton lebouton=(JButton) paramActionEvent.getSource();
            int numf=Integer.parseInt(lebouton.getText());
        
            dice D = new dice(numf);
            int numeroChoisi = D.roll();
            controler.changeResultat("resultat :"+numeroChoisi);
        }

        else if(paramActionEvent.getActionCommand().equals("10")){
            JButton lebouton=(JButton) paramActionEvent.getSource();
            int numf=Integer.parseInt(lebouton.getText());
        
            dice D = new dice(numf);
            int numeroChoisi = D.roll();
            controler.changeResultat("resultat :"+numeroChoisi);
        }

        else if(paramActionEvent.getActionCommand().equals("20")){
            JButton lebouton=(JButton) paramActionEvent.getSource();
            int numf=Integer.parseInt(lebouton.getText());
        
            dice D = new dice(numf);
            int numeroChoisi = D.roll();
            controler.changeResultat("resultat :"+numeroChoisi);
        }
        else if(paramActionEvent.getActionCommand().equals("menu")){
            //controler.afficheMenu();
            System.out.println("menu");
        }
        else if(paramActionEvent.getActionCommand().equals("gauche")){
            //controler.augementer((ModuleFrame) paramActionEvent.getSource());
            System.out.println("-");
        }
        else if(paramActionEvent.getActionCommand().equals("droite")){
            //controler.afficheMenu();
            System.out.println("+");
        }
    }
}
