package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actionListener extends ActionListener {
    public controler controler;

    public actionListener(controler controler){
        this.controler = controler;
    }

    public void actionPerformed(ActionEvent paramActionEvent){
        this.controler.handleActions(paramActionEvent);
    }
}