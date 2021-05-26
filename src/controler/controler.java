package controler;

import model.*;
import view.*;
import java.awt.*;

public class controler {
    private View view;
    private model model;
    private actionListener al;
    public controler(){
        this.model = new model();
        al=new actionListener(this);
        this.view = new View(al);
        
        this.view.pack();
        this.view.setSize(500, 500);
        this.view.setVisible(true);

        
    }

    public void changeResultat(String text){
        view.changeResultatText(text);
    }

    public void afficheMenu(){
        view.afficheMenu();
    }

    public void augementer(ModuleFrame frame){
        model.
    }
    public void decrease(){

    }
}
